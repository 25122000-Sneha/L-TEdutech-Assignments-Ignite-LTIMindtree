const array1 = ['a', 'ab', 'c', 'd', 'e'];
/*
for(let x=0; x<array1.length; x++)
{
    console.log(array1[x]);
}
*/

/*
array1.forEach(function(ele, index, arr){
    console.log(ele);
})
*/

/*
array1.forEach(function(ele, index, arr){
    console.log(array1[index]);
})
*/


array1.forEach(function(ele, index, arr){
    console.log(arr[index]);
})


//array1.forEach((ele) => console.log(ele));
/*
for(ele in array1)
{
    console.log(ele);
}
*/

for(x in array1)
{
    console.log(array1[x]);
}