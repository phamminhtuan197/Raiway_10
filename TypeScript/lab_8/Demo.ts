let numArray = [10, 20, 30];
let total = 0;
numArray.forEach((element) => {
  total = total + element;
});

console.log("Tong cac so trong numArray: " + total);

// Cach 2 su dung Reduce

function callback(accumulator, currentValue, currentIndex) {
  console.log("--------------Lần lặp ", currentIndex + 1, "------------");
  console.log("accumulator hiện tại: ", accumulator);
  console.log("currentValue hiện tại: ", currentValue);
  console.log("currentIndex hiện tại: ", currentIndex);
  accumulator = accumulator + currentValue;
  return accumulator;
}

console.log("Su dung Reduce: ");
let total_reduce = numArray.reduce(callback, 0);
console.log("Tong cac so torng numArray: " + total_reduce);

let total_reduce_2 = numArray.reduce(
  (accumulator, currentValue) => accumulator + currentValue,
  0
);
console.log(
  "Toi uu cach viet cua cach 2, tong cac so trong mang la: " + total_reduce_2
);

// Doi gia tri currentValue 0 -> 20

let total_reduce_2_1 = numArray.reduce(
  (accumulator, currentValue) => accumulator + currentValue,
  20
);
console.log(
  "Doi gia tri currentValue thanh 20. Tong cac so trong mang la: " +
    total_reduce_2_1
);

// Khong truyen gia tri currentValue thi mac dinh la 0

let total_reduce_2_2 = numArray.reduce(
  (accumulator, currentValue) => accumulator + currentValue
);
console.log(
  "Khong truyen gia tri currentValue thi mac dinh se la 0. Tong cac so trong mang: " +
    total_reduce_2_2
);
