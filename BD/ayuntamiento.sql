CREATE DATABASE IF NOT EXISTS AYUNTAMIENTO;

USE AYUNTAMIENTO;

CREATE TABLE Persona(
    dni VARCHAR(9) PRIMARY KEY NOT NULL,
    nombre VARCHAR (25),
    apellidos VARCHAR(50),
    direccion VARCHAR(50),
    poblacion VARCHAR(50),
    telefono INT
);

CREATE TABLE Vehiculo(
    matricula VARCHAR(7) PRIMARY KEY NOT NULL,
    marca VARCHAR(20),
    modelo VARCHAR(50)
);

CREATE TABLE Propietarios(
    dni VARCHAR(9) NOT NULL,
    matricula VARCHAR(7) NOT NULL,
    PRIMARY KEY (dni, matricula),
    FOREIGN KEY (dni) REFERENCES Persona(dni),
    FOREIGN KEY (matricula) REFERENCES Vehiculo(matricula)
);

CREATE TABLE Accidentes(
    id_accidente INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fecha_hora DATETIME,
    lugar VARCHAR(50)
);

CREATE TABLE Involucrado(
    id_accidente INT NOT NULL,
    dni VARCHAR(9) NOT NULL,
    matricula VARCHAR(7) NOT NULL,
    PRIMARY KEY (id_accidente, dni, matricula),
    FOREIGN KEY (id_accidente) REFERENCES Accidentes(id_accidente),
    FOREIGN KEY (dni) REFERENCES Persona(dni),
    FOREIGN KEY (matricula) REFERENCES Vehiculo(matricula)
);

CREATE TABLE Multas(
    id_multa INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    fecha_hora DATETIME,
    lugar VARCHAR(50),
    importe DECIMAL,
    dni VARCHAR(9),
    FOREIGN KEY (dni) REFERENCES Persona(dni)
);

INSERT INTO Persona VALUES ("12345678P", "Antonio", "Jiménez Pérez", "Plaza del Altozano", "Utrera", 693562354);
INSERT INTO Vehiculo VALUES ("4532FDT", "Fiat", "Freemont");
INSERT INTO Propietarios VALUES("12345678P", "4532FDT");
INSERT INTO Accidentes(fecha_hora, lugar) VALUES(NOW(), "Peña Bética");
INSERT INTO Involucrado VALUES(1, "12345678P", "4532FDT");
INSERT INTO Multas(fecha_hora, lugar, importe, dni) VALUES(NOW(), "Paseo de Consolación", 300.50, "12345678P");

SELECT Propietarios.dni, Persona.nombre, Propietarios.matricula, Vehiculo.modelo FROM Propietarios
INNER JOIN Persona
ON Propietarios.dni = Persona.dni
INNER JOIN Vehiculo
ON Propietarios.matricula = Vehiculo.matricula;