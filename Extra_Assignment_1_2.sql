DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE IF NOT EXISTS Fresher;
USE Fresher;

DROP TABLE IF EXISTS Trainee;
CREATE TABLE IF NOT EXISTS Trainee
(
    TraineeID		INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Full_Name		VARCHAR(50) NOT NULL,
    Birth_Date		DATE,
    Gender			ENUM('male', 'female', 'unknown'),
    ET_IQ			INT UNSIGNED CHECK(ET_IQ <=20) NOT NULL,
    ET_Gmath		INT UNSIGNED CHECK(ET_Gmath <=20) NOT NULL,
    ET_English		INT UNSIGNED CHECK(ET_English <=50) NOT NULL,
    Training_Class	VARCHAR(20) NOT NULL,
    Evaluation_Note	TEXT,
    VTI_Account		VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO TraineeID (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Note, VTI_Account) VALUES
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '7B', 'Đang học', 'chungocminhchau'),
('Đặng Ngọc Minh Châu','17/08/2008', 'female', 15, 20, 25, '7A', 'Đang học', 'dangngocminhchau'),
('Đỗ Minh Châu','06/06/2009', 'female', 11, 12, 25, '6B', 'Đang học', 'dominhchau'),
('Lê Thị Hoàng Châu','10/11/2007', 'female', 10, 15, 20, '8B', 'Đang học', 'lethihoangchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),
('Chu Ngọc Minh Châu','30/08/2008', 'female', 10, 15, 20, '6B', 'Đang học', 'chungocminhchau'),


