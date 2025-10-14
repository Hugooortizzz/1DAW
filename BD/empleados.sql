USE Empleados;

CREATE TABLE Empleados (
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR (255) NOT NULL,
    telefono INT NOT NULL,
    poblacion VARCHAR(255) NOT NULL,
    provincia VARCHAR(255) NOT NULL,
    codigo_postal INT NOT NULL,
    n_seguridadsocial INT NOT NULL
);

CREATE TABLE Medicos(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
    numero_colegiado INT NOT NULL,
    tipo_medico VARCHAR(255),
    FOREIGN KEY (nif) REFERENCES Empleados(nif)
);

CREATE TABLE Otros_Empleados(
    nif VARCHAR(9) NOT NULL PRIMARY KEY,
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
    FOREIGN KEY (nif) REFERENCES Empleados (nif)
);