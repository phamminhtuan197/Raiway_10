function sum(a: number, b: number) {
  return a + b;
}

function minus(a: number, b: number) {
  return a - b;
}

function multiply(a: number, b: number) {
  return a * b;
}

let sum_a_b = sum(20, 10);
console.log("Ket qua a+b la: " + sum_a_b);

let minus_a_b = minus(20, 10);
console.log("Ket qua a-b la: " + minus_a_b);

let multiply_a_b = multiply(20, 10);
console.log("Ket qua a*b la: " + multiply_a_b);

// Su dung HOF

function calculate(a: number, b: number, operation) {
  let result = operation(a, b);
  console.log("Ket qua cua phep tinh " + operation + " la: " + result);
}

calculate(20, 10, sum);

calculate(20, 10, minus);

calculate(20, 10, multiply);
