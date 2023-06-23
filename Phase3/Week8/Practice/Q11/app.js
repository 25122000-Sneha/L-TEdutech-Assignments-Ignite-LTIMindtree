var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q11\\input.txt").toString().trim();
var inputArr = input.split("\n");

var arr = [];
for(let i=0; i<inputArr.length; i++){
    let detail = inputArr[i];
    let detailArr = detail.split(",");
    let id = Number(detailArr[0]);
    let name = detailArr[1];
    let price = Number(detailArr[2]);

    let obj = {"id":id, "name":name, "price":price};
    arr.push(obj);
}

arr.sort(function(obj1, obj2){
    return obj2.price - obj1.price;
})

let prod = arr[0];

console.log(arr);
console.log(`Id : ${prod.id}`);
console.log(`Name : ${prod.name}`);
console.log(`Price : ${prod.price}`);
