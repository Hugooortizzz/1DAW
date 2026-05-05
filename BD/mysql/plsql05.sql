-- 1.- Procedimiento. Insertar un nuevo paciente.
DELIMITER //
CREATE PROCEDURE insertar_paciente
(IN u_nombre VARCHAR(100), IN u_fecha_nacimiento DATE, IN u_genero VARCHAR(1), IN u_telefono VARCHAR(15))
BEGIN
    INSERT INTO Pacientes(nombre, fecha_nacimiento, genero, telefono) 
    VALUES(u_nombre, u_fecha_nacimiento, u_genero, u_telefono);
END;
//

DELIMITER ;

-- 2. Procedimiento. Consultar ingresos activos (pacientes que siguen en el hospital) 
DELIMITER //
CREATE PROCEDURE consultar_ingresos()
BEGIN
    SELECT Ingresos.ingreso_id, Pacientes.nombre, Ingresos.habitacion_id, Ingresos.fecha_ingreso FROM Ingresos
    JOIN Pacientes
    ON Ingresos.paciente_id = Pacientes.paciente_id
    WHERE Ingresos.fecha_salida IS NULL;
END;
//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE consultar_ingresos_activos(OUT lista_ingresos TEXT)
BEGIN
    DECLARE datos_paciente_actual TEXT;
    DECLARE lista_pacientes TEXT;
    DECLARE fin INT;

    DECLARE cursos_ingresos CURSOR FOR
        SELECT nombre
        FROM Pacientes
        INNER JOIN Ingresos
        ON Pacientes.paciente_id=Ingresos.paciente_id
        WHERE fecha_salida IS NULL;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin=1;
        SET datos_paciente_actual = "";
        SET lista_ingresos = "";
        SET lista_pacientes = "";
        SET fin = 0;
        OPEN cursor_ingresos;

        leer_loop : LOOP
            FETCH cursor_ingresos INTO datos_paciente_actual;
            IF fin=1 THEN
                LEAVE leer_loop;
            END IF;
            IF lista_pacientes ="" THEN
                SET lista_pacientes = datos_paciente_actual;
            ELSE
                SET lista_pacientes = CONCAT(lista_pacientes, ",", datos_paciente_actual);
            END IF;
        END LOOP;
        SET lista_ingresos = lista_pacientes;
        CLOSE cursor_ingresos;
    END; //
    DELIMITER ;

-- 3. Función. Calcular la edad del paciente. Pistas: TIMESTAMPDIFF,YEAR,CURDATE
DELIMITER //
CREATE FUNCTION calcular_edad(fecha_nacimiento DATE)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE());
END;
//

DELIMITER ;
