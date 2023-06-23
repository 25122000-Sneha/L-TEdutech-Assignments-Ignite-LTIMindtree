var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q17\\input.txt").toString().trim();

var inputArr = input.split("\n");

const arr = inputArr[0].split(",").map(Number);
let num = Number(inputArr[1]);

console.log(`Elements in the aray : ${arr.toString()}`);
arr.pop();
console.log(`Removing last element : ${arr.toString()}`);
arr.push(num);
console.log(`Adding an element at the end : ${arr.toString()}`);
arr.shift();
console.log(`Removing first element : ${arr.toString()}`);

