CREATE DATABASE MedFacil;
USE MedFacil;

CREATE TABLE Usuario(
Id_usuario INT auto_increment primary key,
nome VARCHAR(100) not null,
email VARCHAR(100) unique not null,
senha VARCHAR(100) not null,
telefone VARCHAR(20),
endereco VARCHAR(300),
tipo enum("cliente", "farmacia", "entregador") default "cliente"
);
 
CREATE TABLE Cadastro_Farmacias(
Id_farmacia INT auto_increment primary key,
nome VARCHAR(100) not null,
CNPJ VARCHAR(100) unique not null,
email VARCHAR(100),
telefone VARCHAR(20),
endereco VARCHAR(300)
);

CREATE TABLE Produtos(
Id_produto INT auto_increment primary key,
nome VARCHAR(100) not null,
categoria VARCHAR(100),
laboratorio VARCHAR(100)
);

CREATE TABLE Farmacia_Produtos(
Id_farmacia INT,
Id_produto INT,
preco DECIMAL(10,2) not null,
estoque INT DEFAULT 0,
primary key(Id_farmacia, Id_produto),
foreign key(Id_produto) references Produtos(Id_produto),
foreign key(Id_farmacia) references Cadastro_Farmacias(Id_farmacia)
);

create table Pedidos(
Id_pedido int auto_increment primary key,
Id_usuario int not null,
Id_farmacia int not null,
status enum ("pendente", "em preparo", "a caminho", "entregue", "cancelado") default "pendente",
valor_total decimal(10,2),
foreign key (Id_usuario) references Usuario(Id_usuario),
foreign key (Id_farmacia) references Cadastro_Farmacias(Id_farmacia)
);

create table itens_pedidos(
Id_item INT auto_increment primary key,
Id_pedido int,
Id_produto int,
Quantidade int not null,
preco_unitario decimal(10,2) not null,
foreign key(Id_pedido) references Pedidos(Id_pedido),
foreign key(Id_produto) references Produtos(Id_produto)
);

create table entregas(
Id_entrega INT auto_increment primary key,
Id_pedido int not null,
Id_entregador int not null,
status enum ("pendente", "em preparo", "a caminho", "entregue", "cancelado") default "pendente",
foreign key(Id_pedido) references Pedidos(Id_pedido),
foreign key(Id_entregador) references Usuario(Id_usuario)
);



