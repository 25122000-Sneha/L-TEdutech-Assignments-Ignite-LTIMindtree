let fs=require('fs');
let input= fs.readFileSync("D:\\Internship\\Phase3\\Week8\\ArraysActivity\\Q6\\input.txt").toString().trim().split(",");

let arr = input.map(Number);


const filterArray = (arr) => {
   //fill your code 
   arr = arr.filter((elem) => {return elem>5});
   if (!arr.length)
   {
      console.log("Elements in the array are less than 5");
   }
   else 
   {
      arr.forEach((ele) => console.log(ele));
   }

}

filterArray(arr);



