--  CREAR ESQUEMA, USUARIO Y CONTRASEÑA
--  SQL>GRANT CONNECT, RESOURCE, CREATE SESSION, CREATE VIEW TO SPRINGWEB IDENTIFIED BY SPRINGWEB;
--  SQL>DROP USER SPRINGWEB CASCADE;

--DROP TABLE "SPRINGWEB"."FUSERS";
--DROP TABLE "SPRINGWEB"."FROLES";

select * from FUSERS;
select * from FROLES;
select * from fuser_roles;

 CREATE TABLE "SPRINGWEB"."FUSERS" 
   (	"ID" INT NOT NULL ENABLE, 
	"NAME" VARCHAR2(30 BYTE), 
	"PASSWORD" VARCHAR2(250 BYTE) NOT NULL ENABLE, 
	"USERKEY" VARCHAR2(15 BYTE) DEFAULT NULL, 
	"EMAIL" VARCHAR2(150 BYTE) NOT NULL ENABLE, 
	"DATECREATED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP, 
	"DATEMODIFIED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP,   
	 PRIMARY KEY ("ID")
   );
   
  CREATE TABLE "SPRINGWEB"."FROLES" 
   (	"ID" INT NOT NULL ENABLE, 
	"ROLE" VARCHAR2(30 BYTE) NOT NULL ENABLE, 
	"DATECREATED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP, 
	"DATEMODIFIED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP, 
	 PRIMARY KEY ("ID")
   ) ;  
   
  CREATE TABLE "SPRINGWEB"."FUSER_ROLES" 
   (	"IDUSER" INT NOT NULL ENABLE, 
	"IDROLE" NUMBER(*,0) NOT NULL ENABLE, 
	"DATECREATED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP, 
	"DATEMODIFIED" TIMESTAMP (6) DEFAULT CURRENT_TIMESTAMP, 
	 PRIMARY KEY ("IDUSER", "IDROLE")
   ) ; 
   
   CREATE SEQUENCE  "SPRINGWEB"."IDFUSERS_SEQ"  
   MINVALUE 1 
   MAXVALUE 9999999999999999999999999999 
   INCREMENT BY 1 
   START WITH 1 
   CACHE 20 
   NOORDER  NOCYCLE ;
   
   CREATE SEQUENCE  "SPRINGWEB"."IDFROLES_SEQ_GENERADOR"  
   MINVALUE 1 
   MAXVALUE 9999999999999999999999999999 
   INCREMENT BY 1 
   START WITH 1 
   CACHE 20 
   NOORDER  NOCYCLE ;   
--truncate table FUSERS;  
INSERT INTO FUSERS (ID, NAME, PASSWORD, USERKEY, EMAIL) VALUES ('1', 'angelricardo.uthh@gmail.com', '$2a$10$UTpjhhu3sdgTRamgPrcHoeO2zzPLDKhGqtYNdbV4J7YR7Xq/nABLG', NULL, 'angelricardo.uthh@gmail.com');
INSERT INTO FUSERS (ID, NAME, PASSWORD, USERKEY, EMAIL) VALUES ('2', 'angelricardo.uthh2@gmail.com', '$2a$10$UTpjhhu3sdgTRamgPrcHoeO2zzPLDKhGqtYNdbV4J7YR7Xq/nABLG', NULL, 'angelricardo.uthh@gmail.com');   

--truncate table FROLES;
INSERT INTO FROLES (ID, ROLE) VALUES ('1', 'ADMIN');
INSERT INTO FROLES (ID, ROLE) VALUES ('2', 'USER');   

INSERT INTO FUSER_ROLES (IDUSER, IDROLE) VALUES ('1', '1');
INSERT INTO FUSER_ROLES (IDUSER, IDROLE) VALUES ('2', '2');
   