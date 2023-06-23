let require:any;
//write your code here
var fs = require('fs');
var input  = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q1\\input.txt");
let str : string = input.toString().trim();
console.log(`${str} !!!`);