DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;

DROP TABLE IF EXISTS Khoa;
CREATE TABLE IF NOT EXISTS Khoa
(
	makhoa		CHAR(10),
    tenkhoa		CHAR(30),
    dienthoai	CHAR(10)
);

DROP TABLE IF EXISTS GiangVien;
CREATE TABLE IF NOT EXISTS GiangVien
(
	magv		INT,
    hotengv		CHAR(30),
    luonggv		DECIMAL(5,2),
    makhoa		CHAR(10)
);

DROP TABLE IF EXISTS SinhVien;
CREATE TABLE IF NOT EXISTS SinhVien
(
	masv		INT,
    hotensv		CHAR(30),
    makhoa		CHAR(10),
    namsinh		INT,
    quequan		CHAR(30)
);

DROP TABLE IF EXISTS DeTai;
CREATE TABLE IF NOT EXISTS DeTai
(
	madt		INT,
    tendt		CHAR(100),
    kinhphi		INT,
    NoiThucTap	CHAR(30)
);
 DROP TABLE IF EXISTS HuongDan;
 CREATE TABLE IF NOT EXISTS HuongDan
 (
	masv		INT,
    madt		CHAR(10),
    magv		INT,
    ketqua		DECIMAL(5,2)
);

INSERT INTO Khoa (makhoa, tenkhoa, dienthoai) VALUES
('K_1', 'TOAN', '0975420621'),
('K_2', 'LY', '0975161031'),
('K_3', 'HOA', '0975062781'),
('K_4', 'VAN', '0975233159'),
('K_5', 'SU', '0975407684'),
('K_6', 'DIA LY', '0975459228'),
('K_7', 'CONG NGHE SINH HOC', '0975514610'),
('K_8', 'QLTN', '0975086733'),
('K_9', 'THE CHAT', '0975929205'),
('K_10', 'NGOAI NGU', '0975538134');

INSERT INTO GiangVien (magv, hotengv, luonggv, makhoa) VALUES
(300, 'Trần Sơn', '10.458', 'K_5'),
(471, 'Hà Minh Trí', '10.392', 'K_5'),
(443, 'Nguyễn Triệu Huyền Trang', '7.602', 'K_8'),
(137, 'Trần Anh Thư', '10.400', 'K_9'),
(948, 'Nguyễn Như Quỳnh', '8.222', 'K_1'),
(970, 'Lê Phương Nhi', '6.602', 'K_7'),
(935, 'Hoàng Dương Bảo Minh', '10.973', 'K_3'),
(405, 'Lê Ngọc Mai', '9.136', 'K_8'),
(896, 'Văn Quỳnh Hương', '8.110', 'K_8'),
(202, 'Vũ Thị Huệ', '6.192', 'K_5'),
(303, 'Đặng Tiến Đông', 9.556, 'K_6');

INSERT INTO SinhVien (masv, hotensv, makhoa, namsinh, quequan) VALUES
(7838, 'Nguyễn Thị Phương Anh', 'K_8', 1997, 'Hà Nội'),
(1316, 'Lê Văn Sơn', 'K_1', 1995, 'Nam Định'),
(9707, 'Trần Đặng Huyền Anh', 'K_9', 1998, 'Tuyên Quang'),
(9035, 'Đỗ Chí Dũng', 'K_10', 1998, 'Bắc Ninh'),
(3488, 'Bùi Ngân Hà', 'K_3', 1997, 'Hà Nam'),
(1219, 'Trần Phương Anh', 'K_7', 1995, 'Hà Nội'),
(8470, 'Kiều Thị Uyên Linh', 'K_10', 1995, 'Hải Dương'),
(7591, 'Nguyễn Diệu Linh', 'K_3', 1996, 'Hải Phòng'),
(8402, 'Đặng Minh Đăng', 'K_5', 1996, 'Hưng Yên'),
(2272, 'Nguyễn Thùy Linh', 'K_7', 1995, 'Thái Bình'),
(8730, 'Trần Minh Đức', 'K_1', 1998, 'Hà Nội');

INSERT INTO DeTai (madt, tendt, kinhphi, NoiThucTap) VALUES
('71178', 'DẠY HỌC TÍCH HỢP CÔNG NGHỆ THÔNG TIN Ở TRƯỜNG THPT', 800000, 'Hải Dương'),
('56472', 'VẤN ĐỀ LÀM VIỆC NHÓM CỦA HỌC SINH THPT', 400000, 'Ninh Bình'),
('60356', 'E LEARNING, CƠ HỘI VÀ THÁCH THỨC TRONG BỐI CẢNH HIỆN NAY', 500000, 'Nam Định'),
('89531', 'DẠY VÀ HỌC HIỆU QUẢ MÔN TOÁN THPT THÔNG QUA TÀI LIỆU BIÊN SOẠN TRƯỚC', 300000, 'Hà Nội'),
('72924', 'NHỮNG KHÓ KHĂN VỀ TÂM LÍ CỦA HỌC SINH THPT', 200000, 'Hưng Yên'),
('45040', 'TÍNH TỰ GIÁC TRONG HỌC TẬP CỦA HỌC SINH TRUNG HỌC PHỔ THÔNG', 300000, 'Hải Dương'),
('10720', 'NGHIÊN CỨU KHÓ KHĂN TÂM LÝ TRONG HOẠT ĐỘNG HỌC TẬP CỦA SINH VIÊN NĂM NHẤT', 400000, 'Ninh Bình'),
('67521', 'CÁC YẾU TỐ ẢNH HƯỞNG ĐẾN KẾT QUẢ HỌC TẬP', 900000, 'Vĩnh Phúc'),
('44476', 'SỰ ẢNH HƯỞNG CỦA GIA ĐÌNH ĐẾN TÌNH HÌNH HỌC TẬP CỦA HỌC SINH', 1000000, 'Hà Nội'),
('73322', 'ĐỊNH HƯỚNG NGHỀ NGHIỆP CỦA HỌC SINH', 100000, 'Nam Định');

INSERT INTO HuongDan (masv, madt, magv, ketqua) VALUES
(2272, 71178, 935, 8.5),
(7591, 89531, 935, null),
(1219, 67521, 300, 9.75),
(1316, 45040, 970, 8.5),
(9035, 44476, 896, 7.5),
(9707, 44476, 970, 6),
(8470, 44476, 202, 2),
(7838, 45040, 471, 0),
(8402, 89531, 935, 4),
(3488, 73322, 471, 8.5);

##Câu 2
SELECT 
    g.magv, g.hotengv, k.tenkhoa, k.makhoa
FROM
    giangvien g
        JOIN
    khoa k ON g.makhoa = k.makhoa
ORDER BY tenkhoa;

##Câu 3
SELECT 
    g.magv, g.hotengv, k.tenkhoa
FROM
    giangvien g
        JOIN
    khoa k ON g.makhoa = k.makhoa
WHERE
    tenkhoa IN ('DIA LY' , 'QLTN');

##Câu 4
SELECT 
    k.makhoa, k.tenkhoa, COUNT(masv) AS 'Số sinh viên'
FROM
    khoa k
        JOIN
    sinhvien s ON k.makhoa = s.makhoa
WHERE
    tenkhoa = 'CONG NGHE SINH HOC';

##Câu 5
SELECT 
    s.masv, s.hotensv, (YEAR(NOW()) - namsinh) AS 'Tuổi'
FROM
    sinhvien s
        JOIN
    khoa k ON s.makhoa = k.makhoa
WHERE
    tenkhoa = 'TOAN';

##Câu 6
SELECT 
    k.makhoa, k.tenkhoa, COUNT(masv) AS 'Số sinh viên'
FROM
    khoa k
        JOIN
    sinhvien s ON k.makhoa = s.makhoa
WHERE
    tenkhoa = 'TOAN';
    
##Câu 7
SELECT 
    s.masv, s.hotensv, s.makhoa, s.namsinh, s.quequan
FROM
    sinhvien s
        LEFT JOIN
    huongdan h ON s.masv = h.masv
WHERE
    madt IS NULL;

##Câu 8
SELECT 
    k.makhoa, k.tenkhoa, COUNT(magv) AS 'Số giảng viên'
FROM
    khoa k
        LEFT JOIN
    giangvien g ON k.makhoa = g.makhoa
GROUP BY makhoa
ORDER BY makhoa;

##Câu 9
SELECT 
    k.tenkhoa, k.dienthoai
FROM
    khoa k
        JOIN
    sinhvien s ON k.makhoa = s.makhoa
WHERE
    hotensv = 'Lê Văn Sơn';

##Câu 10
SELECT 
    d.madt, d.tendt
FROM
    huongdan h
        JOIN
    detai d ON h.madt = d.madt
        JOIN
    giangvien g ON h.magv = g.magv
WHERE
    hotengv = 'Trần Sơn';

##Câu 11
SELECT 
    d.tendt, d.madt
FROM
    detai d
        LEFT JOIN
    huongdan h ON h.madt = d.madt
WHERE
    h.masv IS NULL;
    
##Câu 12
SELECT 
    h.magv, g.hotengv, k.tenkhoa
FROM
    giangvien g
        JOIN
    huongdan h ON h.magv = g.magv
        JOIN
    khoa k ON k.makhoa = g.makhoa
GROUP BY h.magv
HAVING COUNT(h.madt) >= 3;

##Câu 13
SELECT 
	madt, tendt 
FROM 
	detai 
WHERE 
	kinhphi=(SELECT MAX(kinhphi) FROM detai);

##Câu 14
SELECT madt FROM huongdan WHERE madt=(SELECT COUNT(madt) >2 FROM huongdan);