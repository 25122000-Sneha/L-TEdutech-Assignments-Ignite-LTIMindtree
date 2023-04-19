var fs = require('fs');
var val = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q1\\input.txt");

val = Number(val);

var arr = [12, 45, 1, 43, 27, 65];

arr.unshift(val);

console.log(arr);