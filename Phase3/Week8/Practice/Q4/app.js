var fs = require('fs');
let input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q4\\input.txt").toString().trim();
input = Number(input);
if(input%2 == 0){
    console.log("Even number");
}
else{
    console.log("Odd number");
}