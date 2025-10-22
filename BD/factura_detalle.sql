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

CREATE TABLE Producto(
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    precio DECIMAL NOT NULL,
    stock INT
);


CREATE TABLE Detalle(
    num_detalle INT AUTO_INCREMENT NOT NULL,
    id_factura INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT,
    precio DECIMAL NOT NULL,
    PRIMARY KEY (num_detalle, id_factura),
    FOREIGN KEY (id_factura) REFERENCES Factura(num_factura),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);

INSERT INTO Cliente(nombre, apellido) VALUES ("Antonio" , "Martinez"), ("Claudia", "Fernandez");
INSERT INTO Factura(id_cliente, fecha) VALUES(1, NOW()), (2, NOW());
INSERT INTO Producto(nombre, precio, stock) VALUES("Taladro", 25.50, 5), ("Motosierra", 100, 10);
INSERT INTO Detalle(id_factura, id_producto, cantidad, precio) VALUES(1, 2, 3, 76.5), (2, 1, 1, 100);