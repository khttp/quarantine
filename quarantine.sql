-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quarantine
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `doc_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `age` int NOT NULL,
  `Salary` int NOT NULL,
  `date_hired` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `nurse_id` int DEFAULT NULL,
  PRIMARY KEY (`doc_id`),
  KEY `FK` (`nurse_id`),
  CONSTRAINT `FK` FOREIGN KEY (`nurse_id`) REFERENCES `nurses` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (11,'Sara Ali',22,3900,'2021-01-12 21:20:01',1),(12,'Sara Mohamed',32,3900,'2021-01-12 21:23:09',1),(13,'Fathy Sayed',35,4900,'2021-01-12 21:23:09',2),(14,'Amal Ahmed',44,5900,'2021-01-12 21:23:10',3),(15,'Yousef Ahmed',33,4300,'2021-01-12 21:23:10',1),(16,'Ali Ayman',53,6900,'2021-01-12 21:23:10',6),(17,'Shokry Sayed',23,2900,'2021-01-12 21:23:10',7),(18,'Hala Mohanad',62,7000,'2021-01-12 21:23:10',8);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nurses`
--

DROP TABLE IF EXISTS `nurses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nurses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Salary` int NOT NULL,
  `date_hired` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nurses`
--

LOCK TABLES `nurses` WRITE;
/*!40000 ALTER TABLE `nurses` DISABLE KEYS */;
INSERT INTO `nurses` VALUES (1,'Mai Mohamed',2900,'2021-01-12 21:16:21'),(2,'Manar Mohamed',2700,'2021-01-12 21:18:53'),(3,'Mahmoud Ali',2900,'2021-01-12 21:18:53'),(4,'Sara Mohamed',3200,'2021-01-12 21:18:53'),(5,'Samar Omar',3900,'2021-01-12 21:18:53'),(6,'Omar Yassin',3300,'2021-01-12 21:18:53'),(7,'Yousef Hamed',3500,'2021-01-12 21:18:53'),(8,'Esraa Ahmed',3000,'2021-01-12 21:18:53'),(9,'Mayada Moahmed',3200,'2021-01-12 21:18:53'),(10,'Aya Ahmed',3900,'2021-01-12 21:18:53');
/*!40000 ALTER TABLE `nurses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `patient_case` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Room Number` int DEFAULT NULL,
  `time_entered` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`patient_id`),
  KEY `FK2` (`Room Number`),
  CONSTRAINT `FK2` FOREIGN KEY (`Room Number`) REFERENCES `room` (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (44,'ahmed',22,'bad','male',NULL,'2021-01-13 15:29:52'),(45,'mohamed',33,'good','male',NULL,'2021-01-13 16:01:25'),(46,'salem',33,'bad','male',NULL,'2021-01-14 14:08:51');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `room_id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (2,'Class A'),(3,'Class A'),(4,'Class A'),(5,'Class A'),(6,'Class A'),(7,'Class A'),(8,'Class A'),(9,'Class A'),(10,'Class A'),(11,'Class A'),(12,'Class B'),(13,'Class B'),(14,'Class B'),(15,'Class B'),(16,'Class B'),(17,'Class B'),(18,'Class B'),(19,'Class B'),(20,'Class B'),(21,'Class B'),(22,'Class C'),(23,'Class C'),(24,'Class C'),(25,'Class C'),(26,'Class C'),(27,'Class C'),(28,'Class C'),(29,'Class C'),(30,'Class C'),(31,'Class C');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-14 18:30:44
