const arr = [2, 4, 5, 4, 9, 8, 7, 6, 8, 9, 4, 2];

const freqArr = [];

for(let i=0; i<arr.length; i++)
{
    freqArr[i] = 1;
    for(let j=i+1; j<arr.length; j++)
    {
        if(arr[i] == arr[j])
        {
            freqArr[i] ++;
            arr[j] = -1;
        }
    }
}

for(let i=0; i<arr.length; i++)
{
    if((arr[i]!=-1) && (freqArr[i] > 1))
    {
        console.log(arr[i]);
    }

}