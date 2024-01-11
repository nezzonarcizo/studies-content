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


// we've started you off with Express, 
// but feel free to use whatever libs or frameworks you'd like through `package.json`.

// http://expressjs.com/en/starter/static-files.html
app.use(express.static('public'));

// http://expressjs.com/en/starter/basic-routing.html
app.get('/', function(request, response) {
  response.sendFile(__dirname + '/views/index.html');
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
         //response.send(data) 
        response.json(data);        
      }   
  }); 
});

//Inclusao de Dados no DynamoDB
app.get('/inserir', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var email_cliente = request.query.email;
  var nome_cliente  = request.query.nome;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params ={
    TableName:'clientes',
    Item: {
      email:email_cliente,
      nome:nome_cliente
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
  
  var email_cliente = request.query.email;
  var nome_cliente  = request.query.nome;
  var valor = request.query.valor;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params = {
    TableName:'clientes',
    Key: {
       email:email_cliente,
       nome: nome_cliente
    },
    UpdateExpression: 'set #s = :y',
    ConditionExpression: 'idade < :x',
    ExpressionAttributeNames:{
     '#s':'salario' 
    },
    ExpressionAttributeValues:{
      ':y':valor,
      ':x':30
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
  
  var email_cliente = request.query.email;
  var nome_cliente  = request.query.nome;
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var params = {
   TableName:'clientes',
    Key: {
     email: email_cliente,
     nome: nome_cliente
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
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var email_cliente = request.query.email;
  var nome_cliente  = request.query.nome;
  
  var params = {
      TableName : 'clientes',
      Key: {
        email: email_cliente,
        nome: nome_cliente
      },
    AttributesToGet: [ 'email','nome','idade'],
    ConsistentRead: false,
    ReturnConsumedCapacity: 'TOTAL'
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
app.get('/buscar', function(request, response) {
  
  AWS.config.update({region:'us-east-1'});
  
  var client = new AWS.DynamoDB.DocumentClient();
  
  var key_produto  = request.query.produto;
  var key_vendedor = request.query.vendedor;
  
  var params = {
    TableName:'produtos',
    Limit: 5
  }
  
  params.ExclusiveStartKey = { produto: key_produto, vendedor:key_vendedor }
  
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



// listen for requests :)
const listener = app.listen(process.env.PORT, function() {
  console.log('Your app is listening on port ' + listener.address().port);
});