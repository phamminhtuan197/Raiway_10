"use strict";
exports.__esModule = true;
var CongNhan_1 = require("./CongNhan");
var KySu_1 = require("./KySu");
var NhanVien_1 = require("./NhanVien");
var cn1 = new CongNhan_1.CongNhan("tuan1", 20, "M", "Ha Noi", 10);
var cn2 = new CongNhan_1.CongNhan("tuan2", 21, "F", "Ha Nam", 9);
var cn3 = new CongNhan_1.CongNhan("tuan3", 22, "U", "Ha Tay", 8);
var cn4 = new CongNhan_1.CongNhan("tuan4", 23, "M", "TP.HCM", 7);
var cn5 = new CongNhan_1.CongNhan("tuan5", 24, "F", "Nam Dinh", 6);
console.log("------------------Demo Array Worker ------------------");
var workerArray;
workerArray = [cn1, cn2, cn3, cn4, cn5];
workerArray.forEach(function (element) {
    element.printInfCongNhan();
});
var ks1 = new KySu_1.KySu("kysu1", 20, "M", "Ha Noi", "DEV");
var ks2 = new KySu_1.KySu("kysu2", 21, "F", "Ha Nam", "TEST");
var ks3 = new KySu_1.KySu("kysu3", 22, "U", "Ha Tay", "PM");
var ks4 = new KySu_1.KySu("kysu4", 23, "M", "TP.HCM", "DEV");
var ks5 = new KySu_1.KySu("kysu5", 24, "F", "Nam Dinh", "HR");
var engineerSet = new Set();
engineerSet.add(ks1);
engineerSet.add(ks2);
engineerSet.add(ks3);
engineerSet.add(ks4);
engineerSet.add(ks5);
console.log("Tong so phan tu trong Set " + engineerSet.size);
console.log("Xoa 1 ptu trong Set " + engineerSet["delete"](ks1));
// In thong tin bang ForEach
engineerSet.forEach(function (element) {
    console.log(element);
});
var nv1 = new NhanVien_1.NhanVien("nhanvien1", 20, "M", "Ha Noi", "Task1");
var nv2 = new NhanVien_1.NhanVien("nhanvien2", 21, "F", "Ha Nam", "Task2");
var nv3 = new NhanVien_1.NhanVien("nhanvien3", 22, "U", "Ha Tay", "Task3");
var nv4 = new NhanVien_1.NhanVien("nhanvien4", 23, "M", "TP.HCM", "Task4");
var nv5 = new NhanVien_1.NhanVien("nhanvien5", 24, "F", "Nam Dinh", "Task5");
var employeeArray;
employeeArray = [nv1, nv2, nv3, nv4, nv5];
// Dung for of de in thong tin
for (var _i = 0, employeeArray_1 = employeeArray; _i < employeeArray_1.length; _i++) {
    var element = employeeArray_1[_i];
    element.printInfNhanVien();
}
employeeArray.map(function (nhanvien, key) {
    console.log("STT: ", key);
    NhanVien_1.printInfEmployees(nhanvien);
});
