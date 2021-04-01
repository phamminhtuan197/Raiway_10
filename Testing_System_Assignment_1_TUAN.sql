CREATE DATABASE IF NOT EXISTS bai_thi_dau_vao;
USE bai_thi_dau_vao;

CREATE TABLE IF NOT EXISTS Department
(
	DepartmentID 	INT AUTO_INCREMENT PRIMARY KEY,
	DepartmentName 	VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Position
(
	PositionID		INT AUTO_INCREMENT PRIMARY KEY,
    PositionName	VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `Account`
(
	AccountID		INT AUTO_INCREMENT PRIMARY KEY,
    Email			VARCHAR(50),
    Usename			VARCHAR(50) NOT NULL,
    Fullname		VARCHAR(50) NOT NULL,
    DepartmentID	INT,
    PositionID		VARCHAR(50),
    CreateDate		DATE
);

CREATE TABLE IF NOT EXISTS `Group`
(
	GroupID			INT AUTO_INCREMENT PRIMARY KEY,
    GroupName		VARCHAR(50),
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE IF NOT EXISTS GroupAccount
(
	GroupID			INT,
    AccountID		INT,
    JoinDate		DATE
);

CREATE TABLE IF NOT EXISTS TypeQuestion
(
	TypeID			INT AUTO_INCREMENT PRIMARY KEY,
    TypeName		VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS CategoryQuestion
(
	CategoryID		INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName	VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Question
(
	QuestionID		INT AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(100) NOT NULL,
    CategoryID		INT,
    TypeID			INT,
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE IF NOT EXISTS Answer
(
	AnswerID		INT AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(100) NOT NULL,
    QuestionID		INT,
    isCorrect		VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS Exam
(
	ExamID			INT AUTO_INCREMENT PRIMARY KEY,
    `Code`			VARCHAR(10),
    Title			VARCHAR(50),
    CategoryID		INT,
    Duration		TIME,
    CreatorID		INT,
    CreateDate		DATE
);

CREATE TABLE IF NOT EXISTS ExamQuestion
(
	ExamID			INT,
    QuestionID		INT
);