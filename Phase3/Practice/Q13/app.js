var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q13\\input.txt").toString().trim();

let age = Number(input);
if((age<15) || (age>60))
{
    console.log("Not Allowed");
}
else 
{
    console.log("Allowed");
}