create database db_green_journey;
use db_green_journey;

create table tb_missao (
	id int primary key auto_increment,
    titulo varchar(100),
    descricao varchar(500),
    nivelDificuldade int,
    pontos int
);

create table tb_pessoa (
	id int primary key auto_increment, 
    username varchar(200) not null, 
    email varchar(200) not null,
    senha varchar(200) not null,
    pontuacao int,
    tipoPessoa char
);

create table tb_missaoAt (
	finalizada boolean,
    id_missao int,
    id_pessoa int,
    primary key(id_missao, id_pessoa),
    constraint fk_missao foreign key (id_missao) references tb_missao (id),
    constraint fk_pessoa foreign key (id_pessoa) references tb_pessoa (id)
);

INSERT INTO tb_pessoa (username, email, senha, pontuacao, tipoPessoa) VALUES ("administrador", "admin@greenjourney.com", "adminadmin123", null, 'A');


