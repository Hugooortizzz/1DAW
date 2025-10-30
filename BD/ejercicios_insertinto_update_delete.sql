CREATE DATABASE EJERCICIOS_INSERTINTO_UPDATE_DELETE;

USE EJERCICIOS_INSERTINTO_UPDATE_DELETE;

CREATE TABLE Empleados(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50),
    puesto VARCHAR(100),
    salario INT
);

/* Ejercicio 1: Inserta un nuevo registro en la tabla empleados con los siguientes datos: 
Nombre: "David", Puesto: "Desarrollador", Salario: 3200.*/
INSERT INTO Empleados(nombre, puesto, salario) VALUES ("David", "Desarrollador", 3200);

/* Ejercicio 2: Inserta tres nuevos registros en la tabla empleados con los siguientes datos:
Nombre: "Eva", Puesto: "Diseñadora", Salario: 2800.
Nombre: "Javier", Puesto: "Gerente", Salario: 6000.
Nombre: "Clara", Puesto: "Analista", Salario: 4000. */
INSERT INTO Empleados(nombre, puesto, salario) VALUES ("Eva", "Diseñadora", 2800), ("Javier", "Gerente", 6000), ("Clara", "Analista", 4000);

/* Ejercicio 3: Inserta un registro en la tabla empleados dejando el campo puesto como NULL. Usa el nombre "Fernando" y un salario de 3500. Ejercicio 3: Inserta un registro en la tabla empleados dejando el campo puesto como NULL. Usa el nombre "Fernando" y un salario de 3500. */
INSERT INTO Empleados(nombre, salario) VALUES ("Fernando", 3500);

/* Ejercicio 5: Elimina el registro del empleado cuyo id es 3. */
DELETE FROM Empleados WHERE id=3;

/* Ejercicio 6: Elimina todos los empleados que tienen el puesto de "Diseñadora". */
DELETE FROM Empleados WHERE puesto="Diseñadora";

/* Ejercicio 7: Elimina los empleados cuyo salario es menor a 3000. */
INSERT INTO Empleados(nombre, puesto, salario) VALUES ("Eva", "Diseñadora", 2800);
DELETE FROM Empleados WHERE salario < 3000;

/* Ejercicio 8: Actualiza el salario del empleado llamado "Eva" a 3700. */
INSERT INTO Empleados(nombre, puesto, salario) VALUES ("Eva", "Diseñadora", 2800);
UPDATE Empleados SET salario = 3700 WHERE nombre="Eva";

/* Ejercicio 9: Actualiza el puesto y salario de todos los empleados que son "Analista" a "Senior Analista" y 4500, respectivamente */
/* Primero le voy a asignar a Fernando el puesto de Senior Analista para que haya alguno */
UPDATE Empleados SET puesto = "Senior Analista" WHERE nombre = "Fernando";
UPDATE Empleados SET salario = 4500 WHERE puesto = "Analista" OR puesto = "Senior Analista";
