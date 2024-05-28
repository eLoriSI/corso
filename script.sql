use `corso`;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `professore`(
	`id` int NOT NULL AUTO_INCREMENT,
    `nome` varchar(45) DEFAULT NULL,
    `cognome` varchar(45) DEFAULT NULL,
    
    PRIMARY KEY (`id`)
    
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `corso`(
	`id` int NOT NULL AUTO_INCREMENT,
    `titolo` varchar(45) DEFAULT NULL,
    `professore_id` int DEFAULT NULL,
    
    PRIMARY KEY (`id`),
    UNIQUE KEY `TITOLO_UNIQUE` (`titolo`),
    KEY `FK_PROFESSORE_ID` (`professore_id`),
    
    CONSTRAINT `FK_PROFESSORE`
    FOREIGN KEY (`professore_id`)
    REFERENCES `professore` (`id`)
    
    ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `studente`(
	`id` int NOT NULL AUTO_INCREMENT,
    `nome` varchar(45) DEFAULT NULL,
    `cognome` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    
    PRIMARY KEY (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `corso_studente`(
	`corso_id` int NOT NULL,
    `studente_id` int NOT NULL,
    
    PRIMARY KEY(`corso_id`, `studente_id`),
    
    CONSTRAINT `FK_CORSO` FOREIGN KEY(`corso_id`)
    REFERENCES `corso` (`id`) 
    ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    CONSTRAINT `FK_STUDENTE` FOREIGN KEY(`studente_id`)
    REFERENCES `studente` (`id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;