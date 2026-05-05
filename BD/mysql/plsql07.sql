-- 1. Procedimiento para insertar una guitarra si no existe. Tendrás que pasarle el modelo, el precio, el stock y la marca.
DELIMITER //
CREATE PROCEDURE insertar_guitarra
(IN p_modelo VARCHAR(100), IN p_precio DECIMAL(10,2), IN p_stock INT, IN p_id_marca INT)
BEGIN
    DECLARE existe INT;

    SELECT COUNT(*) INTO existe FROM guitarras WHERE modelo = p_modelo;

    IF existe = 0 THEN
        INSERT INTO guitarras(modelo, precio, stock, id_marca) VALUES(p_modelo, p_precio, p_stock, p_id_marca);
    ELSE                
        SELECT 'La guitarra ya existe' AS mensaje;
    END IF;
END;
//
DELIMITER ;

-- 2. Función que devuelve el total de todos los precios * stock
DELIMITER //
CREATE FUNCTION precios_totales()
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10,2);

    SELECT SUM(precio*stock) INTO total FROM guitarras;

    RETURN total;
END;
//
DELIMITER ;

-- 3. Procedimiento que permita actualizar un precio en la tabla de guitarras. Necesitará el identificador de la guitarra y el 
-- nuevo precio.

DELIMITER //
CREATE PROCEDURE actualizar_precio
(IN id_guitarra INT, IN p_precio DECIMAL(10,2))
BEGIN
    UPDATE guitarras SET precio = p_precio WHERE id = id_guitarra;
END;
//
DELIMITER ;

-- 4. Trigger: si en una actualización se va a cambiar el stock a un valor negativo paralizar la ejecución del mismo
DELIMITER //
CREATE TRIGGER evitar_negativo
BEFORE UPDATE ON guitarras
FOR EACH ROW
BEGIN
    IF (NEW.stock < 0) THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El stock no puede ser negativo';
    END IF;
END;
//
DELIMITER ;

-- 5. Función que devuelva el total de ventas por cliente. Tendrás que usar las tablas ventas y detalle_ventas 
-- (pista: suma el campo cantidad)  
DELIMITER //
CREATE FUNCTION ventas_por_cliente(p_id INT)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN(
    SELECT SUM(dv.cantidad) FROM detalle_ventas dv
    JOIN ventas v
    ON dv.id_venta = v.id
    WHERE v.id_cliente = p_id
    );
END;
//
DELIMITER ;

-- 6. Procedimiento para listar guitarras caras (>1000)
DELIMITER //
CREATE PROCEDURE listar_guitarras_caras()
BEGIN
    SELECT * FROM guitarras WHERE precio > 1000;
END;
//
DELIMITER ;

-- 7. Función que devuelva el total de guitarras por marca. Lógicamente tendrás que pasar la marca como parámetro a 
-- la función
