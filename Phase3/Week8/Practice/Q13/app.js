const arr = [1,2,3,4,5,6,7,8,9];

const newArr = arr.filter((val)=>{return val%2!=0}).map((val)=>{return val*2});
let sum = newArr.reduce((total,val)=>{return total+val});
console.log(sum);