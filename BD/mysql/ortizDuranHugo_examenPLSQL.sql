-- 1. Procedure. Registrar una venta completa (id cliente, id producto y cantidad).
DELIMITER //
CREATE PROCEDURE venta_completa
(IN p_id_cliente INT, IN p_id_producto INT, IN p_cantidad INT)
BEGIN
    INSERT INTO Ventas(id_cliente, fecha) VALUES(p_id_cliente, NOW());

    INSERT INTO Detalle_Ventas(id_venta, id_producto, cantidad) VALUES (LAST_INSERT_ID(), p_id_producto, p_cantidad);

END;
//
DELIMITER ;

-- 2.- Procedure. Calcular el total gastado por un cliente. Se pasará el identificador de cliente como parámetro
DELIMITER //
CREATE PROCEDURE total_gastado
(IN p_id_cliente INT)
BEGIN
    SELECT Cl.nombre, SUM(Pro.precio * Dv.cantidad) AS total_gastado FROM Detalle_Ventas Dv
    JOIN Productos Pro
    ON Pro.id_producto = Dv.id_producto
    JOIN Ventas Ve
    ON Dv.id_venta = Ve.id_venta
    JOIN Clientes Cl
    ON Ve.id_cliente = Cl.id_cliente
    GROUP BY(Ve.id_cliente)
    HAVING Ve.id_cliente = p_id_cliente;
END;
//
DELIMITER ;

-- 3. Devolver el precio con IVA (21%). Se pasará a la función un valor sobre el cual se calculará el precio incluyendo el IVA.
DELIMITER //
CREATE FUNCTION precio_iva(precio DECIMAL(10,2))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    RETURN precio * 1.21;
END;
//
DELIMITER ;

-- 4. Actualizar automáticamente el stock al vender productos. (tendrá que activarse cuando hagas un INSERT en la tabla 
-- Detalle_Ventas)
DELIMITER //
CREATE TRIGGER actualizar_stock
AFTER INSERT ON Detalle_Ventas
FOR EACH ROW
BEGIN
    UPDATE Productos SET stock = stock - NEW.cantidad WHERE id_producto=NEW.id_producto;
END;
//
DELIMITER ;

-- 5.- Evitar ventas si no hay stock suficiente. Si se inserta una fila en Detalle_Ventas la cantidad especificada tiene que 
-- ser menor o igual que el stock actual que viene descrito en la tabla de productos.
DELIMITER //
CREATE TRIGGER comprobar_stock
BEFORE INSERT ON Detalle_Ventas
FOR EACH ROW
BEGIN
    DECLARE p_stock INT;

    SELECT stock INTO p_stock FROM Productos WHERE id_producto = NEW.id_producto;

    IF NEW.cantidad > p_stock THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El stock es menor que la cantidad que has introducido';
    END IF;

END;
//
DELIMITER ;
