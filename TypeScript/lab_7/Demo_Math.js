function sum(a, b) {
    return a + b;
}
function minus(a, b) {
    return a - b;
}
function multiply(a, b) {
    return a * b;
}
var sum_a_b = sum(20, 10);
console.log("Ket qua a+b la: " + sum_a_b);
var minus_a_b = minus(20, 10);
console.log("Ket qua a-b la: " + minus_a_b);
var multiply_a_b = multiply(20, 10);
console.log("Ket qua a*b la: " + multiply_a_b);
// Su dung HOF
function calculate(a, b, operation) {
    var result = operation(a, b);
    console.log("Ket qua cua phep tinh " + operation + " la: " + result);
}
calculate(20, 10, sum);
calculate(20, 10, minus);
calculate(20, 10, multiply);
