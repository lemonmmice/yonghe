/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : yonghe

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2022-06-10 13:19:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_door
-- ----------------------------
DROP TABLE IF EXISTS `tb_door`;
CREATE TABLE `tb_door` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_door
-- ----------------------------
INSERT INTO `tb_door` VALUES ('1', '美食城二号', '45645644', 'albb');
INSERT INTO `tb_door` VALUES ('2', '永和大王(知春路店)', '010-82356537', '知春路29号大运金都');
INSERT INTO `tb_door` VALUES ('3', '永和大王(东直门)', '010-84477746', '东直门外大街48号东方银座b2-08');
INSERT INTO `tb_door` VALUES ('4', '永和大王(北京站)', '010-65286602', '毛家湾胡同甲13号北京站候车大厅2层');
INSERT INTO `tb_door` VALUES ('5', '永和大王(学院路店)', '010-62152539', '学院南路37号超市发四道口店四道口西北角');

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `door_id` int(11) DEFAULT NULL,
  `order_no` varchar(50) DEFAULT NULL,
  `order_type` varchar(50) DEFAULT NULL,
  `pnum` int(11) DEFAULT NULL,
  `cashier` varchar(50) DEFAULT NULL,
  `order_time` timestamp NOT NULL,
  `pay_time` timestamp NOT NULL,
  `pay_type` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `door_id` (`door_id`),
  CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`door_id`) REFERENCES `tb_door` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1', '1', 'P002', '打包', '5', '杰克', '2022-04-18 06:29:02', '2022-04-18 06:29:02', '微信', '16');
INSERT INTO `tb_order` VALUES ('2', '1', 'P003', '外卖', '3', '张三', '2022-04-18 14:29:02', '2022-04-18 14:29:02', '微信支付', '20');
INSERT INTO `tb_order` VALUES ('3', '1', 'P005', '打包', '1', '张三', '2022-04-18 14:29:02', '2022-04-18 14:29:02', '微信支付', '28');
INSERT INTO `tb_order` VALUES ('6', '1', 'hbnu001', '堂食', '2', '陈迪凯', '2022-04-18 14:29:02', '2022-04-18 14:29:02', '微信支付', '50');
INSERT INTO `tb_order` VALUES ('7', '1', 'P002', '堂食', '5', '杰克', '2022-04-20 19:10:44', '2022-04-20 19:10:44', '微信支付', '50');
