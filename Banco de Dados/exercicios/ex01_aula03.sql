CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_personagens
(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
usuario VARCHAR(255) NOT NULL,
nacionalidade VARCHAR(255),
datanascimento DATE,
PRIMARY KEY(id)
);

CREATE TABLE tb_classes
(
id BIGINT AUTO_INCREMENT,
ataque BIGINT,
defesa BIGINT,
PRIMARY KEY(id)
);

INSERT INTO tb_classes (ataque, defesa) VALUES
(1001.0, 278.0),
(375.0, 666.0),
(1350.0, 889.0),
(500, 250),
(55.0, 27.0);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

ALTER TABLE tb_personagens ADD classesid BIGINT;

ALTER TABLE tb_personagens ADD CONSTRAINT -- tabela onde será criada a FK
fk_personagens_classes -- nome da fk
FOREIGN KEY (classesid) -- coluna onde será prenchida
REFERENCES tb_classes(id); -- de onde pegaráalter

INSERT INTO tb_personagens (nome, usuario, nacionalidade, datanascimento, classesid) VALUES
("Isabela", "IsaS", "BR", "1994-04-11", 1),
("Flavia", "FVV", "BR", "2000-12-05", 2),
("Jeff", "JF", "BR", "1999-03-01", 3),
("Carlos", "Caca", "BR", "2001-08-12", 4),
("Fernanda", "Fefe", "BR", "1996-07-13", 5),
("Diogo", "Dodo", "EUA", "1997-05-28", 5),
("Sandra", "San", "BR", "1980-03-12", 3),
("Fatima", "Fafa", "BR", "1998-03-21", 2);

SELECT  * FROM tb_personagens INNER JOIN tb_classes WHERE ataque > 1000;

SELECT  * FROM tb_personagens INNER JOIN tb_classes WHERE ataque BETWEEN 300 AND 1000;

SELECT  * FROM tb_personagens INNER JOIN tb_classes;

SELECT * FROM tb_personagens WHERE nome LIKE "C%";

SELECT  * FROM tb_personagens INNER JOIN tb_classes WHERE ataque
DROP DATABASE db_generation_game_online;




