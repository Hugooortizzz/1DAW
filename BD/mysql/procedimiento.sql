-- Crear la base de datos
CREATE DATABASE ejercicioPrincipio;


-- Usar la base de datos (en MySQL)
USE ejercicioPrincipio;


-- Crear tabla clientes
CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    ciudad VARCHAR(100)
);


-- Crear tabla precio
CREATE TABLE precio (
    id INT PRIMARY KEY AUTO_INCREMENT,
    producto VARCHAR(100),
    precio_unitario DECIMAL(10, 2)
);


-- Crear tabla compras
CREATE TABLE compras (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT,
    producto_id INT,
    cantidad INT,
    precio_total DECIMAL(10, 2),
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (producto_id) REFERENCES precio(id)
);


-- Insertar datos en clientes
INSERT INTO clientes (nombre, ciudad) VALUES
('Ana López', 'Madrid'),
('Carlos Ruiz', 'Barcelona'),
('Laura Martínez', 'Sevilla'),
('Pedro Sánchez', 'Valencia'),
('Sofía García', 'Bilbao'),
('Jorge Fernández', 'Granada'),
('Lucía Torres', 'Zaragoza'),
('Miguel Gómez', 'Málaga'),
('Elena Díaz', 'Salamanca'),
('Raúl Ortega', 'Toledo');


-- Insertar datos en precio
INSERT INTO precio (producto, precio_unitario) VALUES
('Teclado', 25.99),
('Ratón', 15.50),
('Monitor', 199.99),
('Impresora', 89.95),
('USB 64GB', 12.99),
('Portátil', 799.00),
('Altavoces', 49.90),
('Webcam', 39.99),
('Tablet', 299.99),
('Silla Gaming', 149.90);


-- Insertar datos en compras
INSERT INTO compras (cliente_id, producto_id, cantidad, precio_total) VALUES
(1, 1, 2, 51.98),
(2, 3, 1, 199.99),
(3, 5, 3, 38.97),
(4, 2, 1, 15.50),
(5, 6, 1, 799.00),
(6, 9, 2, 599.98),
(7, 4, 1, 89.95),
(8, 10, 1, 149.90),
(9, 7, 2, 99.80),
(10, 8, 1, 39.99);

-- 1) Crea el procedimiento ciudadesConcatenadas(INOUT lista_ciudades TEXT que visualice la tabla de clientes usando el 
-- parámetro con una lista de ciudades concatenadas. No pueden existir repetidas

DELIMITER //

CREATE PROCEDURE ciudadesConcatenadas
(INOUT lista_ciudades TEXT)
BEGIN
    DECLARE ciudad_actual VARCHAR(20);
    DECLARE fin INT DEFAULT 0;
    DECLARE cursor_ciudades CURSOR FOR
        SELECT DISTINCT ciudad FROM clientes ORDER BY ciudad;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    OPEN cursor_ciudades;

    leer_loop: LOOP
        FETCH cursor_ciudades INTO ciudad_actual;
        IF fin = 1 THEN
            LEAVE leer_loop;
        END IF;
        IF lista_ciudades = '' THEN
            SET lista_ciudades = ciudad_actual;
        ELSE
            SET lista_ciudades = CONCAT(lista_ciudades, ', ', ciudad_actual;
        END IF;
    END LOOP;

    CLOSE cursos_ciudades;