let arr = [1, 2, 3, 4, 5, 6];
// let arr1 = arr.map(function(ele, index, array){
//     return ele*2;
// });
// let arr2 = arr.filter(function(ele, index, array){
//     return ele%2!=0;
// });
// //console.log(arr2);

// let sum = arr.reduce(function(total, ele){
//     return total + ele;
// });
// //console.log(sum);

let sum2 = arr.filter((ele) => {return ele%2!=0}).map((ele)=>{return ele*2}).reduce((total, ele) => {return total+ele});
console.log(sum2);
//18