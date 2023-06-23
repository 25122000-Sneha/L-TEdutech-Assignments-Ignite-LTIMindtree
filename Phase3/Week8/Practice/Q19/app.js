var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q19\\input.txt").toString().trim();
var inputArr = input.split("\n");
var choice = Number(inputArr[0]);
var val1 = Number(inputArr[1]);
var val2 = Number(inputArr[2]);

let ans;
switch(choice)
{
    case 1:
        ans = val1 + val2;
        break;
    case 2:
        ans = val1 - val2;
        break;
    case 3:
        ans = val1*val2;
        break;
    case 4:
        ans = val1/val2;
        break;
}
console.log(ans);