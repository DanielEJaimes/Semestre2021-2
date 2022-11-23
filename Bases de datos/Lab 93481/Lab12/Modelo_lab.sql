

Create table  VENDEDOR  (
	 CODIGO_V  varchar(3) NOT NULL ,
	 NOMBRE_V  varchar(45),
	 ESTADO  varchar(30),
	 CIUDAD  varchar(30),
primary key ( CODIGO_V ) 
) ; 

Create table  PROYECTOS  (
	 CODIGO_P  varchar(3) NOT NULL ,
	 NOMBRE_P  varchar(30),
	 CIUDAD  varchar(30),
primary key ( CODIGO_P ) 
) ; 

Create table  ARTICULOS  (
	 CODIGO_A  varchar(3) NOT NULL ,
	 NOMBRE_A  varchar(30),
	 COLOR  varchar(30),
	 PESO  decimal(4,2),
	 CIUDAD  varchar (30),
primary key ( CODIGO_A ) 
) ; 

Create table  VEND_PRO_ART  (
	 CODIGO_V  varchar (3) NOT NULL ,
	 CODIGO_A  varchar (3) NOT NULL ,
	 CODIGO_P  varchar (3) NOT NULL ,
	 CANTIDAD  integer ,
primary key ( CODIGO_V , CODIGO_A , CODIGO_P ) 
); 


-- Create Foreign keys section

Alter table  VEND_PRO_ART  add  foreign key ( CODIGO_V ) references  VENDEDOR  ( CODIGO_V ) ; 
Alter table  VEND_PRO_ART  add  foreign key ( CODIGO_P ) references  PROYECTOS  ( CODIGO_P ) ; 
Alter table  VEND_PRO_ART  add  foreign key ( CODIGO_A ) references  ARTICULOS  ( CODIGO_A ) ; 
