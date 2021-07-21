import { Engineer } from "./Engineer";
import { Worker } from "./Worker";
import { Employee } from "./Employee";
import { Staff } from "./Staff";

let worker1 = new Worker("Worker1", 20, "Male", "HN", 10);
let worker2 = new Worker("Worker2", 22, "FeMale", "NĐ", 7);
let worker3 = new Worker("Worker3", 24, "Male", "HN", 8);
let Engineer1 = new Engineer("Engineer1", 20, "Male", "HN", "DEV");
let Engineer2 = new Engineer("Engineer2", 22, "FeMale", "NĐ", "TEST");
let Engineer3 = new Engineer("Engineer3", 24, "Male", "HN", "DEV");
let Employee1 = new Employee("Employee1", 20, "Male", "HN", "Task1");
let Employee2 = new Employee("Employee2", 22, "FeMale", "NĐ", "Task2");
let Employee3 = new Employee("Employee3", 24, "Male", "HN", "Task3");

let staffArray: Staff[];
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
// Cach 1

function printWorkerInfo(staffArray: Staff[]) {
  staffArray.forEach((element) => {
    if (element instanceof Worker) {
      element.printInforWorker();
    }
  });
}

function printEngineerInfo(staffArray: Staff[]) {
  staffArray.forEach((element) => {
    if (element instanceof Engineer) {
      element.printInforEngineer();
    }
  });
}
console.log("Thong tin Worker: ", printWorkerInfo(staffArray));
console.log("Thong tin Engineer: ", printEngineerInfo(staffArray));
//Cach 2: HOF
console.log("------ Demo sử dụng HOF Cách 2: ------------");
function printStaff(staffArray: Staff[], function_print) {
  return function_print(staffArray);
}
console.log("Sử dụng HOF để tin thông tin");

printStaff(staffArray, printWorkerInfo);

printStaff(staffArray, printEngineerInfo);
// Cach 3
console.log("----------In thông tin theo Cách 3-----------");
function printStaffArray(staffArray: Staff[], params) {
  staffArray.forEach((element) => {
    if (element instanceof params) {
      console.log("Thông tin:", element);
    }
  });
}
printStaffArray(staffArray, Worker);
printStaffArray(staffArray, Engineer);
