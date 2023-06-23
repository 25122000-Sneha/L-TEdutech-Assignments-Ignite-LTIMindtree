var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q1\\input.txt").toString().trim();
var inputArr = input.split("\n");

for (var i = 0; i < inputArr.length; i++) {
    var detail = inputArr[i];
    var detailArr = detail.split(",");
    var num1 = parseInt(detailArr[0]);
    var num2 = parseInt(detailArr[1]);
    var num3 = parseInt(detailArr[2]) || undefined;
    console.log(sum(num1, num2, num3));
}
function sum(param1, param2, param3) {
    if (param3 == undefined) {
        return param1 + param2;
    }
    return param1 + param2 + param3;
}
