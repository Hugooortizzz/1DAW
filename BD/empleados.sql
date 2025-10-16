USE Empleados;

CREATE TABLE Horarios(
    id_horario INT AUTO_INCREMENT PRIMARY KEY,
    dia VARCHAR(255) NOT NULL,
    hora_entrada TIME NOT NULL,
    hora_salida TIME NOT NULL
);

CREATE TABLE Empleados (
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR (255) NOT NULL,
    telefono INT NOT NULL,
    poblacion VARCHAR(255) NOT NULL,
    provincia VARCHAR(255) NOT NULL,
    codigo_postal INT NOT NULL,
    n_seguridadsocial BIGINT NOT NULL,
    id_horario INT NOT NULL,
    FOREIGN KEY (id_horario) REFERENCES Horarios(id_horario)
);

CREATE TABLE Medicos(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    n_colegiado INT NOT NULL,
    tipo_medico VARCHAR(255),
    FOREIGN KEY (nif) REFERENCES Empleados(nif)
);

CREATE TABLE Otros_Empleados(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    tipo_empleado VARCHAR(255) NOT NULL,
    FOREIGN KEY (nif) REFERENCES Empleados(nif)
);

CREATE TABLE Sustituciones(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    fecha_alta DATE NOT NULL,
    fecha_baja DATE NOT NULL,
    FOREIGN KEY (nif) REFERENCES Empleados(nif)
);

CREATE TABLE Vacaciones(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    vacaciones_planificadas BOOLEAN,
    FOREIGN KEY (nif) REFERENCES Empleados(nif)
);


CREATE TABLE Pacientes(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    telefono INT NOT NULL,
    codigo_postal INT NOT NULL,
    n_seguridadsocial BIGINT NOT NULL,
    nif_medico VARCHAR(9) NOT NULL,
    FOREIGN KEY (nif_medico) REFERENCES Medicos(nif)
);

CREATE TABLE Consultas(
    id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    nif VARCHAR(9) NOT NULL,
    fecha_consulta DATETIME NOT NULL,
    FOREIGN KEY (nif) REFERENCES Pacientes(nif)
);

INSERT INTO Horarios (dia, hora_entrada, hora_salida) VALUES ("Lunes", NOW(), NOW());
INSERT INTO Empleados (nif, nombre, direccion, telefono, poblacion, provincia, codigo_postal, n_seguridadsocial, id_horario) 
VALUES ("3361267K", "Hugo", "Plaza del Altozano", 654379134, "Utrera", "Sevilla", 41710, 808543954332, 1), 
("55824016J", "Manuel", "La Fontanilla", 655756134, "Utrera", "Sevilla", 41710, 843254952832, 1);
INSERT INTO Medicos (nif, n_colegiado, tipo_medico) VALUES ("3361267K", "432432234", "Médico Titular");
INSERT INTO Otros_Empleados (nif, tipo_empleado) VALUES("55824016J", "Auxiliar de enfermería");
INSERT INTO Sustituciones (nif, fecha_alta, fecha_baja) VALUES("3361267K", NOW(), NOW());
INSERT INTO Vacaciones (nif, fecha_inicio, fecha_fin, vacaciones_planificadas) VALUES("3361267K", NOW(), NOW(), TRUE);
INSERT INTO Pacientes (nif, nombre, direccion, telefono, codigo_postal, n_seguridadsocial, nif_medico) 
VALUES("2749510A", "Pepe", "El Tinte", 624692446, 41710, 432432432, "3361267K");
INSERT INTO Consultas (nif, fecha_consulta) VALUES("2749510A", NOW());