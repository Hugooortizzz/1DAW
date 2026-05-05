/* 1.- Se requiere implementar un mecanismo automático que registre en una tabla de historial cualquier cambio en el 
salario de un empleado. Para ello, crea un trigger que, antes de actualizar un registro en la tabla empleados, verifique 
si el salario ha cambiado. Si el nuevo salario (NEW.salario) es diferente al anterior(OLD.salario), debe insertarse un 
registro en la tabla historial_salarios con el empleado_id y el salario_anterior. Posteriormente, realiza una 
actualización del salario del empleado llamado "David Rojas" a 1000 y consulta tanto la tabla historial_salarios 
como la tabla empleados para verificar los cambios. */
DELIMITER //
CREATE TRIGGER actualizaciones
BEFORE UPDATE ON empleados
FOR EACH ROW
BEGIN
    IF OLD.salario <> NEW.SALARIO THEN
        INSERT INTO historial_salarios(empleado_id, salario_anterior) VALUES(OLD.id, OLD.salario);
    END IF;
END
//
DELIMITER ;

UPDATE empleados SET salario = 2500 WHERE nombre="David Rojas";

/*
2) Se necesita llevar un registro de todas las eliminaciones que se realicen en la tabla empleados. Para ello, crea un trigger 
que, antes de eliminar un registro, inserte en la tabla auditoria_eliminaciones el nombre de la tabla afectada ('empleados') 
y el id del registro que va a ser eliminado. Elimina el empleado con id = 1 y consulta la tabla auditoria_eliminaciones para 
verificar que se haya registrado la eliminación.
*/
DELIMITER //
CREATE TRIGGER registro_eliminaciones
BEFORE DELETE ON empleados
FOR EACH ROW
BEGIN
    INSERT INTO auditoria_eliminaciones(tabla_afectada, id_registro) VALUES("empleados", OLD.id);
END;
//
DELIMITER ;

DELETE FROM empleados WHERE id = 1;

/*
3) Con el objetivo de garantizar que los nuevos empleados tengan un salario mínimo establecido, crea un trigger que se active 
antes de insertar un nuevo registro en la tabla empleados. El trigger debe validar que el salario ingresado sea igual o mayor 
a 1000. Si el salario no cumple esta condición, debe impedir la inserción mostrando un mensaje de error: "El salario debe ser 
igual o mayor a 1000". Luego, intenta insertar un empleado llamado "Ana Martínez" con un salario de 200 para comprobar el 
funcionamiento del trigger.
*/
DELIMITER //
CREATE TRIGGER salario_minimo
BEFORE INSERT ON empleados
FOR EACH ROW
BEGIN
    IF NEW.SALARIO < 1000 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El salario debe ser igual o mayor a 1000';
    END IF;
END;
//
DELIMITER ;

INSERT INTO empleados(nombre, salario, fecha_ingreso) VALUES("Ana Martínez", 200, NOW());

/*
4) Se requiere que, al insertar un nuevo empleado en la tabla empleados, si no se especifica una fecha de ingreso, 
automáticamente se asigne la fecha actual del sistema. Para ello, crea un trigger que, antes de la inserción, verifique 
si el campo fecha_ingreso es nulo y, en ese caso, lo establezca con la fecha actual (CURDATE()). Luego, inserta un nuevo 
empleado llamado "Juan Nocilla Nutela" indicando sólo su nombre y salario, y consulta la tabla empleados para verificar 
que la fecha de ingreso se haya completado correctamente.
*/

DELIMITER //
CREATE TRIGGER comprobar_fecha
BEFORE INSERT ON empleados
FOR EACH ROW
BEGIN
    IF NEW.fecha_ingreso IS NULL THEN
       SET new.fecha_ingreso = CURDATE();
    END IF;
END;
//
DELIMITER ;

INSERT INTO empleados(nombre, salario) VALUES("Juan Nocilla Nutela", 1200);

/*
5) Se necesita registrar el salario anterior de un empleado cada vez que se actualice su nombre en la tabla empleados. Para 
ello, crea un trigger que, antes de realizar una actualización, verifique si el nombre ha cambiado. Si es así, debe insertar 
en la tabla historial_salarios el empleado_id y el salario_anterior correspondientes. Comprueba que tu trigger funciona 
correctamente.
*/
DELIMITER //
CREATE TRIGGER registrar_salario_anterior_NOMBRRE
BEFORE UPDATE ON empleados
FOR EACH ROW
BEGIN
    IF OLD.nombre <> NEW.nombre THEN
        INSERT INTO historial_salarios(empleado_id, salario_anterior) VALUES(OLD.id, OLD.salario);
    END IF;
END;
//
DELIMITER ;