var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q18\\input.txt").toString().trim();
const arr = input.split(",").map(Number);
const newArr = arr.filter(function(ele, index, array){
    return ele>5;
});

newArr.forEach((ele) => {console.log(ele)});