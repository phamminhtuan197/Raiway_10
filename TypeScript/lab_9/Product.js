"use strict";
exports.__esModule = true;
exports.Product = void 0;
var Product = /** @class */ (function () {
    function Product(name, price) {
        this.name = name;
        this.price = price;
    }
    Product.prototype.getname = function () {
        return this.name;
    };
    Product.prototype.setname = function (v) {
        this.name = v;
    };
    Product.prototype.getprice = function () {
        return this.price;
    };
    Product.prototype.setprice = function (v) {
        this.price = v;
    };
    return Product;
}());
exports.Product = Product;
