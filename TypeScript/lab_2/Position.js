"use strict";
exports.__esModule = true;
exports.printInfPosition = exports.Position = void 0;
var Position = /** @class */ (function () {
    function Position(id, name) {
        this.id = id;
        this.name = name;
    }
    Position.prototype.getname = function () {
        return this.name;
    };
    Position.prototype.setname = function (v) {
        this.name = v;
    };
    Position.prototype.getid = function () {
        return this.id;
    };
    Position.prototype.setid = function (v) {
        this.id = v;
    };
    return Position;
}());
exports.Position = Position;
function printInfPosition(position) {
    console.log("ID: " + position.getid() + " PositionName: " + position.getname());
}
exports.printInfPosition = printInfPosition;
