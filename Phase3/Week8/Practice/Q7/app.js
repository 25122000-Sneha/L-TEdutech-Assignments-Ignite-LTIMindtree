var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q7\\input.txt").toString().trim();
let num = Number(input);
var arr = [12, 45, 1, 43, 27, 65];
arr.unshift(num);
console.log(arr);