var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q4\\input.txt").toString();

var arr = input.split(",").map(Number);

/*arr.sort();

arr.reverse();*/

//arr.sort(function(a,b){return b - a});

arr.sort((a,b) => b - a);

console.log(arr);