var fs = require('fs');
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\LoopsActivity\\Q1\\input.txt").toString();

var n = Number(value);

for(let i=0; i<10; i++)
{
    let out = `${(i+1)} * ${n} = ${n*(i+1)}`;
    console.log(out);
}