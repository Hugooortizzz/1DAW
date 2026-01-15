CREATE DATABASE OPERACIONESSQL;

USE OPERACIONESSQL;

CREATE TABLE Empleados(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50),
    puesto VARCHAR(50),
    salario INT NOT NULL
);

CREATE TABLE Candidatos(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50),
    puesto VARCHAR(50),
    salario INT NOT NULL,
    estado VARCHAR(50)
);

/* EJEMPLOS INSERT INTO */
/* 1.- Insertar un solo registro: */
INSERT INTO Empleados(nombre, puesto, salario) VALUES("Laura", "Desarrolladora", 3000);
INSERT INTO Candidatos (nombre, puesto, salario, estado) VALUES("Julio", NULL, 0, "Aprobado");

/* 2.- Insertar múltiples registros: */
INSERT INTO Empleados(nombre, puesto, salario) 
VALUES("Carlos", "Diseñador", 2500), ("Ana", "Gerente", 5000), ("Pedro", "Analista", 4000);

/* 3.- Insertar registro con un valor nulo: */
INSERT INTO Empleados(nombre, puesto, salario)
VALUES("Sofía", NULL, 2700) 

/* 4.- Insertar con datos de otra tabla: */
INSERT INTO Empleados(nombre, puesto, salario) 
SELECT nombre, puesto, salario FROM Candidatos WHERE estado = "Aprobado";


/* EJEMPLOS DELETE */
/* 1.- Eliminar un registro específico: */
DELETE FROM Empleados WHERE id = 1;

/* 2.- Eliminar múltiples registros que cumplen una condición: */
DELETE FROM Empleados WHERE puesto = "Analista";

/* 3.- Eliminar registros sin especificar una condición (usa con precaución): */
DELETE FROM Empleados;
INSERT INTO Empleados(nombre, puesto, salario)

VALUES

("Juan","Desarrollador", 3000),

("Ana", "Diseñadora", 2500),

("Pedro", "Gerente", 5000),

("María", "Analista", 4000);

UPDATE Empleados SET id = 1 WHERE nombre = "Juan";
UPDATE Empleados SET id = 2 WHERE nombre = "Ana";
UPDATE Empleados SET id = 3 WHERE nombre = "Pedro";
UPDATE Empleados SET id = 4 WHERE nombre = "María";

/* 4.- Eliminar registros basados en un criterio de otro campo:*/
DELETE FROM Empleados WHERE salario < 3000;


/* EJEMPLOS UPDATE */
/* 1.- Actualizar un registro específico: */
INSERT INTO Empleados(nombre, puesto, salario) VALUES("Laura", "Desarrolladora", 3000);
UPDATE Empleados SET salario = 3500 WHERE nombre = "Laura";

/* 2.- Actualizar múltiples columnas: */
UPDATE Empleados SET puesto = "Senior Desarrollador", salario = 4000 WHERE puesto = "Desarrollador";

/* 3.- Incrementar un valor: */
UPDATE Empleados SET salario = salario * 1.10;

/* 4.- Actualizar con condiciones complejas: */
UPDATE Empleados SET salario = 7000 WHERE puesto = 'Gerente' AND salario < 6000;


