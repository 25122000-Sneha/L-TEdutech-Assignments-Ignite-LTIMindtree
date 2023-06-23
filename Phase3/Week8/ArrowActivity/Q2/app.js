var fs = require('fs');
var input = fs.readFsileSync("D:\\Internship\\Phase3\\Week8\\ArrowActivity\\Q2\\input.txt").toString();
//fill your code

let r = Number(input);

let calculateArea = (radius) => 3.14 * radius * radius;

console.log(calculateArea(r));
