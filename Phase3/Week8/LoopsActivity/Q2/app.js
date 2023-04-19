var fs = require('fs');
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\LoopsActivity\\Q2\\input.txt").toString();

let n = Number(value);
let sum = 1;

do
{
    sum += n;
    console.log(sum);
}while(sum<=56);

