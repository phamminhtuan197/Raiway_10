import { Staff } from "./Staff";

let staff1 = new Staff("staff1", 20, "Male", "HN");
let staff2 = new Staff("staff2", 22, "FeMale", "NĐ");
let staff3 = new Staff("staff3", 24, "Male", "HN");

let staffArray = [staff1, staff2, staff3];
// Tinh tong so tuoi trong mang
let totalAge = staffArray.reduce(
  (sumAge, current) => sumAge + current.getage(),
  0
);
// Tinh tuoi trung binh trong mang
let avgAge = totalAge / staffArray.length;
console.log("Tuoi trung binh la: " + avgAge);
