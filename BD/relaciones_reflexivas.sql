CREATE DATABASE RELACIONES_REFLEXIVAS;

USE RELACIONES_REFLEXIVAS;

CREATE TABLE Empleado (
    id_empleado INT PRIMARY KEY,
    nombre VARCHAR(50),
    id_jefe INT,
    FOREIGN KEY (id_jefe) REFERENCES Empleado(id_empleado)
);

INSERT INTO Empleado(id_empleado, nombre, id_jefe) VALUES(2, "Juan", NULL), (1, "María", 2);
