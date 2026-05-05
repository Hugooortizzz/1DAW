-- 1.-  Crea un procedimiento llamado listar_empleados_departamento que reciba como parámetro el ID de un departamento y 
-- devuelva los nombres de los empleados de ese departamento.
DELIMITER //
CREATE PROCEDURE listar_empleados_departamento
(IN d_id INT)
BEGIN
    SELECT * FROM empleados
    WHERE departamento_id = d_id;
END;
//
DELIMITER ;

-- 2.-  Crea un procedimiento llamado asignar_proyecto_a_empleado que reciba el ID de un empleado y el ID de un proyecto, 
-- y registre esa relación en la tabla empleados_proyectos. Haz un inner join, antes y después, de las tres tablas implicadas 
-- para ver el resultado
DELIMITER //
CREATE PROCEDURE asignar_proyecto_a_empleado
(IN e_id INT,
IN p_id INT)
BEGIN
    INSERT INTO empleados_proyectos(empleado_id, proyecto_id)
    VALUES (e_id, p_id);
END;
//
DELIMITER ;

-- 3.- Crea una función llamada contar_proyectos_empleado que reciba el ID de un empleado y devuelva el número de proyectos en 
-- los que trabaja.
DELIMITER //

CREATE FUNCTION contar_proyectos_empleado(e_id INT)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE total INT;
    SELECT COUNT(*) INTO total FROM empleados_proyectos WHERE empleado_id = e_id;
    RETURN total;
END;
//

DELIMITER ;

-- 4.- Crea un trigger llamado after_insert_empleado que, después de insertar un nuevo empleado, inserte automáticamente 
-- un registro en la tabla empleados_proyectos asignándolo al Proyecto Alpha (id=1).
DELIMITER //

CREATE TRIGGER after_insert_empleado
AFTER INSERT ON empleados
FOR EACH ROW
BEGIN
    INSERT INTO empleados_proyectos(empleado_id, proyecto_id) VALUES(NEW.id, 1);
END;
//

DELIMITER ;

-- 5.- Crea un trigger llamado before_delete_proyecto que impida eliminar un proyecto si tiene empleados asignados.
DELIMITER //

CREATE TRIGGER before_delete_proyecto
BEFORE DELETE ON proyectos
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM empleados_proyectos WHERE proyecto_id = OLD.id) THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No se puede eliminar un proyecto que tiene empleados asignados.';
    END IF;
END;
//

DELIMITER ;

