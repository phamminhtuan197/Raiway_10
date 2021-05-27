DROP DATABASE IF EXISTS Testing_Exam;
CREATE DATABASE IF NOT EXISTS Testing_Exam;
USE Testing_Exam;

DROP TABLE IF EXISTS `User`;
CREATE TABLE IF NOT EXISTS `User`
(
	userID	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fullName	VARCHAR(100) NOT NULL,
    email		VARCHAR(50) NOT NULL UNIQUE,
	`password`	VARCHAR(50) NOT NULL,
    `role`		ENUM ('ADMIN', 'EMPLOYEE')
);

INSERT INTO `User` (fullName, email, `password`, `role`) VALUES
("Phạm Thị Lan Anh", 'phamthilananh@gmail.com', 'Phamthilan', 'ADMIN'),
("Hoàng Nguyệt Ánh", 'hoangnguyetanh@gmail.com', 'Hoangnguyet', 'EMPLOYEE'),
("Nguyễn Minh Bách", 'nguyenminhbach@gmail.com', 'Nguyenminh', 'EMPLOYEE'),
("Nguyễn Khánh Chi", 'nguyenkhanhchi@gmail.com', 'Nguyenkhanh', 'EMPLOYEE'),
("Ngô Hồng Dũng", 'ngohungdung@gmail.com', 'Ngohung', 'ADMIN'),
("Nguyễn Minh Đức", 'nguyenminhduc@gmail.com', 'Nguyenminh', 'EMPLOYEE'),
("Đặng Quỳnh Giao", 'dangquynhgiao@gmail.com', 'Dangquynh', 'ADMIN');