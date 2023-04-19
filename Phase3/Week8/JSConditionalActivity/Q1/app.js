
var fs = require("fs");

//To get the data from the file
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\JSConditionalActivity\\Q1\\input.txt", 'utf-8');
//console.log(value);
var num = Number(value);

console.log(num);

