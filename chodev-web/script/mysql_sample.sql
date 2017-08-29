CREATE TABLE `sample` (
  `ID` int NOT NULL auto_increment,
  `NAME` varchar(50) DEFAULT NULL,
  `DESCRIPTION` varchar(100) DEFAULT NULL,
  `USE_YN` char(1) DEFAULT NULL,
  `REG_USER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;