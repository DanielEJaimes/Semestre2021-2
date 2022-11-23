
INSERT INTO ESTUDIANTES VALUES('101', 'Pepito Perez', 'Cali', '6411173', 'pepitoperez@gmail.com', '17', '0455512');
INSERT INTO ESTUDIANTES VALUES('102', 'Andres Rojas', 'Santa Marta', '6842518', 'andresRojas@gmail.com', '18', '0455512');
INSERT INTO ESTUDIANTES VALUES('103', 'Elkin Albarracin ', 'Barranquilla', '6024930', 'albarracinElkin@gmail.com', '20', '0455512');
INSERT INTO ESTUDIANTES VALUES('104', 'David Sepulveda', 'Riohacha', '6824950', 'david01@gmail.com', '18', '0455512');
INSERT INTO ESTUDIANTES VALUES('105', 'Daniel Patiño', 'Bucaramanga', '6024982', 'danielEnr@gmail.com', '19', '0455512');
INSERT INTO ESTUDIANTES VALUES('106', 'Silvia Pabon', 'Cartagena', '6100458', 'pabon21@gmail.com', '22', '0455512');
INSERT INTO ESTUDIANTES VALUES('107', 'Victor Villa', 'Medellin', '6353104', 'villam11@gmail.com', '21', '0455512');
INSERT INTO ESTUDIANTES VALUES('108', 'Jesus Jaimes', 'Tolima', '6004851', 'jaimesjesus70@gmail.com', '17', '0455512');
INSERT INTO ESTUDIANTES VALUES('109', 'Lizeth Chavez', 'Neiva', '6821544', 'tatiana01@gmail.com', '20', '0455512');
INSERT INTO ESTUDIANTES VALUES('110', 'Valentina Acevedo', 'Sincelejo', '6411173', 'acevedo01@gmail.com', '18', '0455512');

INSERT INTO MATERIAS VALUES('001','Bases de Datos','4','4','S');
INSERT INTO MATERIAS VALUES('002','Sistemas Operativos','3','4','S');
INSERT INTO MATERIAS VALUES('003','Ingenieria de Software','3','4','S');
INSERT INTO MATERIAS VALUES('004','Analisis de algoritmos','3','4','S');
INSERT INTO MATERIAS VALUES('005','Logica de Programacion','4','1','S');
INSERT INTO MATERIAS VALUES('006','Algebra lineal','3','3','N');
INSERT INTO MATERIAS VALUES('007','Cristologia','2','2','N');
INSERT INTO MATERIAS VALUES('008','Humanismo','2','1','N');
INSERT INTO MATERIAS VALUES('009','Calculo diferencial','4','1','S');
INSERT INTO MATERIAS VALUES('010','Geometria','3','1','N');

INSERT INTO FACULTADES VALUES('401','Ingenieria de Sistemas','51238');
INSERT INTO FACULTADES VALUES('402','Ingenieria Industrial','56300');
INSERT INTO FACULTADES VALUES('403','Ingenieria Ambiental','54770');
INSERT INTO FACULTADES VALUES('404','Diseño Grafico','58841');
INSERT INTO FACULTADES VALUES('405','Derecho','50132');
INSERT INTO FACULTADES VALUES('406','Ingenieria Mecanica','58487');
INSERT INTO FACULTADES VALUES('407','Ingenieria Agronomica','50105');
INSERT INTO FACULTADES VALUES('408','Ciencias Politicas','55841');
INSERT INTO FACULTADES VALUES('409','Medicina','54771');
INSERT INTO FACULTADES VALUES('410','Ingenieria Electrica','54772');

INSERT INTO UNIVERSIDADES VALUES('301','UPB');
INSERT INTO UNIVERSIDADES VALUES('302','UCC');
INSERT INTO UNIVERSIDADES VALUES('303','UIS');
INSERT INTO UNIVERSIDADES VALUES('304','UNAB');
INSERT INTO UNIVERSIDADES VALUES('305','UDI');
INSERT INTO UNIVERSIDADES VALUES('306','UTS');
INSERT INTO UNIVERSIDADES VALUES('307','UNAB');
INSERT INTO UNIVERSIDADES VALUES('308','UFPS');
INSERT INTO UNIVERSIDADES VALUES('309','EAFIT');
INSERT INTO UNIVERSIDADES VALUES('310','UP');

INSERT INTO DOCENTES VALUES('201','Alfredo Albarracin','Ingeniero de Sistemas e Informatica','401','301');
INSERT INTO DOCENTES VALUES('202','Danith Solorzano','Ingeniera de Sistemas e Informatica','401','301');
INSERT INTO DOCENTES VALUES('203','Miguel Sepulveda','Abogado','405','301');
INSERT INTO DOCENTES VALUES('204','Carmer Chavez','Diseñadora Grafica','404','302');
INSERT INTO DOCENTES VALUES('205','Leonardo Sepulveda','Ingeniero de Sistemas e Informatica','401','301');
INSERT INTO DOCENTES VALUES('206','Carlos Angarita','Ingeniero Ambiental','403','303');
INSERT INTO DOCENTES VALUES('207','Viviana Acevedo','Abogada','405','301');
INSERT INTO DOCENTES VALUES('208','Rafael Gamboa','Ingeniero Mecanico','406','304');
INSERT INTO DOCENTES VALUES('209','Laura Peñalosa','Ingeniera Industrial','402','305');
INSERT INTO DOCENTES VALUES('210','Orlando Tarazona','Ingeniero Agronomo','407','306');

INSERT INTO ESTU_MAT VALUES('45','101','001','201');
INSERT INTO ESTU_MAT VALUES('44','102','002','203');
INSERT INTO ESTU_MAT VALUES('38','103','003','202');
INSERT INTO ESTU_MAT VALUES('49','104','001','207');
INSERT INTO ESTU_MAT VALUES('50','105','008','208');
INSERT INTO ESTU_MAT VALUES('35','106','005','208');
INSERT INTO ESTU_MAT VALUES('41','107','003','210');
INSERT INTO ESTU_MAT VALUES('42','108','010','205');
INSERT INTO ESTU_MAT VALUES('39','109','009','205');
INSERT INTO ESTU_MAT VALUES('37','110','001','205');