SELECT Nombre_Ciudad,Nombre_pais FROM ciudad, pais WHERE Cod_ciudad = Cod_pais;

SELECT NOMBRE,Nombre_Ciudad,Nombre_Pais FROM EMPRESAS,CIUDAD,PAIS WHERE Nombre_Ciudad = DIRECCION AND Cod_Pais = Cod_Ciudad;

SELECT nombre_producto,valor_unitario, COUNT(*) FROM PRODUCTOS GROUP BY valor_unitario;

SELECT nombre_producto,valor_unitario FROM PRODUCTOS WHERE valor_unitario>2000;

SELECT NOMBRE FROM EMPRESAS WHERE SEDE_PRINCIPAL = 'SP';