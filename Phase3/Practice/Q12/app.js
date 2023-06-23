var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q12\\input.txt").toString().trim();

let num1 = Number(input);
let num2 = 2;

console.log(`Addition : ${num1+num2}`);
console.log(`Subtraction : ${num1-num2}`);
console.log(`Multiplication : ${num1*num2}`);
console.log(`Division : ${num1/num2}`);
console.log(`Modulo : ${num1%num2}`);