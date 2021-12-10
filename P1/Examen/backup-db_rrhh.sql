CREATE DATABASE  IF NOT EXISTS `poo2_ep1_db_rrhh` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `poo2_ep1_db_rrhh`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: poo2_ep1_db_rrhh
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tpersona`
--

DROP TABLE IF EXISTS `tpersona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tpersona` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `cedula` varchar(10) NOT NULL,
  `nombre1` varchar(70) NOT NULL,
  `nombre2` varchar(70) DEFAULT NULL,
  `apellido1` varchar(70) NOT NULL,
  `apellido2` varchar(70) DEFAULT NULL,
  `sexo` varchar(9) NOT NULL,
  `fecha_nac` date NOT NULL,
  `lugar_nac` varchar(40) NOT NULL,
  `edad` int NOT NULL,
  `nacionalidad` varchar(30) NOT NULL,
  `t_movil` varchar(20) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `nom_conyuge` varchar(70) DEFAULT NULL,
  `naci_conyuge` varchar(10) DEFAULT NULL,
  `fecha_nac_conyuge` date DEFAULT NULL,
  `ocupacion_conyuge` varchar(30) DEFAULT NULL,
  `nom_padre` varchar(70) NOT NULL,
  `naci_padre` varchar(10) NOT NULL,
  `fecha_nac_padre` date NOT NULL,
  `ocupacion_padre` varchar(30) NOT NULL,
  `nom_madre` varchar(70) NOT NULL,
  `naci_madre` varchar(10) NOT NULL,
  `fecha_nac_madre` date NOT NULL,
  `ocupacion_madre` varchar(30) NOT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpersona`
--

LOCK TABLES `tpersona` WRITE;
/*!40000 ALTER TABLE `tpersona` DISABLE KEYS */;
INSERT INTO `tpersona` VALUES (2,'12341234','Carlos','Marco','Sanchez','Caiza','M','2000-04-30','Quito',41,'Ecuatoriano','234213343','car@gmail.com','Luisa','12413','2000-04-30','Enfermera','Fabricio','1341324','2000-04-30','Carpintero','Diana','1341234','2000-04-30','Ingeniera'),(3,'1324132','Marco','Luis','Andrade','Chasi','M','2000-04-30','Guayaquil',34,'Ecuatoriano','13413412','marco@gmail.com','Cristina','13234132','2000-04-30','Arquitecta','Alex','123341','2000-04-30','Ingeniero','Viviana','13411334','2000-04-30','Abogada'),(4,'3412341','Melisa','Karla','Borja','Santos','F','2000-04-30','Quito',24,'Ecuatoriana','13413241','meli@gmail.com','Xavier','13241324','2000-04-30','Ingeniero','Patricio','132413134','2000-04-30','Profesor','Adriana','1413241','2000-04-30','Doctora');
/*!40000 ALTER TABLE `tpersona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-09 10:09:57
