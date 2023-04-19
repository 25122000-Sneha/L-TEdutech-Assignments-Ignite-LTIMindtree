var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q2\\input.txt").toString();

var inputArr = input.split("\n");  //splitting file input

var arr = inputArr[0].split(",");  //splitting first line input into string array

var val = inputArr[1];

var numArr = []
for(let i=0; i<arr.length; i++)
{
    numArr.push(Number(arr[i]));   //converting all string elems into number and adding into number array
} 

val = Number(val);

console.log("Elements in the array : "+numArr);

let dlt = numArr.pop();
console.log("Removing last element : "+numArr);

numArr.push(val);
console.log("Adding an element at the end : "+numArr);

numArr.shift();
console.log("Removing first element : "+numArr);