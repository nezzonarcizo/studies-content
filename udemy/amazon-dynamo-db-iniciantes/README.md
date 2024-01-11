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
*  Presença Global
*  Capacidade Adaptável
*  Alta Escalabilidade
*  Backup e Recuperação sob demanda e point-in-time
*  TTL - Time to Live, permite definir a vida útil do dado

Seguro:
*  Controle de Acesso
*  Criptografia de Dados Ociosos

Monitorado:
*  Métricas de Utilização e operacionais no CloudWatch

Custos:
*  Paga apenas pelo que usar

DAX - DynamoDB Accelerator
*  Uso de cache de memória gerenciado e altamente disponível

Índices:
*  Índices Secundários - Flexibilização de Consultas

### Para o Desenvolvedor

Uso Local:
*  Permite desenvolver e testar localmente

Streams:
*  Permite criar sequências quando alterações acontecerem nas tabelas do DynamoDB

Trigger:
- Executar código lambda automaticamente baseado em uma condição

Acesso:
*  AWS Console
*  AWS CLI
*  AWS SDK (NodeJS, Python, Go, Java, Ruby, etc)

Integração com Serviços AWS:
*  Kinesis Stream
*  DynamoDB Stream
*  IoT
*  S3
*  CloudWatch Logs
*  SNS
*  AWS Lambda


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
*  Só pode ter um valor
*  String, number, boolean, binary, null
*  Index e Keys são do tipo scalar e suportam apenas String, number e binary

**String**
*  Texto (UTF-8)
*  Não pode ser um valor vazio
*  "Amazon", " Maria", "Game of Thrones"

**Number**
*  Números (Negativos e Positivos (100.12, 123.56, -1034, -345.13, 0, 1345))

**Boolean**
*  true ou false

**Binary**
*  Dados binários - BLOB (não pode ser um valor vazio (imagens, vídeos, documentos))

**Null**
*  Indefinido / Desconhecido 

### Set Type
*  Conjunto de valores tipo Scalar
*  Não precisa ser ordenado
*  Não pode ter valores vazios (em branco)
*  Não permite valores duplicados
*  Não permite coleção vazia
*  Valores tem que ser do mesmo tipo Scalar

    Exemplos:
        ["Azul", "Verde", "Amarelo", "Branco"] - permitido
        [true, false, false, true, false, true, true] - permitido
        [2009, 2010, -1.90, 3.54, 4345] - permitido
        ["Azul", 2010, true, "-vWhnidARRVvrerFFE"] - proíbido

### Document Type
*  Estruturas aninhadas e complexas
*  Maps e Lists
*  Até 32 níveis
*  Não permite valores vazios dentro de lists e maps
*  Permite lists e maps vazios

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


# Tipos de Dados - JSON DynamoDB

## Tipos de Dados e seus descritores para DynamoDB JSON

É possível especificar descritores para os Tipos de Dados do DynamoDB em formato JSON, conforme o exemplo abaixo:

```
{     
"Item": {         
	"Age": {"N": "8"},         
	"Colors": {
		"L": [
			{"S": "White"},
			{"S": "Brown"},
			{"S": "Black"}             
		]         
	},
	"Name": {"S": "Fido"},         
	"Vaccinations": {             
		"M": {                 
			"Rabies": {                     
				"L": [                         
					{"S": "2009-03-17"},                         
					{"S": "2011-09-21"},                         
					{"S": "2014-07-08"}                     
				]                 },                 
				"Distemper": {"S": "2015-10-13"}             
			}         
		},         
		"Breed": {"S": "Beagle"},         
		"AnimalType": {"S": "Dog"}     
	} 
}
```

Cada um dos tipos de dados é descrito abaixo:

* S - String
* N - Number
* B - Binary
* BOOL - Boolean
* NULL - Null
* M - Map
* L - List
* SS - String Set
* NS - Number Set
* BS - Binary Set


# Modelo de Consistência


AWS tem presença global, ela tem infraestrutura em diversos países do mundo, por exemplo, São Paulo, no Brasil, Virgínia, nos Estados Unidos, Londres, Frankfurt, etc.
Cada uma dessas infraestruturas globais são o que nós chamamos de **_region_**, e cada uma das regiões têm zonas de disponibilidade ou **_availability zones_**, e cada zona de disponibilidade basicamente é um ou mais datacenters da Amazon AWS que estão interligados entre si. Esses datacenters de cada uma das regiões dentro das zonas de disponibilidade, são sincronizados de forma que você possa ter no serviço da AWS, que você usa, confiabilidade, performance, redundâncias, tolerância a falhas e etc.

No caso do DynamoDB, a AWS, salva todos os dados do DynamoDB em discos SSDs de altíssima velocidade. Esses dados eles são salvos e são sincronizados entre as zonas de disponibilidade entre os datacenters da AWS dentro daquela região. A região que você escolheu para ter o seu DynamoDB para ter as suas tabelas, ali o DynamoDB salva seus dados em partições. Então, dessa forma, você acaba tendo três cópias dos dados em cada uma das regiões e regiões geográficas da AWS. Isso é importante porque você acaba tendo um sistema realmente flexível, robusto, seguro, tolerante a falhas e com uma performance incrível.

Você tem uma replicação **_Near Realtime_** entre essas zonas de disponibilidade, então que acontece, esssa replicação é quase em tempo real. Você praticamente quase nem percebe a replicação dos seus dados. E, obviamente, isso acontece porque se você tiver também um problema numa zona de disponibilidade, os seus dados vão estar disponíveis em outra, a AWS vai fazer esse roteamento, você não vai nem perceber e você acaba tendo então domínios independentes tolerantes a falhas. A AWS cuida gerencia para que você tenha o seu Dynamo DB sempre disponível.

Com isso em mente...

veremos que isso tudo é para criar um modelo de consistência que ele chama de **_Read Consistency_** que é o modelo de leitura no DynamoDB.


## Read Consistency

O read consistency, ou consistência de leitura, é a forma como a gente lê os dados nas nossas tabelas no DynamoDB.
Hoje existem dois tipos de read consistency no Dynamo DB, um que se chama **_Eventually Consistency_**  e um que se chama **_Strongly Consistency_**.

### Eventually Consistency

Este modelo de consistência pode refletir ou não a última cópia dos dados. Ele é padrão para todas as operações e ele custa mais barato, ou seja, ele custa 50% mais barato. Se você escolher esse tipo de leitura, ela custa 50% mais barato. O que acontece aqui, nesse caso, por ele dizer, *"pode refletir ou não a última cópia dos dados"*, porque esse modelo de leitura não vai diretamente na tabela, ele não vai na tabela para trazer o último dado salvo para sua pesquisa ou sua leitura, ele vai trazer um dado que está em cache. Você faz leitura nesse cache e por isso você pode trazer um dado que não foi o último dado gravado, não foi o último dado atualizado.

Então onde isso é muito útil?

Quando você precisa ler um volume muito grande, você tem um número muito grande de requisições de leitura, mas você tem um número muito pequeno de requisições de gravação. Seria uma aplicação que lê muito, mas grava pouco. Essa situação faz sentido muitas vezes, porque você às vezes não precisa estar lendo os últimos dados, um exemplo:

Imagine que você têm um catálogo de produtos com 1 milhão de produtos, onde você, por exemplo, atualiza o preço uma vez por semana, enquanto que a leitura desses dados é diária e frequente, então, obviamente, faz sentido você ler os dados que estão num cache. Por quê? Porque você vai trazer um dado que não é o último dado, mas ainda ser um dado útil para sua aplicação.


### Strongly Consistency

É um tipo de leitura que lhe vai diretamente na tabela. Então, ele tem os dados atuais, a última versão, ou seja, se você salvou o dado, acabou de salvar e foi lá ler, vai ler a última versão do que foi salvo. Ele vai diretamente na tabela e não passa pelo cache, ele precisa ser requisitado explicitamente.

Então o que acontece quando você está programando a sua leitura de dados no DynamoDB, se você não definir explicitamente, *"quero fazer uma leitura do tipo strongly"*, ou seja, *"quero ler diretamente na tabela"*, ele vai por padrão, ler do tipo *eventually*, ou seja, ele vai ler do cache.


Como falamos, o eventually consistent, é mais barato e strongly consistent vai direto na tabela, é um pouco mais caro. Cada um tem o seu caso de uso. Cada um é eficiente em determinada situação.
Convém analisar ao longo do tempo, conforme você for utilizando o DynamoDB, o que funciona melhor para a sua aplicação.


### Read Consistency
|  Eventually Consistency   |  Strongly Consistency  |
|---------------------------|------------------------|
| Pode ou não usar cache    | Dados atuais da tabela |
| Modelo Padrão de consulta | Escolha Explícita      |
|     50% mais barato       |                        |



# Unidades de Capacidade - Capacity Units

## Troughput Capacity - Reads and Writes

* Definida por **TABELA (Table)**
* Controla Capacidade de Leitura (Read) e Gravação (Write)
* Suporta Auto Scaling

* Definida por **RCUs** (Read Capacity Unit)
* Definida por **WCUs** (Write Capacity Unit)

* Capacity Unit = 1 requisição/segundo

* **Capacity Unit's definem o preço a ser cobrado pelo uso do DynamoDB**


## Capacity Units

### RCU - Read Capacity Unit
|         Read          |     Capacity     | 
|-----------------------|------------------|
|  Strongly Consistent  | 1 table read/sec |
| Eventually Consistent | 2 table read/sec |
|         Bloco         |       4KB        |


### WCU -  Write Capacity Unit
|     Write   |     Capacity      |
|-------------|-------------------|
|    Write    | 1 table write/sec |                     
|    Bloco    |        1KB        |



### Capacidade Provisionada

RCU: 03
WCU: 03

### Leitura - RCU
|         Type          |             Measure               |
|-----------------------|-----------------------------------|
| Strongly Consistent   |       4KB x 3 = 12KB/seg          |
| Eventually Consistent | 4KB x 3 = 12KB/seg x 2 = 24KB/seg |


### Gravação - WCU
|        Type           |     Measure       |
|-----------------------|-------------------|
| Eventually Consistent | 1KB x 3 = 3KB/seg |



...
**_Exemplo de cálculo de leitura e gravação de um arquivo de 0.5KB_**

### Leitura

**Strongly Consistent**:    0.5KB / 4KB = 0.125 => arredondando (método utilizado AWS/DynamoDB) = 1 RCU

**Eventually Consistent**:  0.5KB / 4KB = (0.125 / 2) => 0.0625 => arredondando => 1 RCU

### Gravação

**Write**: 0.5KB / 1KB = 0.5 => arredondando => 1 WCU

**Total capacidade provisionada:** 1 RCU e 1 WCU


...
**_Exemplo de cálculo de leitura e gravação de um arquivo de 25KB_**

### Leitura

**Strongly Consistent**:    25KB / 4KB = 6.25 => arredondando (método utilizado AWS/DynamoDB) = 7 RCU

**Eventually Consistent**:  25KB / 4KB = (6.25 / 2) => 3.125 => arredondando => 4 RCU

### Gravação

**Write**: 25KB / 1KB = 25 => arredondando => 25 WCU

**Total capacidade provisionada:** 7 RCU e 25 WCU

> Outras funcionalidades dentro do "capacity units" que fazem parte dos recursos do DynamoDB
### Burst Capacity
    Característica: Utiliza até 300 segundos da capacidade não utilizada para:

* Utilizada para estouros ou picos ocasionais
* Pode ser consumida mais rápido do que a capacidade provisionada
* Não podemos planejar demandas baseados nesta reserva, mas sabemos que existe este recurso
* DynamoDB pode usa-la em background para tarefas administrativas


### Escalabilidade
    Característica: Controle sempre que necessário da capacidade de RCU e WCU

* Podemos escalar para cima sempre que necessário
* Podemos escalar para baixo 4 vezes por dia
* Afeta o comportamento da partição


# Hands-on - Criando Tabela no DynamoDB

> Vide Aula 12...

Criação de uma tabela e adição de um registro

```
{
  "email": {
    "S": "test@test.com"
  },
  "nome": {
    "S": "John Doe"
  }
}
```

# Partitions

As tabelas do DynamoDB são salvas, são agrupadas ou acondicionadas em partições.
Essa é uma forma que a AWS encontra de criar um modelo de consistência para suas tabelas do DynamoDB e para também garantir performance.

Exemplo

|  Tabela   |
|-----------|
| Partition |
|  10GB     |
| 3000 RCU  |
| 1000 WCU  |

> Isto é 100% Gerenciado pelo DynamoDB

Uma partição então no DynamoDB tem um limite de dez gigabytes de tamanho de espaço alocado, então os seus dados na tabela tem um limite de dez gigabyte por partição. Uma partição tem um limite de 3000 unidades de leitura e 1000 unidades de gravação, esse é o limite para uma partição.

Agora, se a sua tabela é muito maior que isso e ela precisa de muito mais espaço, muito mais unidades de leitura e gravação, o DynamoDB automaticamente cria novas partições para sua tabela, isso é feito de forma automática e totalmente gerenciado pelo DynamoDB pela WS.

Porém, é muito importante que você entenda como as partições funcionam, porque isso pode te ajudar num futuro a resolver problemas de performance nas suas tabelas ou para que você consiga alocar melhor a sua capacidade de leitura e gravação, de forma que você não impacte a performance das suas tabelas.

Agora, como é que o Dynamo DB faz a alocação dessas partições?

## Exemplos:

### Cálculo 1

Capacidade máxima de uma partição no DynamoDB = Round(RCU(Prov/3000) + WCU(Prov/1000))

Capacidade Provisionada (Configurada na Criação) = 650RCU e 650WCU

Quocientes (RCU(650/3000) e WCU(650/1000)) = 0.22 | 0.65

Round = 0.22 + 0.65 = 0.87

> Arredondamos pra cima

Patições = 1


### Cálculo 2

Capacidade máxima de uma partição no DynamoDB = Round(RCU(Prov/3000) + WCU(Prov/1000))

Capacidade Provisionada (Configurada na Criação) = 1050RCU e 1050WCU

Quocientes (RCU(1050/3000) e WCU(1050/1000)) = 0.35 | 1.05

Round = 0.35 + 1.05 = 1.40

> Arredondamos pra cima

Patições = 2

> Uma vez alocada, a Partition não sofre alterações na sua configuração

Então vamos fazer mais um exemplo de cálculo de partição pois ele é importante.
Então imagina que, por exemplo, você tem uma tabela e ela está numa partição e essa partição tem dez gigabytes de tamanho, e ela tem 650 unidades de leitura e 650 de gravação. E vamos supor que, por uma razão específica,você precisa aumentar a quantidade de leitura e a quantidade de gravação na sua tabela, então a sua tabela está tendo mais acessos, enfim, cresceu o número de usuários, etc.

|  Tabela   |
|-----------|
| Partition |
|    10GB   |
|   650RCU  |
|   650WCU  |

Então o que vai acontecer com a sua tabela?

Ela já tem lá 650 para leitura e 650 para gravação.

A conta é a mesma que já fizemos...

+1250RCU e +1250WCU

Quocientes (RCU(1250/3000) e WCU(1250/1000)) = 0.42 | 1.25

Round = 0.42 + 1.25 = 1.67

Partition(s) = 2

> O que vai acontecer é que o DynamoDB vai dividir a nova capacidade provisionada

|  Tabela   |  Tabela   |             
|-----------|-----------|
| Partition | Partition |
|    10GB   |    10GB   |
|   625RCU  |   625RCU  |
|   625WCU  |   625WCU  |


> Agora temos duas novas partições com capacidade de leitura e gravação menores que a nossa partição original.Neste caso específico que foi exemplificado talvez não teríamos problema, mas num caso onde o provisionamento gere mais partições com os valores muito abaixo do qual estavamos trabalhando, poderemos enfrentar problemas de desempenho na nossa aplicação.


# Indíces - Indexes


* Primary Key é **_OBRIGATÓRIA_** no DynamoDB

Primary Ki é obrigatória no DynamoDB. No DynamoDB você não pode criar uma tabela sem ter uma chave primária. Ela é obrigatória e ela pode ser simples, ou seja, ela pode ter um atributo só.
Quando ela é simples e tem um atributo, esse atributo é o **Partition Key** ou **Hash Key**, como o Dynamo DB também chama.
Ela pode ser uma chave composta, ou seja, você pode ter dois atributos para compor a sua chave primária, onde uma vai ser chamada de **Partition Key** e a outra vai ser chamada de **Sort Key**.

* Simples -> Partition Key ou Hash Key
* Composta -> Partition Key + Sort Key

A Partition Key, é extremamente importante porque ela é utilizada por um algoritmo do DynamoDB que se chama **Hashing Algorithm** para determinar em que partição do DynamoDB vai salvar aquele item daquela tabela. Pois bem, isso é super importante porque, por exemplo, quando definimos a partition key o DynamoDB faz uma análise, faz um cálculo e define em qual das partições que a nossa tabela tem que ele vai gravar. Então, isso faz com que a primary key seja necessária em qualquer operação de busca. Qualquer operação de leitura que você for fazer no DynamoDB você é obrigado a passar a primary key.


## Partition Key

> Primary Key é necessária nas operações de busca

Além do primary key, temos ainda os **Local Secondary Index** e o **Global Secondary Index**.

O Local Secondary Index basicamente, é um segundo índice que criamos para a tabela. É um índice realmente onde usamos a primeiro key para criar um segundo índice.
Enquanto que o Global Secundary Indice é muito mais parecido com a view dos bancos de dados relacionais. Nos bancos de dados relacionais temos a capacidade de criar visões para aquela tabela, que não necessariamente são índices, mas são visões ordenadas por um determinado conjunto de atributos.

Então até o momento temos 3 tipos de Indices

* Primary Key
* Local Secondary Indexes
* Global Secondary Indexes


Vamos utilizar o mesmo item do banco que exemplificamos em uma aula anterior:

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

Aqui poderíamos utilizar a seguinte Primary Key:

### Primary Key
| Partition_Key | carro_id |
| Sort_Key      | marca    |


Exemplo de Local Secondary Index:

> Obs: Quando utilizamos um Local Secondary Index, temos que utilizar a mesma Partition Key

### Local Secondary Index
| Partition_Key | carro_id |
| Sort_Key      | modelo   |

Exemplo de Global Secondary Index

> Obs: Quando utilizamos o Global Secondary Index, não precisamos utilizar a mesma Partition Key da Primary Key, podemos utilizar qualquer outro atributo

### Global Secondary Index
| Partition_Key | marca  |
| Sort_Key      | modelo |


*Vejamos os atributos do Local e Global Secondary Indexes*

## Local Secondary Indexes

* Possui o mesmo partition key, mas sort key diferentes da Primary Key
* Deve ser definido no momento da crição da tabela
* Compartilha os RCU's e WCU's da Tabela
* Pode ser usado para leituras **Eventually Consistent e Strongly Consistent**


## Global Secondary Indexes

* Pode ser criado até 5 GSI
* Pode ser criado a qualquer momento
* Possuem Partition Independente
* Deve ser definida a quantidade de RCU's e WCU's para GSI
* A quantidade de RCU's e WCU's é independente da tabela
* Suporta apenas leitura do tipo **Eventually Consistent**



# Hands-on - Cirando Indices para Tabelas

> Vide Aula 15...


# Preços

[Preços do Amazon DynamoDB](https://aws.amazon.com/pt/dynamodb/pricing/)

No serviço do DynamoDB somos cobrados por cada tabela de forma individual. O cálculo dos custos levam em consideração os seguintes parâmetros:

* Espaço em Disco - GB (SSD)
* Read Capacity Unit - RCU
* Write Capacity Unit - WCU
* Transferência de Dados

> Obs: Na AWS somos cobrados apenas pelos dados que saem da Rede da AWS, normalmente em GBs


## Custos Adicionais

Outros atributos como:

* Auto Scaling
* Backup e Restore
* Stream
* Tabelas Globais

São cobrados separadamente, a parte de RCU, WCU e Storage.


## Nível Gratuito

* 25 GB / mês
* 25 RCU e 25 WCU / mês
* 2.5M Solicitações Stream / mês
* Tabelas Globais - Até 2 regiões

## On Demand

* Não precisa definir a Capacidade Provisionada (RCU/WCU)
* Paga por requisições feitas na Tabela
* Cresce conforme o uso
* Cobrança similar nos custos adicionais (backup, global tables, etc)

> Obs: Quando utilizamos On Demand não somos elegíveis ao Free Tier (Nível Gratuito)


# Introdução a APIs e Webhooks

Nessa aula nós vamos falar de dois elementos super importantes que são os **Webhooks** e as **APIs**.

Os Webhooks e as APIs são tecnologias que permitem a integração entre aplicações e a troca de informações entre elas em tempo real.

Como é que isso funciona?

Vamos imaginar que, por exemplo, você tem uma aplicação que precise fazer acesso a um banco de dados. Sua aplicação podia muito bem fazer o acesso ao banco de dados diretamente e então ele devolver as informações solicitadas. Porém, muitas vezes não é permitido que seja feito dessa forma, diretamente.

Por quê?

Por vários fatores, questão de segurança, por questão de conformidade, por questão de propriedade. Enfim, pode ser por questão de performance, pode ter uma série de questões que inviabilizem esse acesso direto da aplicação ao banco de dados.

O que pode ser feito, então, entre a aplicação A e o banco de dados?

Você pode ter um Webhook ou uma API!

A aplicação então faz acesso a esse Webhook ou a esta API, que faz acesso ao banco de dados, que devolve para essa API ou para este Webhook e que então, devolve para a sua aplicação.

## Webhooks

Webhooks são integrações baseadas em eventos. O termo Webhook é muito utilizado quando você tem programação orientada a eventos, um exemplo:

Imagina que você tem uma aplicação que é uma aplicação de rede social, como por exemplo, Instagram ou Facebook. Então, toda vez que você dá um like lá no Instagram, um gostei no Instagram ou um like no Facebook, isso dispara um evento que chamam um Webhook da plataforma do Facebook ou do Instagram. Esse Webhook automaticamente atualiza esses dados na plataforma do Facebook que devolve essa atualização para a aplicação, ele informa a aplicação que a requisição/ação foi persistida.

A partir do momento que você clicou lá no like, ele dispara um evento e toda essa atualização ela é feita.


## API

API ela já é uma integração que é feita sob demanda, ou seja, não é exatamente quando o evento ocorre. Um exemplo:

Imagina que você tem um sistema contábil, não um sistema de controle financeiro, onde uma vez por mês você faz a conciliação bancária. Então que acontece essa conciliação?
A cada mês você precisa ir lá no seu banco e pegar os seus extratos bancários para que você faça essa atualização bancária. O seu banco pode disponibilizar uma API aonde a sua aplicação chama essa API, por exemplo, pede esses extratos e esses extratos são enviados via API para sua aplicação. Isso é um pedido sob demanda e não acontece baseado num evento como acontece ali no Like do Facebook.


## Mais detalhes sobre a diferença entre um Webhook e uma API

Um webhook e uma API são duas maneiras diferentes de permitir a comunicação entre sistemas ou aplicativos, mas têm finalidades e funcionamentos distintos:

### Webhook:

* Push de dados: Um webhook é um método de envio de dados em que um servidor envia informações automaticamente para outro servidor quando ocorre um evento específico. Em outras palavras, é uma notificação que o servidor emissor envia ao servidor receptor quando algo acontece. O servidor receptor precisa estar configurado para lidar com essas notificações.

* Assíncrono: Os webhooks são tipicamente usados para comunicação assíncrona, o que significa que o servidor receptor não precisa ficar constantemente fazendo solicitações para obter dados, mas em vez disso, ele recebe atualizações quando eventos ocorrem.

* Exemplo de uso: Um exemplo comum é quando um serviço de pagamento envia uma notificação para um servidor quando uma transação é concluída. O servidor receptor pode então realizar ações com base nessa notificação, como atualizar um banco de dados ou enviar um e-mail de confirmação.

### API (Application Programming Interface):

* Solicitação e Resposta: Uma API é uma interface que permite que dois aplicativos se comuniquem fazendo solicitações e recebendo respostas. Ela define um conjunto de regras e protocolos para a comunicação entre os aplicativos.

* Síncrono ou Assíncrono: As APIs podem ser síncronas ou assíncronas, dependendo de como são projetadas. Muitas APIs são projetadas para funcionar por meio de solicitações HTTP (síncronas), mas também podem ser usadas para comunicação assíncrona.

* Exemplo de uso: Quando você usa uma API de previsão do tempo, por exemplo, você faz uma solicitação para o servidor da API, que processa a solicitação e retorna os dados meteorológicos solicitados como resposta. A comunicação é iniciada pelo cliente (você) e é controlada pela solicitação e resposta.

Em resumo, a principal diferença entre um webhook e uma API é que um webhook é uma forma de comunicação assíncrona na qual o servidor emissor envia automaticamente notificações quando ocorrem eventos, enquanto uma API é uma interface que permite que aplicativos solicitem e obtenham dados de forma síncrona ou assíncrona, com o controle iniciando a partir do aplicativo que faz a solicitação. Ambas as abordagens têm seus usos específicos, dependendo dos requisitos do sistema e do fluxo de dados desejado.


# Introdução ao NodeJS e Glitch

## NodeJS

NodeJS é uma plataforma para a criação de Aplicações Web de Alta Escalabilidade.

Motivos pelos quais NodeJS foi escolhido pelo instrutor:

* Muito popular entre desenvolvedores
* Projeto de código aberto
* Baseado em Javascript
* Programação pode ser orientada a eventos
* Altamente escalável
* Permite um número muito grande de conexões simultâneas
* Tornou-se a principal plataforma para desenvolvimento de Webhooks e APIs

### NPM

NPM é um gerenciador de pacotes para o NodeJS.

O NPM amplia as funcionalidades e capacidade de integração do NodeJS com outras tecnologias ou agrupa bibliotecas, facilitando a utilização de tecnologias e simplificando o desenvolvimento de aplicações. Exemplos de conexões que podemos realizar utilizando módulos NPM são SDK AWS, DynamoDB etc.

Outros exemplos:

* Manipulação de arquivos
* Acesso a Banco de dados MySQL
* Internet das coisas
* Envio de e-mails

## Glitch

[Glitch](https://glitch.com/)

Existem diversas implementações de NodeJS no mercado, sejam elas pagas, sejam elas grátis. Por exemplo, uma plataforma paga NodeJS muito conhecida, muito utilizada pelos profissionais é a Heroku, é uma das plataformas mais utilizadas de NodeJS, porém é uma plataforma paga.

Aqui no curso, nós vamos usar uma plataforma que se chama Glitch. O Glitch é uma plataforma grátis de NodeJS para que você possa criar os seus projetos, aprender programação,fazer teste, criar suas APIs.


# Hands-on - Visão geral da plataforma Glitch

> Vide Aula 20...



# **Atenção** - Usando Glitch com pacote Express

> Vide Aula 21...

server.txt (arquivos do curso)



# Hands-on - Configurando AWS SDK para NodeJS

> Vide Aula 22...

[Ferramentas para criar com a AWS](https://aws.amazon.com/pt/developer/tools/)

[AWS SDK para NodeJS](https://aws.amazon.com/pt/sdk-for-javascript/)

Nessa aula nós vamos falar sobre o Software Development Kit da AWS.
Toda vez que queremos acessar um serviço da AWS de forma programática, ou seja, através de programação, temos que usar um SDK, um software development kit da AWS.
E para que vejamos os ultimos SDK disponíveis, plataformas, linguagem de programação etc, temos que ir na página da AWS, barra Tools.

> Links disponíveis acima

Temos SDK disponíveis para Java, .Net, NodeJS, PHP, Python, Ruby, Browser, Go, C++ e alguns para IoT e outras plataformas, como Android. Por exemplo, que o Android, iOS, React, mobile web etc. Então temos uma gama muito grande de plataformas e linguagens de programação que são suportadas pelos SDKs da AWS. Obviamente, eles permitem que acessemos os diversos serviços da AWS, assim como o Dynamo DB.

No nosso caso utilizaremos o SDK para NodeJS.

> Obs: Além dos pacotes "aws-sdk" e "express" vamos também utilizar o pacote "body-parser" e o seguinte trecho de código que será adicionado ao nosso server.js

```
var bodyParser = require('body-parser')
app.use( bodyParser.json() );       // to support JSON-encoded bodies
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
  extended: true
}));
```



# Hands-on - Configurando acesso para o AWS SDK 

> Vide Aula 23...



# Hands-on - Criando API para Operações em Tabela

> Vide Aula 24...

server.txt (arquivos do curso)

[Class AWS.DynamoDB](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/DynamoDB.html)

