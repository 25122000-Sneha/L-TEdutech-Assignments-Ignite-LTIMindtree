var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

value = Number(value);
var sum = value + 2;
var diff = value - 2;
var product = value * 2;
var quotient = value/2;
var remainder = value%2;

console.log("Addition : "+sum);
console.log("Subtraction : "+diff);
console.log("Multiplication : "+product);
console.log("Division : "+quotient);
console.log("Modulo : "+remainder);