DROP DATABASE IF EXISTS testing_system;
CREATE DATABASE IF NOT EXISTS testing_system;
USE testing_system;

DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department
(
	departmentID 	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	departmentname 	VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO department (departmentname) VALUES 
('marketing'),
('kế toán'),
('kho'),
('nhân sự'),
('bảo vệ'),
('hành chính'),
('kế hoạch'),
('test'),
('Sale'),
('Dev');

DROP TABLE IF EXISTS position;
CREATE TABLE IF NOT EXISTS position
(
	positionID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    positionname	ENUM('DEV', 'TEST', 'SCUM MASTER', 'PM')
);
INSERT INTO position (positionname) VALUES
("DEV"),
("TEST"),
("SCUM MASTER"),
("PM");

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account`
(
	accountID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email			VARCHAR(50) UNIQUE,
    username		VARCHAR(50) NOT NULL UNIQUE,
    fullname		VARCHAR(50) NOT NULL,
    departmentID	INT UNSIGNED NOT NULL,
    positionID		INT UNSIGNED NOT NULL,
    createdate		DATE
);
INSERT INTO `account` (email, username, fullname, departmentID, positionID, createdate) VALUES
('phamthilananh@gmail.com', 'phamthilananh', "Phạm Thị Lan Anh", 2, 3, '2012/03/12'),
('hoangnguyetanh@gmail.com', 'hoangnguyetanh', "Hoàng Nguyệt Ánh", 9, 1, '2013/12/12'),
('nguyenminhbach@gmail.com', 'nguyenminhbach', "Nguyễn Minh Bách", 3, 3, '2013/09/04'),
('nguyenkhanhchi@gmail.com', 'nguyenkhanhchi', "Nguyễn Khánh Chi", 7, 1, '2014/06/08'), 
('ngohungdung@gmail.com', 'ngohungdung', "Ngô Hồng Dũng", 2, 2, '2014/10/12'), 
('nguyenminhduc@gmail.com', 'nguyenminhduc', "Nguyễn Minh Đức", 5, 3, '2015/10/31'), 
('dangquynhgiao@gmail.com', 'dangquynhgiao', "Đặng Quỳnh Giao", 9, 2, '2015/07/26'),
('vuduckhanh@gmail.com', 'vuduckhanh', "Vũ Đức Khánh", 10, 2, '2015/10/31'),
('nguyenminhkien@gmail.com', 'nguyenminhkien', "Nguyễn Minh Kiên", 2, 1, '2017/04/06'),
('lebaolinh@gmail.com', 'lebaolinh', "Lê Bảo Linh", 2, 2, '2019/11/01'),
('phamyenlinh@gmail.com', 'phamyenlinh', 'Phạm Yến Linh', 1, 4, '2020/10/05'),
('thaihalinh@gmail.com', 'thaihalinh', 'Thái Hà Linh', 4, 3, '2020/11/23'),
('vitranbaolong@gmail.com', 'vitranbaolong', 'Vi Trần Bảo Long', 6, 1, '2019/12/20'),
('lelyly@gmail.com', 'lelyly', 'Lê Ly Ly', 8, 3, '2021/01/13');

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group`
(
	groupID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    groupname		VARCHAR(50) UNIQUE,
    creatorID		INT UNSIGNED NOT NULL,
    createdate		DATE
);
INSERT INTO `group` (groupname, creatorID, createdate) VALUES
("Group_1", 8, '2013/05/24'),
("Group_2", 3, '2013/06/28'),
("Group_3", 10, '2013/07/23'),
("Group_4", 6, '2014/06/01'),
("Group_5", 2, '2015/02/18'),
("Group_6", 3, '2016/09/22'),
("Group_7", 1, '2015/09/06'),
("Group_8", 3, '2018/02/04'),
("Group_9", 5, '2019/04/08'),
("Group_10", 4, '2019/07/25');

CREATE TABLE IF NOT EXISTS groupaccount
(
	groupID			INT UNSIGNED NOT NULL,
    accountID		INT UNSIGNED NOT NULL UNIQUE,
    joindate		DATE,
    PRIMARY KEY(GroupID, AccountID)
);
INSERT INTO groupaccount (groupID, accountID, joindate) VALUES
(1, 7, '2021/04/01'),
(3, 3, '2021/04/02'),
(4, 2, '2021/02/16'),
(8, 1, '2020/05/18'),
(6, 12, '2018/12/27'),
(2, 14, '2017/04/26'),
(7, 13, '2016/12/08'),
(9, 10, '2016/11/15'),
(5, 11, '2016/08/16'),
(10, 4, '2021/04/03');

DROP TABLE IF EXISTS typequestion;
CREATE TABLE IF NOT EXISTS typequestion
(
	typeID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    typename		ENUM('Essay', 'Multiple-Choice')
);
INSERT INTO typequestion (typename) VALUES
("Essay"),
("Multiple-Choice");

DROP TABLE IF EXISTS categoryquestion;
CREATE TABLE IF NOT EXISTS categoryquestion
(
	categoryID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    categoryname	ENUM('Java','.NET','SQL','Postman','Ruby')
);
INSERT INTO categoryquestion (categoryname) VALUES
('Java'),
('.NET'),
('SQL'),
('Postman'),
('Ruby');

DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question
(
	questionID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content			VARCHAR(50) NOT NULL,
    categoryID		INT UNSIGNED NOT NULL,
    typeID			INT UNSIGNED NOT NULL,
    creatorID		INT UNSIGNED NOT NULL,
    createdate		DATE
);
INSERT INTO question (content, categoryID, typeID, creatorID, createdate) VALUES
('câu hỏi số 1', 4, 1, 2, '2014/02/10'),
('câu hỏi số 2', 5, 2, 10, '2014/04/14'),
('câu hỏi số 3', 3, 1, 6, '2015/03/07'),
('câu hỏi số 4', 4, 2, 8, '2016/02/10'),
('câu hỏi số 5', 1, 2, 4, '2016/11/25'),
('câu hỏi số 6', 3, 2, 7, '2018/05/10'),
('câu hỏi số 7', 5, 1, 3, '2019/04/03'),
('câu hỏi số 8', 3, 2, 9, '2018/10/01'),
('câu hỏi số 9', 5, 2, 1, '2021/02/19'),
('câu hỏi số 10', 2, 2, 5, '2021/03/17');

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer
(
	answerID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content			VARCHAR(50) NOT NULL,
    questionID		INT UNSIGNED,
    iscorrect		ENUM('True','False')
);
INSERT INTO answer (content, questionID, iscorrect) VALUES
('trả lời câu hỏi số 1', 1, 'True'),
('trả lời câu hỏi số 2', 1, 'False'),
('trả lời câu hỏi số 3', 1, 'True'),
('trả lời câu hỏi số 4', 1, 'False'),
('trả lời câu hỏi số 5', 5, 'True'),
('trả lời câu hỏi số 6', 6, 'False'),
('trả lời câu hỏi số 7', 7, 'True'),
('trả lời câu hỏi số 8', 8, 'False'),
('trả lời câu hỏi số 9', 9, 'True'),
('trả lời câu hỏi số 10', 10, 'False');

DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam
(
	examID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `code`			VARCHAR(10) NOT NULL,
    title			VARCHAR(50),
    categoryID		INT UNSIGNED NOT NULL,
    duration		INT UNSIGNED,
    creatorID		INT UNSIGNED NOT NULL,
    createdate		DATE
);

INSERT INTO exam (`code`, title, categoryID, duration, creatorID, createdate) VALUES
('N9TT', 'bài kiểm tra số 1', 4, 90, 4, '2021/03/18'),
('9G0A', 'bài kiểm tra số 2', 1, 15, 5, '2020/12/02'),
('B7FQ', 'bài kiểm tra số 3', 2, 60, 6, '2020/02/23'),
('RANC', 'câu hỏi bài kiểm tra số 4', 4, 30, 2, '2019/08/07'),
('QK6A', 'bài kiểm tra số 5', 3, 120, 3, '2019/04/01'),
('JI6S', 'bài kiểm tra số 6', 1, 120, 6, '2019/12/01'),
('7ETR', 'bài kiểm tra số 7', 3, 60, 2, '2021/04/01'),
('0A6C', 'câu hỏi bài kiểm tra số 8', 2, 15, 1, '2018/10/01'),
('SXFP', 'bài kiểm tra số 9', 5, 90, 5, '2016/07/04'),
('ONI6', 'bài kiểm tra số 10', 5, 60, 3, '2016/03/08');

DROP TABLE IF EXISTS examquestion;
CREATE TABLE IF NOT EXISTS examquestion
(
	examID			INT UNSIGNED NOT NULL UNIQUE,
    questionID		INT UNSIGNED NOT NULL 
);
INSERT INTO examquestion (examID, questionID) VALUES
(7, 7),
(5, 7),
(3, 3),
(6, 6),
(8, 8),
(10, 10),
(1, 7),
(9, 9),
(2, 2),
(4, 4);

##Câu 2
SELECT * FROM department;
##Câu 3
SELECT departmentID FROM department WHERE departmentname='Sale';
##Câu 4
SELECT * FROM `account` WHERE LENGTH(fullname) = (SELECT MAX(LENGTH(fullname)) FROM `account`);
##Câu 5
SELECT * FROM `account` WHERE LENGTH(fullname) = (SELECT MAX(LENGTH(fullname)) FROM `account` WHERE departmentID=3);
##Câu 6
SELECT groupname FROM `group` WHERE createdate < '2019/12/20';
##Câu 7
SELECT questionID FROM answer GROUP BY questionID HAVING COUNT(questionID)>=4;
##Câu 8
SELECT examID FROM exam WHERE duration >=60 AND createdate < '2019/12/20';
##Câu 9
SELECT * FROM `group` ORDER BY createdate DESC LIMIT 5;
##Câu 10
SELECT COUNT(accountID) AS 'Số nhân viên' FROM `account` WHERE departmentID=2;
##Câu 11
SELECT fullname FROM `account` WHERE fullname LIKE 'D%o';
##Câu 12
DELETE FROM exam WHERE createdate < '2019/12/20';
##Câu 13
DELETE FROM question WHERE content LIKE 'Câu hỏi%';
##Câu 14
UPDATE `account` SET fullname= 'Nguyễn Bá Lộc', email= 'loc.nguyenba@vti.com.vn' WHERE accountID=5;
##Câu 15
UPDATE `groupaccount` SET groupID=4 WHERE accountID=5;

######################### TESTING SYSTEM 4 ##################################
##Câu 1
SELECT 
    fullname, departmentID, departmentname
FROM
    `account`
        LEFT JOIN
    department USING (departmentID);
    
##Câu 2
SELECT 
    *
FROM
    `account`
        RIGHT JOIN
    position USING (positionID)
        RIGHT JOIN
    department USING (departmentID);
    
##Câu 3
SELECT 
    fullname
FROM
    `account`
        JOIN
    position USING (positionID)
WHERE
    positionname = 'DEV';
    
##Câu 4
SELECT 
    departmentID, departmentname
FROM
    department
        LEFT JOIN
    `account` USING (departmentID)
GROUP BY departmentID
HAVING COUNT(accountID) > 3;

##Câu 5
SELECT questionID, content, COUNT(questionID) a FROM question LEFT JOIN examquestion USING(questionID) GROUP BY questionID;
##Câu 7
##Câu 7
##Câu 9
##Câu 10
##Câu 11
##Câu 12
##Câu 13
##Câu 14
##Câu 15
##Câu 16
##Câu 17
##Câu 18