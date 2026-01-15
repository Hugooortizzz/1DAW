CREATE DATABASE RELACIONES_REFLEXIVAS3;

USE RELACIONES_REFLEXIVAS3;

CREATE TABLE Persona(
    id_persona INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) 
);

CREATE TABLE Amistad(
    id_persona1 INT NOT NULL,
    id_persona2 INT NOT NULL,
    fecha DATE,
    PRIMARY KEY (id_persona1, id_persona2),
    FOREIGN KEY (id_persona1) REFERENCES Persona(id_persona),
    FOREIGN KEY (id_persona2) REFERENCES Persona(id_persona)
);

INSERT INTO Persona(nombre) VALUES("Manolo"), ("Pepe"), ("Juan"), ("Julio");
INSERT INTO Amistad(id_persona1, id_persona2, fecha) VALUES(1, 2, NOW()), (1,4, '2022-12-30'), (2,3, '2015-06-15');