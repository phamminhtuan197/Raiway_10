DROP DATABASE IF EXISTS testing_system;
CREATE DATABASE IF NOT EXISTS Testing_system;
USE Testing_system;

DROP TABLE IF EXISTS Department;
CREATE TABLE IF NOT EXISTS Department
(
	DepartmentID 	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	DepartmentName 	VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO Department (DepartmentName) VALUES 
('Marketing_1'),
('Marketing_2'),
('Marketing_3'),
('Marketing_4'),
('Marketing_5'),
('Marketing_6'),
('Marketing_7'),
('Marketing_8'),
('Sale'),
('Dev');

DROP TABLE IF EXISTS Position;
CREATE TABLE IF NOT EXISTS Position
(
	PositionID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName	ENUM('DEV', 'TEST', 'SCUM MASTER', 'PM')
);
INSERT INTO Position (PositionName) VALUES
("DEV"),
("DEV"),
("DEV"),
("SCUM MASTER"),
("SCUM MASTER"),
("TEST"),
("TEST"),
("TEST"),
("PM"),
("PM");

DROP TABLE IF EXISTS `Account`;
CREATE TABLE IF NOT EXISTS `Account`
(
	AccountID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email			VARCHAR(50) UNIQUE KEY,
    Usename			VARCHAR(50) UNIQUE KEY,
    Fullname		VARCHAR(50) NOT NULL,
    DepartmentID	INT UNSIGNED NOT NULL,
    FOREIGN KEY(DepartmentID) REFERENCES Department (DepartmentID),
    PositionID		INT UNSIGNED NOT NULL,
    FOREIGN KEY(PositionID) REFERENCES Position (PositionID),
    CreateDate		DATETIME DEFAULT NOW()
);
INSERT INTO `Account` (Email, Usename, Fullname, DepartmentID, PositionID) VALUES
("phavana@gmail.com", "phamvana", "Pham Van A", 1, 1),
("phavana1@gmail.com", "phamvana1", "Pham Van ABasdasdC", 1, 1),
("phavana2@gmail.com", "phamvana2", "Pham Van A", 1, 1),
("phavanb@gmail.com", "phamvanb", "Dam Van Mo", 2, 2), 
("phavanb1@gmail.com", "phamvanb1", "Pham Van B", 2, 2), 
("phavanb2@gmail.com", "phamvanb2", "Pham Van B", 2, 2), 
("phavanc@gmail.com", "phamvanac", "Pham Van c", 3, 3),
("phavanc1@gmail.com", "phamvanac1", "Pham Van cde", 3, 3),
("phavanc3@gmail.com", "phamvanac3", "Pham Van cdav", 3, 3),
("phavanc2@gmail.com", "phamvanac2", "Pham Van c", 3, 3);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE IF NOT EXISTS `Group`
(
	GroupID			INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    GroupName		VARCHAR(50) UNIQUE,
    CreatorID		INT UNSIGNED NOT NULL,
<<<<<<< HEAD
    CreateDate		DATE
=======
    FOREIGN KEY(CreatorID) REFERENCES Position (PositionID),
    CreateDate		DATETIME DEFAULT NOW()
>>>>>>> fd8f2b471fd880ee5d9f51cd27804c65088cd2f8
);
INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES
("Goup_1", 10, "2021/04/01"),
("Goup_2", 1, "2019/04/01"),
("Goup_3", 2, "2021/04/01"),
("Goup_4", 3, "2021/04/01"),
("Goup_5", 4, "2021/04/01"),
("Goup_6", 5, "2021/04/01"),
("Goup_7", 6, "2021/04/01"),
("Goup_8", 7, "2021/04/04"),
("Goup_9", 8, "2021/04/02"),
("Goup_10", 9, "2021/04/03");

CREATE TABLE IF NOT EXISTS GroupAccount
(
	GroupID			INT UNSIGNED NOT NULL,
    FOREIGN KEY(GroupID) REFERENCES `Group` (GroupID),
    AccountID		INT UNSIGNED NOT NULL UNIQUE,
    FOREIGN KEY(AccountID) REFERENCES `Account` (AccountID),
    JoinDate		DATE,
    PRIMARY KEY(GroupID, AccountID)
);
INSERT INTO GroupAccount (GroupID, AccountID, JoinDate) VALUES
(1, 10, "2021/04/01"),
(2, 9, "2021/04/02"),
(3, 8, "2021/04/03"),
(4, 7, "2021/04/03"),
(5, 6, "2021/04/03"),
(6, 5, "2021/04/03"),
(7, 4, "2021/04/03"),
(8, 3, "2021/04/03"),
(9, 2, "2021/04/03"),
(10, 1, "2021/04/03");

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE IF NOT EXISTS TypeQuestion
(
	TypeID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName		ENUM('Essay', 'Multiple-Choice')
);
INSERT INTO TypeQuestion (TypeName) VALUES
("Essay"),
("Essay"),
("Essay"),
("Multiple-Choice"),
("Multiple-Choice"),
("Multiple-Choice"),
("Essay"),
("Essay"),
("Essay"),
("Essay");

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE IF NOT EXISTS CategoryQuestion
(
	CategoryID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName	ENUM('Java','.NET','SQL','Postman','Ruby')
);
INSERT INTO CategoryQuestion (CategoryName) VALUES
('Java'),
('Java'),
('Java'),
('Java'),
('.NET'),
('.NET'),
('.NET'),
('SQL'),
('Postman'),
('Ruby');

DROP TABLE IF EXISTS Question;
CREATE TABLE IF NOT EXISTS Question
(
	QuestionID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(50) NOT NULL,
    CategoryID		INT UNSIGNED NOT NULL,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion (CategoryID),
    TypeID			INT UNSIGNED NOT NULL,
    FOREIGN KEY(TypeID) REFERENCES TypeQuestion (TypeID),
    CreatorID		INT UNSIGNED NOT NULL,
    CreateDate		DATE
);
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate) VALUES
('abc', 1, 9, 10, '2021/04/01'),
('abc', 2, 9, 2, '2021/04/01'),
('abc', 3, 8, 1, '2021/04/01'),
('abc', 4, 7, 4, '2021/04/01'),
('câu hỏi số 4', 5, 6, 3, '2021/04/01'),
('abc', 6, 5, 6, '2021/04/01'),
('abc', 7, 4, 5, '2021/04/01'),
('abc', 8, 1, 4, '2021/04/01'),
('def', 9, 2, 2, '2021/04/02'),
('mnp', 10, 3, 3, '2021/04/03');

DROP TABLE IF EXISTS Answer;
CREATE TABLE IF NOT EXISTS Answer
(
	AnswerID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(50) NOT NULL,
    QuestionID		INT UNSIGNED,
    isCorrect		ENUM('True','False')
);
INSERT INTO Answer (Content, QuestionID, isCorrect) VALUES
('abc', 1, 'True'),
('abc1', 2, 'True'),
('abc2', 2, 'True'),
('abc3', 2, 'True'),
('abc4', 2, 'True'),
('abc5', 2, 'True'),
('abc6', 7, 'True'),
('abc7', 8, 'True'),
('bcd', 9, 'False'),
('abc9', 10, 'True');

DROP TABLE IF EXISTS Exam;
CREATE TABLE IF NOT EXISTS Exam
(
	ExamID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`			VARCHAR(10) NOT NULL,
    Title			VARCHAR(50),
    CategoryID		INT UNSIGNED NOT NULL,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion (CategoryID),
    Duration		TIME,
    CreatorID		INT UNSIGNED NOT NULL,
    CreateDate		DATE
);
ALTER TABLE Exam
CHANGE COLUMN Duration Duration INT UNSIGNED;
INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES
('abc', 'aaa', 1, '90', 1, '2021/04/01'),
('abc', 'aaa', 2, '90', 1, '2020/04/01'),
('abc', 'aaa', 3, '90', 1, '2021/04/02'),
('abc', 'aaa', 4, '90', 1, '2021/04/03'),
('abc', 'aaa', 5, '90', 1, '2019/04/01'),
('abc', 'aaa', 6, '90', 1, '2019/12/01'),
('abc', 'aaa', 7, '90', 1, '2021/04/01'),
('abc', 'aaa', 8, '90', 1, '2021/04/01'),
('qwe', 'bbb', 9, '90', 2, '2021/04/01'),
('fgh', 'ccc', 10, '90', 3, '2021/04/01');

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE IF NOT EXISTS ExamQuestion
(
	ExamID			INT UNSIGNED NOT NULL UNIQUE,
    QuestionID		INT UNSIGNED NOT NULL UNIQUE
);
INSERT INTO ExamQuestion (ExamID, QuestionID) VALUES
(1, 10),
(2, 9),
(3, 8),
(4, 7),
(5, 6),
(6, 5),
(7, 4),
(8, 3),
(9, 2),
(10, 1);

SELECT DepartmentID FROM Department WHERE DepartmentName='Sale';
SELECT * FROM `Account` WHERE LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account` WHERE DepartmentID=3);
SELECT GroupName FROM `Group` WHERE CreateDate < '2019/12/20';
SELECT QuestionID FROM Answer GROUP BY QuestionID HAVING COUNT(QuestionID)>=4;
SELECT ExamID FROM Exam WHERE Duration >=60 AND CreateDate < '2019/12/20';
SELECT * FROM `Group` ORDER BY CreateDate DESC LIMIT 5;
SELECT COUNT(AccountID) AS 'So nhan vien' FROM `Account` WHERE DepartmentID=2;
SELECT Fullname FROM `Account` WHERE Fullname LIKE 'D%o';
DELETE FROM Exam WHERE CreateDate < '2019/12/20';
DELETE FROM Question WHERE Content LIKE 'Câu hỏi%';
UPDATE `Account` SET Fullname= 'Nguyễn Bá Lộc', Email= 'loc.nguyenba@vti.com.vn' WHERE AccountID=5;
UPDATE `GroupAccount` SET GroupID=4 WHERE AccountID=5;
