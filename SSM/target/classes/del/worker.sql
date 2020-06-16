/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-06-16 12:18:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `worker`
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worker
-- ----------------------------
INSERT INTO `worker` VALUES ('1', '张三', '201741413401', '401');
INSERT INTO `worker` VALUES ('2', '李四', '201741413402', '402');
INSERT INTO `worker` VALUES ('7', '赵六', '201741413404', '404');
INSERT INTO `worker` VALUES ('8', '赵七', '201741413405', '405');
INSERT INTO `worker` VALUES ('9', '赵九', '201741413406', '406');
INSERT INTO `worker` VALUES ('10', '赵十', '201741413407', '407');
INSERT INTO `worker` VALUES ('11', '赵十一', '201741413408', '408');
INSERT INTO `worker` VALUES ('12', '赵十二', '201741413409', '409');
INSERT INTO `worker` VALUES ('13', '一拐肘', '201741413411', '411');
