var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q8\\input.txt").toString().trim();
var inputArr = input.split("\n");
const arr = inputArr[0].split(",").map(Number);
const num = Number(inputArr[1]);

console.log("Elements in the array : "+arr.toString());
arr.pop();
console.log("Removing last element : "+arr.toString());
arr.push(num);
console.log("Adding an element at the end : "+arr.toString());
arr.shift();
console.log("Removing first element : "+arr.toString());



