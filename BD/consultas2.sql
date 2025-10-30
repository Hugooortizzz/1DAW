CREATE DATABASE CONSULTAS2;
USE CONSULTAS2;

CREATE TABLE productos(
id int not null,
nombre varchar(50),
precio DECIMAL(10,2),
categoria VARCHAR(50),
PRIMARY KEY(id)
);

INSERT INTO productos VALUES 
(1, "Televisor", 300, "Electrónica"),
(2,	"Laptop",	800,	"Electrónica"),
(3,	"Silla",	50,	"Muebles"),
(4,	"Mesa",	150,	"Muebles"),
(5,	"Smartphone",	600,	"Electrónica");