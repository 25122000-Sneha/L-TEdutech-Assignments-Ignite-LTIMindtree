/** Fill Code here */
let require:any;
var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q4\\input.txt").toString().trim();
let arr : Array<string> = input.split("\n");

arr.sort();

arr.forEach((ele) => console.log(ele));

