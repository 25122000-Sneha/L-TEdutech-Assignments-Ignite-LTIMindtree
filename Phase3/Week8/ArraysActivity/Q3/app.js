var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q3\\input.txt").toString();

const inputArr = input.trim().split('\n');    //trim leading & trailing spaces to avoid extra \n

let len = inputArr.length;

console.log(len);