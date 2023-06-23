let require : any;

var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\ArrowActivity\\Q1\\input.txt").toString().trim();
let year : number= Number(input);

let isLeap = (yr : number) : boolean=> {
    if(yr%400 == 0)
    {
        return true;
    }
    else if((yr%4==0) && (yr%100!=0))
    {
        return true;
    }
    else 
    {
        return false;
    }
}

console.log(isLeap(year));