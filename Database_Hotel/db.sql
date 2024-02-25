-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.34 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for hotel_cmjd
CREATE DATABASE IF NOT EXISTS `hotel_cmjd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hotel_cmjd`;

-- Dumping structure for table hotel_cmjd.admin_table
CREATE TABLE IF NOT EXISTS `admin_table` (
  `UserName` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table hotel_cmjd.admin_table: ~2 rows (approximately)
INSERT INTO `admin_table` (`UserName`, `Password`) VALUES
	('Eshan', '123'),
	('sew', '123');

-- Dumping structure for table hotel_cmjd.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `NIC` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `CustomerName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table hotel_cmjd.customer: ~4 rows (approximately)
INSERT INTO `customer` (`NIC`, `CustomerName`) VALUES
	('317549852v', 'Gihan'),
	('884562256v', 'Kapila  aiyya'),
	('971440315v', 'Madumali'),
	('971550392v', 'Sula');

-- Dumping structure for table hotel_cmjd.reservation
CREATE TABLE IF NOT EXISTS `reservation` (
  `CustID` int NOT NULL AUTO_INCREMENT,
  `CustName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `R_Type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Package` varchar(50) NOT NULL,
  `Amount` int(10) unsigned zerofill NOT NULL,
  `Time` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`CustID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table hotel_cmjd.reservation: ~3 rows (approximately)
INSERT INTO `reservation` (`CustID`, `CustName`, `R_Type`, `Package`, `Amount`, `Time`) VALUES
	(12, 'Madumali', 'Couple', 'Full Board', 0000013500, '2024-02-22T17:56:09.377751700'),
	(17, 'Gihan', 'Single', 'Full Board', 0000012000, '2024-02-23T15:26:35.948410600');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
