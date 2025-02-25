CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos
( id BIGINT AUTO_INCREMENT,
nome VARCHAR (255) NOT NULL,
endereco VARCHAR (255),
curso VARCHAR (255) NOT NULL,
media BIGINT NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO tb_alunos (nome, endereco, curso, media) values
("Ale", "Rua dos Vales", "EM", 8.0),
("Beatriz", "Av. Cactos", "EM", 5.0),
("Alice", "Rua dos Bombeiros", "EF", 7.0),
("Dennis", "Rua Lincon", "EF", 9.0),
("Carla", "Av de Dados", "EM", 6.0),
("Carolina", "Av Pinheiros", "EF", 4.0),
("Bob", "Rua Santa", "EM", 7.0),
("Rafael", "Avenida Santos Drummond", "EF", 7.0);

SELECT * FROM tb_alunos WHERE media > 7;

SELECT * FROM tb_alunos WHERE media < 7;

UPDATE tb_alunos SET media = 9.0 WHERE id = 6;

DROP DATABASE db_escola;