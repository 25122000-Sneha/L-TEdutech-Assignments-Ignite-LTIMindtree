declare var require: any;

var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q1\\input.txt").toString().trim();
var inputArr : Array<string>= input.split("\n");

for(let i=0; i<inputArr.length; i++)
{
    let detail : string = inputArr[i];
    let detailArr : Array<string> = detail.split(",");
    let num1 = parseInt(detailArr[0]);
    let num2 = parseInt(detailArr[1]);
    let num3 = parseInt(detailArr[2]) || undefined;

    console.log(sum(num1, num2, num3));
}


function sum(param1 : number, param2: number, param3 ? : number) : number
{
    if(param3 == undefined)
    {
        return param1 + param2;
    }
    return param1 + param2 + param3;
}
