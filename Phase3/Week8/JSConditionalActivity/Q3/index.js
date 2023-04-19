var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

value = Number(value);

var out = (value%2==0) ? "Even number" : "Odd number";

console.log(out);

//Fill your code