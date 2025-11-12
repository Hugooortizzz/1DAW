CREATE DATABASE IF NOT EXISTS CONSULTAS3;

USE CONSULTAS3;

CREATE TABLE IF NOT EXISTS Suppliers(
    SupplierID INT AUTO_INCREMENT PRIMARY KEY,
    SupplierName VARCHAR(40),
    ContactName VARCHAR(80),
    Address VARCHAR(120),
    City VARCHAR(120),
    PostalCode VARCHAR(10),
    Country VARCHAR(50),
    Phone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Categories(
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(50),
    Description VARCHAR(120)
);

CREATE TABLE IF NOT EXISTS Shippers(
    ShipperID INT AUTO_INCREMENT PRIMARY KEY,
    ShipperName VARCHAR(80),
    Phone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Customers(
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerName VARCHAR(80),
    ContactName VARCHAR(80),
    Address VARCHAR(120),
    City VARCHAR(60),
    PostalCode VARCHAR(10),
    Country VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Employees(
    EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
    LastName VARCHAR(120),
    FirstName VARCHAR(80),
    BirthDate DATE,
    Photo VARCHAR(120),
    Notes VARCHAR(300)
);


CREATE TABLE IF NOT EXISTS Orders(
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerID INT,
    EmployeeID INT,
    OrderDate DATE,
    ShipperID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
    FOREIGN KEY (ShipperID) REFERENCES Shippers(ShipperID)
);

CREATE TABLE IF NOT EXISTS Products(
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    ProductName VARCHAR(50),
    SupplierID INT,
    CategoryID INT,
    Unit VARCHAR(50),
    Price DECIMAL(10,2),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

CREATE TABLE IF NOT EXISTS OrderDetails(
    OrderDetailID INT AUTO_INCREMENT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Shippers
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (1,'Shipper 1','+34 600 000 001');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (2,'Shipper 2','+34 600 000 002');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (3,'Shipper 3','+34 600 000 003');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (4,'Shipper 4','+34 600 000 004');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (5,'Shipper 5','+34 600 000 005');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (6,'Shipper 6','+34 600 000 006');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (7,'Shipper 7','+34 600 000 007');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (8,'Shipper 8','+34 600 000 008');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (9,'Shipper 9','+34 600 000 009');
INSERT INTO Shippers (ShipperID, ShipperName, Phone) VALUES (10,'Shipper 10','+34 600 000 010');

-- Customers
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (1,'Cliente 1 S.L.','Contacto 1','Calle 1 Nº 11','Sevilla','41001','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (2,'Cliente 2 S.L.','Contacto 2','Calle 2 Nº 12','Cádiz','41002','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (3,'Cliente 3 S.L.','Contacto 3','Calle 3 Nº 13','Huelva','41003','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (4,'Cliente 4 S.L.','Contacto 4','Calle 4 Nº 14','Málaga','41004','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (5,'Cliente 5 S.L.','Contacto 5','Calle 5 Nº 15','Granada','41005','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (6,'Cliente 6 S.L.','Contacto 6','Calle 6 Nº 16','Córdoba','41006','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (7,'Cliente 7 S.L.','Contacto 7','Calle 7 Nº 17','Jaén','41007','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (8,'Cliente 8 S.L.','Contacto 8','Calle 8 Nº 18','Almería','41008','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (9,'Cliente 9 S.L.','Contacto 9','Calle 9 Nº 19','Utrera','41009','España');
INSERT INTO Customers (CustomerID,CustomerName,ContactName,Address,City,PostalCode,Country) VALUES (10,'Cliente 10 S.L.','Contacto 10','Calle 10 Nº 20','Jerez','41010','España');

-- Employees
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (1,'Apellido1','Nombre1','1991-01-02','/photos/1.jpg','Empleado con experiencia 1');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (2,'Apellido2','Nombre2','1992-01-03','/photos/2.jpg','Empleado con experiencia 2');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (3,'Apellido3','Nombre3','1993-01-04','/photos/3.jpg','Empleado con experiencia 3');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (4,'Apellido4','Nombre4','1994-01-05','/photos/4.jpg','Empleado con experiencia 4');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (5,'Apellido5','Nombre5','1995-01-06','/photos/5.jpg','Empleado con experiencia 5');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (6,'Apellido6','Nombre6','1996-01-07','/photos/6.jpg','Empleado con experiencia 6');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (7,'Apellido7','Nombre7','1997-01-08','/photos/7.jpg','Empleado con experiencia 7');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (8,'Apellido8','Nombre8','1998-01-09','/photos/8.jpg','Empleado con experiencia 8');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (9,'Apellido9','Nombre9','1999-01-10','/photos/9.jpg','Empleado con experiencia 9');
INSERT INTO Employees (EmployeeID,LastName,FirstName,BirthDate,Photo,Notes) VALUES (10,'Apellido10','Nombre10','2000-01-11','/photos/10.jpg','Empleado con experiencia 10');

-- Categories
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (1,'Bebidas','Productos de bebidas');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (2,'Condimentos','Productos de condimentos');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (3,'Lácteos','Productos lácteos');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (4,'Carnes','Productos cárnicos');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (5,'Cereales','Productos de cereales');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (6,'Frutas','Productos de frutas');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (7,'Verduras','Productos de verduras');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (8,'Snacks','Productos de snack');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (9,'Dulces','Productos dulces');
INSERT INTO Categories (CategoryID,CategoryName,Description) VALUES (10,'Congelados','Productos congelados');

-- Suppliers
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (1,'Proveedor 1 S.A.','Vendedor 1','Av. Proveedor 1, 21','Madrid','28001','España','+34 910 00 001');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (2,'Proveedor 2 S.A.','Vendedor 2','Av. Proveedor 2, 22','Barcelona','28002','España','+34 910 00 002');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (3,'Proveedor 3 S.A.','Vendedor 3','Av. Proveedor 3, 23','Valencia','28003','España','+34 910 00 003');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (4,'Proveedor 4 S.A.','Vendedor 4','Av. Proveedor 4, 24','Sevilla','28004','España','+34 910 00 004');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (5,'Proveedor 5 S.A.','Vendedor 5','Av. Proveedor 5, 25','Zaragoza','28005','España','+34 910 00 005');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (6,'Proveedor 6 S.A.','Vendedor 6','Av. Proveedor 6, 26','Bilbao','28006','España','+34 910 00 006');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (7,'Proveedor 7 S.A.','Vendedor 7','Av. Proveedor 7, 27','Vigo','28007','España','+34 910 00 007');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (8,'Proveedor 8 S.A.','Vendedor 8','Av. Proveedor 8, 28','Murcia','28008','España','+34 910 00 008');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (9,'Proveedor 9 S.A.','Vendedor 9','Av. Proveedor 9, 29','Toledo','28009','España','+34 910 00 009');
INSERT INTO Suppliers (SupplierID,SupplierName,ContactName,Address,City,PostalCode,Country,Phone) VALUES (10,'Proveedor 10 S.A.','Vendedor 10','Av. Proveedor 10, 30','Salamanca','28010','España','+34 910 00 010');

-- Products (SupplierID = CategoryID = ProductID para mantener la FK simple)
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (1,'Producto 1',1,1,'caja',  2.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (2,'Producto 2',2,2,'paquete',4.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (3,'Producto 3',3,3,'botella',6.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (4,'Producto 4',4,4,'lata',   8.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (5,'Producto 5',5,5,'bolsa', 10.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (6,'Producto 6',6,6,'caja',  12.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (7,'Producto 7',7,7,'paquete',14.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (8,'Producto 8',8,8,'botella',16.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (9,'Producto 9',9,9,'lata',   18.99);
INSERT INTO Products (ProductID,ProductName,SupplierID,CategoryID,Unit,Price) VALUES (10,'Producto 10',10,10,'bolsa',20.99);

-- Orders  (CustomerID=(i+2)%10+1, EmployeeID=(i+5)%10+1, ShipperID =(i+3)%10+1)
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (1,4,7,'2025-01-05',5);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (2,5,8,'2025-02-10',6);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (3,6,9,'2025-03-15',7);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (4,7,10,'2025-04-20',8);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (5,8,1,'2025-05-25',9);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (6,9,2,'2025-06-05',10);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (7,10,3,'2025-07-10',1);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (8,1,4,'2025-08-15',2);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (9,2,5,'2025-09-20',3);
INSERT INTO Orders (OrderID,CustomerID,EmployeeID,OrderDate,ShipperID) VALUES (10,3,6,'2025-10-25',4);

-- OrderDetails (uno por pedido, enlazando producto = mismo id)
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (1,1,1,5);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (2,2,2,7);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (3,3,3,3);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (4,4,4,10);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (5,5,5,2);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (6,6,6,9);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (7,7,7,4);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (8,8,8,6);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (9,9,9,8);
INSERT INTO OrderDetails (OrderDetailID,OrderID,ProductID,Quantity) VALUES (10,10,10,11);

/* 1. Obtener los nombres de los productos y los nombres de sus respectivas categorías. */
SELECT Products.ProductName, Categories.CategoryName FROM Products
INNER JOIN Categories
ON Products.CategoryID = Categories.CategoryID;

/* 2. Listar todos los productos y, si existen, las órdenes asociadas. */
SELECT Products.ProductName, OrderDetails.OrderID, OrderDetails.Quantity FROM Products
LEFT JOIN OrderDetails
ON Products.ProductID = OrderDetails.ProductID;

/* 3. Mostrar todas las órdenes y los productos asociados, si los hay. */
SELECT OrderDetails.OrderDetailID, Products.ProductName FROM OrderDetails
LEFT JOIN Products
ON OrderDetails.ProductID = Products.ProductID;

/* 4. Contar cuántos productos hay por categoría. */
SELECT Categories.CategoryName, COUNT(Products.CategoryID) AS Products_In_This_Category FROM Categories
INNER JOIN Products
ON Categories.CategoryID = Products.CategoryID
GROUP BY (Products.CategoryID);

/* 5. Mostrar las categorías que tienen más de 5 productos. */
SELECT Categories.CategoryName, COUNT(Products.CategoryID) AS Products_In_This_Category FROM Categories
INNER JOIN Products
ON Categories.CategoryID = Products.CategoryID
GROUP BY (Products.CategoryID)
HAVING Products_In_This_Category > 5;

/* 6. Mostrar los nombres de los clientes y los empleados que procesaron sus órdenes. */
SELECT Orders.OrderID, Customers.CustomerName, Employees.FirstName, Employees.LastName FROM Orders
INNER JOIN Employees
ON Orders.EmployeeID = Employees.EmployeeID
INNER JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;

/* 7. Mostrar todos los clientes y sus órdenes, si existen. */
SELECT Customers.CustomerName, Orders.OrderID FROM Customers
INNER JOIN Orders
ON Orders.CustomerID = Customers.CustomerID;

/* 8. Mostrar el total de órdenes procesadas por cada empleado. */
SELECT Employees.FirstName, Employees.LastName, COUNT(Orders.EmployeeID) AS ProcessedOrders FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY (Orders.EmployeeID);

/* 9. Mostrar los empleados que han procesado más de 10 órdenes. */
SELECT Employees.FirstName, Employees.LastName, COUNT(Orders.EmployeeID) AS ProcessedOrders FROM Employees
INNER JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY (Orders.EmployeeID)
HAVING ProcessedOrders > 10;

/* 10. Mostrar el nombre de los proveedores y los productos que suministran. */
SELECT Suppliers.SupplierName, Products.ProductName FROM Suppliers
LEFT JOIN Products
ON Suppliers.SupplierID = Products.SupplierID;

/* 11. Mostrar todos los productos y el proveedor, si lo tienen. */
SELECT Products.ProductName, Suppliers.SupplierName FROM Products
LEFT JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID;

/* 12. Mostrar el total de productos suministrados por cada proveedor. */
SELECT Suppliers.SupplierName, COUNT(Products.SupplierID) AS Supplied_Products FROM Suppliers
LEFT JOIN Products
ON Suppliers.SupplierID = Products.SupplierID
GROUP BY (Products.SupplierID);

/* 13. Mostrar los proveedores que suministran más de 10 productos. */
SELECT Suppliers.SupplierName, COUNT(Products.SupplierID) AS Supplied_Products FROM Suppliers
INNER JOIN Products
ON Suppliers.SupplierID = Products.SupplierID
GROUP BY (Products.SupplierID)
HAVING Supplied_Products > 10;

/* 14. Mostrar todas las órdenes y los nombres de los clientes asociados. */
SELECT Orders.OrderID, Customers.CustomerName FROM Orders
LEFT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;

/* 15. Mostrar los productos que han sido ordenados y las cantidades en cada orden. */
SELECT Products.ProductName, SUM(OrderDetails.Quantity) AS QuantityOrdered FROM Products
INNER JOIN OrderDetails
ON Products.ProductID = OrderDetails.ProductID
GROUP BY (OrderDetails.OrderID);

/*  16. Mostrar todos los empleados y las órdenes que han procesado, si las hay. */
SELECT Employees.FirstName, Orders.OrderID FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID;

/* 17. Mostrar el total de órdenes hechas por cada cliente. */
SELECT Customers.CustomerName, COUNT(Orders.CustomerID) AS Customer_Orders FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY (Orders.CustomerID);

/* 18. Mostrar los clientes que han hecho más de 5 órdenes. */
SELECT Customers.CustomerName, COUNT(Orders.CustomerID) AS Customer_Orders FROM Customers
INNER JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY (Orders.CustomerID)
HAVING Customer_Orders > 5;

/* 19. Mostrar los nombres de los empleados y los nombres de los clientes a los que han atendido. */
SELECT Employees.FirstName, Customers.CustomerName FROM Orders
LEFT JOIN Employees
ON Orders.EmployeeID = Employees.EmployeeID
LEFT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;

/* 20. Mostrar todos los productos y sus respectivas categorías, si existen. */
SELECT Products.ProductName, Categories.CategoryName FROM Products
LEFT JOIN Categories
ON Products.CategoryID = Categories.CategoryID;

/* 21. Mostrar cuántos productos hay por cada proveedor. */
SELECT Suppliers.SupplierName, COUNT(Products.SupplierID) AS Products_Supplied FROM Suppliers
LEFT JOIN Products
ON Suppliers.SupplierID = Products.SupplierID
GROUP BY (Products.SupplierID);

/* 22. Mostrar los proveedores que suministran más de 15 productos. */
SELECT Suppliers.SupplierName, COUNT(Products.SupplierID) AS Products_Supplied FROM Suppliers
INNER JOIN Products
ON Suppliers.SupplierID = Products.SupplierID
GROUP BY (Products.SupplierID)
HAVING Products_Supplied > 15;

/* 23. Crear una vista que muestre el total de órdenes por cliente. */
CREATE VIEW OrdersPerClient AS
SELECT Customers.CustomerName, COUNT(Orders.CustomerID) AS Client_Orders FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY (Orders.CustomerID);

/* 24. Crear una vista que muestre los empleados y el total de órdenes que han procesado. */
CREATE VIEW EmployeesTotalOrders AS
SELECT Employees.FirstName, COUNT(Orders.EmployeeID) AS ProcessedOrders FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY (Orders.EmployeeID);