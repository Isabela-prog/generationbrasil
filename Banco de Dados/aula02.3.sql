-- adc coluna que recebe a chave estrangeira
ALTER TABLE tb_produtos ADD categoriaid BIGINT;

ALTER TABLE tb_produtos ADD CONSTRAINT 
fk_produtos_categorias 
FOREIGN KEY (categoriaid)
REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos;

UPDATE tb_produtos SET categoriaid = 1 WHERE id = 3;

INSERT INTO tb_produtos
(nome, quantidade, datavalidade, preco, categoriaid) VALUES
("Cenoura", 500, "2023-12-15", 2.00, 2);

SELECT * FROM 
tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoriaid = tb_categorias.id;

SELECT * FROM
tb_produtos LEFT JOIN tb_categorias
ON tb_produtos.categoriaid = tb_categorias.id;

SELECT * FROM
tb_produtos RIGHT JOIN tb_categorias
ON tb_produtos.categoriaid = tb_categorias.id;