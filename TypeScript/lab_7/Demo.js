"use strict";
exports.__esModule = true;
var Engineer_1 = require("./Engineer");
var Worker_1 = require("./Worker");
var Employee_1 = require("./Employee");
// Tạo ra các đối tượng
var worker1 = new Worker_1.Worker("Worker1", 20, "Male", "HN", 10);
var worker2 = new Worker_1.Worker("Worker2", 22, "FeMale", "NĐ", 7);
var worker3 = new Worker_1.Worker("Worker3", 24, "Male", "HN", 8);
var Engineer1 = new Engineer_1.Engineer("Engineer1", 20, "Male", "HN", "DEV");
var Engineer2 = new Engineer_1.Engineer("Engineer2", 22, "FeMale", "NĐ", "TEST");
var Engineer3 = new Engineer_1.Engineer("Engineer3", 24, "Male", "HN", "DEV");
var Employee1 = new Employee_1.Employee("Employee1", 20, "Male", "HN", "Task1"); // Tạo mới 1 đối tượng Worker.
var Employee2 = new Employee_1.Employee("Employee2", 22, "FeMale", "NĐ", "Task2");
var Employee3 = new Employee_1.Employee("Employee3", 24, "Male", "HN", "Task3");
// Khai báo 1 mảng các staff, chứa các đối tượng phía trên vừa khai báo
var staffArray;
staffArray = [
    worker1,
    worker2,
    worker3,
    Engineer1,
    Engineer2,
    Engineer3,
    Employee1,
    Employee2,
    Employee3,
];
// CÁCH 1: Thực hiện gọi hàm bình thường.
// Viết hàm để in ra thông tin worker
function printWorkerInfo(staffArray) {
    staffArray.forEach(function (element) {
        if (element instanceof Worker_1.Worker) {
            element.printInforWorker();
        }
    });
}
// Viết hàm để in ra thông tin Engineer
function printEngineerInfo(staffArray) {
    staffArray.forEach(function (element) {
        if (element instanceof Engineer_1.Engineer) {
            element.printInforEngineer();
        }
    });
}
console.log("Thong tin Worker: ", printWorkerInfo(staffArray));
console.log("Thong tin Engineer: ", printEngineerInfo(staffArray));
// CÁCH 2: Sử dụng HOF, tham số đầu vào là 1 hàm, đầu ra trả ra 1 hàm.
console.log("------ Demo sử dụng HOF Cách 2: ------------");
function printStaff(staffArray, function_print) {
    return function_print(staffArray);
}
console.log("Sử dụng HOF để tin thông tin");
// In thông tin worker
printStaff(staffArray, printWorkerInfo);
// In thông tin Engineer
printStaff(staffArray, printEngineerInfo);
// CÁCH 3: Viết hàm giá trị truyền vào là 1 object
console.log("----------In thông tin theo Cách 3-----------");
function printStaffArray(staffArray, params) {
    staffArray.forEach(function (element) {
        if (element instanceof params) {
            console.log("Thông tin:", element);
        }
    });
}
printStaffArray(staffArray, Worker_1.Worker);
printStaffArray(staffArray, Engineer_1.Engineer);
