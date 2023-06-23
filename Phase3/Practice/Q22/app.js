var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q22\\input.txt").toString().trim();

var inputArr = input.split("\n");
let p = Number(inputArr[0]);
let n = Number(inputArr[1]);
let r = Number(inputArr[2]);

if(isNaN(r))
{
    r = undefined;
}

let si = (principle, yrs, rate=5) => {
    return (principle*yrs*rate)/100;
};

let interest = si(p, n, r);
console.log(interest);