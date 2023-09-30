# Banco de Dados NoSQL

## Introdução

Vamos falar então nessa aula uma introdução sobre os bancos de dados NoSQL...

Os bancos de dados NoSQL são bancos de dados não relacionais.
Eles são altamente escaláveis, flexíveis e têm alta performance.
NoSQL é um termo que foi criado em 1988 por um cara chamado Carlo Strozzi e depois, em meados de 2009, começou a ser reintroduzido no mercado por um engenheiro da Rackspace, um cara chamado Eric Evans.

Atualmente temos diversos bancos de dados NoSQL no mercado para as mais diversas funcionalidades, criados pelas mais diversas empresas e comunidades.

### Por que banco de dados NoSQL?

Basicamente, antes de 2000, as aplicações tinham as suas informações concentradas em bancos de dados relacionais. Esses bancos de dados relacionais são grandes bancos de dados de grandes empresas e por isso eles dominavam o mercado e as aplicações.

Basicamente tinhamos apenas esses bancos de dados para trabalharmos.
Como as aplicações eram um pouco mais centralizadas não tinhamos ainda um grande volume de usuários utilizando essas aplicações.

Muitas dessas aplicações não eram utilizadas, por exemplo, pelo usuário final dentro de empresas, então você tinha sim um volume de dados, mas não era um volume tão absurdo de dados, e esses dados acabavam ficando concentrados em bancos de dados relacionais, como por exemplo o Oracle, SQL Server, DB2, depois, ao longo do tempo, foram surgindo outros bancos como o PostgreSQL e MySQL, etc.

Bom, depois dos anos 2000, quando começou a ter realmente uma grande explosão na utilização da internet, quando a Internet começou a se tornar popular e começou a se tornar mais disponível aos usuários em massa.

O surgimento em larga escala de aplicativos, de plataformas e etc, que começaram a chegar na mão do consumidor, do público em geral, como por exemplo o Facebook, o Twitter, LinkedIn, Skype, Netflix, Wikipedia etc. As aplicações começaram a ter uma outra necessidade, que é a necessidade de ter dados muitas vezes não estruturados ou dados que são não convencionais.

Como por exemplo, a gente começou a ter vídeos, começamos a ter fotos, começamos ter arquivos criptografados, começamos manter enciclopédias, começamos a ter diversos tipos de estrutura, de dados que acabaram sendo consumidos, carregados, etc.

Dados que não poderiam ser colocados em bancos de dados relacionais tradicionais, como por
exemplo, Oracle e SQL Server. Isto também, obviamente, alavancou por causa do grande crescimento que se tem na utilização da internet, não só na utilização tradicional que era por meio dos PCs (Personal Computers), mas também através de dispositivos móveis.

Então, hoje, como muita gente não ter um computador pessoal, mas a pessoa tem, por exemplo, um celular e consome também informações da internet. Podemos também citar os jogos online.

### Características NoSQL

Vamos entender as características que fazem de um banco de dados ser um banco de dados NoSQL.

##### Flexibilidade

Um banco de dados NoSQL oferece uma estrutura de dados flexível, oferecendo utilização de dados semiestruturados e não estruturados. Por ter começado a crescer a necessidade de você ter que armazenar dados que não eram estruturados, não eram modelados, não seguiam uma normalização, como, por exemplo, o banco de dados relacional.

Então começamos a ter vídeos, fotos, arquivos, informações diversas, que são informações que muitas vezes elas não são estruturadas, são semiestruturadas.

Então um banco de dados NoSQL permite que você armazene informações, seja estruturadas ou não estruturadas.

#### Escalabilidade 

Um banco de dados NoSQL, ele permite uma escalabilidade horizontal, utilizando infraestrutura mais barata, em muitos casos, em nuvens, ao invés de servidores caros e verticais.

O que acontece aqui é uma grande e uma grande vantagem do banco de dados NoSQL, ele faz escalabilidade horizontal.

O que isso quer dizer?

Isso quer dizer que, por exemplo, quando você precisa ter mais poder de processamento, por exemplo, num banco de dados como o Oracle ou como o SQL Server, normalmente você aumenta o tamanho da máquina, então você coloca mais processador, mais memória, mais disco dentro da mesma máquina. Isto chamamos de escalabilidade vertical. No caso do banco de dados, NoSQL não, você pode usar diversas máquinas pequenas, baratas, menores.

Vamos dizer assim à medida que seu banco de dados vai precisando de mais recursos, então, dessa forma você consegue escalar mais rápido e mais barato.

#### Performance 

O banco de dados NoSQL possui um padrão de acesso para modelos específicos que é o nome, valor, documento, gráficos, etc, e é otimizado para tal acesso, o que não ocorre com o banco de dados relacionais.

Então aqui temos um outro ponto importante.

Existem vários tipos de bancos de dados NoSQL quando definimos um tipo específico de banco de dados NoSQL, ele é otimizado para aquele tipo escolhido. Ele consegue ser muito mais performático porque ele atende um tipo específico, vamos dizer assim, de informação do que um banco de dados relacional que tem um modelo normalizado.

O banco de dados, relacional, não atende a diversos tipos de dados ou a diversos tipos de informação. Por isso ele acaba sendo muitas vezes muito mais lento do que um banco de dados NoSQL que tem uma característica específica, e com isso ele consegue ser muito melhor e muito mais otimizado.

### Tipos de Banco de Dados NoSQL

Hoje temos alguns tipos de bancos de dados NoSQL.
Então não são todos os bancos de dados NoSQL que são iguais.

##### Chave-Valor

Isso permite escalabilidade horizontal e possui alto particionamento, facilitando o acesso e distribuição. O tipo chave de valor é o tipo mais comum que tem, é aquele tipo onde você tem a chave e o valor ex (Nome = Fulano, Cidade = São Paulo, Pais = Brasil)


#### Documento

NoSQL que tem o tipo documento, ele permite que você salve documentos JSON, os dados eles são representados como um documento. JSON's são mais intuitivos para desenvolvedores e permitem flexibilizar o modelo de dados e ser mais aderente às aplicações.

Quando o desenvolvedor começa a desenvolver uma aplicação utilizando um banco de dados relacional, tem que seguir aquele modelo de normalização que existe ali para o banco de dados. Então, uma vez que aquele modelo foi definido e foi configurado pelo DBA, pelo database administrator, o programador, o desenvolvedor, ele não consegue criar nada diferente, então ele não consegue salvar o dado de um jeito diferente, nem recuperar o dado de um jeito diferente.

Enquanto que quando você trabalha com o banco NoSQL do tipo documento, você consegue salvar a estrutura de dados que você quiser, desde que ela esteja no formato JSON, então isso acaba ajudando bastante a quem desenvolve tanto a ter mais flexibilização nos dados quanto a não depender, por exemplo, de um daybreak de um database administrator.

#### Gráfico

É utilizado para dados altamente disponíveis e conectados, como redes sociais, detecção de fraude e aplicações que usam a teoria de grafos para análise de relação entre objetos. Então esse banco de dados NoSQL ele é muito específico.

Por quê?

Porque quando você faz a gravação ou faz o acesso às informações, elas são muito rápidas em trazer não só o objeto, mas trazer um conjunto de objetos relacionados.

Exemplo:

Imagine, como se fosse o Facebook. No Facebook você é um objeto, é uma entidade. Porém, você tem todos os posts que você fez, você tem todos os seus amigos, você tem uns posts dos seus amigos, você tem os compartilhamentos.

Então, por exemplo, quisermos recuperar a entidade que te representa, se eu quiser ler o seu perfil, todos os seus amigos e todos os amigos dos seus amigos. Esse é um tipo de relacionamento que é muito complicado de você ler, de um banco de dados relacional porque ele demora muito.

Então, do ponto de vista de performance, você não consegue ter uma performance boa quando você faz esse tipo de recuperação num banco tradicional. Quando você usa um banco de dados, por exemplo, NoSQL baseado em gráfico você consegue ter uma alta performance na recuperação desses tipos de dados.

O DynamoDB não é um banco de dados do tipo gráfico, mas a AWS tem um banco de dados do tipo gráfico que se chama Neptune.


#### Memória

É um banco de dados NoSQL que basicamente fica quase tempo todo com as informações de memória. Ele é utilizado para aplicações que precisam de informações em tempo real e com tempo de resposta em microssegundos que são menores que milissegundos e que pode ocasionalmente ter picos de acesso, como jogos eletrônicos, transmissões ao vivo, entre outros.

É um tipo de banco de dados NoSQL que é muito utilizado para quando você precisa acessar um volume grande de dados e tem um tempo de resposta pequeno. Por isso que um dos grandes casos de uso aqui são jogos, porque jogos on line você não pode ficar esperando uma consulta num banco de dados relacional, principalmente quando é um jogo onde você joga, por
exemplo, online com multijogadores, ali você precisa ter uma performance realmente muito grande, então acabamos utilizando esse tipo de banco de dados.


## DynamoDB

Tipo: Suporta estrutura de dados chave-valor e documentos

Arquitetura: Serveless - Sem a necessidade de provisionar servidores

Gerenciado:
    *Presença Global
    *Capacidade Adaptável
    *Alta Escalabilidade
    *Backup e Recuperação sob demanda e point-in-time
    *TTL - Time to Live, permite definir a vida útil do dado

Seguro:
    *Controle de Acesso
    *Criptografia de Dados Ociosos

Monitorado:
    *Métricas de Utilização e operacionais no CloudWatch

Custos:
    *Paga apenas pelo que usar

DAX - DynamoDB Accelerator
    *Uso de cache de memória gerenciado e altamente disponível

Índices:
    *Índices Secundários - Flexibilização de Consultas

### Para o Desenvolvedor

Uso Local:
    *Permite desenvolver e testar localmente

Streams:
    *Permite criar sequências quando alterações acontecerem nas tabelas do DynamoDB

Trigger:
    *Executar código lambda automaticamente baseado em uma condição

Acesso:
    *AWS Console
    *AWS CLI
    *AWS SDK (NodeJS, Python, Go, Java, Ruby, etc)

Integração com Serviços AWS:
    *Kinesis Stream
    *DynamoDB Stream
    *IoT
    *S3
    *CloudWatch Logs
    *SNS
    *AWS Lambda


# Terminologia

No DynamoDB não temos o conceito de "database".
Não temos "FK".

Temos PK e a Tabela possui o nível mais alto e são independentes...
Cada tabela pode ter sua própria estrutura...
Tabelas super flexíveis...

### Termos

| AWS DynamoDB             | SQL                      |
|--------------------------|--------------------------|
| Tables                   | Tables                   |
| Items                    | Items                    |
| Attributes               | Columns                  |
| PK - Obrigatório         | PK - Opcional            |
| Local Secondary Indexes  | Indexes                  |
| Global Secondary Indexes | Views                    |


PK:
DynamoDB: Mínimo 1 - Máximo 2 atributos 
> Obs: DynamoDB utiliza o termo Partition Key
> Obs2: O segundo componente da chave primária é o Sort Key

SQL: Multi Colunas


### Tabela SQL

| Order_id | Cliente_id | Produto_id | Valor   | Status       |
|----------|------------|------------|---------|--------------|
| 100123   | 237890     | 987292     | 125.12  | Entregue     |
| 100124   | 237890     | 988876     | 142.98  | Entregue     |
| 100128   | 374568     | 546734     | 139.23  | Em Processo  |

### DynamoDB

```
[
    {
        "order_id":"100123",
        "cliente_id":"237890",
        "produto_id":"987292",
        "valor":"125.12",
        "status":"entregue"
    },
    {
        "order_id":"100124",
        "cliente_id":"237890",
        "produto_id":"988876",
        "valor":"142.98",
        "status":"entregue"
    },
    {
        "order_id":"100128",
        "cliente_id":"374568",
        "produto_id":"546734",
        "valor":"139.23",
        "status":"em processo"
    }
]
```


##  Convenção de Nomes

Convenção de Nomes das Tabelas e Atributos

*3 a 255 caracteres
*a-z
*A-Z
*_(underline)
*-(traço)
*.(ponto)

Atributos - Nomes de 1 a 255 caracteres

UTF-8
"***" Case Sensitive
": #" Palavras Reservadas


## Tipos de Dados

### Scalar Type
    *Só pode ter um valor
    *String, number, boolean, binary, null
    *Index e Keys são do tipo scalar e suportam apenas String, number e binary

    **String**
    *Texto (UTF-8)
    *Não pode ser um valor vazio
    *"Amazon", " Maria", "Game of Thrones"

    **Number**
    *Números (Negativos e Positivos (100.12, 123.56, -1034, -345.13, 0, 1345))

    **Boolean**
    *true ou false

    **Binary**
    *Dados binários - BLOB (não pode ser um valor vazio (imagens, vídeos, documentos))

    **Null**
    *Indefinido / Desconhecido 

### Set Type
    *Conjunto de valores tipo Scalar
    *Não precisa ser ordenado
    *Não pode ter valores vazios (em branco)
    *Não permite valores duplicados
    *Não permite coleção vazia
    *Valores tem que ser do mesmo tipo Scalar

        Exemplos:
            ["Azul", "Verde", "Amarelo", "Branco"] - permitido
            [true, false, false, true, false, true, true] - permitido
            [2009, 2010, -1.90, 3.54, 4345] - permitido

            ["Azul", 2010, true, "-vWhnidARRVvrerFFE"] - proíbido

### Document Type
    *Estruturas aninhadas e complexas
    *Maps e Lists
    *Até 32 níveis
    *Não permite valores vazios dentro de lists e maps
    *Permite lists e maps vazios

        Exemplos:
            [] - permitido
            ["Apple", "Titanium", 1234.12] - permitido
            [{{"nome":"Marlon"}}] - permitido

            ["",""] - proíbido
            ["nome":""] - proíbido


### Exemplo de item dentro do DynamoDB

```
{
    "carro_id":"A83848484",
    "foto_frontal":"v9dj399JnnnINJJ(jss90Nns9jdnji)()9mknnknoNINio(iJniu99HjibI*89HjBVty87UGbIBIJiuHU(H989*((ujiiji",
    "marca":"BMW",
    "modelo","X1",
    "opcoes_cores",["Branco", "Preto", "Azul", "Cinza"],
    "itens_opcionais":{
        "motor":["B74774",47575,true],
        "":[12.6,34.5,false,"verified"]
    },
    "origem":{
        "base":"Berlin",
        "pod_location":{
            "geospace":{
                "latitude": 52.520918,
                "longitude": 13.397987
            }
        }
    }
}
```

> Neste item do DynamoDB temos 3 tipos inseridos (Document(Map), Set e Scalar)