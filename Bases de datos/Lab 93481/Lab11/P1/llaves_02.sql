ALTER TABLE PAIS
  ADD PRIMARY KEY (Cod_pais);

ALTER TABLE CIUDAD
  ADD PRIMARY KEY (Cod_ciudad);
  
ALTER TABLE EMPRESAS
  ADD PRIMARY KEY (COD_EMPRESA);
  
ALTER TABLE TIPOEMPLEADOS
  ADD PRIMARY KEY (Cod_tipo_empleado);
  
ALTER TABLE EMPLEADOS
  ADD PRIMARY KEY (Cedula);
  
ALTER TABLE AREAS
  ADD PRIMARY KEY (cod_area);
  
ALTER TABLE Productos
  ADD PRIMARY KEY (codi_producto);

ALTER TABLE productos_has_empleados
  ADD PRIMARY KEY (num_factura);