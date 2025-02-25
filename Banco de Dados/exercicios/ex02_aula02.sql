CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos
( id BIGINT AUTO_INCREMENT,
nome VARCHAR (255) NOT NULL,
cor VARCHAR (255),
preco BIGINT NOT NULL,
tipo VARCHAR (255),
PRIMARY KEY (id)
);

INSERT INTO tb_produtos (nome, cor, preco, tipo) values
("Amora", "vermelho", 100.0, "camiseta"),
("Renner", "jeans", 150.0, "calça"),
("C&A", "estampado", 50.0, "cropped"),
("Renner", "rosa bebê", 200.0, "vestido"),
("Riachuelo", "branco", 130.0, "blusão");

SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET preco = 500.0 WHERE id = 4;

SELECT * FROM tb_produtos;

DROP DATABASE db_ecommerce;