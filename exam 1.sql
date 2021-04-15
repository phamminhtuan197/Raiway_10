DROP DATABASE IF EXISTS testing_exam_1;
CREATE DATABASE IF NOT EXISTS testing_exam_1;
USE testing_exam_1;

DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE IF NOT EXISTS CUSTOMER
(
	CustomerID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name`					VARCHAR(50) NOT NULL,
    Phone					VARCHAR(50) NOT NULL,
    Email					VARCHAR(50),
    Address					VARCHAR(50) NOT NULL,
    Note					VARCHAR(100)
);

DROP TABLE IF EXISTS CAR;
CREATE TABLE IF NOT EXISTS CAR
(
	CarID					TINYINT UNSIGNED PRIMARY KEY NOT NULL,
    Maker					ENUM('HONDA','TOYOTA','NISSAN'),
    Model					VARCHAR(50) NOT NULL,
    `Year`					VARCHAR(50) NOT NULL,
    Color					VARCHAR(50) NOT NULL,
    Note					VARCHAR(100)
);

DROP TABLE IF EXISTS CAR_ORDER;
CREATE TABLE IF NOT EXISTS CAR_ORDER
(
	OrderID					TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CustomerID				TINYINT UNSIGNED NOT NULL,
    CarID					TINYINT UNSIGNED NOT NULL,
    Amount					TINYINT NOT NULL DEFAULT 1,
    SalePrice				INT	UNSIGNED NOT NULL,
    OrderDate				DATE NOT NULL,
    DeliveryDate			DATE NOT NULL,
    DeliveryAddress			VARCHAR(100) NOT NULL,
    `Status`				ENUM('đã đặt hàng','đã giao','đã huỷ') DEFAULT 'đã đặt hàng',
    Note					VARCHAR(100),
    CONSTRAINT fk_customerID FOREIGN KEY (CustomerID) REFERENCES CUSTOMER (CustomerID),
	CONSTRAINT fk_carID FOREIGN KEY (CarID) REFERENCES CAR (CarID)
);

INSERT INTO CUSTOMER(`Name`, Phone, Email, Address, Note) VALUES
('Phạm Thị Lan Anh', 84987107486, 'phamthilananh@gamil.com', 'Ba Đình', 'nữ cao'),
('Hoàng Nguyệt Ánh', 84766219330, 'hoangnguyetanh@gmail.com', 'Bắc Từ Liêm', 'nữ thấp'),
('Nguyễn Minh Bách', 84913028286, 'nguyenminhbach@gmail.com', 'Cầu Giấy', 'nam cao'),
('Nguyễn Khánh Chi', 84868080033, 'nguyenkhanhchi@gmail.com', 'Đống Đa', 'nữ cao'),
('Ngô Hồng Dũng', 84344269699, 'ngohungdung@gmail.com', 'Hà Đông', 'nam thấp'),
('Đặng Quỳnh Giao', 84948211668, 'dangquynhgiao@gmail.com', 'Cầu Giấy', 'nữ thấp');

INSERT INTO CAR(CarID, Maker, Model, `Year`, Color, Note) VALUES
(38,'TOYOTA','Camry', 2020, 'red', 'new'),
(13,'HONDA','City', 2019, 'blue', 'old'),
(7,'HONDA','CR-V', 2019, 'green', 'new'),
(2,'HONDA','Civic', 2018, 'black', 'new'),
(35,'TOYOTA','Fortuner', 2017, 'blue', 'like new'),
(34,'HONDA','Brio', 2021, 'black', 'like new'),
(12,'TOYOTA','Yaris', 2020, 'brown', 'new'),
(84,'NISSAN','X-Trail', 2019, 'black', 'new'),
(75,'NISSAN','Terra', 2020, 'brown', 'like new');

INSERT INTO CAR_ORDER(CustomerID, CarID, Amount, SalePrice, OrderDate, DeliveryDate, DeliveryAddress,`Status`, Note) VALUES
(1,38, 1, 300, '2017/04/06', '2017/04/26', 'Ba Đình', 'đã giao', 'satisfied'),
(2,75, 2, 471, '2019/08/09', '2019/11/01', 'Bắc Từ Liêm', 'đã huỷ', 'unsatisfied'),
(3,84, 1, 948, '2020/10/05', '2021/04/01', 'Cầu Giấy', 'đã đặt hàng', 'delivery during office hours'),
(4,13, 4, 970, '2020/11/23', '2021/02/01', 'Đống Đa', 'đã đặt hàng', 'Delivery outside office hours'),
(5,12, 5, 935, '2019/12/20', '2020/05/11', 'Hà Đông', 'đã giao', 'satisfied'),
(6,34, 7, 896, '2021/01/13', '2021/01/22', 'Cầu Giấy', 'đã đặt hàng', 'call before delivery');

#Câu 2
SELECT 
    c.`Name`, co.Amount
FROM
    CUSTOMER c
        INNER JOIN
    CAR_ORDER co USING (CustomerID)
ORDER BY co.Amount;

#Câu 3
SELECT 
    c.Maker
FROM
    CAR c
        INNER JOIN
    CAR_ORDER co USING (CarID)
WHERE
    co.Amount = (SELECT 
            MAX(Amount)
        FROM
            CAR_ORDER);
            
#Câu 4
DROP PROCEDURE IF EXISTS del_orders_cancel;
DELIMITER $$
CREATE PROCEDURE del_orders_cancel()
BEGIN
	DECLARE v_orders_cancel TINYINT UNSIGNED;
    SELECT OrderID INTO v_orders_cancel FROM CAR_ORDER WHERE YEAR(OrderDate) < YEAR(CURRENT_DATE()) AND `Status`='đã huỷ';
    DELETE FROM CAR_ORDER WHERE OrderID=v_orders_cancel;
    SELECT ROW_COUNT() AS amount_row_del;
END$$
DELIMITER ;
CALL del_orders_cancel();

#Câu 5
DROP PROCEDURE IF EXISTS data_orders;
DELIMITER $$
CREATE PROCEDURE data_orders(IN customer_id TINYINT UNSIGNED)
BEGIN
	SELECT 
    cu.`Name`, co.OrderID, co.Amount, c.Maker
FROM
    CAR_ORDER co
        INNER JOIN
    CAR c USING (CarID)
        INNER JOIN
    CUSTOMER cu USING (CustomerID)
WHERE
    cu.CustomerID = customer_id;
END$$
DELIMITER ;
CALL data_orders(2);

#Câu 6
DROP TRIGGER IF EXISTS trigger_insert_invalid_inf;
DELIMITER $$
CREATE TRIGGER trigger_insert_invalid_inf
BEFORE INSERT ON CAR_ORDER FOR EACH ROW
BEGIN
	IF NEW.DeliveryDate < OrderDate+15 THEN 
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT=' cannot insert this data';
    END IF;
END$$
DELIMITER ;