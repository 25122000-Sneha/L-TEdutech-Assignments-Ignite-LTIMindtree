declare let require:any;
//write your code here
var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q6\\input.txt").toString().trim();
var inputArr : Array<string> = input.split(",");

let role1 : string = inputArr[0];
let role2 : string = inputArr[1];

enum ROLE{
    endUser,
    author, 
    subAdmin,
    admin
}

if(ROLE[role1] > ROLE[role2])
{
    console.log(`${role1} has more priority than ${role2}`);
}
else  if(ROLE[role2] > ROLE[role1])
{
    console.log(`${role2} has more priority than ${role1}`);
}