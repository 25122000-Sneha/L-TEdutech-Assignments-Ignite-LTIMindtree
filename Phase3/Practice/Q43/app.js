var data = "10";
let n = Number(data);
let val;
for(let i=1; i<=n; i++)
{
    if(i%2==0)
    {
        val = Math.pow(i, 2) - 2;
    }
    else 
    {
        val = Math.pow(i, 2) - 1;
    }
    console.log(val);
}