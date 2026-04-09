CREATE DATABASE IF NOT EXISTS VEHICULO_ALQUILER;

USE VEHICULO_ALQUILER;

CREATE TABLE Cliente(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50),
    dni VARCHAR(9) NOT NULL,
    telefono INT
);

CREATE TABLE Vehiculo(
    matricula VARCHAR(7) PRIMARY KEY NOT NULL,
    marca VARCHAR(20),
    modelo VARCHAR(40),
    precio_por_dia DECIMAL
);

CREATE TABLE Alquiler(
    id_cliente INT NOT NULL,
    matricula VARCHAR(7) NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    coste_total DECIMAL,
    PRIMARY KEY(id_cliente, matricula),
    FOREIGN KEY(id_cliente) REFERENCES Cliente(id),
    FOREIGN KEY(matricula) REFERENCES Vehiculo(matricula)
);

INSERT INTO Cliente(nombre, dni, telefono) VALUES("Hugo", "77938015P", 682798322), ("Daniela", "1749567M", 659237492);
INSERT INTO Vehiculo(matricula, marca, modelo, precio_por_dia) VALUES("1404HDA", "Fiat", "Freemont", 50), ("1907DDN", "Renault", "Clio", 40);
INSERT INTO Alquiler(id_cliente, matricula, fecha_inicio, fecha_fin, coste_total) VALUES(1, "1907DDN", '2024-12-15', '2024-12-20', 250), (2, "1404HDA", '2025-03-01', '2025-03-07', 280);

-- 1. Mostrar todos los clientes
SELECT * FROM Cliente;

-- 2. Mostrar vehículos disponibles (todos)
SELECT * FROM Vehiculo;

-- 3. Listar alquileres con nombre del cliente
SELECT Cliente.nombre AS nombre_cliente, Alquiler.matricula, Alquiler.fecha_inicio, Alquiler.fecha_fin, Alquiler.coste_total FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id;

-- 4. Mostrar vehículos alquilados por un cliente
SELECT Cliente.nombre AS nombre_cliente, Vehiculo.matricula, Vehiculo.modelo, Vehiculo.precio_por_dia FROM Vehiculo
JOIN Alquiler
ON Vehiculo.matricula = Alquiler.matricula
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id;

-- 5. Mostrar alquileres de un vehículo concreto
SELECT Vehiculo.marca, Vehiculo.modelo, Alquiler.fecha_inicio, Alquiler.fecha_fin, Alquiler.coste_total FROM Alquiler
JOIN Vehiculo
ON Alquiler.matricula = Vehiculo.matricula;

-- 6. Calcular el ingreso total de la empresa
SELECT SUM(coste_total) AS ingreso_total FROM Alquiler;

-- 7. Mostrar alquileres activos (hoy)
SELECT * FROM Alquiler WHERE CURDATE() BETWEEN fecha_inicio AND fecha_fin;

-- 8. Contar alquileres por cliente
SELECT Cliente.nombre, COUNT(Alquiler.id_cliente) AS alquileres FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id
GROUP BY(Alquiler.id_cliente);

-- 9. Mostrar el vehículo más caro por día
SELECT * FROM Vehiculo 
ORDER BY precio_por_dia DESC
LIMIT 1;

-- 10. Mostrar clientes que no han alquilado nada
SELECT Cliente.nombre, COUNT(Alquiler.id_cliente) AS alquileres FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id
GROUP BY(Alquiler.id_cliente)
HAVING alquileres = 0;

-- 11 .Mostrar el nombre de los clientes y el número total de alquileres que han realizado, pero solo aquellos que han hecho más de 1 alquiler.
SELECT Cliente.nombre, COUNT(Alquiler.id_cliente) AS alquileres FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id
GROUP BY(Alquiler.id_cliente)
HAVING alquileres > 1;

-- 12. Obtener la marca de los vehículos y el número de veces que han sido alquilados, mostrando solo aquellas marcas que han sido alquiladas más de 2 veces.
SELECT Vehiculo.marca, COUNT(Alquiler.matricula) AS veces_alquilado FROM Alquiler
JOIN Vehiculo
ON Alquiler.matricula = Vehiculo.matricula
GROUP BY(Alquiler.matricula)
HAVING veces_alquilado > 2;

-- 13. Mostrar el nombre de los clientes y el gasto total en alquileres, pero solo aquellos que han gastado más de 500€ en total.
SELECT Cliente.nombre, SUM(Alquiler.coste_total) AS gasto_total FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id
GROUP BY(Alquiler.id_cliente)
HAVING gasto_total > 500;

-- 14 .Mostrar la matrícula de los vehículos y el ingreso total generado por cada uno, pero solo aquellos que han generado más de 1000€.
SELECT matricula, SUM(coste_total) AS total_generado FROM Alquiler
GROUP BY(matricula)
HAVING total_generado > 1000;

-- 15. Mostrar los clientes y el número de vehículos distintos que han alquilado, pero solo aquellos que han alquilado más de 2 vehículos diferentes.
SELECT Cliente.nombre, COUNT(DISTINCT Alquiler.matricula) AS vehiculos_alquilados FROM Alquiler
JOIN Cliente
ON Alquiler.id_cliente = Cliente.id
GROUP BY(Alquiler.id_cliente)
HAVING vehiculos_alquilados > 2;

-- 16. Mostrar la marca de vehículos y el gasto promedio por alquiler (AVG), pero solo aquellas marcas cuyo promedio sea mayor a 100€ por alquiler.
SELECT Vehiculo.marca, AVG(Alquiler.coste_total) AS gasto_promedio FROM Alquiler
JOIN Vehiculo
ON Alquiler.matricula = Vehiculo.matricula
GROUP BY(Vehiculo.marca)
HAVING gasto_promedio > 1000;