-- ordenar por ordem alfabética
SELECT * FROM tb_produtos ORDER BY nome ASC;

SELECT * FROM tb_produtos ORDER BY nome DESC;

INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("tomate",100, "2023-12-15", 8.00);
INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("maçã",20, "2023-12-15", 5.00);
INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("laranja",50, "2023-12-15", 10.00);
INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("banana",200, "2023-12-15", 12.00);
INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("uva",1200, "2023-12-15", 30.00);
INSERT INTO tb_produtos(nome, quantidade, datavalidade, preco) 
values ("pêra",500, "2023-12-15", 2.00);

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (descricao)
VALUES ("Frutas");

INSERT INTO tb_categorias (descricao)
VALUES ("Verduras");

INSERT INTO tb_categorias (descricao)
VALUES ("Legumes");

INSERT INTO tb_categorias (descricao)
VALUES ("Temperos");

INSERT INTO tb_categorias (descricao)
VALUES ("Ovos");

INSERT INTO tb_categorias (descricao)
VALUES ('Outros');

SELECT * FROM tb_categorias ORDER BY descricao ASC;

SELECT * FROM tb_categorias WHERE descricao = "Cereais";

SELECT * FROM tb_categorias WHERE descricao LIKE "%s";

SELECT * FROM tb_categorias WHERE descricao LIKE "%a%";

SELECT * FROM tb_produtos WHERE preco IN(5, 10.0, 15.0);

SELECT * FROM tb_produtos WHERE preco BETWEEN 5.0 AND 15.0;

-- media dos preços
SELECT AVG(preco) AS "Média de preços" FROM tb_produtos;

-- soma dos preços
SELECT SUM(preco) AS "Soma total de preços" FROM tb_produtos;

-- preço mais caro
SELECT MAX(preco) AS "Valor mais caro" FROM tb_produtos;

-- preço mais barato
SELECT MIN(preco) AS "Valor mais barato" FROM tb_produtos;

-- contar quantos registros
SELECT COUNT(preco) AS "Quantidade de produtos" FROM  tb_produtos;