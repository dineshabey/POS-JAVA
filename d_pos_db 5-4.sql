/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : d_pos_db

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2018-04-05 17:02:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cashier_manage
-- ----------------------------
DROP TABLE IF EXISTS `cashier_manage`;
CREATE TABLE `cashier_manage` (
  `cashier_id` int(10) NOT NULL,
  `date_time` datetime DEFAULT NULL,
  `status` int(2) NOT NULL COMMENT 'status 0 - cancel bill\r\nstatus 1 - bill success'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of cashier_manage
-- ----------------------------

-- ----------------------------
-- Table structure for cus_reg
-- ----------------------------
DROP TABLE IF EXISTS `cus_reg`;
CREATE TABLE `cus_reg` (
  `cus_id` int(10) NOT NULL AUTO_INCREMENT,
  `cus_code` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `cus_name` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `cus_add` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `cus_tp` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `cus_con_person` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `cus_con_tp` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `credit_limit` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `nic` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(2) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of cus_reg
-- ----------------------------
INSERT INTO `cus_reg` VALUES ('1', '55', 'lkl', 'klk', '54545', 'ggh', '121', '121', null, null);
INSERT INTO `cus_reg` VALUES ('2', '123', 'cholitha', 'kurunegala,Rd, Kandy', '07154564', 'Aminla', '07584544', '50000.00', null, null);
INSERT INTO `cus_reg` VALUES ('3', '458', 'kasun', 'gh', '0725121', 'han', '0145252', '10000', null, null);
INSERT INTO `cus_reg` VALUES ('4', '23232', 'test', 'abc', '122123231', 'kil', '2112121212', '1101', null, null);

-- ----------------------------
-- Table structure for in_sysprvlg
-- ----------------------------
DROP TABLE IF EXISTS `in_sysprvlg`;
CREATE TABLE `in_sysprvlg` (
  `prvCode` int(11) NOT NULL,
  `prvName` varchar(50) DEFAULT NULL,
  `prvStatus` int(3) NOT NULL DEFAULT '1',
  `usrPrvMnuName` varchar(100) NOT NULL,
  `usrPrvMnuName_sinhala` varchar(50) DEFAULT NULL,
  `usrPrvMnuIcon` varchar(45) DEFAULT '',
  `usrPrvMnuPath` varchar(100) NOT NULL,
  `usrPrnt` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`prvCode`),
  UNIQUE KEY `user_privilage_code` (`prvCode`),
  UNIQUE KEY `user_privilage_code_2` (`prvCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_sysprvlg
-- ----------------------------
INSERT INTO `in_sysprvlg` VALUES ('99', 'Customer Registration', '1', 'Customer Registration', null, 'images/cutomer_details_report.png', 'cus_reg.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('100', 'Item Registration', '1', 'Item Registration', null, 'images/item.png', 'item_reg.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('101', 'Other Registration', '1', 'Other Registration', null, 'images/systemSettings.png', 'systemSettinsDashboard.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('103', 'GRN', '1', 'GRN', null, 'images/grnn.png', 'grn_menus.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('109', 'Reports', '1', 'Reports', null, 'images/saless.png', 'report_dashboard.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('110', 'Current Stock', '1', 'Current Stock', null, 'images/current.png', 'stock_typs.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('111', 'Item Movement', '1', 'Item Movement', null, 'images/it_move.png', 'itemMovement.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('114', 'System Backup', '1', 'System Backup', null, 'images/backup.png', 'run.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('150', 'User Management', '1', 'User Management', null, 'images/usermanege.png', 'userManege/userManegement.php', '0');
INSERT INTO `in_sysprvlg` VALUES ('151', 'Stock Adjustments', '1', 'Stock Adjustments', null, 'images/stock _gistment.png', 'stock_adjustments.php', '0');

-- ----------------------------
-- Table structure for in_usr
-- ----------------------------
DROP TABLE IF EXISTS `in_usr`;
CREATE TABLE `in_usr` (
  `usrID` int(11) NOT NULL AUTO_INCREMENT,
  `usrName` varchar(50) NOT NULL DEFAULT '',
  `usrFName` varchar(100) DEFAULT NULL,
  `usrLName` varchar(100) DEFAULT NULL,
  `usrLevel` int(11) NOT NULL DEFAULT '1',
  `usrPwd` varchar(255) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL DEFAULT '',
  `usrRegDate` date NOT NULL DEFAULT '0000-00-00',
  `usrStatus` int(1) NOT NULL DEFAULT '1',
  `usrAddress` varchar(200) DEFAULT NULL,
  `usrEmail` varchar(150) DEFAULT NULL,
  `lstLgDate` date NOT NULL,
  `lstLgTime` time NOT NULL,
  `usrNIC` varchar(20) DEFAULT NULL,
  `usrMobileNo` varchar(20) DEFAULT NULL,
  `usrWorkTelNo` varchar(20) DEFAULT NULL,
  `usrHomeTelNo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`usrID`,`usrName`),
  UNIQUE KEY `usrNIC` (`usrNIC`),
  UNIQUE KEY `usrEmpNo_2` (`usrNIC`),
  KEY `id` (`usrID`),
  KEY `user_level` (`usrLevel`),
  KEY `user_name` (`usrName`) USING BTREE,
  CONSTRAINT `in_usr_ibfk_1` FOREIGN KEY (`usrLevel`) REFERENCES `in_usrlevel` (`lvID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_usr
-- ----------------------------
INSERT INTO `in_usr` VALUES ('85', 'admin', '', '', '188', '41ff1d83af6c997c70a7127c8fbbd1ae9b2e6eeb', '2017-11-24', '1', '', '', '2017-11-24', '05:11:35', '950901390V', '', '', '');
INSERT INTO `in_usr` VALUES ('86', 'Admin', '', '', '188', 'b655bbe91ce5779ea9267a7bee5fa66419bed261', '2017-11-24', '1', '', '', '2017-11-24', '04:58:15', '931092928V', '', '', '');
INSERT INTO `in_usr` VALUES ('87', 'cashir 01', '', '', '199', '48f413e3c4917865a28f79b14556bb647e22a027', '2017-11-26', '1', '', '', '2017-11-26', '06:17:31', '', '', '', '');

-- ----------------------------
-- Table structure for in_usrlevel
-- ----------------------------
DROP TABLE IF EXISTS `in_usrlevel`;
CREATE TABLE `in_usrlevel` (
  `lvID` int(11) NOT NULL AUTO_INCREMENT,
  `lvName` varchar(100) DEFAULT NULL,
  `usrLvlPrvSeq` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`lvID`),
  UNIQUE KEY `usrLvlPrvSeq` (`usrLvlPrvSeq`),
  UNIQUE KEY `admin_level_name` (`lvName`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_usrlevel
-- ----------------------------
INSERT INTO `in_usrlevel` VALUES ('18', 'Super User', '20');
INSERT INTO `in_usrlevel` VALUES ('188', 'Admin', '1');
INSERT INTO `in_usrlevel` VALUES ('199', 'Cashier', '4');
INSERT INTO `in_usrlevel` VALUES ('200', 'Owner', '3');
INSERT INTO `in_usrlevel` VALUES ('204', 'Stock Keeper', '5');

-- ----------------------------
-- Table structure for in_usrlvlpriv
-- ----------------------------
DROP TABLE IF EXISTS `in_usrlvlpriv`;
CREATE TABLE `in_usrlvlpriv` (
  `usrLvl` int(11) NOT NULL,
  `usrPrivilage` int(11) NOT NULL,
  PRIMARY KEY (`usrLvl`,`usrPrivilage`),
  UNIQUE KEY `usrLvl` (`usrLvl`,`usrPrivilage`),
  KEY `usrPrivilage` (`usrPrivilage`),
  CONSTRAINT `in_usrlvlpriv_ibfk_1` FOREIGN KEY (`usrLvl`) REFERENCES `in_usrlevel` (`lvID`) ON UPDATE CASCADE,
  CONSTRAINT `in_usrlvlpriv_ibfk_2` FOREIGN KEY (`usrPrivilage`) REFERENCES `in_sysprvlg` (`prvCode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_usrlvlpriv
-- ----------------------------

-- ----------------------------
-- Table structure for in_usrprvlg
-- ----------------------------
DROP TABLE IF EXISTS `in_usrprvlg`;
CREATE TABLE `in_usrprvlg` (
  `usrID` int(11) NOT NULL,
  `usrPrvCode` int(11) NOT NULL,
  PRIMARY KEY (`usrID`,`usrPrvCode`),
  UNIQUE KEY `usrID` (`usrID`,`usrPrvCode`),
  KEY `usrPrvCode` (`usrPrvCode`),
  CONSTRAINT `in_usrprvlg_ibfk_1` FOREIGN KEY (`usrID`) REFERENCES `in_usr` (`usrID`) ON UPDATE CASCADE,
  CONSTRAINT `in_usrprvlg_ibfk_2` FOREIGN KEY (`usrPrvCode`) REFERENCES `in_sysprvlg` (`prvCode`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_usrprvlg
-- ----------------------------
INSERT INTO `in_usrprvlg` VALUES ('85', '99');
INSERT INTO `in_usrprvlg` VALUES ('86', '99');
INSERT INTO `in_usrprvlg` VALUES ('87', '99');
INSERT INTO `in_usrprvlg` VALUES ('85', '100');
INSERT INTO `in_usrprvlg` VALUES ('86', '100');
INSERT INTO `in_usrprvlg` VALUES ('87', '100');
INSERT INTO `in_usrprvlg` VALUES ('85', '101');
INSERT INTO `in_usrprvlg` VALUES ('86', '101');
INSERT INTO `in_usrprvlg` VALUES ('87', '101');
INSERT INTO `in_usrprvlg` VALUES ('85', '103');
INSERT INTO `in_usrprvlg` VALUES ('86', '103');
INSERT INTO `in_usrprvlg` VALUES ('87', '103');
INSERT INTO `in_usrprvlg` VALUES ('85', '109');
INSERT INTO `in_usrprvlg` VALUES ('86', '109');
INSERT INTO `in_usrprvlg` VALUES ('85', '110');
INSERT INTO `in_usrprvlg` VALUES ('86', '110');
INSERT INTO `in_usrprvlg` VALUES ('87', '110');
INSERT INTO `in_usrprvlg` VALUES ('85', '111');
INSERT INTO `in_usrprvlg` VALUES ('86', '111');
INSERT INTO `in_usrprvlg` VALUES ('85', '114');
INSERT INTO `in_usrprvlg` VALUES ('86', '114');
INSERT INTO `in_usrprvlg` VALUES ('87', '114');
INSERT INTO `in_usrprvlg` VALUES ('85', '150');
INSERT INTO `in_usrprvlg` VALUES ('86', '150');
INSERT INTO `in_usrprvlg` VALUES ('85', '151');
INSERT INTO `in_usrprvlg` VALUES ('86', '151');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `quantity` int(10) DEFAULT NULL,
  `price` double(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for main_category
-- ----------------------------
DROP TABLE IF EXISTS `main_category`;
CREATE TABLE `main_category` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of main_category
-- ----------------------------
INSERT INTO `main_category` VALUES ('38', 'Chiken');
INSERT INTO `main_category` VALUES ('39', 'Soop');
INSERT INTO `main_category` VALUES ('40', 'Noodles');
INSERT INTO `main_category` VALUES ('41', 'Toothpaste');
INSERT INTO `main_category` VALUES ('42', 'Milk Powder');
INSERT INTO `main_category` VALUES ('43', 'Shampoo');
INSERT INTO `main_category` VALUES ('44', 'Tea');
INSERT INTO `main_category` VALUES ('45', 'test');
INSERT INTO `main_category` VALUES ('50', 'jhjjj');
INSERT INTO `main_category` VALUES ('51', 'test44');
INSERT INTO `main_category` VALUES ('52', 'test4');
INSERT INTO `main_category` VALUES ('53', 'Arack');

-- ----------------------------
-- Table structure for r_grn_data
-- ----------------------------
DROP TABLE IF EXISTS `r_grn_data`;
CREATE TABLE `r_grn_data` (
  `grn_no` int(11) NOT NULL AUTO_INCREMENT,
  `grnManual` int(50) DEFAULT NULL,
  `grn_sup_invo_no` varchar(50) DEFAULT NULL,
  `grn_date` varchar(10) DEFAULT NULL,
  `grn_sup_id` int(11) DEFAULT NULL,
  `grn_location_id` int(20) DEFAULT NULL,
  `grn_total` double(50,2) DEFAULT NULL,
  `grn_curr_paid` double(50,2) DEFAULT '0.00',
  `grn_pay_status` int(5) DEFAULT '1' COMMENT '1 == pendin, 2 == completed',
  `sys_user` int(11) DEFAULT NULL,
  `grn_no_status` int(5) DEFAULT NULL COMMENT '0 == pending, 1 == completed, 99 == holeded',
  `bill_discount` double(50,2) DEFAULT NULL,
  `manual_status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`grn_no`),
  KEY `grn_sup_id` (`grn_sup_id`),
  KEY `grn_location_id` (`grn_location_id`),
  CONSTRAINT `r_grn_data_ibfk_1` FOREIGN KEY (`grn_sup_id`) REFERENCES `suplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `r_grn_data_ibfk_2` FOREIGN KEY (`grn_location_id`) REFERENCES `r_store_locations` (`store_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_grn_data
-- ----------------------------
INSERT INTO `r_grn_data` VALUES ('19', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('20', null, '200', '19-03-2018', '2', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('21', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('22', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('23', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('24', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('25', null, '200', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('26', null, '12', '19-03-2018', '2', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('27', null, '12', '19-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('28', null, '656', '21-03-2018', '2', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('29', null, '3', '21-03-2018', '2', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('30', null, 'hg', '27-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('31', null, 'hg', '27-03-2018', '1', null, null, null, null, null, null, null, null);
INSERT INTO `r_grn_data` VALUES ('32', null, '0021', '05-04-2018', '2', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for r_grn_itm_data
-- ----------------------------
DROP TABLE IF EXISTS `r_grn_itm_data`;
CREATE TABLE `r_grn_itm_data` (
  `grn_itm_data_id` int(11) NOT NULL AUTO_INCREMENT,
  `grn_itm_id` int(11) DEFAULT NULL,
  `grn_no` int(20) DEFAULT NULL,
  `grn_ini_qty` double(50,2) DEFAULT NULL,
  `grn_qunt` double(50,2) DEFAULT NULL,
  `grn_free_qty` double(50,2) DEFAULT NULL,
  `grn_itm_cost` double(50,2) DEFAULT NULL,
  `grn_itm_sell` double(50,2) DEFAULT NULL,
  `grn_itm_discount` double(50,2) DEFAULT NULL,
  `grn_itm_tot_cost` double(50,2) DEFAULT NULL,
  `grn_return_add_date` date DEFAULT NULL,
  `gtn_itm_ststus` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`grn_itm_data_id`),
  KEY `grn_itm_id` (`grn_itm_id`),
  KEY `grn_no` (`grn_no`),
  CONSTRAINT `r_grn_itm_data_ibfk_1` FOREIGN KEY (`grn_itm_id`) REFERENCES `r_itm_reg` (`itm_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_grn_itm_data
-- ----------------------------
INSERT INTO `r_grn_itm_data` VALUES ('249', '116', '1', '78.00', '70.00', null, '0.09', '78.09', null, '68172.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('250', '116', '1', '78.00', '77.00', null, '0.09', '78.09', null, '68172.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('251', '116', '1', '78.00', '77.00', null, '0.09', '78.09', null, '68172.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('252', '116', '20', '45.00', '44.00', null, '0.50', '45.50', null, '4050.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('253', '116', '20', '5645.00', '5644.00', null, '62.72', '107.72', null, '508050.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('254', '116', '21', '5645.00', '5644.00', null, '62.72', '107.72', null, '508050.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('255', '112', '21', '454.00', '448.00', null, '9.27', '54.27', null, '22246.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('256', '112', '21', '454.00', '448.00', null, '9.27', '54.27', null, '22246.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('257', '112', '21', '454.00', '448.00', null, '9.27', '54.27', null, '22246.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('258', '110', '27', '454.00', '454.00', null, '9.27', '54.27', null, '22246.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('259', '115', '28', '23.00', '24.00', null, '200.00', '250.00', null, '1817.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('260', '114', '28', '54.00', '49.00', null, '1.10', '46.10', null, '2646.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('261', '115', '30', '6556.00', '6555.00', null, '54.63', '610.63', null, '786720.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('262', '113', '30', '565.00', '551.00', null, '0.90', '565.90', null, '355950.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('263', '121', '32', '3500.00', '3493.00', null, '16.67', '81.67', null, '735000.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('264', '120', '32', '4500.00', '4295.00', null, '150.00', '400.00', null, '135000.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('265', '122', '32', '6000.00', '6000.00', null, '600.00', '1350.00', null, '60000.00', null, null);
INSERT INTO `r_grn_itm_data` VALUES ('266', '122', '33', '6000.00', '6000.00', null, '600.00', '1900.00', null, '60000.00', null, null);

-- ----------------------------
-- Table structure for r_invo_releted_itm
-- ----------------------------
DROP TABLE IF EXISTS `r_invo_releted_itm`;
CREATE TABLE `r_invo_releted_itm` (
  `invo_itm_data_id` int(11) NOT NULL AUTO_INCREMENT,
  `invo_no` varchar(20) DEFAULT NULL,
  `invo_itm_id` int(11) DEFAULT NULL,
  `invo_itm_qty` double(20,2) DEFAULT NULL,
  `a_itm_sell_price` double(20,2) DEFAULT NULL,
  `invo_sell_price` double(20,2) DEFAULT NULL,
  `invo_cost_price` double(20,2) DEFAULT NULL,
  `invo_discount` double(20,2) DEFAULT NULL,
  `discount_type` varchar(10) DEFAULT NULL,
  `grn_item_reg_id` int(20) DEFAULT NULL,
  `status` int(2) DEFAULT '1',
  `type` varchar(20) DEFAULT NULL,
  `date_time` datetime DEFAULT NULL,
  PRIMARY KEY (`invo_itm_data_id`),
  KEY `invo_no` (`invo_no`),
  KEY `invo_itm_id` (`invo_itm_id`),
  CONSTRAINT `r_invo_releted_itm_ibfk_1` FOREIGN KEY (`invo_itm_id`) REFERENCES `r_itm_reg` (`itm_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2409 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_invo_releted_itm
-- ----------------------------
INSERT INTO `r_invo_releted_itm` VALUES ('2396', '3', '116', '5.00', '78.09', '390.45', null, '0.00', null, '249', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2399', '3', '116', '1.00', '78.09', '78.09', null, '0.00', null, '249', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2400', '3', '113', '1.00', '565.90', '565.90', null, '0.00', null, '262', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2401', '3', '113', '1.00', '565.90', '565.90', null, '0.00', null, '262', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2402', '3', '110', '1.00', '54.27', '54.27', null, '0.00', null, '258', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2403', '3', '113', '1.00', '565.90', '565.90', null, '0.00', null, '262', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2404', '3', '120', '1.00', '400.00', '400.00', null, '0.00', null, '264', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2405', '3', '121', '1.00', '81.67', '81.67', null, '0.00', null, '263', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2406', '3', '114', '2.00', '46.10', '92.20', null, '0.00', null, '260', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2407', '3', '112', '1.00', '54.27', '54.27', null, '0.00', null, '255', '1', '-', '2017-11-24 08:23:08');
INSERT INTO `r_invo_releted_itm` VALUES ('2408', '3', '113', '1.00', '565.90', '565.90', null, '0.00', null, '262', '1', '-', '2017-11-24 08:23:08');

-- ----------------------------
-- Table structure for r_itm_reg
-- ----------------------------
DROP TABLE IF EXISTS `r_itm_reg`;
CREATE TABLE `r_itm_reg` (
  `itm_id` int(11) NOT NULL AUTO_INCREMENT,
  `itm_cat_id` int(11) DEFAULT NULL,
  `itm_code` varchar(20) DEFAULT NULL,
  `itm_name` varchar(500) DEFAULT NULL,
  `itm_re_level` int(20) DEFAULT NULL,
  `cell_price` double(20,2) DEFAULT NULL,
  `cost_price` double(20,2) DEFAULT NULL,
  `unit_type` int(10) DEFAULT NULL,
  `discount_type` varchar(20) DEFAULT NULL,
  `discount` double(50,2) DEFAULT '0.00',
  PRIMARY KEY (`itm_id`),
  KEY `itm_cat_id` (`itm_cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_itm_reg
-- ----------------------------
INSERT INTO `r_itm_reg` VALUES ('110', '15', '001', 'Clogate', '5', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('111', '13', '002', 'Signal', '5', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('112', '14', '003', 'Sudhantha', '6', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('113', '16', '003', 'Sensodine', '3', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('114', '35', '100', 'Preema', '2', null, null, '1', null, null);
INSERT INTO `r_itm_reg` VALUES ('115', '35', '002', 'Preema - curry', '5', null, null, '1', null, null);
INSERT INTO `r_itm_reg` VALUES ('116', '13', '005', 'Signal large', '4', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('117', '19', '405', 'Fadna Tame - Tea (200mg)', '2', null, null, '4', null, null);
INSERT INTO `r_itm_reg` VALUES ('118', '19', '406', 'Fadna Tame - Tea (Largr 500mg)', '2', null, null, '4', null, null);
INSERT INTO `r_itm_reg` VALUES ('119', '37', '800', 'Chiken- Maxis ', '10', null, null, '1', null, null);
INSERT INTO `r_itm_reg` VALUES ('120', '27', '700', 'Sunsilk-bottle', '3', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('121', '27', '701', 'Sunsilk-Shashe', '3', null, null, '5', null, null);
INSERT INTO `r_itm_reg` VALUES ('122', '39', '0092', 'Whisky Large', '2', null, null, '5', null, null);

-- ----------------------------
-- Table structure for r_store_locations
-- ----------------------------
DROP TABLE IF EXISTS `r_store_locations`;
CREATE TABLE `r_store_locations` (
  `store_id` int(10) NOT NULL AUTO_INCREMENT,
  `store_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_store_locations
-- ----------------------------

-- ----------------------------
-- Table structure for sub_category_id
-- ----------------------------
DROP TABLE IF EXISTS `sub_category_id`;
CREATE TABLE `sub_category_id` (
  `sub_cat_id` int(10) NOT NULL AUTO_INCREMENT,
  `sub_cat_name` varchar(200) COLLATE utf8_bin NOT NULL,
  `main_cat_id` int(10) NOT NULL,
  PRIMARY KEY (`sub_cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sub_category_id
-- ----------------------------
INSERT INTO `sub_category_id` VALUES ('13', 'Signal', '41');
INSERT INTO `sub_category_id` VALUES ('14', 'Sudhantha', '41');
INSERT INTO `sub_category_id` VALUES ('15', 'Clogate', '41');
INSERT INTO `sub_category_id` VALUES ('16', 'Sensodine', '41');
INSERT INTO `sub_category_id` VALUES ('17', 'Creast', '41');
INSERT INTO `sub_category_id` VALUES ('18', 'Supiriwiki', '41');
INSERT INTO `sub_category_id` VALUES ('19', 'Fadna Tame', '44');
INSERT INTO `sub_category_id` VALUES ('20', 'Lipton', '44');
INSERT INTO `sub_category_id` VALUES ('21', 'Tea', '44');
INSERT INTO `sub_category_id` VALUES ('22', 'Sunlight', '39');
INSERT INTO `sub_category_id` VALUES ('23', 'Lifeboy', '39');
INSERT INTO `sub_category_id` VALUES ('24', 'Lux', '39');
INSERT INTO `sub_category_id` VALUES ('25', 'Rani', '39');
INSERT INTO `sub_category_id` VALUES ('26', 'Detol', '39');
INSERT INTO `sub_category_id` VALUES ('27', 'Sunsilk', '43');
INSERT INTO `sub_category_id` VALUES ('28', 'Lifeboy', '43');
INSERT INTO `sub_category_id` VALUES ('29', 'Kumarika', '43');
INSERT INTO `sub_category_id` VALUES ('30', 'Magee', '40');
INSERT INTO `sub_category_id` VALUES ('31', 'Harischandra', '40');
INSERT INTO `sub_category_id` VALUES ('32', 'Nestamolet', '42');
INSERT INTO `sub_category_id` VALUES ('33', 'Milo', '42');
INSERT INTO `sub_category_id` VALUES ('34', 'Ancher', '42');
INSERT INTO `sub_category_id` VALUES ('35', 'Preema', '38');
INSERT INTO `sub_category_id` VALUES ('36', 'Curry', '38');
INSERT INTO `sub_category_id` VALUES ('37', 'Maxis', '38');
INSERT INTO `sub_category_id` VALUES ('38', 'ucv', '45');
INSERT INTO `sub_category_id` VALUES ('39', 'Whisky', '53');
INSERT INTO `sub_category_id` VALUES ('40', 'Jack Daniyale', '53');

-- ----------------------------
-- Table structure for suplier
-- ----------------------------
DROP TABLE IF EXISTS `suplier`;
CREATE TABLE `suplier` (
  `sup_id` int(10) NOT NULL AUTO_INCREMENT,
  `sup_name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sup_address` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sup_tp` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sup_con_person` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sup_con_per_tp` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of suplier
-- ----------------------------
INSERT INTO `suplier` VALUES ('1', 'kasun ', 'k,123 Kandy', '071656565 55', '071454545 55', '4545454 55');
INSERT INTO `suplier` VALUES ('2', 'chamara ', 'Kurunegala', '0144656565', '0457445', '0656565656');

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `unit` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of unit
-- ----------------------------
INSERT INTO `unit` VALUES ('1', 'Kg');
INSERT INTO `unit` VALUES ('2', 'g');
INSERT INTO `unit` VALUES ('4', 'mg');
INSERT INTO `unit` VALUES ('5', 'NON');
