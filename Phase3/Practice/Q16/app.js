var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q16\\input.txt").toString().trim();

var inputArr = input.split("\n");

let arr = [];
for(let i=0; i<inputArr.length; i++)
{
    let detail = inputArr[i];
    let detailArr = detail.split(",");
    let id = Number(detailArr[0]);
    let name = detailArr[1];
    let price = Number(detailArr[2]);
    const obj = {"id":id, "name":name, "price":price};
    arr.push(obj);
}

arr.sort(function(obj1, obj2){
    return obj2.price - obj1.price;
});

let costlyObj = arr[0];
console.log(`Id : ${costlyObj.id}`);
console.log(`Name : ${costlyObj.name}`);
console.log(`Price : ${costlyObj.price}`);

