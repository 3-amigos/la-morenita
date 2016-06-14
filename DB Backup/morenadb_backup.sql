-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: morenadb_schema
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `check`
--

DROP TABLE IF EXISTS `check`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `check` (
  `Check_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Check_Number` int(11) NOT NULL,
  `Check_Amount` float NOT NULL,
  `Check_Memo` longtext,
  `Check_Date` date NOT NULL,
  `Check_Status` varchar(10) DEFAULT NULL,
  `Company_ID` int(11) DEFAULT NULL,
  `Invoice_ID` int(11) NOT NULL,
  `Check_CustomerID` int(11) NOT NULL,
  PRIMARY KEY (`Check_ID`),
  UNIQUE KEY `Check_ID_UNIQUE` (`Check_ID`),
  KEY `Company_ID_idx` (`Company_ID`),
  KEY `InvoiceID_idx` (`Invoice_ID`),
  KEY `CustID_idx` (`Check_CustomerID`),
  CONSTRAINT `CompanyID` FOREIGN KEY (`Company_ID`) REFERENCES `company` (`Company_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CustomerID` FOREIGN KEY (`Check_CustomerID`) REFERENCES `customer` (`Customer_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `InvoiceID` FOREIGN KEY (`Invoice_ID`) REFERENCES `invoice` (`Invoice_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='Check table holds the information associated to a single check';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `check`
--

LOCK TABLES `check` WRITE;
/*!40000 ALTER TABLE `check` DISABLE KEYS */;
INSERT INTO `check` VALUES (1,2345,100.1,NULL,'2016-04-20','INPROGRESS',NULL,1,1),(2,2366,100.1,NULL,'2016-04-20','INPROGRESS',NULL,1,1),(3,2367,200.2,NULL,'2016-05-20','INPROGRESS',NULL,1,1),(4,23787,600.5,NULL,'2016-05-02','INPROGRESS',NULL,2,2),(5,27787,176.5,NULL,'2016-05-25','INPROGRESS',NULL,2,2);
/*!40000 ALTER TABLE `check` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `Company_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Name` varchar(255) NOT NULL,
  `Company_Address1` varchar(50) DEFAULT NULL,
  `Company_Address2` varchar(50) DEFAULT NULL,
  `Company_CIty` varchar(25) DEFAULT NULL,
  `Comapny_State` varchar(2) DEFAULT NULL,
  `Company_Zip` int(11) DEFAULT NULL,
  `Company_Phone` varchar(15) NOT NULL,
  PRIMARY KEY (`Company_ID`),
  UNIQUE KEY `Company_ID_UNIQUE` (`Company_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `Customer_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FName` varchar(25) NOT NULL,
  `MName` varchar(25) DEFAULT NULL,
  `SurName` varchar(25) NOT NULL,
  `MaternalSurName` varchar(25) DEFAULT NULL,
  `Phone` varchar(15) NOT NULL,
  `Address1` varchar(50) DEFAULT NULL,
  `Address2` varchar(50) DEFAULT NULL,
  `City` varchar(25) DEFAULT NULL,
  `State` varchar(2) DEFAULT NULL,
  `Zip` int(11) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Table holds information related to the customer';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Alvaro',NULL,'Licea',NULL,'2063334444',NULL,NULL,NULL,NULL,NULL),(2,'Odiscious',NULL,'Dozier',NULL,'2064533234',NULL,NULL,NULL,NULL,NULL),(3,'juan','eduardo','martinez','dominguez','4251234567',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `Invoice_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Invoice_Date` date NOT NULL,
  `Invoice_TotalCharge` float NOT NULL,
  `Invoice_CustomerID` int(11) NOT NULL,
  PRIMARY KEY (`Invoice_ID`),
  UNIQUE KEY `Invoice_ID_UNIQUE` (`Invoice_ID`),
  KEY `invCustomerID_idx` (`Invoice_CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='invoice table holds information of the invoice''s date and total amount from checks associated with a particular invoice';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (1,'2016-06-08',400.4,0),(2,'2016-06-08',777,0);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `User_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FName` varchar(25) NOT NULL,
  `LName` varchar(25) NOT NULL,
  `UserName` varchar(25) NOT NULL,
  `UserPassword` varchar(25) NOT NULL,
  `Admin` binary(2) NOT NULL,
  PRIMARY KEY (`User_ID`),
  UNIQUE KEY `User_ID_UNIQUE` (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='User table contains the user authenticated to access the database';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Juan','Martinez','admin','password','1\0');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-13 20:26:32
