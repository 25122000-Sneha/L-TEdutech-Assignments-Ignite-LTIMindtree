var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q5\\input.txt").toString().trim();
input = Number(input);
if((input<15) || (input>60)){
    console.log("Not Allowed");
}
else {
    console.log("Allowed");
}