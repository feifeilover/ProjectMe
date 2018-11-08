/*
SQLyog Ultimate v12.08 (32 bit)
MySQL - 5.5.60 : Database - db_message
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_message` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_message`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `observer_id` int(11) DEFAULT NULL,
  `reply` varchar(200) DEFAULT NULL,
  `msg_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_com_msg` (`msg_id`),
  KEY `fk_com_msg1` (`observer_id`),
  CONSTRAINT `fk_com_msg` FOREIGN KEY (`msg_id`) REFERENCES `messages` (`id`),
  CONSTRAINT `fk_com_msg1` FOREIGN KEY (`observer_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9023 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`id`,`observer_id`,`reply`,`msg_id`) values (9003,1,'李四第一条评论....',2002),(9004,1,'李四第二条评论....',2002),(9005,1,'hahaha',2002),(9006,1,'你是一个好孩子',2002),(9007,2,'李四自己评论',2002),(9014,1,'hahahaha你是?	',4444),(9017,1,'第一条评论',1002),(9018,1,'第二条评论',1002),(9019,1,'好什么好，一天没有好好休息了		',2003),(9020,1,'你是？？？？',4444),(9021,2,'然后呢、、、你要干嘛啊		',5003),(9022,2,'为什么啊？	',2003);

/*Table structure for table `messages` */

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言编号',
  `publishTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `context` varchar(200) DEFAULT NULL COMMENT '留言内容',
  `author_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  KEY `fk_mid_aid` (`author_id`),
  CONSTRAINT `fk_mid_aid` FOREIGN KEY (`author_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5005 DEFAULT CHARSET=utf8;

/*Data for the table `messages` */

insert  into `messages`(`id`,`publishTime`,`context`,`author_id`) values (1002,'2018-10-21 19:49:54','这是张三的第二条测试',1),(2002,'2018-10-19 16:18:03','我是李四	',2),(2003,'2018-10-21 19:25:36','今天是星期日我的心情特别好啊',2),(4444,'2018-10-20 12:14:45','这是我张三的留言哦	\r\n				',1),(5003,'2018-10-21 19:52:53','明天就是苦逼的星期一			\r\n				',1),(5004,'2018-10-21 19:53:30','还有五天才放假啊，我很伤心啊',1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `loginName` varchar(50) DEFAULT NULL COMMENT '登录名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `writerName` varchar(200) DEFAULT NULL COMMENT '签名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginName` (`loginName`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`loginName`,`password`,`email`,`writerName`) values (1,'张三','zhangsan','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','zhang@163.com','今天天气真好'),(2,'李四','lisi','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','lisi@163.com','今天天气bbbb'),(3,'大华','dahua','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257',NULL,'大华长的很帅'),(4,'王五','wangwu','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257',NULL,'隔壁老王....哈哈');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
