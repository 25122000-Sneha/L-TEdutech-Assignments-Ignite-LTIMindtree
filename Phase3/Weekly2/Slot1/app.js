var range = '20';
range = Number(range);
for(let x=2; x<=range; x++){
    let flag = 0;
    for(let i=2; i<x; i++){
        if(x%i==0){
            flag++;
            break;
        }
    }
    if(flag==0){
        console.log(x);
    }
}