CREATE DATABASE db_rh_empresa;

USE db_rh_empresa;

CREATE TABLE tb_colaboradores
( id BIGINT AUTO_INCREMENT,
nome VARCHAR (255) NOT NULL,
cpf BIGINT NOT NULL,
salario BIGINT NOT NULL,
email VARCHAR (255) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores (nome, cpf, salario, email) values
("Isabela", 1234567891, 3500.0, "andorinha@gmail.com"),
("Marcelo", 5678931542, 2000.0, "eumesmo@hotmail.com"),
("Eva", 123789552, 1999.0, "aeva@outlook.com"),
("Anderson", 678953212, 1300.0, "andersoncomums@gmail.com"),
("Adriano", 765921602, 3400.0, "adeadriano@hotmail.com");

SELECT * FROM tb_colaboradores WHERE salario > 2000.0;

SELECT * FROM tb_colaboradores WHERE salario < 2000.0;