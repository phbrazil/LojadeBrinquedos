CREATE DATABASE LojaBrinquedosDatabase;
USE LojaBrinquedosDatabase;

CREATE TABLE Usuarios(
  CodigoUser INT NOT NULL AUTO_INCREMENT,
  NomeUser Varchar (30) NOT NULL,
  Username VARCHAR(50) NOT NULL,
  Password VARCHAR(20), 
  PRIMARY KEY (CodigoUser));


INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Paulo Henrique Bezerra","Paulo.Bezerra","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Lucas Medeiros","Lucas.Medeiros","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Andre Pereira","Andre.Pereira","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Pedro Paulo Olivira","Pedro.Oliveira","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Matheus Diamantino","Matheus.Diamantino","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Guilherme Feitosa","Guilherme.Feitosa","Mortadela1");
INSERT INTO Usuarios(NomeUser, username,Password) VALUES ("Gabriel","Gabiru","Mortadela1");


CREATE TABLE Clientes(
Nome VARCHAR(60) NOT NULL,
Logradouro VARCHAR(50) NOT NULL,
RG VARCHAR(20) NOT NULL,
CPF BIGINT(11) NOT NULL AUTO_INCREMENT,
Bairro VARCHAR(50) NOT NULL,  
Cidade VARCHAR(50) NOT NULL,
Estado VARCHAR(50) NOT NULL,
UF VARCHAR(2) NOT NULL,
Telefone VARCHAR(15) NOT NULL,
Celular VARCHAR(15),
Email VARCHAR(30),
Sexo VARCHAR(10) NOT NULL,
EstadoCivil VARCHAR(20),
Nascimento DATE NOT NULL,
PRIMARY KEY (CPF));

CREATE TABLE Vendas(
IDVenda INT NOT NULL AUTO_INCREMENT,
CPFCliente BIGINT(11) NOT NULL,
TotalValor FLOAT (5,2),
DataCompra DATE,
QuantidadeItens INT NOT NULL,
PRIMARY KEY (IDVenda, CPFCliente),
FOREIGN KEY (CPFCliente) REFERENCES Clientes (CPF));

INSERT INTO Clientes (Nome,Logradouro,RG,CPF,Bairro,Cidade,Estado,UF,Telefone,Celular,Email,Sexo,EstadoCivil,Nascimento) 
VALUES ("Paulo Henrique Bezerra", "Rua mario Wilches 10", "466825523", "37519758885","JD Maria Fernandes","S�o Paulo", "S�o Paulo","SP","11981997228","55268573",
"pauloh2012sul@gmail.com","Masculino", "Solteiro",'1990-01-29');






CREATE TABLE Produtos(
idproduto INT NOT NULL AUTO_INCREMENT,
codigobarras LONG NOT NULL,
Nomeproduto VARCHAR(60) NOT NULL,
Valor DECIMAL(12, 2),
FaixaEtaria VARCHAR(20) NOT NULL,
Fabricante VARCHAR(50),  
PrazoGarantia VARCHAR(30),
Quantidade INT NOT NULL,
PRIMARY KEY (idproduto));


INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('1,'Telefone Feliz',59.99,'0 � 12 meses','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('2,'Mordedor Macaco Brincalh�o',29.99,'0 � 12 meses','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('3,'Rob�zinho BeatBo',399.99,'0 � 12 meses','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('4,'Cachorrinho - Aprendendo a Brincar',179.50,'0 � 12 meses','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('5,'Lamparina Aprender e Brincar ',139.99,'0 � 12 meses','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('6,'Chocalho e Mordedor',19.99,'0 � 12 meses','ELKA','',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('7,'Chocalho Galinha Pintadinha',39.99,'0 � 12 meses','ELKA','',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('8,'Pir�mide de Argolas',49.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('9,'Boneca Minnie - Conta hist�rias',99.99,'De 1 � 2 anos','ELKA','',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('10,'Mega Bloks - �nibus da Escola 123 - 45 pe�as',99.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('11,'Figura de atividade - Montro Labirinto Divertido',189.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('12,'Mochila animada do cachorrinho',199.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('13,'Piano cachorrinho aprender e brincar ',179.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('14,'Pel�cia Interativa ',99.99,'De 1 � 2 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('15,'Boneco Baby Alive Menino - loiro',249.60,'De 3 � 4 anos','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('16,'Boneca Baby Alive - loira',499.00,'De 3 � 4 anos','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('17,'Microfone com base - Barbie',149.60,'De 3 � 4 anos','Bar�o Distribuidor','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('18,'Boneca Little Mommy',89.80,'De 3 � 4 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('19,'Mini Ve�culo com personagem - PJ Masks',69.99,'De 3 � 4 anos','DTC','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('20,'Boneco Liga da Justi�a - Superman',39.99,'De 3 � 4 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('21,'Boneco Liga da Justi�a - Coringa',39.99,'De 3 � 4 anos','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('22,'Veiculo Furg�o Patrulheiro - Patrulha Canina',699.99,'De 5 � 6 anos','Sunny','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('23,'Boneco - AuthenticGames',109.99,'De 5 � 6 anos','ZR Toys','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('24,'Jogo Pizzaria maluca',59.99,'De 5 � 6 anos','Grow','',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('25,'Massa de Modelar - Super massa',39.99,'De 5 � 6 anos','Estrela','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('26,'Boneco Power Ranger Dino Charger - Armadura de Luxo',79.90,'De 5 � 6 anos','Sunny','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('27,'Pista Hot Wheels - fuga em alto mar',79.99,'De 5 � 6 anos','Mattel','',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('28,'Luva Lan�a Teias - Spider Man',79.99,'De 5 � 6 anos','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('29,'Lego Super Heroes - Disney - Marvel - Spider man',149.99,'De 7 � 8 anos ','Lego','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('30,'Lego City - Ve�culo de Policia Off Road',49.99,'De 7 � 8 anos ','Lego','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('31,'Veiculo - Avi�o Patruleiro - Patrulha Canina',419,'De 7 � 8 anos ','Sunny','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('32,'Lego super Heroes - Poderosos Micros: Iron man',89.99,'De 7 � 8 anos ','Lego','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('33,'Hand Spinner - Ladybug',24.99,'De 7 � 8 anos ','Novabrink','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('34,'Hand Spinner - Batman',24.99,'De 7 � 8 anos ','Novabrink','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('35,'Lan�ador de Dardo - Nerf Rebelle',129.99,'De 7 � 8 anos ','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('36,'Pi�o Beyblade',199.99,'De 9 � 10 anos ','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('37,'Lego Speed Champions - Mercedes',129.99,'De 9 � 10 anos ','Lego','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('38,'Lego Manicraft',259.99,'De 9 � 10 anos ','Lego','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('39,'Conjunto de Pista - Hot Wheels - Super lava r�pido',169.99,'De 9 � 10 anos ','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('40,'Bicicleta Pincesas Disney com Cesta - Aro 16',599.99,'De 9 � 10 anos ','Bandeirante','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('41,'Picareta do Jogo - N�vel Diamante',59.90,'De 9 � 10 anos ','ZR Toys','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('42,'noneca Barbie - Fashion com acess�rios',129.99,'De 9 � 10 anos ','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('43,'Casa da Barbie dos sonhos',1599.99,'De 11 ou mais','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('44,'Arena Beyblade Burst - azul',119.70,'De 11 ou mais','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('45,'Carrinho Hot Wheels - Ve�culo B�sico',9.99,'De 11 ou mais','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('46,'Mini Figura e ve�culo - imaginext DC Comics',49.99,'De 11 ou mais','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('47,'Boneca Barbie - Dreamtopia - Reino dos doces ',139.99,'De 11 ou mais','Mattel','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('48,'Balde de soldados - 60 pe�as',49.99,'De 11 ou mais','TOYNG','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('49,'Boneco Articula 30cm - Titan Hero - Hulk',89.99,'De 11 ou mais','Hasbro','3 meses',1);
INSERT INTO Produtos (codigobarras, Nomeproduto, Valor, FaixaEtaria, Fabricante, PrazoGarantia, Quantidade) VALUES ('50,'Carrinho Die Cast - Forza Motorsport',19.99,'De 11 ou mais','Mattel','3 meses',1);












