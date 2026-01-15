USE CONSULTAS;

/* 1) Listar de "Customers" solo aquellos cuya ciudad sea "Berlin" o "Stuttgart". */
SELECT CustomerID, CustomerName, City FROM Customers WHERE City = "Berlin" OR City = "Stuttgart";


/* 2) Listar de "Customers" donde el pais sea "Germany" o "Spain". */
SELECT CustomerID, CustomerName, Country FROM Customers WHERE Country = "Germany" OR Country = "Spain";


/* 3) Listar de "Customers" donde el país NO es "Germany" */
SELECT CustomerID, CustomerName, Country FROM Customers WHERE NOT Country = "Germany";


/* 4) Listar de "Customers" donde el país es "Germany" y la ciudad es "Berlin" o "Stuttgart" */
SELECT CustomerID, CustomerName, Country, City FROM Customers WHERE Country = "Germany" AND City IN ("Berlin", "Stuttgarts");

/* 5) Listar de "Customers" donde el país no es "Germany" y tampoco "USA". */


/* 6) Listar "Customers" ordenados por la columna "Country"  */
SELECT CustomerID, CustomerName, Country FROM Customers ORDER BY Country;

/* 7) Listar "Customers" ordenados de forma descendente por la columna "Country" */
SELECT CustomerID, CustomerName, Country FROM Customers ORDER BY Country DESC;


/* 8) Listar "Customers" ordenados por la columna "Country" y luego por la columna ¨CustomerName" */
SELECT CustomerID, CustomerName, Country FROM Customers ORDER BY Country, CustomerName;


/* 9) Listar "Customers" ordenados ascendentemente por "Country" y descendentemente por "CustomerName" */
SELECT CustomerID, CustomerName, Country FROM Customers ORDER BY Country DESC, CustomerName ASC;
