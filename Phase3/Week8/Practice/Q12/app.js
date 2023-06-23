var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\Practice\\Q12\\input.txt").toString().trim();

const arr = input.split(",").map(Number);

const newArr = arr.filter(function(val, index, array){
    return val>5;
});

if(newArr.length == 0){
    console.log(`Elements in the array are less than 5`);
}
else {
    newArr.forEach((ele) => console.log(ele));
}

