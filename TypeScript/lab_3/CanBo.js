"use strict";
exports.__esModule = true;
exports.CanBo = void 0;
var CanBo = /** @class */ (function () {
    function CanBo(name, age, gender, address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    CanBo.prototype.getname = function () {
        return this.name;
    };
    CanBo.prototype.setname = function (name) {
        this.name = name;
    };
    CanBo.prototype.getage = function () {
        return this.age;
    };
    CanBo.prototype.setage = function (age) {
        this.age = age;
    };
    CanBo.prototype.getgender = function () {
        return this.gender;
    };
    CanBo.prototype.setgender = function (gender) {
        this.gender = gender;
    };
    CanBo.prototype.getaddress = function () {
        return this.address;
    };
    CanBo.prototype.setaddress = function (address) {
        this.address = address;
    };
    CanBo.prototype.printInfCanBo = function () {
        console.log("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender + ", Address: " + this.address);
    };
    return CanBo;
}());
exports.CanBo = CanBo;
