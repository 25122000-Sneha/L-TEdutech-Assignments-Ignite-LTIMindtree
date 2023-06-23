let require:any;
//write your code here
function myFunc(s : string){
    return s.toLowerCase();
}

var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\VarDataTypeActivity\\Q3\\input.txt").toString().trim();
var inputArr  : Array<string> = input.split("\n");

let categories : string= inputArr[0];
let searchCat : string = inputArr[1].toLowerCase();

let catArr  : Array<string> = categories.split("|").map(myFunc);

let flag  : number = 0;
for(let i=0; i<catArr.length; i++){
    if(catArr[i] == searchCat){
        flag++;
        break;
    }
}
if(flag == 1){
    console.log(`${searchCat} item is present.`);
}
else {
    console.log(`${searchCat} item is not present.`);

}
