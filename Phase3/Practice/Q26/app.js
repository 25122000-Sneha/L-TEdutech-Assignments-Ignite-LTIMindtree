var number = "598";

let n = Number(number);

let num = n;
let reversed = 0;
while(n!=0)
{
    let lastDigit = n%10;
    reversed = (reversed*10) + lastDigit;
    n = parseInt(n/10);
}
if(num == reversed)
{
    console.log("Palindrome");
}
else 
{
    console.log("Not palindrome");
}