/* Usando la BD www(yo la he nombrado CONSULTAS3) realiza los siguientes apartados (recuerda que se dispone de las siguientes tablas:  
Categories,Customers,Employees, OrderDetails, Orders, Products, Shippers y Suppliers) */
USE CONSULTAS3;

/* 1. Listar todos los nombres de producto y su proveedor */
SELECT Products.ProductName, Suppliers.SupplierName FROM Products
LEFT JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID;

/* 2.- Nombre completo de empleados y número total de órdenes gestionadas. Usar CONCAT para concatenar nombre y apellidos. */
SELECT CONCAT(Employees.FirstName, " ", Employees.LastName) AS EmployeeFullName, COUNT(Orders.EmployeeID) AS Orders FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY (Orders.EmployeeID);

/* 3. Nombres clientes y total de pedidos realizados */
SELECT Customers.CustomerName, COUNT(Orders.CustomerID) AS Orders FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY (Orders.CustomerID);

/* 4.- Detalles de pedidos (identificador pedido, nombre de producto, cantidad y precio) */
SELECT OrderDetails.OrderID, Products.ProductName, OrderDetails.Quantity, Products.Price * OrderDetails.Quantity AS TotalPrice FROM OrderDetails
LEFT JOIN Products
ON OrderDetails.ProductID = Products.ProductID;

/* 5. Pedidos con total mayor a 500 */
SELECT OrderDetails.OrderID, Products.ProductName, OrderDetails.Quantity, Products.Price * OrderDetails.Quantity AS TotalPrice FROM OrderDetails
LEFT JOIN Products
ON OrderDetails.ProductID = Products.ProductID
HAVING TotalPrice > 500;

/* 6. Compañía de envío y cantidad de pedidos */
SELECT Shippers.ShipperName, COUNT(Orders.ShipperID) AS Shippings FROM Shippers
LEFT JOIN Orders
ON Shippers.ShipperID = Orders.ShipperID
GROUP BY (Orders.ShipperID);

/* 7. Listar clientes y su total gastado */
SELECT Customers.CustomerName, SUM(OrderDetails.Quantity * Products.Price) AS TotalSpent FROM Orders
RIGHT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID
LEFT JOIN OrderDetails
ON Orders.OrderID = OrderDetails.OrderID
LEFT JOIN Products
ON OrderDetails.ProductID = Products.ProductID
GROUP BY (OrderDetails.OrderID);

/* 8. Productos y cantidad total vendida */
SELECT Products.ProductName, SUM(OrderDetails.Quantity) AS Product_Quantity_Sold FROM Products
LEFT JOIN OrderDetails
ON Products.ProductID = OrderDetails.ProductID
GROUP BY (OrderDetails.ProductID);

/* 9. Listado de clientes sin pedidos el último año (1998) */
SELECT Customers.CustomerName, YEAR(Orders.OrderDate) AS Order_Year FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY Customers.CustomerID
HAVING Order_Year < 2025;

/* 10. Categorías y total de productos vendidos */
SELECT Categories.CategoryName, SUM(OrderDetails.Quantity) AS Category_Quantity_Sold FROM Products
LEFT JOIN Categories
ON Products.CategoryID = Categories.CategoryID
LEFT JOIN OrderDetails
ON Products.ProductID = OrderDetails.ProductID
GROUP BY (OrderDetails.ProductID);

/* 11. Empleados y clientes más frecuentes */
SELECT Employees.FirstName, COUNT(Orders.EmployeeID) AS Employee_Frequency FROM Employees
LEFT JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY (Orders.EmployeeID)
ORDER BY Employee_Frequency;

SELECT Customers.CustomerName, COUNT(Orders.CustomerID) AS Customer_Frequency FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID
GROUP BY (Orders.CustomerID)
ORDER BY Customer_Frequency;

/* 12. Productos no vendidos */
SELECT Products.ProductName FROM Products
LEFT JOIN OrderDetails
ON Products.ProductID = OrderDetails.ProductID
HAVING COUNT(OrderDetails.ProductID) < 1;

/* 13. Compañía de envío y pedidos de un año determinado (busca tú mismo
un año donde se hayan podido producir envíos) */
SELECT YEAR(Orders.OrderDate) AS DateYear, Shippers.ShipperName FROM Orders
LEFT JOIN Shippers
ON Shippers.ShipperID = Orders.ShipperID
HAVING DateYear = 2025;