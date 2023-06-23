declare var require: any

var fs = require('fs');
let petName : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q5\\input.txt").toString().trim();

enum Players{
    Hardhik33 = "Hardik Pandya",
    Rishabh47 = "Rishabh Pant",
    Rohit45 = "Rohit Sharma",
    MS7 = "Mahendrasingh Dhoni",
    Virat18 = "Virat Kholi",
    Jasprit59 = "Jasprit Bumrah",
    Lokesh1 = "Lokesh Rahul",
    Prithvi100 = "Prithvi Shaw",
    Shreyas41 ="Shreyas Iyer",
    Rahul19 = "Rahul Dravid"
}

const p = Players[petName];
if(p){
    console.log(p);
}
else 
{
    console.log("No players found");
}




