import { Grades } from "./grades";

let g1 = new Grades("Tuấn", 8, "M");
let g2 = new Grades("Tú", 18, "F");
let g3 = new Grades("Tài", 9, "M");
let g4 = new Grades("Tình", 19, "F");
let g5 = new Grades("Tính", 10, "F");
let g6 = new Grades("Toán", 20, "M");
let g7 = new Grades("Tiền", 11, "F");
let g8 = new Grades("Tiêu", 12, "M");
let g9 = new Grades("Tết", 17, "F");
var grades: Grades[];

grades = [g1, g2, g3, g4, g5, g6, g7, g8, g9];

function avgGrade(grades: Grades[]) {
  grades.forEach((element) => {
    if (element.getgender() == "M") {
      let total = 1;
      //   let a = element.getgrade()
    }
  });
}
