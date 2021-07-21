"use strict";
exports.__esModule = true;
var Staff_1 = require("./Staff");
var staff1 = new Staff_1.Staff("staff1", 20, "Male", "HN");
var staff2 = new Staff_1.Staff("staff2", 22, "FeMale", "NĐ");
var staff3 = new Staff_1.Staff("staff3", 24, "Male", "HN");
var staffArray = [staff1, staff2, staff3];
// Tinh tong so tuoi trong mang
var totalAge = staffArray.reduce(function (sumAge, current) { return sumAge + current.getage(); }, 0);
// Tinh tuoi trung binh trong mang
var avgAge = totalAge / staffArray.length;
console.log("Tuoi trung binh la: " + avgAge);
