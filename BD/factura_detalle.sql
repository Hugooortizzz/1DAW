CREATE DATABASE FACTURA_DETALLE;

USE FACTURA_DETALLE;

CREATE TABLE Cliente(
    id_cliente INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    apellido VARCHAR(30) NOT NULL
);

CREATE TABLE Factura(
    num_factura INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    fecha DATE NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE Detalle(
    num_detalle INT AUTO_INCREMENT NOT NULL,
    id_factura INT 
)