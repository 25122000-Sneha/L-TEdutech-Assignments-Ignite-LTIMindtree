var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q21\\input.txt").toString().trim();
var inputArr = input.split("\n");

let p = Number(inputArr[0]);
let n = Number(inputArr[1]);
let r = Number(inputArr[2]) || undefined;

let si = (principle, no, rate = 5) => {
    return (principle*no*rate)/100;
}

console.log(si(p,n,r));

