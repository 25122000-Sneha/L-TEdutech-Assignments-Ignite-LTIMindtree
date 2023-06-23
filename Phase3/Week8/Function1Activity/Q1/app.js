var fs = require('fs');
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Function1Activity\\Q1\\input.txt").toString();

var age = Number(value);

function checkAge()
{
    if(age >= 18)
    {
        console.log("Allowed");
    }
    else 
    {
        console.log("Not Allowed");
    }
}

checkAge();