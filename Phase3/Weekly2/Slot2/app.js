/*var result = 0;
for(var i=0; i<5; i++)
{
    for(var j=0; j<5; j++)
    {
        if((i%2==0) || (j%2==0))
        {
            continue;
        }
        result += i + j;
    }
}
console.log(result);*/
//16

let n = 5;
let string = "";
for(let i=1; i<=n; i++)
{
    for(let j=1; j<=n; j++)
    {
        if(j<=i)
        {
            string+="*";
        }
        else 
        {
            string+=" ";
        }
    }
    string+="\n";
}
console.log(string);