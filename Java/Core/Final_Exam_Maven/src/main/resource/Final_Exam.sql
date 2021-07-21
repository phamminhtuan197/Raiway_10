DROP DATABASE IF EXISTS Final_Exam;
CREATE DATABASE IF NOT EXISTS Final_Exam;
USE Final_Exam;

DROP TABLE IF EXISTS `User`;
CREATE TABLE IF NOT EXISTS `User` 
(
    userID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fullName 	VARCHAR(50) NOT NULL,
    email 		VARCHAR(50) NOT NULL UNIQUE,
    `password` 	VARCHAR(50) NOT NULL,
    `role`		ENUM('EMPLOYEE', 'MANAGER')
);

INSERT INTO `User` (userID, fullName, email, `password`, `role`) VALUES
(1, 'Leo Malcolmson', 'lmalcolmson0@cafepress.com', 'wEQ9PWizcLB0', 'EMPLOYEE'),
(2, 'Abbot Ponte', 'aponte1@jiathis.com', 'nECbVe', 'EMPLOYEE'),
(3, 'Wilie Bruhnke', 'wbruhnke2@cafepress.com', 'oieRVSJ', 'EMPLOYEE'),
(4, 'Mellie Undrell', 'mundrell3@discovery.com', 'uJuzOi0dJ2OF', 'MANAGER'),
(5, 'Delmar Leidecker', 'dleidecker4@wix.com', 'yaCypg', 'EMPLOYEE'),
(6, 'Finlay McGrirl', 'fmcgrirl5@scribd.com', '95Hw0Y', 'MANAGER'),
(7, 'Glenden Solon', 'gsolon6@digg.com', '3Zvq3q', 'EMPLOYEE'),
(8, 'Cull Laimable', 'claimable7@mozilla.org', 'S7FsX15cD', 'EMPLOYEE'),
(9, 'Georgina Henrys', 'ghenrys8@cloudflare.com', 'mPMCdFefk8UN', 'MANAGER'),
(10, 'Miles Philips', 'mphilips9@java.com', 'TpLgsmj0', 'EMPLOYEE');

DROP TABLE IF EXISTS Project;
CREATE TABLE IF NOT EXISTS Project
(
	projectID	TINYINT UNSIGNED AUTO_INCREMENT,
    projectName VARCHAR(50) NOT NULL,
    idManager	TINYINT UNSIGNED NOT NULL,
    teamSize	TINYINT UNSIGNED NOT NULL DEFAULT 4,
    PRIMARY KEY(projectID, projectName, idManager)
);

INSERT INTO Project(projectName, idManager) VALUES
('Andalax', 6),
('Konklab', 4),
('Wrapsafe', 9),
('Regrant', 6),
('Otcom', 6),
('Solarbreeze', 9),
('Fix San', 6),
('Trippledex', 4),
('Bitchip', 4),
('Keylex', 9);

DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS Manager 
(
	managerID	TINYINT UNSIGNED,
    ExpInYear	TINYINT UNSIGNED,
    CONSTRAINT fk_managerID FOREIGN KEY (managerID) REFERENCES `User`(userID)
);

INSERT INTO Manager(managerID, ExpInYear) VALUES 
(9, 7),
(6, 8),
(4, 5);

DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee
(
	employeeID	TINYINT UNSIGNED,
    projectID	TINYINT UNSIGNED,
    proSkill	ENUM('DEV', 'TEST', 'JAVA', 'SQL'),
    PRIMARY KEY(employeeID, projectID),
    CONSTRAINT fk_employeeID FOREIGN KEY (employeeID) REFERENCES `User`(userID),
    CONSTRAINT fk_projectID FOREIGN KEY (projectID) REFERENCES Project(projectID)
);

INSERT INTO Employee(employeeID, projectID, proSkill) VALUES
(1, 1, 'DEV'),
(2, 1, 'TEST'),
(3, 1, 'JAVA'),
(5, 2, 'SQL'),
(7, 2, 'DEV'),
(8, 2, 'JAVA'),
(10, 3, 'SQL'),
(1, 3, 'DEV'),
(2, 3, 'TEST'),
(3, 4, 'JAVA'),
(5, 4, 'SQL'),
(7, 4, 'DEV'),
(8, 5, 'JAVA'),
(10, 5, 'SQL'),
(1, 5, 'DEV'),
(2, 6, 'TEST'),
(3, 6, 'JAVA'),
(5, 6, 'SQL'),
(7, 7, 'DEV'),
(8, 7, 'JAVA'),
(10, 7, 'SQL'),
(1, 8, 'DEV'),
(2, 8, 'TEST'),
(3, 8, 'JAVA'),
(5, 9, 'SQL'),
(7, 9, 'DEV'),
(8, 9, 'JAVA'),
(10, 10, 'SQL'),
(1, 10, 'DEV'),
(2, 10, 'TEST');
