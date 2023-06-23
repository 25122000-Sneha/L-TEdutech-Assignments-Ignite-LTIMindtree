var fs = require("fs");
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArrowActivity\\Q3\\input.txt").toString().trim();

//Fill your code
//console.log(value);
let n = Number(value);

let countDigits = (num) => {
    let digits = 0;
    while(num!=0)
    {
        digits ++;
        num = Math.floor(num/10);
    }
    return digits;
}

console.log(countDigits(n));