var fs = require('fs');
var input = fs.readFileSync("D:\\Internship\\Phase3\\Week8\\FunctionParamsReturnActivity\\Q2\\input.txt").toString();
var spl = input.trim();
var array = spl.split("\n");

let val1 = array[0];
let val2 = array[1];

val1 = Number(val1);
val2 = Number(val2);

function checkMax()
{
    let person;
    if(val1 > val2 )
    {
        person = 'John';
    }
    else 
    {
        person = 'Joe';
    }
    return person;
}

let personName = checkMax();

console.log(personName);