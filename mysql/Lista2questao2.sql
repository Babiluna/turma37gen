CREATE DATABASE db_pizza_legal ;

USE db_pizza_legal ;
CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    tamanho ENUM ('Pequena','Media', 'Grande'),
    tipo_massa ENUM ('Tradicional', 'Fina'),

    PRIMARY KEY (id_categoria)
    );
    
    CREATE TABLE tb_pizza (
    id_pizza INT AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda ENUM ('Catupiry', 'Cheddar','Sem Borda'),
    recheio BOOLEAN NOT NULL,
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
    );
    
    INSERT INTO tb_categoria (tamanho, tipo_massa) VALUES 
    ('Pequena', 'Fina'),
    ('Média', 'Fina'),
    ('Grande', 'Fina'),
    ('Pequena', 'Tradicional'),
    ('Media', 'Tradicional'),
    ('Grande', 'Tradicional');
    
    SELECT * FROM tb_categoria ; 
    
    INSERT INTO tb_pizza (sabor, borda, recheio, valor, fk_id_categoria) VALUES
    ('Calabresa', 'Catupiry', 1, 10.50, 1),
    ('Nordestina', 'Cheddar', 0, 45.50, 2),
    ('Peperoni', 'Catupiry', 1, 12.50, 3),
    ('Frango', 'Cheddar', 0, 10.50, 3),
    ('Brigadeiro', 'Catupiry', 1, 12.50, 2),
    ('Beijinho', 'Cheddar', 0, 65.00, 1);
    
   SELECT * FROM tb_pizza ; 

SELECT * FROM tb_pizza WHERE valor > 45.00 ; 

SELECT * FROM tb_pizza WHERE valor > 29.00 AND valor < 60.00 ;

SELECT * FROM tb_pizza WHERE sabor LIKE 'c%' ; 

SELECT * FROM tb_categoria 
INNER JOIN tb_pizza 
ON tb_pizza.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_pizza ON tb_pizza.fk_id_categoria = tb_categoria.id_categoria
WHERE id_categoria = 1;