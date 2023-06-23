let require:any;
//write your code here
var fs = require('fs');
var input : string = fs.readFileSync("D:\\Internship\\Phase3\\Week9\\FunctionActivity\\Q2\\input.txt").toString().trim();
var inputArr : string[]= input.split("|");

let total : number= 0;
for(let i=0; i<inputArr.length; i++)
{
    let detail : string = inputArr[i];
    let detailArr : Array<string>= detail.split(",");
    let name : string= detailArr[0];
    let amount : number = parseInt(detailArr[1]);
    let gst  = parseInt(detailArr[2]) || undefined;
    total  += calculateDiscount(amount, gst);
}

console.log(`The Total price of all products including GST is ${total}`);

function calculateDiscount(amt : number, gst =18) : number
{
    let price : number = amt + (amt*(gst/100));
    return price;
}
