let require:any;
//write your code here
interface Product 
{
    name : string;
    brand : string;
    price : number;
    discount :number;
}

var fs = require('fs');
var input = fs.readFileSync("input.txt").toString().trim();
var arr = input.split(",");
function impProduct(type : Product) : void
{
    var total : number = type.price - ((type.discount/100)*type.price);
    console.log("Total Amount : "+total.toFixed(2));
}

let obj = { name : arr[0], brand : arr[1], price : parseInt(arr[2]), discount : parseInt(arr[3])};
impProduct(obj);