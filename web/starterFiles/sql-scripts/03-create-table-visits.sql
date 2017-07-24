DROP TABLE IF EXISTS `visit`;

CREATE TABLE `visit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` DATE DEFAULT NULL,
  `patient_id` int(11) NOT NULL,
  `comment` LONG VARCHAR DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


LOCK TABLES `visit` WRITE;


INSERT INTO `visit` VALUES
	(1,'2008-04-10',4, 'Spirometry FVC and FEV1 91%'),
	(2,'2008-04-10',2, 'White Blood Cell (WBC)	6.9			K/mcL	4.8-10.8
Red Blood Cell (RBC)		1.8	L	M/mcL	4.7-6.1
Hemoglobin (HB/Hgb))		6.5	L**	g/dL	14.0-18.0');



UNLOCK TABLES;
