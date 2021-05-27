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
('Dev'),
('waiting department');

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

DROP TABLE IF EXISTS groupaccount;
CREATE TABLE IF NOT EXISTS groupaccount
(
	groupID			INT UNSIGNED NOT NULL,
    accountID		INT UNSIGNED NOT NULL,
    joindate		DATE,
    PRIMARY KEY(GroupID, AccountID)
);
INSERT INTO groupaccount (groupID, accountID, joindate) VALUES
(1, 7, '2021/04/01'),
(3, 3, '2021/04/02'),
(2, 2, '2021/02/16'),
(8, 1, '2020/05/18'),
(2, 12, '2018/12/27'),
(4, 14, '2017/04/26'),
(7, 13, '2016/12/08'),
(9, 10, '2016/11/15'),
(6, 11, '2016/08/16'),
(10, 4, '2021/04/03'),
(1, 4, '2021/04/01'),
(1, 2, '2021/02/01'),
(1, 12, '2021/01/04'),
(1, 5, '2020/05/11'),
(1, 6, '2019/08/09'),
(1, 10, '2020/07/07'),
(1, 11, '2021/01/22');



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
('câu hỏi số 9', 5, 2, 1, '2021/04/01'),
('câu hỏi số 10', 2, 2, 5, '2021/03/17'),
('câu hỏi số 11', 2, 1, 3, '2021/04/10');

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer
(
	answerID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    content			VARCHAR(50) NOT NULL,
    questionID		INT UNSIGNED,
    iscorrect		ENUM('True','False')
);
INSERT INTO answer (content, questionID, iscorrect) VALUES
('câu trả lời số 1', 1, 'True'),
('câu trả lời số 2', 1, 'False'),
('câu trả lời số 3', 1, 'True'),
('câu trả lời số 4', 1, 'False'),
('câu trả lời số 5', 5, 'True'),
('câu trả lời số 6', 6, 'False'),
('câu trả lời số 7', 7, 'True'),
('câu trả lời số 8', 8, 'False'),
('câu trả lời số 9', 9, 'True'),
('câu trả lời số 10', 10, 'False');

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
#DELETE FROM exam WHERE createdate < '2019/12/20';
##Câu 13
#DELETE FROM question WHERE content LIKE 'Câu hỏi%';
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
SELECT 
    questionID,
    content,
    COUNT(examID) AS 'Số lượng bài kiểm tra'
FROM
    question
        JOIN
    examquestion USING (questionID)
GROUP BY questionID HAVING COUNT(examID) =(SELECT 
    MAX(a)
FROM
    (SELECT 
        COUNT(examID) a
    FROM
        examquestion
    JOIN question USING (questionID)
    GROUP BY questionID) AS bang1);

##Câu 6
SELECT 
    categoryID, categoryname, COUNT(questionID) AS 'so luong question'
FROM
    categoryquestion 
        LEFT JOIN
    question  USING (categoryID)
GROUP BY categoryID;

##Câu 7
SELECT 
    questionID, content, COUNT(examID) AS 'So bai kiem tra'
FROM
    question
        LEFT JOIN
    examquestion USING (questionID)
        LEFT JOIN
    exam USING (examID)
GROUP BY questionID;

##Câu 8
SELECT 
    q.questionID, q.content, COUNT(answerID) AS 'so cau tra loi'
FROM
    question q
        LEFT JOIN
    answer a USING (questionID)
GROUP BY q.questionID
HAVING COUNT(answerID) = (SELECT 
        MAX(a)
    FROM
        (SELECT 
            COUNT(answerID) a
        FROM
            question
        LEFT JOIN answer USING (questionID)
        GROUP BY questionID) AS bangphu);
##Câu 9
SELECT 
    g.groupID,
    g.groupname,
    COUNT(accountID) AS 'So luong account'
FROM
    `group` g
        LEFT JOIN
    groupaccount USING (groupID)
GROUP BY groupID;

##Câu 10
SELECT 
    positionID, positionname, COUNT(accountID) AS 'So nguoi'
FROM
    position
        LEFT JOIN
    `account` USING (positionID)
GROUP BY positionID
HAVING COUNT(accountID) = (SELECT 
        MAX(a)
    FROM
        (SELECT 
            COUNT(accountID) a
        FROM
            `account`
        RIGHT JOIN position USING (positionID)
        GROUP BY positionID) AS bangphu);
        
##Câu 11
SELECT 
    *
FROM
    department
        LEFT JOIN
    (SELECT 
        departmentID, COUNT(positionname) AS 'so nhan vien dev'
    FROM
        department
    JOIN `account` USING (departmentID)
    JOIN position USING (positionID)
    WHERE
        positionname = 'DEV'
    GROUP BY departmentID) AS bangdev USING (departmentID)
        LEFT JOIN
    (SELECT 
        departmentID, COUNT(positionname) AS 'So nhan vien test'
    FROM
        department
    JOIN `account` USING (departmentID)
    JOIN position USING (positionID)
    WHERE
        positionname = 'TEST'
    GROUP BY departmentID) AS bangtest USING (departmentID)
        LEFT JOIN
    (SELECT 
        departmentID,
            COUNT(positionID) AS 'So nhan vien Scum Master'
    FROM
        department
    JOIN `account` USING (departmentID)
    JOIN position USING (positionID)
    WHERE
        positionname = 'SCUM MASTER'
    GROUP BY departmentID) AS bangSM USING (departmentID)
        LEFT JOIN
    (SELECT 
        departmentID, COUNT(positionID) AS 'So nhan vien PM'
    FROM
        department
    JOIN `account` USING (departmentID)
    JOIN position USING (positionID)
    WHERE
        positionname = 'PM'
    GROUP BY departmentID) AS bangPM USING (departmentID)
GROUP BY departmentID 
ORDER BY departmentID;

##Câu 12
SELECT 
	q.questionID, 
	q.content AS 'Nội dung', 
	c.categoryname AS 'Chủ đề', 
	t.typename 'Loại', 
	a.fullname AS 'Người tạo', 
	q.createdate AS 'Ngày tạo' 
FROM 
		question q 
	LEFT JOIN categoryquestion c USING(categoryID) 
    LEFT JOIN typequestion t USING(typeID) 
    LEFT JOIN `account` a ON q.creatorID=a.accountID;

##Câu 13
SELECT 
	t.*, 
	COUNT(questionID) AS 'Số lương câu hỏi' 
FROM 
	typequestion t 
		JOIN question q USING(typeID) 
GROUP BY t.typeID; 

##Câu 14 15
SELECT 
    groupID, groupname
FROM
    `group`
        LEFT JOIN
    groupaccount USING (groupID)
WHERE
    accountID IS NULL;
    
##Câu 16
SELECT 
    q.questionID, q.content
FROM
    question q
        LEFT JOIN
    answer a USING (questionID)
WHERE
    a.answerID IS NULL;
    
##Câu 17
#a)
SELECT 
    *
FROM
    `account`
        JOIN
    groupaccount USING (accountID)
WHERE
    groupID = 1;
#b)
SELECT 
    *
FROM
    `account`
        JOIN
    groupaccount USING (accountID)
WHERE
    groupID = 2;
#c)
SELECT * FROM (SELECT 
    *
FROM
    `account`
        JOIN
    groupaccount USING (accountID)
WHERE
    groupID = 1) AS bang1
UNION ALL
SELECT * FROM (SELECT 
    *
FROM
    `account`
        JOIN
    groupaccount USING (accountID)
WHERE
    groupID = 2) AS bang2;

##Câu 18
#a)
SELECT 
    groupID, groupname
FROM
    `group`
        JOIN
    groupaccount USING (groupID)
GROUP BY groupID
HAVING COUNT(accountID) > 5;
#b)
SELECT 
    groupID, groupname
FROM
    `group`
        JOIN
    groupaccount USING (groupID)
GROUP BY groupID
HAVING COUNT(accountID) < 7;
#c)
SELECT * FROM (SELECT 
    groupID, groupname
FROM
    `group`
        JOIN
    groupaccount USING (groupID)
GROUP BY groupID
HAVING COUNT(accountID) > 5) AS bang1
UNION
SELECT * FROM (SELECT 
    groupID, groupname
FROM
    `group`
        JOIN
    groupaccount USING (groupID)
GROUP BY groupID
HAVING COUNT(accountID) < 7) AS bang2;

################################################ TESTING SYSTEM 5 ###############################################################
##Câu 1
CREATE VIEW danh_sach_nhan_vien_sale AS
	SELECT 
		a.fullname, d.departmentname
	FROM
		`account` a
			INNER JOIN
		department d USING (departmentID)
	WHERE
		departmentname = 'Sale';

##Câu 2
CREATE VIEW account_tham_gia_nhieu_group_nhat AS
SELECT 
    a.*, COUNT(groupID) AS 'Số group đã tham gia'
FROM
    account a
        LEFT JOIN
    groupaccount USING (accountID)
GROUP BY accountID
HAVING COUNT(groupID) = (SELECT 
        MAX(a)
    FROM
        (SELECT 
            COUNT(groupID) a
        FROM
            account
        LEFT JOIN groupaccount USING (accountID)
        GROUP BY accountID) AS bangphu);
        
##Câu 3
CREATE VIEW cau_hoi_content_dai AS
SELECT questionID, content FROM question WHERE LENGTH(content) >17;
#DELETE FROM cau_hoi_content_dai;

##Câu 4
CREATE VIEW phong_ban_nhieu_nhan_vien_nhat AS
SELECT 
    departmentID,
    departmentname,
    COUNT(accountID) AS 'Số nhân viên'
FROM
    department
        LEFT JOIN
    account USING (departmentID)
GROUP BY departmentID
HAVING COUNT(accountID) = (SELECT 
        MAX(a)
    FROM
        (SELECT 
            COUNT(accountID) a
        FROM
            department
        LEFT JOIN account USING (departmentID)
        GROUP BY departmentID) AS bangphu);

##Câu 5
CREATE VIEW cau_hoi_do_user_ho_Nguyen_tao AS
SELECT 
    q.questionID, q.content, a.fullname
FROM
    question q
        LEFT JOIN
    `account` a ON q.creatorID = a.accountID
WHERE
    fullname LIKE 'Nguyễn%';
    
    ############################################# TESTING SYSTEM 6 ######################################################################
    
    ##Câu 1
DROP PROCEDURE IF EXISTS indepartment_outaccount;
DELIMITER $$
CREATE PROCEDURE indepartment_outaccount(IN ten_phong VARCHAR(50))
BEGIN
    SELECT *
	FROM
		`account` a
			INNER JOIN
		department d USING (departmentID)
	WHERE
		d.departmentname = ten_phong;
END$$
DELIMITER ;
CALL indepartment_outaccount('Marketing');

##Câu 2
DROP PROCEDURE IF EXISTS cau2;
DELIMITER $$
CREATE PROCEDURE cau2(IN id_group INT UNSIGNED)
BEGIN
		SELECT 
		g.groupID, g.groupname, COUNT(accountID) AS 'Số account'
	FROM
		groupaccount ga
			RIGHT JOIN
	   `group` g USING (groupID) WHERE g.groupID=id_group
	GROUP BY g.groupID;
END$$
DELIMITER ;
CALL cau2(1);
##Câu 3
DROP PROCEDURE IF EXISTS cau3;
DELIMITER $$
CREATE PROCEDURE cau3(IN loai_cau_hoi ENUM('Essay', 'Multiple-Choice'))
BEGIN
		SELECT 
		t.*, COUNT(questionID) AS 'Số câu hỏi'
	FROM
		typequestion t
			INNER JOIN
		question q USING (typeID)
	WHERE
		typename = loai_cau_hoi
			AND MONTH(createdate) = MONTH(NOW())
			AND YEAR(createdate) = YEAR(NOW())
	GROUP BY typeID;
END$$
DELIMITER ;
CALL cau3('Essay');

##Câu 4
DROP PROCEDURE IF EXISTS cau4;
DELIMITER $$
CREATE PROCEDURE cau4(OUT typeID_nhieu_cau_hoi_nhat INT UNSIGNED)
BEGIN
    SELECT 
		typeID INTO typeID_nhieu_cau_hoi_nhat
	FROM
		typequestion
			INNER JOIN
		question USING (typeID)
	GROUP BY typeID
	HAVING COUNT(questionID) = (SELECT 
			MAX(a)
		FROM
			(SELECT 
				COUNT(questionID) a
			FROM
				question
			INNER JOIN typequestion USING (typeID)
			GROUP BY typeID) AS bangphu);
END$$
DELIMITER ;
SET @x=0;
CALL cau4(@x);
SELECT @x;

##Câu 5
DROP PROCEDURE IF EXISTS cau5;
DELIMITER $$
CREATE PROCEDURE cau5 (IN id_type INT UNSIGNED)
BEGIN
	 SELECT 
		typename
	FROM
		typequestion
	WHERE
		typeID = id_type;
 END$$
 DELIMITER ;
 CALL cau5(2);
 
##Câu 6
DROP PROCEDURE IF EXISTS cau6;
DELIMITER $$
CREATE PROCEDURE cau6(IN nhap_chuoi VARCHAR(20))
BEGIN
 SELECT groupname AS result FROM `group` WHERE groupname LIKE CONCAT('%',nhap_chuoi,'%') UNION ALL
 SELECT username AS result FROM `account` WHERE username LIKE CONCAT('%',nhap_chuoi,'%');
END$$
DELIMITER ;
CALL cau6('group');

##Câu 7
DROP PROCEDURE IF EXISTS cau7;
DELIMITER $$
CREATE PROCEDURE cau7( IN p_fullname VARCHAR(50), IN p_email VARCHAR(50))
BEGIN
	DECLARE v_username VARCHAR(50) DEFAULT SUBSTRING_INDEX(p_email,'@',1);
    DECLARE v_positionID INT UNSIGNED DEFAULT (SELECT positionID a FROM position WHERE positionname='DEV');
    DECLARE v_departmentID INT UNSIGNED DEFAULT (SELECT departmentID b FROM department WHERE departmentname='waiting department');
    DECLARE v_createdate DATE DEFAULT CURDATE();
    INSERT INTO `account` VALUES (accountID, p_email, v_username, p_fullname, v_departmentID, v_positionID, v_createdate);
    SELECT * FROM `account` WHERE fullname=p_fullname;
END$$	
DELIMITER ;
#CALL cau7('pham minh tuan','phamminhtuan@gmail.com');

##Câu 8
DROP PROCEDURE IF EXISTS cau8;
DELIMITER $$
CREATE PROCEDURE cau8(IN v_type_question ENUM('Essay', 'Multiple-Choice'))
BEGIN
	SELECT 
    questionID, content, typename, LENGTH(content)
FROM
    question
        INNER JOIN
    typequestion USING (typeID)
WHERE
    typename = v_type_question
        AND LENGTH(content) = (SELECT 
            MAX(a)
        FROM
            (SELECT 
                LENGTH(content) a
            FROM
                question) AS bang3);
END$$
DELIMITER ;
CALL cau8('Multiple-Choice');

##Câu 9 
DROP PROCEDURE IF EXISTS cau9;
DELIMITER $$
CREATE PROCEDURE cau9(IN v_examID INT UNSIGNED)
BEGIN
	DELETE FROM exam WHERE examID=v_examID;
END$$
DELIMITER ;

##Câu 10
DROP PROCEDURE IF EXISTS cau10;
DELIMITER $$
CREATE PROCEDURE cau10(OUT amount_of_record_deleted INT)
BEGIN
DECLARE id_of_exam_created_3year_ago INT UNSIGNED;
SELECT examID INTO id_of_exam_created_3year_ago FROM exam WHERE YEAR(createdate)=YEAR(NOW())-3;
#DELETE FROM exam WHERE examID=id_of_exam_created_3year_ago;
SELECT ROW_COUNT() INTO amount_of_record_deleted;
END$$
DELIMITER ;
SET @amount_record=0;
CALL cau10(@amount_record);
SELECT @amount_record;

##Câu 11
DROP PROCEDURE IF EXISTS cau11;
DELIMITER $$
CREATE PROCEDURE cau11(IN v_departmentname VARCHAR(50))
BEGIN
DECLARE id_choviec INT;
SELECT departmentID INTO id_choviec FROM department WHERE departmentname='waiting department';
#UPDATE `account` SET departmentID= id_choviec WHERE departmentID=(SELECT departmentID FROM department WHERE departmentname=v_departmentname);
#DELETE FROM department WHERE departmentname=v_departmentname;
END$$
DELIMITER ;
#CALL cau11('kho');

##Câu 12
DROP PROCEDURE IF EXISTS cau12;
DELIMITER $$
CREATE PROCEDURE cau12()
BEGIN
	SELECT MONTH(createdate) AS 'Tháng', COUNT(questionID) AS 'Số câu hỏi' FROM question WHERE YEAR(createdate)=YEAR(NOW()) GROUP BY MONTH(createdate);
END$$
DELIMITER ;
CALL cau12();

##Câu 13
DROP PROCEDURE IF EXISTS cau13;
DELIMITER $$
CREATE PROCEDURE cau13()
BEGIN
	SELECT six_month_ago.*, COUNT(questionID) AS number_question,
    CASE 
		WHEN COUNT(questionID)=0 THEN 'không có câu hỏi nào trong tháng'
        ELSE ''
	END AS NOTE
    FROM(
		SELECT YEAR(NOW()) AS `YEAR`, MONTH(NOW()) AS `MONTH`
    UNION
		SELECT YEAR(DATE_SUB((NOW()), INTERVAL 1 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 1 MONTH)) AS `MONTH`
    UNION
       SELECT YEAR(DATE_SUB((NOW()), INTERVAL 2 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 2 MONTH)) AS `MONTH`
	UNION
       SELECT YEAR(DATE_SUB((NOW()), INTERVAL 3 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 3 MONTH)) AS `MONTH`
	UNION
       SELECT YEAR(DATE_SUB((NOW()), INTERVAL 4 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 4 MONTH)) AS `MONTH`
	UNION
       SELECT YEAR(DATE_SUB((NOW()), INTERVAL 5 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 5 MONTH)) AS `MONTH`
	UNION
       SELECT YEAR(DATE_SUB((NOW()), INTERVAL 6 MONTH)) AS `YEAR`, MONTH(DATE_SUB((NOW()), INTERVAL 6 MONTH)) AS `MONTH`
       ) AS six_month_ago
    LEFT JOIN question ON six_month_ago.`MONTH`=MONTH(createdate) GROUP BY six_month_ago.`MONTH`;
END$$
DELIMITER ;
CALL cau13();

################################################## TESTING SYSTEM 7 ################################################################

#Câu 1
DROP TRIGGER IF EXISTS trigger_insert_group;
DELIMITER $$
CREATE TRIGGER trigger_insert_group
BEFORE INSERT ON `group`
FOR EACH ROW
BEGIN
	IF NEW.createdate < DATE_SUB(CURRENT_DATE(), INTERVAL 1 YEAR) THEN 
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='cannot add data to Groups with create date 1 year ago';
	END IF;
END$$
DELIMITER ;

#Câu 2
DROP TRIGGER IF EXISTS trigger_insert_user;
DELIMITER $$
CREATE TRIGGER trigger_insert_user
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN
	IF NEW.departmentID=(SELECT departmentID FROM department WHERE departmentname='Sale') THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT="Department Sale cannot add more user";
	END IF;
END$$
DELIMITER ;

#Câu 3
DROP TRIGGER IF EXISTS trigger_5user;
DELIMITER $$
CREATE TRIGGER trigger_5user
BEFORE INSERT ON groupaccount
FOR EACH ROW
BEGIN
	DECLARE amount_user INT;
    SELECT COUNT(accountID) INTO amount_user FROM groupaccount WHERE groupID=NEW.groupID GROUP BY groupID;
    IF amount_user > 5 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='the number of group members cannot be more than 5';
	END IF;
END$$
DELIMITER ;

#Câu 4
DROP TRIGGER IF EXISTS trigger_10question;
DELIMITER $$
CREATE TRIGGER trigger_10question
BEFORE INSERT ON examquestion
FOR EACH ROW
BEGIN
	DECLARE amount_question INT;
    SELECT COUNT(questionID) INTO amount_question FROM examquestion WHERE examID=NEW.examID GROUP BY examID;
    IF amount_question >10 THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='the number of question cannot be more than 10';
	END IF;
END$$
DELIMITER ;

#Câu 5
DROP TRIGGER IF EXISTS cancel_del_account;
DELIMITER $$
CREATE TRIGGER cancel_del_account
BEFORE DELETE ON `account` 
FOR EACH ROW
BEGIN
DECLARE v_accountID INT;
SELECT accountID INTO v_accountID FROM `account` WHERE email=OLD.email;
	IF OLD.email= 'admin@gmail.com' THEN 
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT='cannot delete this account';
	#ELSE 
		#DELETE FROM `account` WHERE accountID=v_accountID;
        #DELETE FROM `group` WHERE creatorID=v_accountID;
        #DELETE FROM exam WHERE creatorID=v_accountID;
       # DELETE FROM question WHERE creatorID=v_accountID;
	END IF;
END$$
DELIMITER ;

#Câu 6
DROP TRIGGER IF EXISTS auto_waiting_department;
DELIMITER $$
CREATE TRIGGER auto_waiting_department
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	IF NEW.departmentID IS NULL THEN SET NEW.departmentID= (SELECT departmentID FROM department WHERE departmentname='waiting department');
    END IF;
END$$
DELIMITER ;

#Câu 7
DROP TRIGGER IF EXISTS create_answer;
DELIMITER $$
CREATE TRIGGER create_answer
BEFORE INSERT ON answer FOR EACH ROW
BEGIN
DECLARE amount_answer INT;
DECLARE amount_correct_answer INT;
SELECT COUNT(answerID) AS 'số câu trả lời' INTO amount_answer FROM answer INNER JOIN question USING(questionID) WHERE questionID=NEW.questionID GROUP BY questionID;
SELECT COUNT(answerID) AS 'số câu trả lời đúng' INTO amount_correct_answer FROM answer INNER JOIN question USING(questionID) WHERE questionID=NEW.questionID AND iscorrect='True' GROUP BY questionID;
IF amount_answer >4 THEN 
	SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='Only a maximum of 4 responses can be created';
END IF;
IF amount_correct_answer >2 THEN 
	SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='only a maximum of 2 correct answers';
END IF;
END$$
DELIMITER ;

#Câu 8
ALTER TABLE `account` ADD gender ENUM('M','F','U') DEFAULT 'U';
DROP TRIGGER IF EXISTS fix_gender_data;
DELIMITER $$
CREATE TRIGGER fix_gender_data
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	IF NEW.gender='male' THEN SET NEW.gender='M';
	ELSEIF NEW.gender='female' THEN SET NEW.gender='F';
	ELSEIF NEW.gender='unknow' THEN SET NEW.gender='U';
    END IF;
END$$
DELIMITER ;

#Câu 9
DROP TRIGGER IF EXISTS cancel_del_exam;
DELIMITER $$
CREATE TRIGGER cancel_del_exam
BEFORE DELETE ON exam FOR EACH ROW
BEGIN
    IF OLD.createdate = DATE_SUB(CURRENT_DATE(), INTERVAL 2 DAY) THEN 
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='Can not delete the newly created exam 2 days ago';
    END IF;
END$$
DELIMITER ;

#Câu 10
DROP TRIGGER IF EXISTS update_question;
DELIMITER $$
CREATE TRIGGER update_question
BEFORE UPDATE ON question FOR EACH ROW
BEGIN
	DECLARE questionID_update INT;
    SELECT q.questionID INTO questionID_update FROM question q JOIN examquestion e USING(questionID) WHERE q.questionID = e.questionID GROUP BY questionID;
    IF OLD.questionID = questionID_update THEN 
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='cannot update this question bacause it was in an exam';
    END IF;
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_question;
DELIMITER $$
CREATE TRIGGER delete_question
BEFORE DELETE ON question FOR EACH ROW
BEGIN
	DECLARE questionID_delete INT;
    SELECT q.questionID INTO questionID_delete FROM question q JOIN examquestion e USING(questionID) WHERE q.questionID = e.questionID GROUP BY questionID;
    IF OLD.questionID = questionID_delete THEN 
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT='cannot delete this question bacause it was in an exam';
    END IF;
END$$
DELIMITER ;

SELECT 
    *,
    CASE
        WHEN duration <= 30 THEN 'short time'
        WHEN duration > 30 AND duration <= 60 THEN 'medium time'
        ELSE 'long time'
    END AS type_duration
FROM exam;

#Câu 13
SELECT groupID, groupname, COUNT(accountID) AS 'number_user',
CASE 
	WHEN COUNT(accountID) <=5 THEN 'few'
    WHEN 5< COUNT(accountID) <=20 THEN 'normal'
    ELSE 'higher'
END AS the_number_user_amount
FROM groupaccount INNER JOIN `group` USING(groupID) GROUP BY groupID;

#Câu 14
SELECT departmentID, departmentname, COUNT(accountID) AS 'number_user',
CASE 
	WHEN COUNT(accountID) =0 THEN 'không có user'
    ELSE ''
END AS note
FROM department LEFT JOIN `account` USING(departmentID) GROUP BY departmentID;

#deleteDepartment
DROP PROCEDURE IF EXISTS sp_delete_department;
DELIMITER $$
CREATE PROCEDURE sp_delete_department(IN v_departmentID INT)
BEGIN
	DELETE FROM department WHERE departmentID = v_departmentID;
END $$
DELIMITER ;
