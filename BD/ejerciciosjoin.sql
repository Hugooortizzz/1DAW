CREATE DATABASE JOINs;
USE JOINs;

-- Crear la tabla de usuarios
CREATE TABLE usuarios (
    usuario_id INT PRIMARY KEY,
    nombre VARCHAR(50),
    correo VARCHAR(100)
);

-- Insertar datos en la tabla de usuarios
INSERT INTO usuarios (usuario_id, nombre, correo) VALUES 
(1, 'Juan Pérez', 'juan.perez@example.com'),
(2, 'Ana García', 'ana.garcia@example.com'),
(3, 'Luis López', 'luis.lopez@example.com'),
(4, 'Marta Gómez', 'marta.gomez@example.com');

-- Crear la tabla de pedidos
CREATE TABLE pedidos (
    pedido_id INT PRIMARY KEY,
    usuario_id INT,
    producto VARCHAR(100),
    cantidad INT
);

-- Insertar datos en la tabla de pedidos
INSERT INTO pedidos (pedido_id, usuario_id, producto, cantidad) VALUES 
(1, 1, 'Laptop', 1),
(2, 2, 'Smartphone', 2),
(3, 3, 'Tablet', 1),
(4, 1, 'Monitor', 2),
(5, 2, 'Teclado', 1);

/* 1.- Obtener todos los usuarios y sus pedidos (LEFT JOIN) 
Muestra todos los usuarios junto con los detalles de sus pedidos, incluyendo los usuarios que no tienen pedidos.*/
SELECT usuarios.nombre, pedidos.producto, cantidad FROM usuarios
LEFT JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id;

/* 2.- Obtener todos los pedidos y los usuarios asociados (RIGHT JOIN)
Muestra todos los pedidos junto con la información de los usuarios que los realizaron. Si algún pedido no tiene usuario asociado, también debe aparecer. */
SELECT usuarios.nombre, pedidos.producto, cantidad FROM usuarios
RIGHT JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id;

/* 3.- Obtener los usuarios que realizaron pedidos (INNER JOIN)
Lista solo a los usuarios que tienen al menos un pedido. */
SELECT usuarios.nombre, pedidos.producto, cantidad FROM usuarios
INNER JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id;

/* 4.- Contar la cantidad de pedidos por usuario (LEFT JOIN)
Muestra cada usuario y la cantidad total de pedidos que ha realizado. */
SELECT usuarios.nombre, COUNT(pedidos.usuario_id) AS cantidad_pedidos FROM usuarios
LEFT JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
GROUP BY usuarios.usuario_id;

/* 5.- Listar productos y cantidad pedida por cada usuario (INNER JOIN) */
SELECT usuarios.nombre, SUM(pedidos.cantidad) AS cantidad_pedida FROM usuarios
INNER JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
GROUP BY usuarios.usuario_id;

/* 6.- Muestra el nombre de cada usuario junto con el producto y la cantidad que pidió. */
SELECT usuarios.nombre, pedidos.producto, SUM(pedidos.cantidad) AS cantidad FROM usuarios
INNER JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
GROUP BY pedidos.producto
ORDER BY usuarios.nombre;

/* 7.- Mostrar usuarios sin pedidos (LEFT JOIN con filtro)
Encuentra los usuarios que no han realizado ningún pedido. */
SELECT usuarios.nombre, pedidos.producto FROM usuarios
LEFT JOIN pedidos 
ON usuarios.usuario_id = pedidos.usuario_id
WHERE producto is NULL;

/* 8.- Mostrar pedidos sin usuario asociado (RIGHT JOIN con filtro)
Encuentra los pedidos que no tienen un usuario asociado (si existiera algún error en la base de datos).*/
SELECT usuarios.nombre, pedidos.producto FROM usuarios
LEFT JOIN pedidos 
ON usuarios.usuario_id = pedidos.usuario_id
WHERE usuarios.nombre is NULL;

/* 9.- Obtener los usuarios y la suma de las cantidades pedidas (LEFT JOIN)
Muestra cada usuario con la suma de todas las cantidades de productos que ha pedido. */
SELECT usuarios.nombre, SUM(pedidos.cantidad) AS cantidad FROM usuarios
LEFT JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
GROUP BY usuarios.nombre
ORDER BY usuarios.nombre;

/* 10.- Verificar duplicados de productos pedidos por usuario (INNER JOIN)
Lista los productos que fueron pedidos por un usuario más de una vez (por ejemplo si Ana ha pedido un Smartphone y luego ha vuelto a realizar otro pedido en el cual haya solicitado nuevamente otro smartphone) */
SELECT usuarios.nombre, pedidos.producto, COUNT(pedidos.producto) AS repetidos FROM usuarios
INNER JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
GROUP BY usuarios.usuario_id, pedidos.producto
HAVING repetidos > 1;

/* 11.- Mostrar usuarios y sus pedidos de 'Laptop' (LEFT JOIN con filtro) */
SELECT usuarios.nombre, pedidos.producto, COUNT(pedidos.producto) AS portatiles FROM usuarios
LEFT JOIN pedidos
ON usuarios.usuario_id = pedidos.usuario_id
WHERE pedidos.producto = "Laptop";

