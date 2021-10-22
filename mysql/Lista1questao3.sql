CREATE DATABASE db_ecommerce;

USE db_ecommerce;
CREATE TABLE tb_produtos(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255),
    tipo VARCHAR(255),
	cor VARCHAR(255),
    valor DOUBLE,
    PRIMARY KEY(id_produto)
);
use db_ecommerce;
INSERT INTO tb_produtos(nome,tipo,cor,valor) VALUES
("Luá","Camisa","Vermelho",199.99),
("Seaway","Boné","Verde",59.99),
("Jeans","Calça","Azul",299.99),
("Adidas","Tênis","Cinza",499.99),
("Ouro","Anel","Bege",799.99),
("Prata","Pulseira","Roxo",99.99),
("Borgonha","Esmalte","Ciano",29.99),
("Sol","Base","Amarelo",79.99);

SELECT * FROM tb_produtos WHERE valor<500;
SELECT * FROM tb_produtos WHERE valor>500;

USE db_ecommerce;
UPDATE tb_produtos SET valor = 159.99 WHERE id_produto= 1;