/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-06-16 12:18:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `people`
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `flight` varchar(255) DEFAULT NULL,
  `train` varchar(255) DEFAULT NULL,
  `time` date NOT NULL,
  `wid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `foreignkey` (`wid`),
  CONSTRAINT `foreignkey` FOREIGN KEY (`wid`) REFERENCES `worker` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of people
-- ----------------------------
INSERT INTO `people` VALUES ('101', '虚竹', '男', '101', null, null, '2020-06-04', '1');
INSERT INTO `people` VALUES ('102', '萧峰', '男', '102', '北京-厦门', null, '2020-06-03', '2');
INSERT INTO `people` VALUES ('103', '阿朱', '女', '103', null, 'D9082', '2020-05-30', '1');
INSERT INTO `people` VALUES ('104', '天山童姥', '女', '104', '北京-广州', 'G101', '2020-06-06', '2');
INSERT INTO `people` VALUES ('105', '无名氏', '男', '105', null, null, '2020-06-15', '7');
INSERT INTO `people` VALUES ('106', 'x', 'x', '106', 'x', 'x', '2020-06-03', '2');
INSERT INTO `people` VALUES ('107', '虚竹', '女', '107', null, null, '2020-06-18', '8');
INSERT INTO `people` VALUES ('108', '铁拐李', '男', '1372222222', 'null', 'null', '2020-06-15', '1');
INSERT INTO `people` VALUES ('109', '铁拐', '男', '1372222222', 'null', '北京-南京', '2020-06-15', '1');
INSERT INTO `people` VALUES ('110', '铁拐', '男', '1372222222', 'null', '北京-南京', '2020-06-16', '1');
