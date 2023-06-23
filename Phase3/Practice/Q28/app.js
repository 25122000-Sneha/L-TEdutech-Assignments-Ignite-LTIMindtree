let m = 300;
let n = 2000;

function countDigits(num)
{
    let digits = 0;
    while(num!=0)
    {
        digits++;
        num = Math.trunc(num/10);
    }
    return digits;
}

for(let x=m; x<=n; x++)
{
    let  temp = x;
    let sum = 0;
    let digs = countDigits(x);
    while(temp!=0)
    {
        let digit = temp%10;
        sum += Math.pow(digit, digs);
        temp = Math.trunc(temp/10);
    }
    if(x == sum)
    {
        console.log(x);
    }
    
}