CREATE DATABASE IF NOT EXISTS inventario;

USE inventario;

CREATE TABLE categoria(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre_categoria VARCHAR(30) NOT NULL
);

CREATE TABLE proveedor(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre_proveedor VARCHAR(30) NOT NULL,
    contacto INT NOT NULL,
    direccion VARCHAR(500)
);

CREATE TABLE producto(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    categoria_id INT,
    cantidad_disponible INT,
    precio_unitario DECIMAL(10,2),
    proveedor_id INT,
    FOREIGN KEY(categoria_id) REFERENCES categoria(id),
    FOREIGN KEY(proveedor_id) REFERENCES proveedor(id)
);

CREATE TABLE entrada(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_producto INT NOT NULL,
    cantidad_entrada INT NOT NULL,
    fecha_entrada DATE,
    FOREIGN KEY (id_producto) REFERENCES producto(id)
);

CREATE TABLE salida(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_producto INT NOT NULL,
    cantidad_salida INT NOT NULL,
    fecha_salida DATE,
    FOREIGN KEY (id_producto) REFERENCES producto(id)
);

INSERT INTO categoria(nombre_categoria) VALUES("Shooter"), ("Plataformas"), ("Terror"), ("Aventura");
INSERT INTO proveedor(nombre_proveedor, contacto, direccion) 
VALUES("Capcom", 900811390, "3-1-3 Uchihirano-machi, Chuo-ku, Osaka, 540-0037"), 
("Nintendo", 917886498, "Calle Estebanez Calderon, 5, 28020, Madrid"), 
("Konami", 0368670573, "1-11-1 Ginza, Chuo-ku, Tokio 104-0061"), 
("Activision", 911829403, "C. de Anabel Segura, 7, 28108 Alcobendas, Madrid, Spain");

INSERT INTO producto(nombre, categoria_id, cantidad_disponible, precio_unitario, proveedor_id) 
VALUES("Call Of Duty Black Ops 3", 1, 500, 59.99, 4), 
("Resident Evil 2 Remake", 3, 1000, 9.99, 1), 
("The Legend Of Zelda: Tears of the Kingdom", 4, 2000, 59.99, 2),
("New Super Mario Bros U Deluxe", 2, 20, 49.99, 2);

INSERT INTO entrada(id_producto, cantidad_entrada, fecha_entrada) 
VALUES(1, 400, NOW()), 
(3, 200, NOW()), 
(2, 15, NOW()), 
(4, 500, NOW());

INSERT INTO salida(id_producto, cantidad_salida, fecha_salida) 
VALUES(3, 400, NOW()), 
(1, 220, NOW()), 
(4, 150, NOW()), 
(2, 50, NOW());


