var input = "371";
let num = Number(input);

function countDigits(n)
{
    let digits = 0;
    while(n!=0)
    {
        digits++;
        n = Math.trunc(n/10);
    }
    return digits;
}
let sum = 0;
let digs = countDigits(num);
let temp = num;
while(num!=0)
{
    let lastDigit = num%10;
    sum += Math.pow(lastDigit, digs);
    num = Math.trunc(num/10);
}
if(sum == temp)
{
    console.log(`${temp} is an Armstrong number`);
}
else 
{
    console.log(`${temp} is not an Armstrong number`);
}
