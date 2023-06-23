var require;
//write your code here
function myFunc(s) {
    return s.toLowerCase();
}
var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q3\\input.txt").toString().trim();
var inputArr = input.split("\n");
var categories = inputArr[0];
var searchCat = inputArr[1].toLowerCase();
var catArr = categories.split("|").map(myFunc);
var flag = 0;
for (var i = 0; i < catArr.length; i++) {
    if (catArr[i] == searchCat) {
        flag++;
        break;
    }
}
if (flag == 1) {
    console.log("".concat(searchCat, " item is present."));
}
else {
    console.log("".concat(searchCat, " item is not present."));
}
