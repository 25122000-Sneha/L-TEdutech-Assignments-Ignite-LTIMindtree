var number = "1634";
let n = Number(number)

let t = n;

let countDigits = (num) => {
    let digits = 0;
    while(num!=0)
    {
        digits++;
        num = Math.trunc(num/10);
    }
    return digits;
};

let digs = countDigits(n);
let sum = 0;
while(n!=0)
{
    let lastDigit = n%10;
    sum += Math.pow(lastDigit, digs);
    n = Math.trunc(n/10);
}

if(sum == t)
{
    console.log(`${t} is an Armstrong number`);
}
else 
{
    console.log(`${t} is not an Armstrong number`);
}
