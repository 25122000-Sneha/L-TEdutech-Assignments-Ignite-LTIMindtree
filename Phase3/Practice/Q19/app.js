var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Practice\\Q19\\input.txt").toString().trim();

let n = Number(input);

let flag = 0;
for(let i=2; i<n; i++)
{
    if(n%i==0)
    {
        flag++;
        break;
    }
}
if(flag == 0)
{
    console.log(`${n} is a prime number`);
}
else 
{
    console.log(`${n} is not a prime number`);
}
