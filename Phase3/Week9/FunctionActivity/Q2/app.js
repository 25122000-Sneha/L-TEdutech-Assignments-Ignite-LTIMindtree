var require;
//write your code here
var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q2\\input.txt").toString().trim();
var inputArr = input.split("|");
var total = 0;
for (var i = 0; i < inputArr.length; i++) {
    var detail = inputArr[i];
    var detailArr = detail.split(",");
    var name_1 = detailArr[0];
    var amount = parseInt(detailArr[1]);
    var gst = parseInt(detailArr[2]) || undefined;
    total += calculateDiscount(amount, gst);
}
console.log("The Total price of all products including GST is ".concat(total));
function calculateDiscount(amt, gst) {
    if (gst === void 0) { gst = 18; }
    var price = amt + (amt * (gst / 100));
    return price;
}
