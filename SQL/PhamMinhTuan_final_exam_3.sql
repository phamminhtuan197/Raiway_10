DROP DATABASE IF EXISTS final_exam_3;
CREATE DATABASE IF NOT EXISTS final_exam_3;
USE final_exam_3;

DROP TABLE IF EXISTS Country;
CREATE TABLE IF NOT EXISTS Country
(
	country_id				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    country_name			VARCHAR(30) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS Location;
CREATE TABLE IF NOT EXISTS Location
(
	location_id				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street_address			VARCHAR(50) NOT NULL,
    postal_code				INT UNSIGNED UNIQUE,
    country_id				TINYINT UNSIGNED NOT NULL,
    CONSTRAINT fk_countryid FOREIGN KEY (country_id) REFERENCES Country (country_id)
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee
(
	employee_id				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    full_name				VARCHAR(50) NOT NULL,
    email					VARCHAR(50),
	location_id				TINYINT UNSIGNED
);


INSERT INTO Country(country_name) VALUES 
('Vietnam'),
('Malaysia'),
('Thailand'),
('Laos');

INSERT INTO Location(street_address, postal_code, country_id) VALUES
('04840 Ridge Oak Lane', 11337, 2),
('1060 Giai Phong', 11111, 1),
('78291 La Follette Lane', 54150, 3),
('9109 Shasta Drive', 12211, 4),
('242 Bach Mai', 33456, 1);

INSERT INTO Employee( full_name, email, location_id) VALUES
('Ethelbert Chessman', 'echessman0@gmail.com', 1),
('Kimbra Arnowicz','karnowicz1@gmail.com', 3),
('Eugenia Lovie', 'elovie5@mozilla.com', 4),
('Pham Minh Tuan', 'nn03@gmail.com', 2),
('Nguyen Minh Tuan', 'nguyenminhtuan@gmail.com', 5);


##Câu 2: Viết lệnh để
#a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT 
    e.full_name
FROM
    Employee e
        INNER JOIN
    Location l ON e.location_id = l.location_id
        INNER JOIN
    Country c ON l.country_id = c.country_id
WHERE
    country_name = 'Vietnam';

#b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT 
    c.country_name
FROM
    Country c
        INNER JOIN
    location l ON c.country_id = l.country_id
        INNER JOIN
    Employee e ON l.location_id = e.location_id
WHERE
    email = 'nn03@gmail.com';
    
#c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.

#Thống kê mỗi country có bao nhiêu employee đang làm việc.
SELECT 
    c.country_name, COUNT(e.employee_id) AS amount_employee
FROM
    Country c
        LEFT JOIN
    Location l ON c.country_id = l.country_id
        LEFT JOIN
    Employee e ON l.location_id = e.location_id
GROUP BY c.country_name;

#Thống kê mỗi location có bao nhiêu employee đang làm việc.
SELECT 
    l.street_address, COUNT(e.employee_id) AS amount_employee
FROM
    location l
        LEFT JOIN
    Employee e ON l.location_id = e.location_id
GROUP BY l.street_address;

##Câu 3: Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS trigger_employee;
DELIMITER $$
CREATE TRIGGER trigger_employee
BEFORE INSERT ON Employee FOR EACH ROW
BEGIN
	DECLARE v_amount_employee INT;
	SELECT 
		c.country_name, COUNT(e.employee_id) AS amount_employee INTO v_amount_employee 
	FROM
		Country c
			LEFT JOIN
		Location l ON c.country_id = l.country_id
			LEFT JOIN
		Employee e ON l.location_id = e.location_id
	GROUP BY c.country_name;
	IF v_amount_employee >10 THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT='each country has a maximum of 10 employee';
	END IF;
END$$
DELIMITER ;

##Câu 4: Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null.

ALTER TABLE Employee
ADD CONSTRAINT fk_locationid FOREIGN KEY (location_id) REFERENCES Location (location_id) ON DELETE SET NULL;