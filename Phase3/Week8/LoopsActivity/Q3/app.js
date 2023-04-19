var fs = require('fs');
var value = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\LoopsActivity\\Q3\\input.txt").toString();

let num = Number(value);

let flag = 0;

let i=2;
while(i<num)
{
    if(num%i==0)
    {
        flag++;
        break;
    }
    i++;
}
if(flag == 0)
{
    console.log(`${num} is a prime number`);
}
else 
{
    console.log(`${num} is not a prime number`);
}
