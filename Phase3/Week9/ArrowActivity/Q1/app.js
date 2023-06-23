var require;
var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\ArrowActivity\\Q1\\input.txt").toString().trim();
var year = Number(input);
var isLeap = function (yr) {
    if (yr % 400 == 0) {
        return true;
    }
    else if ((yr % 4 == 0) && (yr % 100 != 0)) {
        return true;
    }
    else {
        return false;
    }
};
console.log(isLeap(year));
