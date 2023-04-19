var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

value = Number(value);

if((value < 15) || (value > 60))
{
    console.log("Not Allowed");
}
else 
{
    console.log("Allowed");
}

