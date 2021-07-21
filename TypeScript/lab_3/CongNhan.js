"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.CongNhan = void 0;
var CanBo_1 = require("./CanBo");
var CongNhan = /** @class */ (function (_super) {
    __extends(CongNhan, _super);
    function CongNhan(name, age, gender, address, rank) {
        var _this = _super.call(this, name, age, gender, address) || this;
        _this.rank = rank;
        return _this;
    }
    CongNhan.prototype.getrank = function () {
        return this.rank;
    };
    CongNhan.prototype.setrank = function (rank) {
        this.rank = rank;
    };
    CongNhan.prototype.printInfCongNhan = function () {
        console.log("Thong tin cong nhan");
        _super.prototype.printInfCanBo.call(this);
        console.log("Rank: " + this.rank);
    };
    return CongNhan;
}(CanBo_1.CanBo));
exports.CongNhan = CongNhan;
