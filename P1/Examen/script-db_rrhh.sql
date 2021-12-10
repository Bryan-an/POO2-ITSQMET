DROP DATABASE IF EXISTS poo2_ep1_db_rrhh;
CREATE DATABASE poo2_ep1_db_rrhh;
USE poo2_ep1_db_rrhh;

CREATE TABLE tpersona (
	idpersona INT(11) AUTO_INCREMENT,
    cedula VARCHAR(10) NOT NULL,
    nombre1 VARCHAR(70) NOT NULL,
    nombre2 VARCHAR(70) DEFAULT NULL,
    apellido1 VARCHAR(70) NOT NULL,
    apellido2 VARCHAR(70) DEFAULT NULL,
    sexo VARCHAR(9) NOT NULL,
    fecha_nac DATE NOT NULL,
    lugar_nac VARCHAR(40) NOT NULL,
    edad INT(3) NOT NULL,
    nacionalidad VARCHAR(30) NOT NULL,
    t_movil VARCHAR(20) NOT NULL,
    correo VARCHAR(30) NOT NULL,
    nom_conyuge VARCHAR(70) DEFAULT NULL,
    naci_conyuge VARCHAR(10) DEFAULT NULL,
    fecha_nac_conyuge DATE DEFAULT NULL,
    ocupacion_conyuge VARCHAR(30) DEFAULT NULL,
    nom_padre VARCHAR(70) NOT NULL,
    naci_padre VARCHAR(10) NOT NULL,
    fecha_nac_padre DATE NOT NULL,
    ocupacion_padre VARCHAR(30) NOT NULL,
    nom_madre VARCHAR(70) NOT NULL,
    naci_madre VARCHAR(10) NOT NULL,
    fecha_nac_madre DATE NOT NULL,
    ocupacion_madre VARCHAR(30) NOT NULL,
	PRIMARY KEY (idpersona)
);