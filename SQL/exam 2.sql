DROP DATABASE IF EXISTS testing_exam_2;
CREATE DATABASE IF NOT EXISTS testing_exam_2;
USE testing_exam_2;

DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department
(
	department_id				INT(10) AUTO_INCREMENT PRIMARY KEY,
    department_name				ENUM('Admin', 'HR', 'IT', 'Delivery'),
    `description`				TEXT DEFAULT NULL,
    created_at					DATETIME,
    updated_at					DATETIME
);

insert into department (department_id, department_name, description, created_at, updated_at) values (1, 'Admin', null, '2020/01/18', '2020/06/13');
insert into department (department_id, department_name, description, created_at, updated_at) values (2, 'HR', null, '2019/12/09', '2020/12/12');
insert into department (department_id, department_name, description, created_at, updated_at) values (3, 'IT', null, '2018/06/20', '2021/02/03');
insert into department (department_id, department_name, description, created_at, updated_at) values (4, 'Delivery', null, '2019/10/15', '2020/04/30');

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
	user_id						INT(10) AUTO_INCREMENT PRIMARY KEY,
    first_name					VARCHAR(30),
    last_name					VARCHAR(30),
    email						VARCHAR(100),
    phone						VARCHAR(20),
    employee_id					VARCHAR(20),
    avatar						TEXT,
    department_id				INT(10),
    gender						VARCHAR(20),
    age							INT(3),
    created_at					DATETIME,
    updated_at					DATETIME,
    FOREIGN KEY(department_id) REFERENCES department(department_id)
);

insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (1, 'Antonio', 'Rawling', 'arawling0@boston.com', '280-193-9230', '630-26-745', 'https://robohash.org/quibusdamexpeditased.jpg?size=50x50&set=set1', 1, 'Non-binary', 25, '2019/07/12', '2021/03/09');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (2, 'Latrena', 'Kohlerman', 'lkohlerman1@ted.com', '733-462-1043', '265-91-890', 'https://robohash.org/aliasquidemoptio.jpg?size=50x50&set=set1', 3, 'Genderqueer', 21, '2019/12/22', '2021/03/15');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (3, 'Uriel', 'Matfield', 'umatfield2@msn.com', '533-288-0012', '437-05-247', 'https://robohash.org/quiinnatus.jpg?size=50x50&set=set1', 4, 'Polygender', 26, '2019/07/25', '2020/11/10');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (4, 'Lotte', 'Radcliffe', 'lradcliffe3@mozilla.org', '655-549-7855', '674-23-175', 'https://robohash.org/quiaetlaboriosam.jpg?size=50x50&set=set1', 3, 'Agender', 26, '2019/09/06', '2020/08/21');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (5, 'Filbert', 'Verny', 'fverny4@indiatimes.com', '364-983-8265', '195-83-600', 'https://robohash.org/dictatemporeet.jpg?size=50x50&set=set1', 2, 'Non-binary', 27, '2018/12/25', '2021/02/13');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (6, 'Cory', 'Damper', 'cdamper5@deliciousdays.com', '118-440-9806', '808-31-062', 'https://robohash.org/estmolestiaenecessitatibus.jpg?size=50x50&set=set1', 3, 'Female', 28, '2018/08/12', '2020/10/30');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (7, 'Royce', 'Tonkin', 'rtonkin6@gmpg.org', '157-849-9311', '379-05-664', 'https://robohash.org/quaeratquisaut.jpg?size=50x50&set=set1', 4, 'Bigender', 29, '2019/07/29', '2020/12/01');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (8, 'Sallie', 'Buckam', 'sbuckam7@shinystat.com', '198-216-5610', '865-09-539', 'https://robohash.org/autrecusandaedicta.jpg?size=50x50&set=set1', 2, 'Genderqueer', 25, '2018/12/26', '2021/01/02');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (9, 'Cahra', 'Durham', 'cdurham8@unblog.fr', '765-176-9690', '544-96-637', 'https://robohash.org/enimarchitectodolore.jpg?size=50x50&set=set1', 1, 'Male', 28, '2019/04/23', '2020/10/30');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (10, 'Charmian', 'Dilley', 'cdilley9@simplemachines.org', '259-587-684', '375-85-3024', 'https://robohash.org/cumquiaut.jpg?size=50x50&set=set1', 1, 'Male', 21, '2018/06/29', '2020/09/17');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (11, 'Candy', 'Boick', 'cboicka@pcworld.com', '893-121-9668', '448-48-010', 'https://robohash.org/odioperferendisincidunt.jpg?size=50x50&set=set1', 2, 'Bigender', 30, '2018/08/04', '2020/09/24');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (12, 'Hayley', 'Entres', 'hentresb@blogtalkradio.com', '473-539-2929', '279-05-345', 'https://robohash.org/temporibusevenietquis.jpg?size=50x50&set=set1', 1, 'Genderqueer', 20, '2018/09/16', '2021/04/08');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (13, 'Patton', 'Lount', 'plountc@mediafire.com', '509-428-6977', '348-51-872', 'https://robohash.org/temporibussitnon.jpg?size=50x50&set=set1', 1, 'Genderfluid', 28, '2018/05/01', '2020/09/24');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (14, 'Federico', 'Beecham', 'fbeechamd@google.com.br', '915-369-1957', '778-71-233', 'https://robohash.org/quierrortenetur.jpg?size=50x50&set=set1', 1, 'Female', 21, '2019/10/29', '2020/11/05');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (15, 'Josh', 'Peiro', 'jpeiroe@google.es', '486-751-3982', '223-09-325', 'https://robohash.org/exdelectuset.jpg?size=50x50&set=set1', 3, 'Female', 25, '2019/02/17', '2020/10/31');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (16, 'Giustino', 'Icke', 'gickef@oracle.com', '294-923-7749', '484-86-578', 'https://robohash.org/consequuntursintest.jpg?size=50x50&set=set1', 1, 'Genderqueer', 28, '2018/10/03', '2020/10/07');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (17, 'Clemence', 'Moulding', 'cmouldingg@ebay.com', '172-374-6216', '150-94-103', 'https://robohash.org/quivelaut.jpg?size=50x50&set=set1', 2, 'Bigender', 27, '2018/10/19', '2020/10/29');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (18, 'Melloney', 'Topping', 'mtoppingh@ovh.net', '145-540-9475', '626-71-826', 'https://robohash.org/utquaedicta.jpg?size=50x50&set=set1', 2, 'Non-binary', 25, '2019/01/18', '2020/11/15');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (19, 'Alvin', 'McKernan', 'amckernani@nih.gov', '679-447-2822', '524-03-694', 'https://robohash.org/nostrumetsoluta.jpg?size=50x50&set=set1', 1, 'Male', 28, '2019/10/19', '2020/12/13');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (20, 'Benson', 'Sheppey', 'bsheppeyj@sitemeter.com', '704-158-7618', '762-74-118', 'https://robohash.org/oditvoluptasvoluptates.jpg?size=50x50&set=set1', 1, 'Female', 28, '2019/08/24', '2020/11/09');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (21, 'Toby', 'Golda', 'tgoldak@reference.com', '601-697-0854', '588-13-428', 'https://robohash.org/oditpossimusomnis.jpg?size=50x50&set=set1', 3, 'Female', 24, '2019/08/23', '2020/12/07');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (22, 'Joella', 'Lannin', 'jlanninl@vkontakte.ru', '259-297-2013', '603-40-150', 'https://robohash.org/rationepraesentiumab.jpg?size=50x50&set=set1', 4, 'Female', 28, '2018/11/25', '2020/05/20');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (23, 'Eziechiele', 'Newcom', 'enewcomm@walmart.com', '408-865-2918', '247-46-952', 'https://robohash.org/voluptatemutenim.jpg?size=50x50&set=set1', 2, 'Male', 27, '2018/08/12', '2020/10/11');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (24, 'Guglielma', 'Faers', 'gfaersn@businesswire.com', '719-301-3374', '893-55-117', 'https://robohash.org/natusinventoreanimi.jpg?size=50x50&set=set1', 4, 'Female', 21, '2019/09/30', '2020/08/01');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (25, 'Roxanna', 'Slora', 'rslorao@uiuc.edu', '509-545-7519', '167-19-938', 'https://robohash.org/sequicommodinulla.jpg?size=50x50&set=set1', 1, 'Male', 23, '2020/02/23', '2020/11/28');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (26, 'Mahalia', 'Layfield', 'mlayfieldp@senate.gov', '433-964-2951', '384-10-680', 'https://robohash.org/doloremcupiditatenon.jpg?size=50x50&set=set1', 4, 'Non-binary', 23, '2019/01/16', '2020/11/08');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (27, 'Guilbert', 'Gronou', 'ggronouq@facebook.com', '437-697-6560', '494-09-680', 'https://robohash.org/laboreetdebitis.jpg?size=50x50&set=set1', 1, 'Non-binary', 21, '2019/06/30', '2020/06/03');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (28, 'Abdel', 'Marquet', 'amarquetr@mail.ru', '681-236-8090', '423-75-348', 'https://robohash.org/exercitationemsedquae.jpg?size=50x50&set=set1', 1, 'Female', 28, '2019/08/16', '2020/09/29');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (29, 'Art', 'Packington', 'apackingtons@salon.com', '817-559-1567', '459-71-977', 'https://robohash.org/dictaexercitationemtotam.jpg?size=50x50&set=set1', 2, 'Male', 26, '2019/08/30', '2020/07/14');
insert into users (user_id, first_name, last_name, email, phone, employee_id, avatar, department_id, gender, age, created_at, updated_at) values (30, 'Lilllie', 'Chessor', 'lchessort@youku.com', '562-103-1221', '801-33-874', 'https://robohash.org/aminimasit.jpg?size=50x50&set=set1', 1, 'Non-binary', 21, '2020/02/15', '2021/02/12');

DROP TABLE IF EXISTS user_deparment;
CREATE TABLE IF NOT EXISTS user_department
(
	user_department_id			INT(10) AUTO_INCREMENT PRIMARY KEY,
    user_id						INT(10),
    department_id				INT(10),
    start_date					DATE,
    end_date					DATE,
    created_at					DATETIME,
    updated_at					DATETIME,
    FOREIGN KEY (user_id) REFERENCES users( user_id),
    FOREIGN KEY (department_id) REFERENCES department( department_id)
);

insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (1, 9, 3, '2019/01/19', '2020/12/27', '2020/03/28', '2021/02/24');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (2, 9, 1, '2019/08/13', '2021/02/16', '2018/10/23', '2021/03/19');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (3, 17, 4, '2018/08/05', '2020/10/15', '2019/08/01', '2020/04/17');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (4, 9, 3, '2019/07/09', '2021/01/14', '2018/10/28', '2020/09/30');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (5, 10, 2, '2019/09/25', '2020/06/15', '2019/02/02', '2020/08/18');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (6, 15, 4, '2020/01/11', '2020/06/17', '2018/07/23', '2020/10/16');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (7, 4, 1, '2018/06/16', '2021/03/14', '2019/04/05', '2020/12/22');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (8, 18, 2, '2018/07/27', '2021/01/15', '2018/10/24', '2020/10/17');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (9, 22, 4, '2018/07/09', '2021/02/12', '2019/08/22', '2020/12/07');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (10, 21, 3, '2019/11/07', '2021/01/18', '2019/01/10', '2020/11/13');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (11, 18, 3, '2019/10/30', '2020/08/13', '2019/06/29', '2021/01/11');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (12, 17, 1, '2018/08/23', '2020/08/08', '2019/05/18', '2020/12/21');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (13, 24, 2, '2019/11/12', '2020/07/05', '2018/10/04', '2020/06/17');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (14, 14, 1, '2019/12/01', '2020/04/22', '2019/11/10', '2020/10/13');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (15, 30, 2, '2018/07/13', '2021/03/10', '2019/07/02', '2021/01/23');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (16, 7, 2, '2019/11/21', '2020/11/30', '2018/05/09', '2021/01/31');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (17, 21, 1, '2018/12/12', '2021/04/05', '2019/11/11', '2021/02/28');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (18, 30, 3, '2019/04/28', '2021/02/01', '2019/02/06', '2021/04/06');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (19, 22, 1, '2018/05/05', '2020/04/21', '2019/05/04', '2020/12/23');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (20, 6, 1, '2020/02/17', '2020/10/31', '2019/04/14', '2021/02/18');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (21, 21, 4, '2019/06/22', '2020/08/03', '2018/07/10', '2020/05/24');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (22, 28, 4, '2018/06/26', '2020/11/23', '2018/08/14', '2020/08/21');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (23, 10, 3, '2018/05/22', '2020/07/06', '2018/08/04', '2020/10/05');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (24, 30, 4, '2018/06/05', '2020/09/10', '2019/04/02', '2020/05/22');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (25, 21, 1, '2018/11/19', '2021/01/06', '2019/11/03', '2020/12/17');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (26, 7, 3, '2018/06/13', '2021/03/04', '2019/10/30', '2020/04/18');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (27, 18, 3, '2018/08/28', '2020/08/26', '2020/04/02', '2020/09/17');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (28, 5, 3, '2018/06/13', '2020/06/15', '2018/07/14', '2020/06/12');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (29, 25, 4, '2019/04/17', '2021/01/10', '2019/02/13', '2020/08/25');
insert into user_department (user_department_id, user_id, department_id, start_date, end_date, created_at, updated_at) values (30, 21, 4, '2018/12/07', '2021/01/29', '2019/03/14', '2021/03/14');

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role`
(
	role_id						INT(10) AUTO_INCREMENT PRIMARY KEY,
    role_name					ENUM( 'giám đốc', 'trưởng phòng', 'phó phòng','nhân viên', 'CTV'),
    created_at					DATETIME,
    updated_at					DATETIME
);

insert into `role` (role_id, role_name, created_at, updated_at) values (1, 'giám đốc', '2019/10/28', '2021/01/08');
insert into `role` (role_id, role_name, created_at, updated_at) values (2, 'trưởng phòng', '2019/07/29', '2020/04/20');
insert into `role` (role_id, role_name, created_at, updated_at) values (3, 'phó phòng', '2018/10/22', '2021/02/19');
insert into `role` (role_id, role_name, created_at, updated_at) values (4, 'nhân viên', '2018/07/08', '2020/11/08');
insert into `role` (role_id, role_name, created_at, updated_at) values (5, 'CTV', '2018/05/10', '2021/04/15');

DROP TABLE IF EXISTS user_role;
CREATE TABLE IF NOT EXISTS user_role
(
	user_role_id				INT(10) AUTO_INCREMENT PRIMARY KEY,
    user_department_id			INT(10),
    role_id						INT(10),
    start_date					DATE,
    end_date					DATE,
    created_at					DATETIME,
    updated_at					DATETIME,
	FOREIGN KEY (user_department_id) REFERENCES user_department( user_department_id),
	FOREIGN KEY (role_id) REFERENCES `role`( role_id)
);

insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (1, 20, 3, '2020/03/14', null, '2019/06/04', '2021/01/13');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (2, 10, 2, '2019/10/05', '2020/07/12', '2019/07/29', '2021/03/20');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (3, 20, 4, '2018/10/25', '2020/12/25', '2020/03/15', '2020/10/09');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (4, 19, 5, '2019/10/23', null, '2018/05/15', '2021/02/21');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (5, 5, 1, '2018/10/19', '2020/10/28', '2019/10/27', '2020/09/15');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (6, 5, 1, '2018/09/04', '2020/06/10', '2018/05/08', '2020/07/05');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (7, 11, 1, '2019/02/16', '2020/08/15', '2019/08/29', '2020/06/12');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (8, 10, 3, '2018/08/09', '2020/12/06', '2018/04/27', '2021/02/22');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (9, 20, 2, '2019/12/20', '2020/06/27', '2018/04/19', '2020/12/25');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (10, 11, 5, '2020/01/21', null, '2020/01/07', '2020/05/28');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (11, 7, 5, '2018/11/19', '2020/10/22', '2020/01/19', '2020/05/28');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (12, 14, 4, '2020/03/14', '2020/11/02', '2019/08/23', '2020/06/22');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (13, 20, 3, '2018/06/09', '2020/06/06', '2018/12/14', '2020/07/06');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (14, 3, 1, '2019/08/08', '2021/02/21', '2018/08/01', '2020/10/02');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (15, 12, 4, '2018/06/25', '2020/11/23', '2019/01/27', '2020/11/09');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (16, 17, 2, '2019/10/29', '2021/02/20', '2018/10/01', '2020/08/28');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (17, 21, 5, '2020/01/22', '2021/01/18', '2019/05/14', '2020/11/21');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (18, 29, 1, '2018/05/11', '2020/09/08', '2018/12/24', '2020/08/28');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (19, 21, 4, '2018/04/26', '2021/01/20', '2018/09/12', '2020/05/25');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (20, 24, 4, '2019/10/26', '2020/05/07', '2019/09/21', '2020/10/12');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (21, 7, 5, '2018/06/29', null, '2018/08/04', '2020/10/08');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (22, 19, 1, '2018/08/23', null, '2018/06/26', '2020/10/03');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (23, 5, 5, '2018/11/03', '2020/12/08', '2020/01/06', '2020/08/13');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (24, 19, 1, '2019/12/26', '2020/10/13', '2019/09/24', '2020/07/12');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (25, 13, 5, '2019/06/23', '2020/09/19', '2018/04/23', '2020/10/16');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (26, 1, 5, '2019/06/25', '2021/03/03', '2019/08/14', '2020/06/23');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (27, 22, 5, '2020/02/19', '2020/05/03', '2019/04/13', '2021/04/09');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (28, 5, 5, '2019/08/22', '2020/11/25', '2019/02/27', '2020/09/25');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (29, 21, 2, '2019/10/09', '2020/10/03', '2019/04/21', '2020/12/30');
insert into user_role (user_role_id, user_department_id, role_id, start_date, end_date, created_at, updated_at) values (30, 19, 5, '2018/10/29', '2021/03/28', '2019/09/22', '2021/01/09');

DROP TABLE IF EXISTS salary_detail_type;
CREATE TABLE IF NOT EXISTS salary_detail_type
(
	salary_detail_type_id		INT(10) AUTO_INCREMENT PRIMARY KEY,
    `name`						ENUM('lương cứng', 'phụ cấp', 'thưởng', 'thuế TNCN','BHXH'),
    created_at					DATETIME,
    updated_at					DATETIME
);

insert into salary_detail_type (salary_detail_type_id, `name`, created_at, updated_at) values (1,'lương cứng', '2018/06/19', '2020/11/01');
insert into salary_detail_type (salary_detail_type_id, `name`, created_at, updated_at) values (2,'phụ cấp', '2019/02/04', '2021/01/23');
insert into salary_detail_type (salary_detail_type_id, `name`, created_at, updated_at) values (3, 'thưởng', '2019/05/20', '2020/07/09');
insert into salary_detail_type (salary_detail_type_id, `name`, created_at, updated_at) values (4, 'thuế TNCN', '2020/03/04', '2020/09/26');
insert into salary_detail_type (salary_detail_type_id, `name`, created_at, updated_at) values (5, 'BHXH', '2018/05/19', '2020/11/29');

DROP TABLE IF EXISTS salary;
CREATE TABLE IF NOT EXISTS salary
(
	salary_id					INT(10) AUTO_INCREMENT PRIMARY KEY,
    user_role_id				INT(10),
    total_salary				DOUBLE(12,2),
    `month`						VARCHAR(2),
    `year`						VARCHAR(4),
    created_at					DATETIME,
    updated_at					DATETIME,
	FOREIGN KEY (user_role_id) REFERENCES user_role( user_role_id)
);

DROP TABLE IF EXISTS salary_detail;
CREATE TABLE IF NOT EXISTS salary_detail
(
	salary_detail_id			INT(10) AUTO_INCREMENT PRIMARY KEY,
    amount						DOUBLE(12,2),
    salary_id					INT(10),
    salary_detail_type_id		INT(10),
    operation					ENUM('1', '2')

);

insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (1, 13359525.49, 30, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (2, 11487468.44, 29, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (3, 11717678.89, 28, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (4, 10305679.51, 27, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (5, 18938920.19, 26, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (6, 17644076.59, 25, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (7, 16937157.21, 24, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (8, 11347920.6, 23, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (9, 14677155.6, 22, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (10, 16251746.52, 21, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (11, 10489246.42, 20, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (12, 14111379.53, 19, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (13, 13419440.37, 18, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (14, 15385361.39, 17, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (15, 18636535.5, 16, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (16, 11994236.94, 15, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (17, 15631558.45, 14, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (18, 16601796.65, 13, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (19, 15486715.76, 12, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (20, 17131810.11, 11, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (21, 11267917.7, 10, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (22, 11669682.4, 9, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (23, 18857499.26, 8, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (24, 14051606.56, 7, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (25, 14831954.21, 6, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (26, 17850025.41, 5, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (27, 19019301.82, 4, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (28, 10391011.08, 3, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (29, 15070261.81, 2, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (30, 17349840.08, 1, 1, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (31, 16158919.74, 1, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (32, 13314042.04, 2, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (33, 18989388.59, 3, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (34, 10243608.83, 4, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (35, 14587478.49, 5, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (36, 12272388.68, 6, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (37, 18141641.51, 7, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (38, 19250473.53, 8, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (39, 10896121.41, 9, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (40, 16069568.35, 10, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (41, 16819162.6, 11, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (42, 14739420.54, 12, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (43, 16678374.04, 13, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (44, 18978034.35, 14, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (45, 19413895.74, 15, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (46, 10252576.96, 16, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (47, 12300178.49, 17, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (48, 18298768.72, 18, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (49, 18938606.08, 19, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (50, 16915982.83, 20, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (51, 11639582.68, 21, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (52, 18284974.25, 22, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (53, 12982471.67, 23, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (54, 10750773.95, 24, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (55, 10787010.35, 25, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (56, 18739724.47, 26, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (57, 19104421.64, 27, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (58, 15873138.01, 28, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (59, 12238578.02, 29, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (60, 19807960.17, 30, 2, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (61, 17756193.25, 1, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (62, 13313584.66, 2, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (63, 10913887.29, 3, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (64, 16953078.17, 4, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (65, 10159320.55, 5, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (66, 10896130.55, 6, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (67, 18082327.97, 7, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (68, 15963602.73, 8, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (69, 12285053.91, 9, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (70, 12199988.57, 10, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (71, 16068284.56, 11, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (72, 16697788.41, 12, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (73, 13353805.05, 13, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (74, 17690115.52, 14, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (75, 19902845.84, 15, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (76, 11720147.95, 16, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (77, 16798016.75, 17, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (78, 11933853.02, 18, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (79, 12185798.39, 19, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (80, 17989935.34, 20, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (81, 13104461.94, 21, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (82, 18539482.35, 22, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (83, 15348129.44, 23, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (84, 15503015.65, 24, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (85, 13449589.16, 25, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (86, 14674717.59, 26, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (87, 14218989.97, 27, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (88, 13791896.31, 28, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (89, 14520235.99, 29, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (90, 13945880.27, 30, 3, 1);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (91, 16642406.05, 1, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (92, 19506362.59, 2, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (93, 12182553.25, 3, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (94, 19278315.17, 4, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (95, 17983966.7, 5, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (96, 16886530.24, 6, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (97, 17934759.49, 7, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (98, 13573070.76, 8, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (99, 16438105.35, 9, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (100, 14743608.95, 10, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (101, 12637558.6, 11, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (102, 10732103.62, 12, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (103, 19837767.22, 13, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (104, 17987212.3, 14, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (105, 17530999.21, 15, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (106, 14538294.9, 16, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (107, 16518743.78, 17, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (108, 16672448.96, 18, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (109, 14819366.9, 19, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (110, 12180337.29, 20, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (111, 17384042.33, 21, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (112, 16174554.15, 22, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (113, 16572401.21, 23, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (114, 13129570.04, 24, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (115, 11478811.35, 25, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (116, 19857393.24, 26, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (117, 15436653.21, 27, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (118, 17458072.77, 28, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (119, 18988700.1, 29, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (120, 17198129.28, 30, 4, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (121, 11680726.99, 1, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (122, 14029972.52, 2, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (123, 13954963.71, 3, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (124, 15798079.42, 4, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (125, 17103644.19, 5, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (126, 13558431.79, 6, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (127, 16872797.38, 7, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (128, 19122408.53, 8, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (129, 16627844.81, 9, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (130, 11976556.0, 10, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (131, 16612562.64, 11, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (132, 19835481.02, 12, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (133, 19674931.98, 13, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (134, 11991463.66, 14, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (135, 14717900.84, 15, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (136, 19180013.01, 16, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (137, 16005524.55, 17, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (138, 18101106.28, 18, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (139, 14986951.26, 19, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (140, 13474650.29, 20, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (141, 13783653.47, 21, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (142, 15867668.7, 22, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (143, 17640337.44, 23, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (144, 19301718.42, 24, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (145, 15697041.45, 25, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (146, 12876836.31, 26, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (147, 14136364.5, 27, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (148, 13367413.23, 28, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (149, 12528244.97, 29, 5, 2);
insert into salary_detail (salary_detail_id, amount, salary_id, salary_detail_type_id, operation) values (150, 16865463.84, 30, 5, 2);


insert into salary (salary_id, user_role_id, total_salary, `month`, `year`, created_at, updated_at) values (1, 1, null, 5, 2021, '2020/02/08', '2021/02/23');
insert into salary (salary_id, user_role_id, total_salary, `month`, `year`, created_at, updated_at) values (2, 2, null, 8, 2020, '2018/10/06', '2020/07/24');
insert into salary (salary_id, user_role_id, total_salary, `month`, `year`, created_at, updated_at) values (3, 3, null, 9, 2020, '2020/03/16', '2020/12/13');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (4, 4, null, 6, 2021, '2018/10/28', '2020/08/27');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (5, 5, null, 11, 2020, '2018/12/30', '2021/02/19');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (6, 6, null, 5, 2020, '2019/11/09', '2020/06/19');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (7, 7, null, 3, 2020, '2018/11/14', '2020/09/17');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (8, 8, null, 8, 2020, '2020/01/27', '2020/12/13');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (9, 9, null, 4, 2021, '2019/07/01', '2020/09/18');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (10, 10, null, 9, 2021, '2020/03/18', '2021/01/24');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (11, 11, null, 7, 2020, '2018/09/13', '2020/09/09');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (12, 12, null, 2, 2021, '2018/12/06', '2020/10/07');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (13, 13, null, 2, 2020, '2020/01/30', '2021/03/24');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (14, 14, null, 2, 2021, '2018/12/10', '2020/10/02');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (15, 15, null, 12, 2020, '2018/05/17', '2020/07/16');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (16, 16, null, 2, 2021, '2019/05/30', '2020/11/27');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (17, 17, null, 2, 2021, '2019/03/05', '2020/07/18');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (18, 18, null, 8, 2020, '2018/10/12', '2021/01/15');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (19, 19, null, 12, 2020, '2018/07/06', '2020/06/06');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (20, 20, null, 9, 2020, '2018/08/05', '2021/02/27');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (21, 21, null, 3, 2020, '2019/06/27', '2021/04/02');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (22, 22, null, 4, 2020, '2019/02/03', '2020/07/24');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (23, 23, null, 2, 2020, '2020/01/31', '2020/12/19');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (24, 24, null, 9, 2020, '2019/09/04', '2020/11/07');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (25, 25, null, 7, 2020, '2018/07/30', '2020/12/13');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (26, 26, null, 8, 2021, '2018/09/17', '2020/12/02');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (27, 27, null, 9, 2020, '2020/03/18', '2020/09/28');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (28, 28, null, 1, 2021, '2018/12/02', '2021/02/20');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (29, 29, null, 1, 2020, '2019/11/07', '2020/05/28');
insert into salary (salary_id, user_role_id, total_salary,`month`, `year`, created_at, updated_at) values (30, 30, null, 7, 2020, '2020/04/09', '2020/06/02');

WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=1 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=1 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =1;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=2 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=2 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =2;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=3 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=3 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =3;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=4 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=4 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =4;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=5 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=5 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =5;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=6 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=6 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =6;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=7 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=7 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =7;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=8 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=8 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =8;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=9 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=9 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =9;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=10 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=10 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =10;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=11 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=11 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =11;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=12 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=12 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =12;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=13 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=13 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =13;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=14 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=14 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =14;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=15 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=15 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =15;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=16 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=16 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =16;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=17 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=17 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =17;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=18 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=18 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =18;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=19 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=19 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =19;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=20 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=20 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =20;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=21 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=21 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =21;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=22 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=22 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =22;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=23 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=23 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =23;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=24 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=24 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =24;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=25 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=25 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =25;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=26 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=26 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =26;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=27 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=27 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =27;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=28 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=28 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =28;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=29 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=29 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary=(SELECT luong FROM bangluong) WHERE salary_id =29;
WITH bangluong (luong) AS (
SELECT (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=30 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=30 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)
)
UPDATE salary SET total_salary = (SELECT luong FROM bangluong) WHERE salary_id =30;


##cau 2
#a)
SELECT total_salary FROM salary WHERE user_role_id=1 AND `month`=5;
#b)
SELECT d.department_id, department_name, user_id, first_name, last_name, total_salary FROM department d INNER JOIN user_department USING(department_id) INNER JOIN users USING(user_id) INNER JOIN user_role USING(user_department_id) INNER JOIN salary USING(user_role_id) WHERE department_name='Admin' AND `month`=5 ORDER BY total_salary DESC;
#c)

DROP VIEW IF EXISTS salary_total_1; 
CREATE VIEW salary_total_1 AS
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=1 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=1 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) as bang1
UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=2 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=2 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang2 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=3 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=3 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang3 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=4 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=4 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang4 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=5 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=5 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang5 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=6 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=6 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang6 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=7 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=7 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang7 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=8 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=8 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang8 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=9 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=9 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang9 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=10 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=10 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang10 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=11 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=11 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang11 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=12 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=12 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang12 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=13 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=13 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang13 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=14 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=14 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang14 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=15 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=15 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang15 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=16 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=16 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang16 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=17 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=17 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang17 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=18 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=18 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang18 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=19 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=19 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang19 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=20 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=20 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang20 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=21 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=21 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang21 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=22 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=22 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang22 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=23 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=23 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang23 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=24 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=24 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang24 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=25 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=25 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang25 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=26 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=26 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang26 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=27 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=27 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang27 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=28 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=28 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang28 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=29 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=29 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang29 UNION
SELECT * FROM (SELECT salary_id, (tong-hieu) AS luong FROM (SELECT SUM(amount) AS tong, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=30 AND salary_detail_type_id IN(1,2,3)) AS a1_salary) AS bangtong INNER JOIN (SELECT SUM(amount) AS hieu, salary_id FROM (SELECT * FROM salary_detail WHERE salary_id=30 AND salary_detail_type_id IN(4,5)) AS b_salary) AS banghieu USING(salary_id)) AS bang30;

DROP VIEW IF EXISTS salary_total_2;
CREATE VIEW salary_total_2 AS
SELECT salary_id, user_id, first_name, last_name, total_salary FROM users INNER JOIN user_department USING(user_id) INNER JOIN user_role USING(user_department_id) INNER JOIN salary USING(user_role_id);
SELECT * FROM salary_total_1 INNER JOIN salary_total_2 USING(salary_id) WHERE luong != total_salary;
#d)
SELECT department_id, department_name, SUM(total_salary) AS 'chi phi' FROM user_department INNER JOIN department USING(department_id) INNER JOIN user_role USING(user_department_id) INNER JOIN salary USING(user_role_id) WHERE `month`=5 AND `year`=2020 GROUP BY department_id;

#Cau 3
DROP PROCEDURE IF EXISTS luong_thang;
DELIMITER$$
CREATE PROCEDURE luong_thang(IN p_user_id 