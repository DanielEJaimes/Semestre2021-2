CREATE TABLE PAIS (
Cod_pais int,
Nombre_Pais varchar(45));

CREATE TABLE CIUDAD (
Cod_ciudad int,
Nombre_Ciudad varchar(45));

CREATE TABLE EMPRESAS (
COD_EMPRESA int,
NOMBRE varchar(45),
DIRECCION varchar(45),
TELEFONO varchar(45),
SEDE_PRINCIPAL varchar(2));

CREATE TABLE TIPOEMPLEADOS (
Cod_tipo_empleado int,
descripcion varchar(45));

CREATE TABLE EMPLEADOS (
Cedula int,
nombre varchar(45),
correo varchar(45),
telefono varchar(45),
sueldo int);

CREATE TABLE AREAS (
cod_area int,
nombre_area varchar(45));

CREATE TABLE Productos (
codi_producto int,
nombre_producto varchar(45),
max_stock int,
min_stock int,
valor_unitario int);

CREATE TABLE Productos_has_EMPLEADOS (
num_factura int,
fecha_venta date,
vlr_descuento int);
