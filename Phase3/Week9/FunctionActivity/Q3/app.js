var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q3\\input.txt").toString().trim();
var inputArr = input.split("|");
inputArr.pop();
console.log(inputArr);
var totalPrice = discount.apply(void 0, inputArr);
console.log("Total price of all the products is ".concat(totalPrice));
function discount() {
    var arr = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        arr[_i] = arguments[_i];
    }
    var total = 0;
    for (var i = 0; i < arr.length; i++) {
        var detailArr = arr[i].split(",").map(Number);
        var amt = detailArr[0];
        var dis = detailArr[1];
        total += amt - (amt * (dis / 100));
    }
    return total;
}
