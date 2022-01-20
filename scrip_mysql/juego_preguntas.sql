-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: juego_preguntas
-- ------------------------------------------------------
-- Server version	5.7.26-log

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(45) DEFAULT NULL,
  `Dificultad` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Conocimiento General',1),(2,'Cine',2),(3,'Geografia',3),(4,'Musica',4),(5,'Informatica',5);
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadistica`
--

DROP TABLE IF EXISTS `estadistica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estadistica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idJugador` int(11) DEFAULT NULL,
  `idRonda` int(1) DEFAULT NULL,
  `Premio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadistica`
--

LOCK TABLES `estadistica` WRITE;
/*!40000 ALTER TABLE `estadistica` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadistica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nick` varchar(45) DEFAULT NULL,
  `Tipo_Premio` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opcion`
--

DROP TABLE IF EXISTS `opcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opcion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPregunta` int(4) DEFAULT NULL,
  `Respuesta` varchar(200) DEFAULT NULL,
  `Correcta` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opcion`
--

LOCK TABLES `opcion` WRITE;
/*!40000 ALTER TABLE `opcion` DISABLE KEYS */;
INSERT INTO `opcion` VALUES (1,1,'El Río Nilo',_binary '\0'),(2,1,'El Río Uruguay',_binary '\0'),(3,1,'El Río Amazonas',_binary ''),(4,1,'El Río Paraná',_binary '\0'),(5,2,'1989',_binary ''),(6,2,'1999',_binary '\0'),(7,2,'1945',_binary '\0'),(8,2,'2001',_binary '\0'),(9,3,'Indico',_binary '\0'),(10,3,'Pacífico',_binary ''),(11,3,'Artico',_binary '\0'),(12,3,'Atlántico',_binary '\0'),(13,4,'Cocodrilo',_binary '\0'),(14,4,'Mosquito',_binary ''),(15,4,'Tiburon',_binary '\0'),(16,4,'Araña',_binary '\0'),(17,5,'0',_binary '\0'),(18,5,'2',_binary '\0'),(19,5,'4',_binary '\0'),(20,5,'5',_binary ''),(21,6,'1998',_binary '\0'),(22,6,'2001',_binary '\0'),(23,6,'1999',_binary ''),(24,6,'2000',_binary '\0'),(25,7,'Will Smith',_binary '\0'),(26,7,'Brad Pitt',_binary ''),(27,7,'Jhon Travolta',_binary '\0'),(28,7,'Elvis Presley',_binary '\0'),(29,8,'El Planeta de los Simios',_binary '\0'),(30,8,'Madagascar',_binary '\0'),(31,8,'El Rey Leon',_binary ''),(32,8,'Shrek',_binary '\0'),(33,9,'El Renacido',_binary ''),(34,9,'Titanic',_binary '\0'),(35,9,'El Lobo de Wall Street',_binary '\0'),(36,9,'El Origen',_binary '\0'),(37,10,'1988',_binary '\0'),(38,10,'2011',_binary '\0'),(39,10,'2007',_binary ''),(40,10,'2008',_binary '\0'),(41,11,'Jordania,Israel y Palestina',_binary ''),(42,11,'Egipto y Namibia',_binary '\0'),(43,11,'Iran, Palestina y Siria',_binary '\0'),(44,11,'Iran, Palestina e Israel',_binary '\0'),(45,12,'Rusia',_binary ''),(46,12,'Canadá',_binary '\0'),(47,12,'Estados Unidos',_binary '\0'),(48,12,'Brasil',_binary '\0'),(49,13,'Huascaran',_binary '\0'),(50,13,'Aconcagua',_binary ''),(51,13,'Tres Cruces',_binary '\0'),(52,13,'Bonete',_binary '\0'),(53,14,'Salto del Ángel',_binary ''),(54,14,'Iguazú',_binary '\0'),(55,14,'Niágara',_binary '\0'),(56,14,'Salto Yosemite',_binary '\0'),(57,15,'15',_binary '\0'),(58,15,'19',_binary ''),(59,15,'22',_binary '\0'),(60,15,'17',_binary '\0'),(61,16,'Georg Friedrich Haendel',_binary '\0'),(62,16,'Antonio Lucio Vivaldi',_binary '\0'),(63,16,'Wolfang Amadeus Mozart',_binary ''),(64,16,'Ludwig van Beethoven ',_binary '\0'),(65,17,'Belga',_binary '\0'),(66,17,'Austriaco',_binary '\0'),(67,17,'Polaco',_binary '\0'),(68,17,'Aleman ',_binary ''),(69,18,'Gran Bretaña',_binary '\0'),(70,18,'Irlanda',_binary '\0'),(71,18,'Tanzania',_binary ''),(72,18,'Sud Africa',_binary '\0'),(73,19,'Argentina',_binary '\0'),(74,19,'Paraguay',_binary '\0'),(75,19,'Uruguay',_binary ''),(76,19,'Chile',_binary '\0'),(77,20,'Los Redondos',_binary '\0'),(78,20,'Rata Blanca',_binary '\0'),(79,20,'Soda Stereo',_binary ''),(80,20,'La Renga',_binary '\0'),(81,21,'1959',_binary ''),(82,21,'1969',_binary '\0'),(83,21,'1967',_binary '\0'),(84,21,'1953',_binary '\0'),(85,22,'1959',_binary '\0'),(86,22,'1969',_binary '\0'),(87,22,'1991',_binary ''),(88,22,'1953',_binary '\0'),(89,23,'Maketado de Algoritmos',_binary '\0'),(90,23,'Renderizar Videos',_binary '\0'),(91,23,'Programacion Orientada a Objetos',_binary '\0'),(92,23,'Desarrollo Web',_binary ''),(93,24,'Hedy Lamarr',_binary '\0'),(94,24,'Ada Lovelace',_binary ''),(95,24,'Lynn Conway',_binary '\0'),(96,24,'Frances Allen',_binary '\0'),(97,25,'2001',_binary '\0'),(98,25,'2002',_binary '\0'),(99,25,'2003',_binary ''),(100,25,'2000',_binary '\0');
/*!40000 ALTER TABLE `opcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pregunta` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `idCategoria` int(2) DEFAULT NULL,
  `Pregunta` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` VALUES (1,1,'¿Cuál es el río más largo del mundo?'),(2,1,'¿En qué año cayó el muro de Berlín?'),(3,1,'¿Cuál es el océano más grande del mundo?'),(4,1,'¿Cuál es el animal que más muertes provoca cada año?'),(5,1,'¿Cuántos corazones tiene un gusano de tierra?'),(6,2,'¿En qué año se estreno Matrix?'),(7,2,'¿Qué actor interpretó a Aquiles en la película Troya del 2004?'),(8,2,'¿En qué película podemos encontrar al león Mufasa y a su hijo Simba?'),(9,2,'¿Por qué película ganó Leonardo DiCaprio su primer Óscar? '),(10,2,'¿En que año se estrenó la pelicula uruguaya \'El baño del papa\'?'),(11,3,'¿Dónde está el mar Muerto?'),(12,3,'¿Cuál es el país más grande del mundo?'),(13,3,'¿Cuál es la montaña más alta del continente americano?'),(14,3,'¿Cuál es la catarata más alta del mundo?'),(15,3,'¿Cuantos departamentos integran la República Oriental del Uruguay?'),(16,4,'¿Qué mítico compositor fue el creador de la ópera Las bodas de Fígaro?'),(17,4,'¿De qué nacionalidad era Beethoven?'),(18,4,'¿En qué país nació Freddie Mercury?'),(19,4,'¿De que pais es originaria la famosa banda \'Los Iracundos\'?'),(20,4,'¿Quién interpreta la canción De música ligera?'),(21,5,'¿En que año fue creado el lenguaje COBOL?'),(22,5,'¿En que año nacio LINUX?'),(23,5,'¿Para que sirve HTML?'),(24,5,'¿Primer mujer programadora?'),(25,5,'¿En que año fue lanzado Windows XP?');
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ronda`
--

DROP TABLE IF EXISTS `ronda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ronda` (
  `id` int(1) NOT NULL,
  `Dificultad` int(4) DEFAULT NULL,
  `idPremio` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ronda`
--

LOCK TABLES `ronda` WRITE;
/*!40000 ALTER TABLE `ronda` DISABLE KEYS */;
INSERT INTO `ronda` VALUES (1,25,1),(2,50,2),(3,90,3),(4,150,4),(5,200,5);
/*!40000 ALTER TABLE `ronda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-20 19:51:18
