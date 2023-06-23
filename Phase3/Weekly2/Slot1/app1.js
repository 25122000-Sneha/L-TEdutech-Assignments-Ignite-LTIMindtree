var data = '10';
data = Number(data);
let val;
for(let i=1; i<=data; i++){
    if(i%2!=0){
        val = i**2 - 1;
    }
    else {
        val = i**2 - 2;
    }
    console.log(val);
}