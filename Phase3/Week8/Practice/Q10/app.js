var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q10\\input.txt").toString().trim();
const arr = input.split(",").map(Number);

arr.sort(function(a,b){
    return b - a;
});

console.log(arr);