function multiply(a, b, c) {
    return a * b * c;
}
var result = multiply(1, 2, 3);
console.log("Tich 3 so 1 2 3 la: " + result);
// Curring Function
function multiply1(a) {
    return function (b) {
        return function (c) {
            return a * b * c;
        };
    };
}
var result1 = multiply1(1)(2)(3);
console.log("Tich 3 so 1 2 3 la: " + result1);
var multiply_1 = multiply1(1);
var multiply_2 = multiply_1(2);
console.log("Nhan voi 3: " + multiply_2(3));
// Arrow Function
var multiply_arrow = function (a) { return function (b) { return function (c) { return a * b * c; }; }; };
var multiply_arrow_1 = multiply_arrow(1);
var multiply_arrow_2 = multiply_arrow_1(2);
console.log("Ket qua khi nhan voi 5: " + multiply_arrow_2(5));
