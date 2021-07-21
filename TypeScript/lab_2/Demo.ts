import { Account, printInfAccount } from "./Account";
import { Department, printInfDepartment } from "./Department";
import { Position, printInfPosition } from "./Position";

// Khai báo
let dep1 = new Department(1, "Sale");
let dep2 = new Department(2, "Kỹ Thuật");
let dep3 = new Department(3, "Phó giám đốc");
let dep4 = new Department(4, "Tài chính");
let dep5 = new Department(5, "Bảo vệ");

console.log('----Thông tin phòng ban trên hệ thống----')
// In ra thông tin đối tượng vừa tạo
printInfDepartment(dep1);
printInfDepartment(dep2);
printInfDepartment(dep3);
printInfDepartment(dep4);
printInfDepartment(dep5);

let pos1 = new Position(1, "Dev");
let pos2 = new Position(2, "Test");
let pos3 = new Position(3, "Scrum_Master");
let pos4 = new Position(4, "PM");

printInfPosition(pos1);
printInfPosition(pos2);
printInfPosition(pos3);
printInfPosition(pos4);

let date: Date = new Date("2021-07-13");
let acc1 = new Account(1, "phamminhtuan1@gmail.com", "phamminhtuan1", "pham minh tuan", dep1, pos1, date);
let acc2 = new Account(2, "phamminhtuan2@gmail.com", "phamminhtuan2", "tuan minh pham", dep2, pos2, date);
let acc3 = new Account(3, "phamminhtuan3@gmail.com", "phamminhtuan3", "pham tuan minh", dep3, pos3, date);
let acc4 = new Account(4, "phamminhtuan4@gmail.com", "phamminhtuan4", "pham minh minh", dep4, pos4, date);
let acc5 = new Account(5, "phamminhtuan5@gmail.com", "phamminhtuan5", "pham tuan tuan", dep5, pos1, date);

printInfAccount(acc1);
printInfAccount(acc2);
printInfAccount(acc3);
printInfAccount(acc4);
printInfAccount(acc5);