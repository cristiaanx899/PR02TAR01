-- Crea la base de datos y la tabla productos
CREATE DATABASE chalet;
USE chalet;

CREATE TABLE productos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(200),
    precio DECIMAL(10,2) NOT NULL
);

INSERT INTO productos (nombre, descripcion, precio) VALUES ('Producto 1', 'Descripción 1', 10.50);
INSERT INTO productos (nombre, descripcion, precio) VALUES ('Producto 2', 'Descripción 2', 20.00);