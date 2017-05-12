CREATE DATABASE  IF NOT EXISTS `stuBasket` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `stuBasket`;
-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: stuBasket
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.16-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coach`
--

DROP TABLE IF EXISTS `coach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coach` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coachname` varchar(25) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `birth` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coach`
--

LOCK TABLES `coach` WRITE;
/*!40000 ALTER TABLE `coach` DISABLE KEYS */;
/*!40000 ALTER TABLE `coach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rival` int(11) DEFAULT NULL,
  `win` int(11) DEFAULT NULL,
  `home` int(11) DEFAULT NULL,
  `dategame` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rival` (`rival`),
  CONSTRAINT `game_ibfk_1` FOREIGN KEY (`rival`) REFERENCES `rival` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `playername` varchar(25) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `birth` int(11) DEFAULT NULL,
  `enplantilla` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playergame`
--

DROP TABLE IF EXISTS `playergame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `playergame` (
  `idplayer` int(11) NOT NULL,
  `idgame` int(11) NOT NULL,
  `minutes` int(11) DEFAULT NULL,
  `points` int(11) DEFAULT NULL,
  `rebounds` int(11) DEFAULT NULL,
  `asists` int(11) DEFAULT NULL,
  `steals` int(11) DEFAULT NULL,
  `blocks` int(11) DEFAULT NULL,
  `fieldgoalsattempted` int(11) DEFAULT NULL,
  `fieldgoalsmade` int(11) DEFAULT NULL,
  `threepointattempted` int(11) DEFAULT NULL,
  `threepointmade` int(11) DEFAULT NULL,
  `freethrowsattempted` int(11) DEFAULT NULL,
  `freethrowsmade` int(11) DEFAULT NULL,
  PRIMARY KEY (`idplayer`,`idgame`),
  KEY `idgame` (`idgame`),
  CONSTRAINT `playergame_ibfk_1` FOREIGN KEY (`idplayer`) REFERENCES `player` (`id`),
  CONSTRAINT `playergame_ibfk_2` FOREIGN KEY (`idgame`) REFERENCES `game` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playergame`
--

LOCK TABLES `playergame` WRITE;
/*!40000 ALTER TABLE `playergame` DISABLE KEYS */;
/*!40000 ALTER TABLE `playergame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rival`
--

DROP TABLE IF EXISTS `rival`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rival` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teamname` varchar(25) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rival`
--

LOCK TABLES `rival` WRITE;
/*!40000 ALTER TABLE `rival` DISABLE KEYS */;
/*!40000 ALTER TABLE `rival` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-12 20:47:51
