import {CongNhan} from "./CongNhan";
import {KySu} from "./KySu";
import {NhanVien, printInfEmployees} from "./NhanVien";
let cn1 = new CongNhan("tuan1", 20, "M", "Ha Noi", 10);
let cn2 = new CongNhan("tuan2", 21, "F", "Ha Nam", 9);
let cn3 = new CongNhan("tuan3", 22, "U", "Ha Tay", 8);
let cn4 = new CongNhan("tuan4", 23, "M", "TP.HCM", 7);
let cn5 = new CongNhan("tuan5", 24, "F", "Nam Dinh", 6);

console.log("------------------Demo Array Worker ------------------");

let workerArray: CongNhan[];
workerArray = [cn1, cn2, cn3, cn4, cn5];

workerArray.forEach(element => {
    element.printInfCongNhan();
});

let ks1 = new KySu("kysu1", 20, "M", "Ha Noi", "DEV");
let ks2 = new KySu("kysu2", 21, "F", "Ha Nam", "TEST");
let ks3 = new KySu("kysu3", 22, "U", "Ha Tay", "PM");
let ks4 = new KySu("kysu4", 23, "M", "TP.HCM", "DEV");
let ks5 = new KySu("kysu5", 24, "F", "Nam Dinh", "HR");

let engineerSet = new Set();

engineerSet.add(ks1);
engineerSet.add(ks2);
engineerSet.add(ks3);
engineerSet.add(ks4);
engineerSet.add(ks5);

console.log("Tong so phan tu trong Set " +  engineerSet.size);
console.log("Xoa 1 ptu trong Set " + engineerSet.delete(ks1));

// In thong tin bang ForEach
engineerSet.forEach(element => {
    console.log(element);
});

let nv1 = new NhanVien("nhanvien1", 20, "M", "Ha Noi", "Task1");
let nv2 = new NhanVien("nhanvien2", 21, "F", "Ha Nam", "Task2");
let nv3 = new NhanVien("nhanvien3", 22, "U", "Ha Tay", "Task3");
let nv4 = new NhanVien("nhanvien4", 23, "M", "TP.HCM", "Task4");
let nv5 = new NhanVien("nhanvien5", 24, "F", "Nam Dinh", "Task5");

let employeeArray: NhanVien[];
employeeArray = [nv1, nv2, nv3, nv4, nv5];
// Dung for of de in thong tin
for(const element of employeeArray) {
    element.printInfNhanVien();
}


employeeArray.map(function(nhanvien: NhanVien, key: number) {
    console.log("STT: ", key);
    printInfEmployees(nhanvien);
})