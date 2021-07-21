"use strict";
exports.__esModule = true;
var Product_1 = require("./Product");
var p1 = new Product_1.Product("p1", 200);
var p2 = new Product_1.Product("p2", 300);
var p3 = new Product_1.Product("p3", 350);
var arr;
arr = [p1, p2, p3];
var discount = function (discount) { return function (price) { return price - price * discount; }; };
// Giam gia 10%
var percentDiscount10 = discount(0.1);
console.log("----Gia sp sau khi giam gia 10%----");
arr.forEach(function (element) {
    console.log("Name: " +
        element.getname() +
        ", Price: " +
        percentDiscount10(element.getprice()));
});
var percentDiscount20 = discount(0.2);
console.log("----Gia sp sau khi giam 20%----");
arr.forEach(function (element) {
    console.log("Name: " +
        element.getname() +
        ", Price: " +
        percentDiscount20(element.getprice()));
});
