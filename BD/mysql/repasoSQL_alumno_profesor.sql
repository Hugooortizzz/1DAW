CREATE DATABASE REPASOSQL;


USE DATABASE REPASOSQL;

CREATE TABLE Alumno(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    email VARCHAR(80) NOT NULL
);

CREATE TABLE Profesor(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    email VARCHAR(80) NOT NULL
);

CREATE TABLE Asignaturas(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    id_profesor INT NOT NULL,
    FOREIGN KEY(id_profesor) REFERENCES Profesor(id)
);

CREATE TABLE Matricula(
    id_alumno INT NOT NULL,
    id_asignatura INT NOT NULL,
    fecha_matricula DATE NOT NULL,
    PRIMARY KEY(id_alumno, id_asignatura),
    FOREIGN KEY (id_alumno) REFERENCES Alumno(id),
    FOREIGN KEY (id_asignatura) REFERENCES Asignaturas(id)
);

INSERT INTO Alumno(nombre, email) VALUES("Hugo", "hugo.ortiz-duran@iesruizgijon.com"), ("Daniela", "daniela.bonifacio-cerda@iesruizgijon.com");
INSERT INTO Profesor(nombre, email) VALUES("Eduardo", "eduardo.jaenes@iesruizgijon.com"), ("Daniel", "daniel.leyva@iesruizgijon.com");

INSERT INTO Asignaturas(nombre, id_profesor) VALUES("Programacion", 1), ("Bases de Datos", 2);

INSERT INTO Matricula(id_alumno, id_asignatura, fecha_matricula) VALUES(1,2, NOW()), (2, 1, NOW());

-- Devuelve los nombres de profesores con las asignaturas que imparten
SELECT Profesor.nombre, Asignaturas.nombre FROM Profesor
LEFT JOIN Asignaturas
ON Profesor.id = Asignaturas.id;

-- Contabiliza cuántas asignaturas (número entero) da cada alumno (debe aparecer el nombre del alumno y el nombre de las asignaturas)
SELECT id_alumno, COUNT(id_asignatura) AS numero_asignaturas FROM Matricula GROUP BY(id_alumno);

-- Visualizar una tabla que tenga todos los datos de la base de datos completa (nombre profesor, nombre asignatura y nombre de estudiante). Haz los joins de forma correcta
SELECT Profesor.nombre AS Profesor, Asignaturas.nombre AS Asignatura, Alumno.nombre AS Alumno FROM Asignaturas
JOIN Matricula
ON Matricula.id_asignatura = Asignaturas.id
JOIN Alumno
ON Matricula.id_alumno = Alumno.id
JOIN Profesor
ON Asignaturas.id_profesor = Profesor.id;

-- Visualiza qué asignaturas tienen menos de dos matrículas del alumnado
SELECT Asignaturas.nombre, COUNT(Alumno.id) AS AlumnosMatriculados FROM Asignaturas
JOIN Matricula
ON Asignaturas.id = Matricula.id_asignatura
JOIN Alumno
ON Matricula.id_alumno = Alumno.id
GROUP BY (Alumno.id)
HAVING ALumnosMatriculados < 2;
