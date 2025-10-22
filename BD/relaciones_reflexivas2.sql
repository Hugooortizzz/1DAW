CREATE DATABASE RELACIONES_REFLEXIVAS2;

USE DATABASE RELACIONES_REFLEXIVAS2;

CREATE TABLE Producto(
    id_producto INT PRIMARY KEY,
    nombre VARCHAR(50),
    id_producto_padre INT,
    FOREIGN KEY (id_producto_padre) REFERENCES Producto(id_producto)
);

INSERT INTO Producto(id_producto, nombre, id_producto_padre) VALUES (1, "Resistencia", NULL), (2, "Condensador", NULL), (3, "Placa Interruptor", 1), (4, "Placa Interruptor", 2);