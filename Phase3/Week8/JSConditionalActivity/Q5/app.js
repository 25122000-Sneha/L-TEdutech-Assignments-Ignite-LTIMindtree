var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

value = Number(value);

if(value >= 18)
{
    console.log("Eligible");
}
else 
{
    console.log("Not Eligible");
}