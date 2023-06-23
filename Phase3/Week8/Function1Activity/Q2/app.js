var fs = require('fs');
var input = fs.readFileSync('D:\\Internship\\Phase3\\Week8\\Function1Activity\Q2\\input.txt').toString();

var num = Number(input);

function checkPrime()
{
    let flag = 0;
    for(let i=2; i<num; i++)
    {
        if(num%i == 0)
        {
            flag++;
            break;
        }
    }
    if(flag == 0)
    {
        console.log("Prime");
    }
    else 
    {
        console.log("Not Prime");
    }
}

checkPrime();
