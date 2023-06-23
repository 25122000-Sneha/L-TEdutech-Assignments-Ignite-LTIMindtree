var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArrowActivity\\Q1\\input.txt").toString();
var spl = input.trim();
var array = spl.split("\n");

let si = (principal, yrs, rate=5 ) => { 
        return (principal*rate*yrs)/100;
    };


let p = Number(array[0]);
let n = Number(array[1]);
let r = Number(array[2]);

if(isNaN(r)){
    r = undefined;
}

console.log(si(p, n, r));