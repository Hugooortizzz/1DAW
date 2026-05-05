-- 1) Cree un procedimiento almacenado llamado uspCountriesAsia para enumerar todos los países con ContinentId igual a 1 
-- de forma ascendente


DELIMITER //

CREATE PROCEDURE uspCountriesAsia()
BEGIN
    SELECT * FROM tblCountry 
    WHERE ContinentID = 1
    ORDER BY CountryName ASC;
END;
//

DELIMITER ;

-- 2) Modifique el texto de su consulta para crear un procedimiento diferente llamado uspCountriesEurope que enumere todos los 
-- países con el número de identificación del continente 3 de forma descendente
DELIMITER //

CREATE PROCEDURE uspCountriesEurope()
BEGIN
    SELECT * FROM tblCountry 
    WHERE ContinentID = 3
    ORDER BY CountryName DESC;
END;
//

DELIMITER ;