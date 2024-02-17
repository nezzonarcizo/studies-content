// server.js
// where your node app starts


// init project
const express = require('express');
const app = express();

const AWS = require('aws-sdk');

var bodyParser = require('body-parser')
app.use( bodyParser.json() );       // to support JSON-encoded bodies
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
  extended: true
}));

// Carregando as configurações AWS daqui quando o uso é local e não existem variáveis de ambiente
AWS.config.loadFromPath('./config.json');

// we've started you off with Express, 
// but feel free to use whatever libs or frameworks you'd like through `package.json`.

// http://expressjs.com/en/starter/static-files.html
app.use(express.static('public'));

// http://expressjs.com/en/starter/basic-routing.html
app.get('/', function(request, response) {
  // Response para glitch
  // response.sendFile(__dirname + '/src/pages/index.html');

  // Response para localhost
  response.send("Aplicação node rodando com sucesso!")
});

app.get('/teste', function(request, response) {
  
  AWS.config.loadFromPath('./config.json');
  
});


//listar tabelas do DynamoDB
app.get('/listarTabelas', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var dynamodb = new AWS.DynamoDB();
  
  var params = {};
  dynamodb.listTables(params,function(err,data){
      if (err) {
        console.log(err);
      } else {
          response.json(data);
         // var tabela = "";
         // for (let i=0; i < data.TableNames.length; i++) {
         //   tabela += "Tabela => "+data.TableNames[i]+"<br>";
         // }
         // response.send(tabela);
      }   
  }); 
});

//Inclusao de Dados no DynamoDB
app.get('/inserir', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client_email = request.query.email;
  var client_name  = request.query.name;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params ={
    TableName:'twilio-talks',
    Item: {
      email:client_email,
      name:client_name
      
      // Se quiser passar os valores hardcoded
      // email:'nesso.narcizo@hotmail.com',
      // name:'Marlon Augusto Nezzo Narcizo',
      // birth_date:'1987-09-14'
    }
  }
  
  client.put(params,function(err,data){
     if (err) {
       console.log(err);
     } else {
        response.send(data); 
     }  
  });
  
});

//Alteracao de Dados no DynamoDB
app.get('/atualizar', function(request, response) {

  AWS.config.update({region:'us-east-1'});
  
  var client_email = request.query.email;
  var client_name  = request.query.name;
  var salary = request.query.salary;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params = {
    TableName:'twilio-talks',
    Key: {
       email:client_email,
       name:client_name
    },
    UpdateExpression: 'set #s = :y',
    ConditionExpression: 'idade > :x',
    ExpressionAttributeNames:{
     '#s':'salario' 
    },
    ExpressionAttributeValues:{
      ':y':salary,
      ':x':21
    }
  }
  
  client.update(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });
});

//Exclusao de Dados no DynamoDB
app.get('/excluir', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client_email = request.query.email;
  var client_name  = request.query.name;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params = {
   TableName:'twilio-talks',
    Key: {
     email: client_email,
     name: client_name
    }
  }
  
  client.delete(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });
  
  
});

//consulta dados no dynamodb
app.get('/recuperar', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client_email = request.query.email;
  var client_name  = request.query.name;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params = {
      TableName : 'twilio-talks',
      Key: {
        email: client_email,
        name: client_name
      },
    //Trazendo somente os atributos desejados
    AttributesToGet: [ 'email','name','idade'],
    //Neste atributos definimos o tipo de busca/leitura (Eventually Consistent (Busca no Cache) ou Strongly Consistent (Busca direto na Tabela))
    // ConsistentRead se refere a Strongly Consistent
    ConsistentRead: false,
    // Para que em cada consulta retorne a capacidade consumida
    ReturnConsumedCapacity: 'TOTAL'
    // Resumindo os testes, quando é ConsistentRead = true, ele gasta 1 CapacityUnit, pois precisa ir até o banco, direto na tabela e ler o valor, quando está como ConsistentRead = false ele gasta apenas 0.5 CapacityUnit, pois leu do cache
  };
  
  client.get(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });
  
  
});


//consulta dados no dynamodb atraves de SCAN
//Ler todos os itens da tabela
app.get('/buscar', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  // var params = {
  //   TableName:'twilio-talks',
  //   FilterExpression: 'idade >= :p_idade',
  //   ExpressionAttributeValues: {
  //     ':p_idade':37
  //   }
  // }
  
  
  var key_email = request.query.email;
  var key_name  = request.query.name;
  
  var params = {
    TableName:'twilio-talks',
    // IndexName:'empresa-index',
    Limit: 3
  }
  
  params.ExclusiveStartKey = { email: key_email, name: key_name }
  
  client.scan(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });
  
});

//consulta dados no dynamodb atraves de Query
//consulta baseada na chave primária (não lê toda a tabela)
app.get('/consultar', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var key_produto   = request.query.produto;
  var key_categoria = request.query.categoria;
  
  var params = {
   TableName:'produtos',
   IndexName: 'produto-categoria-index',
   KeyConditionExpression:'produto = :p_produto and categoria = :p_categoria',
   ExpressionAttributeValues: {
      ':p_produto':key_produto,
      ':p_categoria':key_categoria
   }    
  }
  
  client.query(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });

});


//consulta dados no dynamodb em Lote
//busca em várias tabelas os itens com os valores informados na requisição
app.get('/lerLote', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var key_email = request.query.email;
  var key_nome  = request.query.nome;
  
  var params = {
   RequestItems: {
     'clientes':{
       Keys: [
         {
           email: key_email,
           nome: key_nome
         }
       ]
     },
     'clientes_loja':{
       Keys: [
         {
           email: key_email,
           nome: key_nome
         }
       ]       
     }
   }    
  }
  
  client.batchGet(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });

});

//gravacao em lote
app.get('/gravarLote', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var nome_cliente = request.query.nome;
  var email_cliente = request.query.email;
  
  var params = {
  RequestItems: {
      'clientes': [
        {
          PutRequest: {
            Item: {
              email: email_cliente,
              nome: nome_cliente
            }
          }
        }
      ],
    'clientes_loja':[
        {
          PutRequest: {
            Item: {
              email: email_cliente,
              nome: nome_cliente
            }
          }
        }
      ]
    }
  };
  
  client.batchWrite(params,function(err,data){
     if (err) {
       response.send(err);
       console.log(err);
     } else {
        response.send(data); 
     }  
  });

  
});

// listen for requests :) Using Glitch
// const listener = app.listen(process.env.PORT, function() {
//   console.log('Your app is listening on port ' + listener.address().port);
// });

// listen for requests :) Local
let port = process.env.PORT || 3000;

const listener = app.listen(port, function() {
  console.log('Your app is listening on port ' + listener.address().port);
});