-- 1) Crea un procedimiento almacenado que inserte un nuevo grupo solo si no existe otro con el mismo nombre.
DELIMITER //
CREATE PROCEDURE nuevo_grupo 
(IN p_nombre VARCHAR(100), IN p_pais VARCHAR(50), IN p_anio_formacion INT)
BEGIN
    DECLARE existe INT;

    SELECT COUNT(*) INTO existe
    FROM grupos
    WHERE nombre = p_nombre;

    IF existe = 0 THEN
        INSERT INTO grupos(nombre, pais, anio_formacion) VALUES(p_nombre, p_pais, p_anio_formacion);
    END IF;
END;
//
DELIMITER ;

-- 2) Crea una función que reciba el id de un grupo y devuelva cuántos álbumes tiene.
DELIMITER //
CREATE FUNCTION numero_albumes(p_id INT)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE numero INT;
    SELECT COUNT(*) INTO numero FROM albumes WHERE id_grupo = p_id;
    RETURN numero;
END;
//

DELIMITER ;

-- 3) Crea un procedimiento que: reciba el nombre de un grupo, actualice su país, si el grupo no existe, muestre un mensaje
DELIMITER //
CREATE PROCEDURE actualizar_grupo
(IN p_nombre VARCHAR(100), IN p_pais VARCHAR(50))
BEGIN
    DECLARE existe INT;

    SELECT COUNT(*) INTO existe
    FROM grupos
    WHERE nombre = p_nombre;

    IF existe = 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El grupo no existe';
    ELSE
        UPDATE grupos SET pais = p_pais WHERE nombre=p_nombre;
    END IF;
END;

//
DELIMITER ;

-- 4) Crea un trigger BEFORE INSERT que: evite insertar álbumes con año menor a 1950/si ocurre, lance un error
DELIMITER //
CREATE TRIGGER evitar_albumes
BEFORE INSERT ON albumes
FOR EACH ROW
BEGIN
    IF NEW.anio < 1950 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El año no puede ser menor de 1950';
    END IF;
END
//
DELIMITER ;

--  5) Crea un procedimiento que: reciba un número X | muestre los grupos que tienen más de X álbumes
DELIMITER //
CREATE PROCEDURE filtrar_grupos
(IN p_numero INT)
BEGIN
    SELECT grupos.nombre, COUNT(albumes.id_grupo) AS n_albumes FROM grupos
    JOIN albumes
    ON grupos.id = albumes.id_grupo
    GROUP BY grupos.id, grupos.nombre
    HAVING COUNT(albumes.id_grupo) > p_numero;
END;

//
DELIMITER ;