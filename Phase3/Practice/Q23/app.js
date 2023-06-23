var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q23\\input.txt").toString().trim();

let n = Number(input);

let countDigits = (num) => {
    let digits = 0;
    while(num!=0)
    {
        digits++;
        num = Math.trunc(num/10);
    }
    return digits;
};

console.log(countDigits(n));