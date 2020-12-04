use db_empresa;
create table tb_funcionario(
id bigint auto_increment,
nome varchar(100),
cpf bigint(60),
cargo varchar(100),
email varchar (100),
foreign key(id) 
);

