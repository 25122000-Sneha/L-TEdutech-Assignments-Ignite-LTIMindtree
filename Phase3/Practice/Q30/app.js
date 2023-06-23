var bin = 1101;
let i=0;
let sum = 0;
while(bin!=0)
{
    let digit = bin%10;
    sum += digit*Math.pow(2, i);
    bin = Math.trunc(bin/10);
    i++;
}
console.log(`Decimal number : ${sum}`);