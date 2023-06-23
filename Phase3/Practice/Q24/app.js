var number = "1996";

let year = Number(number);

if(year%400==0)
{
    console.log(`${year} is a leap year`);
}
else if((year%4==0) && (year%100!=0))
{
    console.log(`${year} is a leap year`);
}
else 
{
    console.log(`${year} is not a leap year`);
}