/* Usando la BD www realiza los siguientes apartados (recuerda que se dispone de las siguientes tablas:  
Categories,Customers,Employees, OrderDetails, Orders, Products, Shippers y Suppliers) */
USE CONSULTAS3;

/* 1.- Indica el nombre de las mensajerías usadas por el cliente "France restauration".  Tienen que aparecer el nombre del cliente y el nombre de la mensajería
No pueden aparecer filas duplicada */
SELECT  Customers.CustomerName, Shippers.ShipperName FROM Orders
INNER JOIN Customers
ON Orders.CustomerID = Customers.CustomerID
INNER JOIN Shippers
ON Orders.ShipperID = Shippers.ShipperID
WHERE Customers.CustomerNAme = "Cliente 3 S.L.";

/* 2. Lista todos los detalles de pedidos con su nombre de producto, su identificador de detalle de pedido y quién  lo ha suministrado (Suppliers) */
SELECT OrderDetails.OrderDetailID, Suppliers.SupplierName, Products.ProductName,  FROM OrderDetails
LEFT JOIN Orders
ON OrderDetails.OrderID = Orders.OrderID 
LEFT JOIN Products
ON OrderDetails.ProductID = Products.ProductID
LEFT JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID;

/* 3. Empleados que hayan nacido a partir del año 1963 incluido (YEAR), y sus pedidos realizados. Tiene que aparecer el nombre completo usando CONCAT, el año de nacimiento y los identificadores de pedidos */
SELECT Employees.FirstName, Employees.LastName, Employees.BirthDate AS BirthDate, Orders.OrderID FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
WHERE YEAR(BirthDate) > 1995;

/* 4. Visualiza la CANTIDAD de productos por categorías.  Deben aparecer la cantidad y el nombre de la categoría */
SELECT Categories.CategoryName, COUNT(Products.ProductID) AS ProductsPerCategory FROM Categories
LEFT JOIN Products
ON Categories.CategoryID = Products.CategoryID
GROUP BY (Products.ProductID);

/*  5. Listar el nombre de los 5 primeros productos ordenados alfabéticamente sin admitir duplicados*/
