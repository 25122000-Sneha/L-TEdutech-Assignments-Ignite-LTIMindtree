var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\FunctionParamsReturnActivity\\Q1\\input.txt").toString();

let num = parseInt(input);

function findFibonacci(n)
{
    let a = 0;
    let b = 1;
    if(n==1){
        console.log(a);
    }
    else 
    {
        console.log(a);
        console.log(b);
        let count = 2;
        let sum;
        while(count < n)
        {
            sum = a+b;
            console.log(sum);
            a = b;
            b = sum;
            count ++;
        }
    }
}

findFibonacci(num);