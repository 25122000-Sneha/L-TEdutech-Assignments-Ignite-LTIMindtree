var fs = require('fs');
let n = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q6\\input.txt").toString().trim();
n = Number(n);

let remainder = n%7;
switch(remainder){
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