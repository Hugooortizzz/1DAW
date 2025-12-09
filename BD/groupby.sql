CREATE DATABASE GROUPBY_;
USE GROUPBY_;


CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    departamento VARCHAR(50),
    salario DECIMAL(10, 2)
);


CREATE TABLE ventas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    empleado_id INT,
    producto VARCHAR(50),
    cantidad INT,
    precio DECIMAL(10, 2),
    fecha DATE,
    constraint ‘foranea_empleado’ 
    foreign key (empleado_id) references empleados(id)
);

INSERT INTO ventas (empleado_id, producto, cantidad, precio, fecha) VALUES
(1, 'Producto A', 10, 50.00, '2024-11-01'),
(2, 'Producto B', 5, 30.00, '2024-11-02'),
(1, 'Producto A', 8, 50.00, '2024-11-03'),
(3, 'Producto C', 20, 70.00, '2024-11-04'),
(2, 'Producto B', 15, 30.00, '2024-11-05'),
(3, 'Producto C', 10, 70.00, '2024-11-06'),
(1, 'Producto A', 10, 50.00, '2024-12-01');


INSERT INTO empleados (nombre, departamento, salario) VALUES
('Juan', 'Ventas', 3000.00),
('María', 'Ventas', 3200.00),
('Luis', 'Logística', 2800.00);


/* 1.- Ventas totales por empleado */
SELECT empleados.id, empleados.nombre, COUNT(ventas.empleado_id) AS ventas_totales FROM empleados
LEFT JOIN ventas
ON empleados.id = ventas.empleado_id
GROUP BY (empleados.id);

/* 2.- Cantidad total vendida de cada producto */
SELECT producto, SUM(cantidad) AS total_vendido FROM ventas
GROUP BY (producto);

/* 3.- Ventas totales por empleado, sólo si el total supera 500 */
SELECT empleados.id, empleados.nombre, COUNT(ventas.empleado_id) AS ventas_totales FROM empleados
LEFT JOIN ventas
ON empleados.id = ventas.empleado_id
GROUP BY (empleados.id)
HAVING ventas_totales > 500;

/* 4.- Número de productos distintos vendidos por empleado */
SELECT empleados.id, empleados.nombre, ventas.producto AS ventas_totales FROM empleados
LEFT JOIN ventas
ON empleados.id = ventas.empleado_id
GROUP BY (ventas.producto);

/* 5.- Promedio de ventas por empleado */