//decimal to binary
var num = "12";

let decimal = Number(num);

let arr = [];
let i=0;
while(decimal != 0)
{
    arr[i] = decimal%2;
    decimal = Math.trunc(decimal/2);
    i++;
}
let bin = "";
for(let i=arr.length-1; i>=0; i--)
{
    bin += arr[i];
}
console.log(`Binary Number : ${bin}`);