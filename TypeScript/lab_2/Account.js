"use strict";
exports.__esModule = true;
exports.printInfAccount = exports.Account = void 0;
var Account = /** @class */ (function () {
    function Account(id, email, userName, fullName, department, position, createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
    Account.prototype.getid = function () {
        return this.id;
    };
    Account.prototype.setid = function (v) {
        this.id = v;
    };
    Account.prototype.getemail = function () {
        return this.email;
    };
    Account.prototype.setemail = function (v) {
        this.email = v;
    };
    Account.prototype.getfullName = function () {
        return this.fullName;
    };
    Account.prototype.setfullName = function (v) {
        this.fullName = v;
    };
    Account.prototype.getuserName = function () {
        return this.userName;
    };
    Account.prototype.setuserName = function (v) {
        this.userName = v;
    };
    Account.prototype.getdepartment = function () {
        return this.department;
    };
    Account.prototype.setdepartment = function (v) {
        this.department = v;
    };
    Account.prototype.getposition = function () {
        return this.position;
    };
    Account.prototype.setposition = function (v) {
        this.position = v;
    };
    Account.prototype.getcreateDate = function () {
        return this.createDate;
    };
    Account.prototype.setcreateDate = function (v) {
        this.createDate = v;
    };
    return Account;
}());
exports.Account = Account;
function printInfAccount(account) {
    console.log("ID: " + account.getid() + ", Email: " + account.getemail() + ", UserName: " + account.getuserName() + ", FullName: " + account.getfullName() + ", Department: " + account.getdepartment().getname() + ", Position: " + account.getposition().getname() + ", CreateDate: " + account.getcreateDate());
}
exports.printInfAccount = printInfAccount;
