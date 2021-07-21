import { Product } from "./Product";

let p1 = new Product("p1", 200);
let p2 = new Product("p2", 300);
let p3 = new Product("p3", 350);

let arr: Product[];

arr = [p1, p2, p3];
const discount = (discount) => (price) => price - price * discount;
// Giam gia 10%
const percentDiscount10 = discount(0.1);
console.log("----Gia sp sau khi giam gia 10%----");
arr.forEach((element) => {
  console.log(
    "Name: " +
      element.getname() +
      ", Price: " +
      percentDiscount10(element.getprice())
  );
});

const percentDiscount20 = discount(0.2);
console.log("----Gia sp sau khi giam 20%----");
arr.forEach((element) => {
  console.log(
    "Name: " +
      element.getname() +
      ", Price: " +
      percentDiscount20(element.getprice())
  );
});
