USE CONSULTAS;

/* CREACIÓN DE LA TABLA */
CREATE TABLE IF NOT EXISTS Products(
ProductID int not null,
ProductName VARCHAR(50),
SupplierID int,
CategoryID int,
Unit VARCHAR(80),
Price DECIMAL(10,2),
PRIMARY KEY(ProductID)
);


/* HABILITAR IMPORTACION MYSQL */
SET GLOBAL local_infile=1;
quit

/* IMPORTACIÓN DEL CSV */
USE ACTIVIDAD_SOBRE_CONSULTAS2;

LOAD DATA LOCAL INFILE "/home/hugom/Downloads/products.csv"

INTO TABLE Products

COLUMNS TERMINATED BY ';'

OPTIONALLY ENCLOSED BY '"'

LINES TERMINATED BY '\n'

IGNORE 1 LINES;

/* 1) Listar todos los clientes (customers) con un valor NULL en el campo "Address" */
SELECT * FROM Customers WHERE Address IS NULL;

/* 2) Listar todos los clientes (customers) con valor distinto de NULL en el campo "Address" */
SELECT * FROM Customers WHERE Address IS NOT NULL;

/*  3) Listar el producto (Products) con el precio más barato */
SELECT MIN(Price) AS Cheapest_Product FROM Products;

/* 4) Encontrar el precio del producto más caro */
SELECT MAX(Price) AS Most_Expensive_Product FROM Products;

/* 5) Encontrar el número de productos existentes */
SELECT COUNT(*) AS Existing_Product FROM Products;

/* 6) Encontrar la media de precio de todos los productos */
SELECT AVG(Price) AS Average_Price FROM Products;

/* 7) Encontrar todos los clientes (CustomerName) que empiecen por el carácter 'a' */
SELECT * FROM Customers WHERE CustomerName LIKE "a%";

/* 8) Encontrar todos los clientes (CustomerName) que terminan por el carácter 'a' */
SELECT * FROM Customers WHERE CustomerName LIKE "%a";

/* 9) Encontraer los clientes cuyo nombre (CustomerName) que tienen los caracteres "or" en cualquier posición */
SELECT * FROM Customers WHERE CustomerName LIKE "%or%";

/* 10) Encontrar los clientes cuyo nombre (CustomerName) tienen 'r' en la segunda posición */
SELECT * FROM Customers WHERE CustomerName LIKE "_r%";

/* 11) Seleccionar los clientes cuyo nombre (CustomerName) empieza con 'a' y tienen al menos 3 caracteres en longitud */
SELECT * FROM Customers WHERE CustomerName LIKE "a___%";

/* 12) Seleccionar los clientes cuyo nombre (CustomerName) NO empieza por la letra 'a' */
SELECT * FROM Customers WHERE CustomerName NOT LIKE "a%";

/* 13) Seleccionar todos los clientes que están localizados en "Germany", "France" o "UK". */
SELECT * FROM Customers WHERE Country IN("Germany", "France", "UK");

/* 14) Seleccionar todos los clientes que NO estén localizados en "Germany", "France" o "UK". */
SELECT * FROM Customers WHERE Country NOT IN("Germany", "France", "UK");

/* 15) Descansa y respira un poco */

/* 16) Seleccionar los productos que tengan un precio entre 10 y 20 */
SELECT * FROM Products WHERE Price BETWEEN 10 AND 20;

/* 17) Seleccionar los productos que tengan un precio entre 10 y 20. Y además no pertenezcan a la categoría (CategoryID) de 1, 2 o 3. */
SELECT * FROM Products WHERE Price BETWEEN 10 AND 20 AND CategoryID NOT IN(1, 2, 3);

/* 18) Seleccionar todos los productos cuyo nombre de producto (ProductName) esté entre "Carnarvon Tigers" y "Mozzarella di Giovanni". */
SELECT * FROM Products WHERE ProductName BETWEEN "Carnavon Tigers" and "Mozzarella di Giovanni";

/* 19) Crear una consulta con 2 alias, uno para la columna CustomerID y otro para la columna CustomerName */
SELECT CustomerID AS ID, CustomerName AS Name FROM Customers;

/* 20-21) Descansa un poco y respira profundo */

/* 22) Averiguar el número de clientes (customers) en cada país (country) */
SELECT COUNT(*) AS Clients, Country FROM Customers GROUP BY Country;