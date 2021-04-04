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
INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Note, VTI_Account) VALUES
('Chu Ngọc Minh Châu','2008/08/30', 'female', 10, 15, 50, '1', 'Đang học', 'chungocminhchau'),
('Đặng Ngọc Minh Châu','2008/08/17', 'female', 15, 20, 45, '2', 'Đang học', 'dangngocminhchau'),
('Đỗ Minh Châu','2009/06/06', 'female', 11, 12, 45, '3', 'Đang học', 'dominhchau'),
('Lê Thị Hoàng Châu','2007/11/10', 'female', 10, 15, 40, '4', 'Đang học', 'lethihoangchau'),
('Hoàng Linh Chi','2007/08/30', 'female', 15, 17, 49, '5', 'Đang học', 'hoanglinhchi'),
('Trần Linh Chi','2008/02/05', 'female', 15, 12, 43, '7', 'Đang học', 'tranlinhchi'),
('Trương Văn Chiến','2009/08/10', 'male', 15, 15, 46, '6', 'Đang học', 'truongvanchien'),
('Nguyễn Ngọc Diệp','2008/12/16', 'female', 17, 18, 38, '7', 'Đang học', 'nguyenngocdiep'),
('Ngô Hồng Dũng','2009/10/07', 'male', 19, 19, 38, '6', 'Đang học', 'ngohungdung'),
('Đàm Quang Duy','2008/02/28', 'male', 13, 16, 43, '7', 'Đang học', 'damquanghuy');
##cau 2
##SELECT Full_Name, MONTH(Birth_Date) AS 'Thang sinh' FROM Trainee GROUP BY MONTH(Birth_Date) ORDER BY MONTH(Birth_Date);
##cau 3
SELECT * FROM Trainee WHERE LENGTH(Full_Name)= (SELECT MAX(LENGTH(Full_Name)) FROM Trainee);
##cau 4

##cau 5
DELETE FROM Trainee WHERE TraineeID= 3;
##cau 6
UPDATE Trainee SET Training_Class=2 WHERE TraineeID=5;