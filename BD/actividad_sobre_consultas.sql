/* CREACIÓN DE LA BD Y LA TABLA (METADATOS) */
CREATE DATABASE CONSULTAS;
USE CONSULTAS;
CREATE TABLE IF NOT EXISTS Customers(
CustomerID int not null,
CustomerName VARCHAR(80),
ContactName VARCHAR(80),
Address VARCHAR(120),
City VARCHAR(60),
PostalCode VARCHAR(20) ,
Country VARCHAR(20),
PRIMARY KEY(CustomerID)
);

/* Importando el CSV (Suponemos que ya se ha habilitado la importación en mysql) */
USE CONSULTAS;

LOAD DATA LOCAL INFILE "/home/hugom/Downloads/customers.csv"

INTO TABLE Customers

COLUMNS TERMINATED BY ';'

OPTIONALLY ENCLOSED BY '"'

LINES TERMINATED BY '\n'

IGNORE 1 LINES;

/* 1) Listar de "Customers" solo aquellos cuya ciudad sea "Berlin" o "Stuttgart". */
SELECT * FROM Customers WHERE City = "Berlin" OR City = "Stuttgart";

/* 2) Listar de "Customers" donde el pais sea "Germany" o "Spain". */
SELECT * FROM Customers WHERE Country = "Germany" OR Country = "Spain";

/* 3) Listar de "Customers" donde el país NO es "Germany" */
SELECT * FROM Customers WHERE NOT Country = "Germany";

/* 4) Listar de "Customers" donde el país es "Germany" y la ciudad es "Berlin" o "Stuttgart" */
SELECT * FROM Customers WHERE Country = "Germany" AND City = "Berlin" OR City = "Stuttgart";

/* 5) Listar de "Customers" donde el país no es "Germany" y tampoco "USA". */
SELECT * FROM Customers WHERE NOT Country = "Germany" AND NOT Country = "USA";

/* 6) Listar "Customers" ordenados por la columna "Country"  */
SELECT * FROM Customers ORDER BY Country;

/* 7) Listar "Customers" ordenados de forma descendente por la columna "Country" */
SELECT * FROM Customers ORDER BY Country DESC;

/* 8) Listar "Customers" ordenados por la columna "Country" y luego por la columna ¨CustomerName" */
SELECT * FROM Customers ORDER BY Country, CustomerName;

/* 9) Listar "Customers" ordenados ascendentemente por "Country" y descendentemente por "CustomerName" */
SELECT * FROM Customers ORDER BY Country ASC, CustomerName DESC;