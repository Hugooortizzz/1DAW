CREATE DATABASE CLIENTE_PRODUCTO;

USE CLIENTE_PRODUCTO;

CREATE TABLE Cliente(
    DNI VARCHAR(9) NOT NULL PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL
);

CREATE TABLE Producto(
    cod_producto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fabricante VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    stock INT
);

CREATE TABLE Compras(
    DNI VARCHAR(9) NOT NULL,
    cod_producto INT NOT NULL,
    unidades INT NOT NULL,
    fecha DATETIME NOT NULL,
    PRIMARY KEY(DNI, cod_producto),
    FOREIGN KEY (DNI) REFERENCES Cliente(DNI),
    FOREIGN KEY (cod_producto) REFERENCES Producto(cod_producto)
);

INSERT INTO Cliente(DNI, Nombre) VALUES("32657845K", "Antonio"), ("12234543Q", "María");
INSERT INTO Producto(fabricante, modelo, stock) VALUES ("Google", "Pixel 8 Pro", 4), ("Xiaomi", "14T", 12), ("Apple", "iPhone 13", 3);
INSERT INTO Compras(DNI, cod_producto, unidades, fecha) VALUES ("32657845K", 1, 1, NOW()), ("32657845K", 2, 2, NOW()), ("12234543Q", 1, 1, NOW());


