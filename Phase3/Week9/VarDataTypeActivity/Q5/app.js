var fs = require('fs');
var petName = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q5\\input.txt").toString().trim();
var Players;
(function (Players) {
    Players["Hardhik33"] = "Hardik Pandya";
    Players["Rishabh47"] = "Rishabh Pant";
    Players["Rohit45"] = "Rohit Sharma";
    Players["MS7"] = "Mahendrasingh Dhoni";
    Players["Virat18"] = "Virat Kholi";
    Players["Jasprit59"] = "Jasprit Bumrah";
    Players["Lokesh1"] = "Lokesh Rahul";
    Players["Prithvi100"] = "Prithvi Shaw";
    Players["Shreyas41"] = "Shreyas Iyer";
    Players["Rahul19"] = "Rahul Dravid";
})(Players || (Players = {}));
var p = Players[petName];
if (p) {
    console.log(p);
}
else {
    console.log("No players found");
}
