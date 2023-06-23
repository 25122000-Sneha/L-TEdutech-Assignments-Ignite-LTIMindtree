//write your code here
var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q6\\input.txt").toString().trim();
var inputArr = input.split(",");
var role1 = inputArr[0];
var role2 = inputArr[1];
var ROLE;
(function (ROLE) {
    ROLE[ROLE["endUser"] = 0] = "endUser";
    ROLE[ROLE["author"] = 1] = "author";
    ROLE[ROLE["subAdmin"] = 2] = "subAdmin";
    ROLE[ROLE["admin"] = 3] = "admin";
})(ROLE || (ROLE = {}));
if (ROLE[role1] > ROLE[role2]) {
    console.log("".concat(role1, " has more priority than ").concat(role2));
}
else if (ROLE[role2] > ROLE[role1]) {
    console.log("".concat(role2, " has more priority than ").concat(role1));
}
