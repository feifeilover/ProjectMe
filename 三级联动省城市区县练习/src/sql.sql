/*
SQLyog Ultimate v12.08 (32 bit)
MySQL - 5.5.60 : Database - igeek_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`igeek_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `igeek_test`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  `pro_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `fk_pro_pid` (`pro_id`),
  CONSTRAINT `fk_pro_pid` FOREIGN KEY (`pro_id`) REFERENCES `province` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8;

/*Data for the table `city` */

insert  into `city`(`cid`,`cname`,`pro_id`) values (101,'南京',1),(102,'无锡',1),(103,'苏州',1),(104,'常州',1),(201,'郑州',2),(202,'洛阳',2),(203,'开封',2),(204,'商丘',2);

/*Table structure for table `county` */

DROP TABLE IF EXISTS `county`;

CREATE TABLE `county` (
  `qid` int(11) NOT NULL AUTO_INCREMENT,
  `qname` varchar(20) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`qid`),
  KEY `fk_city_cid` (`city_id`),
  CONSTRAINT `fk_city_cid` FOREIGN KEY (`city_id`) REFERENCES `city` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=325 DEFAULT CHARSET=utf8;

/*Data for the table `county` */

insert  into `county`(`qid`,`qname`,`city_id`) values (301,'玄武区',101),(302,'鼓楼区',101),(303,'浦口区',101),(304,'崇安区',102),(305,'南长区',102),(306,'惠山区',102),(307,'吴中区',103),(308,'沧浪区',103),(309,'平江区',103),(310,'钟楼区',104),(311,'武进区',104),(312,'天宁区',104),(313,'中原区',201),(314,'二七区',201),(315,'金水区',201),(316,'老城区',202),(317,'西工区',202),(318,'洛龙区',202),(319,'龙亭区',203),(320,'鼓楼区',203),(321,'郊区',203),(322,'梁园区',204),(323,'睢阳区',204),(324,'民权县',204);

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `province` */

insert  into `province`(`pid`,`pname`) values (1,'江苏省'),(2,'河南省');



