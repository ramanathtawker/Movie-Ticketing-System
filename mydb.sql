-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.73-community - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for mydb
CREATE DATABASE IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mydb`;


-- Dumping structure for table mydb.chennai
CREATE TABLE IF NOT EXISTS `chennai` (
  `MOVIENAME` varchar(25) NOT NULL,
  `SEAT1` int(2) DEFAULT NULL,
  `SEAT2` int(2) DEFAULT NULL,
  `SEAT3` int(2) DEFAULT NULL,
  `SEAT4` int(2) DEFAULT NULL,
  `SEAT5` int(2) DEFAULT NULL,
  `SEAT6` int(2) DEFAULT NULL,
  `SEAT7` int(2) DEFAULT NULL,
  `SEAT8` int(2) DEFAULT NULL,
  `SEAT9` int(2) DEFAULT NULL,
  `SEAT10` int(2) DEFAULT NULL,
  `SEAT11` int(2) DEFAULT NULL,
  `SEAT12` int(2) DEFAULT NULL,
  `SEAT13` int(2) DEFAULT NULL,
  `SEAT14` int(2) DEFAULT NULL,
  `SEAT15` int(2) DEFAULT NULL,
  `SEAT16` int(2) DEFAULT NULL,
  `SEAT17` int(2) DEFAULT NULL,
  `SEAT18` int(2) DEFAULT NULL,
  `SEAT19` int(2) DEFAULT NULL,
  `SEAT20` int(2) DEFAULT NULL,
  `SEAT21` int(2) DEFAULT NULL,
  `SEAT22` int(2) DEFAULT NULL,
  `SEAT23` int(2) DEFAULT NULL,
  `SEAT24` int(2) DEFAULT NULL,
  `SEAT25` int(2) DEFAULT NULL,
  `SEAT26` int(2) DEFAULT NULL,
  `SEAT27` int(2) DEFAULT NULL,
  `SEAT28` int(2) DEFAULT NULL,
  `SEAT29` int(2) DEFAULT NULL,
  `SEAT30` int(2) DEFAULT NULL,
  `DATE` varchar(10) NOT NULL,
  PRIMARY KEY (`MOVIENAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table mydb.images
CREATE TABLE IF NOT EXISTS `images` (
  `SCREEN` varchar(25) NOT NULL,
  `TITLE` varchar(50) NOT NULL,
  `URL` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table mydb.user
CREATE TABLE IF NOT EXISTS `user` (
  `USERNAME` varchar(10) NOT NULL,
  `PASSWORD` varchar(10) DEFAULT NULL,
  `SECURITY` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
