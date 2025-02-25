CREATE DATABASE db_quitanda;
-- criar um banco de dados com o nome database

CREATE DATABASE db_escola_evelyn;

USE db_quitanda;

USE db_escola_evelyn;

-- id = chave primária -> dado único -> não pode ser criado pelo usuário
CREATE TABLE tb_produtos
( id BIGINT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
quantidade INT,
datavalidade DATE,
preco DECIMAL,
PRIMARY KEY(id)
);

INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES 
("banana", 1200, "2025-02-26", 10.0);

-- depois de rodar, se inserir maais um produto e rodar novamente ele vai adicionar todos produtos de novo
INSERT INTO tb_produtos (nome, quantidade, datavalidade, preco) VALUES 
("abacate", 400, "2025-02-27", 15.0),
("goiaba", 550, "2025-02-26", 10.0);

SELECT * FROM tb_produtos;

SELECT nome FROM tb_produtos;

SELECT nome, preco FROM tb_produtos;

-- com caracter especial, precisa das aspas
SELECT nome AS NomeProduto, preco "Preço" FROM tb_produtos;

-- tupla é uma linha do banco, retornar só uma linha
-- * todas as colunas
SELECT  * FROM tb_produtos WHERE id = 3;

SELECT * FROM tb_produtos WHERE preco <= 10;

-- operadores AND OR NOT
SELECT * FROM tb_produtos WHERE preco <> 10 OR quantidade > 40;

-- ajustes na estrutura para modificar campo existente
ALTER TABLE tb_produtos MODIFY preco DECIMAL(6,2);

-- alteração para ajustar um campo
ALTER TABLE tb_produtos ADD descricao VARCHAR(255);

-- ataualizar a informação
UPDATE tb_produtos SET preco  = 2.99;

-- setar/passar configuração -> sem trava de segurança
SET SQL_SAFE_UPDATES = 0;

-- habilitar travas
SET SQL_SAFE_UPDATES = 1;

-- safe mode só deixa 
DELETE FROM tb_produtos WHERE id = 2;

SET SQL_SAFE_UPDATES = 0;

DELETE FROM tb_produtos WHERE nome = "banana";

-- apagar
DROP TABLE tb_produtos;
 
DROP DATABASE db_quitanda;
DROP DATABASE db_escola_evelyn;
 
 SET SQL_SAFE_UPDATES = 1;