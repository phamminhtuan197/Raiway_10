#################################### EXTRA ASSIGNMENT 1-2 ################################################################
DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE IF NOT EXISTS Fresher;
USE Fresher;

DROP TABLE IF EXISTS Trainee;
CREATE TABLE IF NOT EXISTS Trainee
(
    TraineeID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name		VARCHAR(50) NOT NULL,
    Birth_Date		DATE,
    Gender			ENUM('male', 'female', 'unknown'),
    ET_IQ			INT UNSIGNED CHECK(ET_IQ <=20) NOT NULL,
    ET_Gmath		INT UNSIGNED CHECK(ET_Gmath <=20) NOT NULL,
    ET_English		INT UNSIGNED CHECK(ET_English <=50) NOT NULL,
    Training_Class	INT UNSIGNED NOT NULL,
    Evaluation_Note	TEXT
);
ALTER TABLE Trainee
ADD COLUMN  VTI_Account		VARCHAR(50) NOT NULL UNIQUE;

#################################### EXTRA ASSIGNMENT 3 ################################################################

##Cau 1
INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Note, VTI_Account) VALUES
('Chu Ngọc Minh Châu','2008/08/30', 'female', 10, 15, 50, '1', 'Đang học', 'chungocminhchau'),
('Đặng Ngọc Minh Châu','2008/08/17', 'female', 15, 20, 45, '2', 'Đang học', 'dangngocminhchau'),
('Đỗ Minh Châu','2009/06/06', 'female', 11, 12, 15, '3', 'Đang học', 'dominhchau'),
('Lê Thị Hoàng Châu','2007/11/10', 'female', 10, 5, 10, '4', 'Đang học', 'lethihoangchau'),
('Hoàng Linh Chi','2007/08/30', 'female', 15, 17, 9, '5', 'Đang học', 'hoanglinhchi'),
('Trần Linh Chi','2008/02/05', 'female', 15, 12, 43, '7', 'Đang học', 'tranlinhchi'),
('Trương Văn Chiến','2009/08/10', 'male', 15, 5, 46, '6', 'Đang học', 'truongvanchien'),
('Nguyễn Ngọc Diệp','2008/12/16', 'female', 17, 8, 38, '7', 'Đang học', 'nguyenngocdiep'),
('Ngô Hồng Dũng','2009/10/07', 'male', 19, 5, 38, '6', 'Đang học', 'ngohungdung'),
('Đàm Quang Duy','2008/02/28', 'male', 3, 6, 13, '7', 'Đang học', 'damquanghuy');

##cau 2
SELECT 
    MONTH(Birth_Date) AS 'Thang sinh',
    GROUP_CONCAT(Full_Name) AS 'Ten'
FROM
    Trainee
GROUP BY MONTH(Birth_Date)
ORDER BY MONTH(Birth_Date);

##cau 3
SELECT 
    *
FROM
    Trainee
WHERE
    LENGTH(Full_Name) = (SELECT MAX(LENGTH(Full_Name)) FROM Trainee);
            
##cau 4
SELECT 
    Full_Name,
    Birth_Date,
    Gender,
    ET_IQ,
    ET_Gmath,
    ET_English,
    Training_Class,
    Evaluation_Note,
    VTI_Account
FROM
    Trainee
WHERE
    (ET_IQ + ET_Gmath) >= 20 AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18
ORDER BY Full_Name;
        
##cau 5
DELETE FROM Trainee WHERE TraineeID= 3;

##cau 6
UPDATE Trainee SET Training_Class=2 WHERE TraineeID=5;

#################################### EXTRA ASSIGNMENT 4 ################################################################

##Câu 1
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department
(
	department_number		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    department_name			VARCHAR(50) UNIQUE
);

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee
(
	employee_number			INT UNSIGNED AUTO_INCREMENT,
    employee_name			VARCHAR(50),
    department_number		INT,
    PRIMARY KEY (employee_number, department_number)
);

DROP TABLE IF EXISTS employee_skill;
CREATE TABLE IF NOT EXISTS employee_skill
(
	employee_number			INT UNSIGNED,
    skill_code				ENUM('Java','.NET','SQL','Postman','Ruby'),
    date_registered			DATE,
    PRIMARY KEY (employee_number, skill_code)
);

##Câu 2
INSERT INTO department (department_name) VALUES
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

INSERT INTO employee (employee_name, department_number) VALUES
("Phạm Thị Lan Anh", 1),
("Hoàng Nguyệt Ánh", 6),
("Nguyễn Minh Bách", 10),
("Nguyễn Khánh Chi", 5),
("Ngô Hồng Dũng", 1),
("Nguyễn Minh Đức", 9),
("Đặng Quỳnh Giao", 6),
("Vũ Đức Khánh", 2),
("Nguyễn Minh Kiên", 7),
("Lê Bảo Linh", 3),
('Phạm Yến Linh', 4),
('Thái Hà Linh', 8),
('Vi Trần Bảo Long', 1),
('Lê Ly Ly', 1),
('Lê Bảo Bình', 4);

INSERT INTO employee_skill (employee_number, skill_code, date_registered) VALUES
(4, 'Ruby', '2016/07/13'),
(15, 'Postman', '2016/08/20'),
(3, '.NET', '2016/12/23'),
(1, '.NET', '2017/01/12'),
(13, '.NET', '2017/07/28'),
(7, 'Java', '2017/11/25'),
(14, 'Postman', '2018/03/08'),
(8, '.NET', '2018/05/27'),
(5, '.NET', '2018/07/08'),
(8, 'Ruby', '2018/08/13'),
(14, '.NET', '2019/01/19'),
(3, 'SQL', '2019/06/09'),
(2, '.NET', '2019/08/02'),
(1, 'Java', '2019/11/06'),
(7, 'Ruby', '2019/11/24'),
(15, 'Ruby', '2020/09/24'),
(6, 'Ruby', '2020/10/18'),
(9, '.NET', '2020/11/12'),
(10, '.NET', '2020/12/16'),
(11, 'Ruby', '2020/05/27'),
(12, 'Java', '2020/06/14');

 ##Câu 3
SELECT 
    employee_number, employee_name
FROM
    employee
        INNER JOIN
    employee_skill USING (employee_number)
WHERE
    skill_code = 'Java';

##Câu 4
SELECT 
    d.*, COUNT(employee_number) AS 'Số nhân viên'
FROM
    department d
        LEFT JOIN
    employee USING (department_number)
GROUP BY department_number
HAVING COUNT(employee_number) > 3;

##Câu 5
SELECT 
    department_name,
    GROUP_CONCAT(employee_name) AS 'Danh sách nhân viên'
FROM
    department
        LEFT JOIN
    employee USING (department_number)
GROUP BY department_name;

##Câu 6
SELECT 
    employee_name, COUNT(skill_code) AS 'Số skill hiện có'
FROM
    employee
        INNER JOIN
    employee_skill USING (employee_number)
GROUP BY employee_name
HAVING COUNT(skill_code) > 1;