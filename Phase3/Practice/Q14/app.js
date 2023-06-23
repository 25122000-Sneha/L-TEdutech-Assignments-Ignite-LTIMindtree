var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q14\\input.txt").toString().trim();

let num = Number(input);
let remainder = num%7;

switch(remainder)
{
    case 0:
        console.log("Sunday");
        break;
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    
}