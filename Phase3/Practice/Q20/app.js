var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q20\\input.txt").toString().trim();

var inputArr = input.split("\n");

const arr1 = inputArr[0].split(",").map(Number);
const arr2 = inputArr[1].split(",").map(Number);

const val1 = arr1.every(function(ele, index, arr){
    return arr2.includes(ele);
});

const val2 = arr2.every(function(ele, index, arr){
    return arr1.includes(ele);
});

const val3 = val1 && val2;

if(val3 == true)
{
    console.log("Equal");
}
else if(val1 == true)
{
    console.log("SubList");
}
else if(val2 == true)
{
    console.log("SuperList");
}
else 
{
    console.log("Unequal");
}
