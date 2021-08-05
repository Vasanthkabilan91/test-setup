CREATE DATABASE  IF NOT EXISTS `springbootdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `springbootdb`;

DROP TABLE IF EXISTS `employee_db`;

CREATE TABLE `employee_db` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `employee_gender` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `employeeContactNumber` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
