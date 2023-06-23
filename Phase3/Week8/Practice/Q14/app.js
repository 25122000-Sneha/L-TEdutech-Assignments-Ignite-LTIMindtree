var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q14\\input.txt");
let n = Number(input);
let product;
for(let i=0; i<10; i++){
    product = (i+1)*n;
    console.log(`${i+1} * ${n} = ${product}`);
}