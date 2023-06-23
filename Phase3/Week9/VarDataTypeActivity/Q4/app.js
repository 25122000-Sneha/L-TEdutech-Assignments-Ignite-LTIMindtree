/** Fill Code here */
var require;
var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q4\\input.txt").toString().trim();
var arr = input.split("\n");
arr.sort();
arr.forEach(function (ele) { return console.log(ele); });
