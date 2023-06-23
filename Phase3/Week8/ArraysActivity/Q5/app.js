var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q5\\input.txt").toString();

var inputArr = input.trim().split("\n");

let productArr = [];
for(let i=0; i<inputArr.length; i++)
{
    let detail = inputArr[i].split(",");
    let id = Number(detail[0]);
    let name = detail[1];
    let price = Number(detail[2]);
    
    let product = {
        "id" : id,
        "name" : name,
        "price" : price
    }
    productArr.push(product);
}

productArr.sort((obj1, obj2) =>{ return obj2.price - obj1.price;} );    //descending order of price

let costlyProd = productArr[0];

console.log(`Id : ${costlyProd.id}`);
console.log(`Name : ${costlyProd.name}`);
console.log(`Price : ${costlyProd.price}`);

