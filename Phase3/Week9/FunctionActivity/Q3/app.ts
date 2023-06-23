declare var require: any
var fs : any = require('fs');
var input:string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q3\\input.txt").toString().trim();

var inputArr : Array<string> = input.split("|");
inputArr.pop();
console.log(inputArr);
let totalPrice : number = discount(...inputArr);
console.log(`Total price of all the products is ${totalPrice}`);

function discount( ...arr : string[]) : number{
    let total : number = 0;
    for (let i=0; i<arr.length; i++)
    {
        let detailArr : Array<number> = arr[i].split(",").map(Number);
        let amt = detailArr[0];
        let dis = detailArr[1];
        total += amt - (amt * (dis/100));

    }
    return total;
}