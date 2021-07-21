function multiply(a, b, c) {
  return a * b * c;
}
const result = multiply(1, 2, 3);
console.log("Tich 3 so 1 2 3 la: " + result);

// Curring Function

function multiply1(a) {
  return (b) => {
    return (c) => {
      return a * b * c;
    };
  };
}
const result1 = multiply1(1)(2)(3);
console.log("Tich 3 so 1 2 3 la: " + result1);

const multiply_1 = multiply1(1);
const multiply_2 = multiply_1(2);
console.log("Nhan voi 3: " + multiply_2(3));

// Arrow Function

const multiply_arrow = (a) => (b) => (c) => a * b * c;

const multiply_arrow_1 = multiply_arrow(1);
const multiply_arrow_2 = multiply_arrow_1(2);

console.log("Ket qua khi nhan voi 5: " + multiply_arrow_2(5));
