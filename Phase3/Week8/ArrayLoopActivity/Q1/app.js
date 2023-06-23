const fs = require('fs');
var input = fs.readFileSync('D:\\Internship\\Phase3\\Week8\\ArrayLoopActivity\\Q1\\input.txt').toString().trim().split('\n');

const arr1 = input[0].split(",").map(Number);

const arr2 = input[1].split(",").map(Number);

/*function check(val){
    return arr1.includes(val);
}*/

const result1 = arr2.every((val) => arr1.includes(val));

//const result1 = arr2.every(val => check(val));

const result2 = arr1.every((val) => arr2.includes(val));

const result3 = result1 && result2;


if(result3 == true)
{
    console.log("Equal");
}
else if(result1 == true)
{
    console.log("SuperList");
}
else if(result2 == true)
{
    console.log("SubList");
}
else 
{
    console.log("UnEqual");
}


