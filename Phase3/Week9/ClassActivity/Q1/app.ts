

declare let require:any;

class Product{
	name:string;
	description:string;	
	price:number;
	discount:number;
	finalPrice:number;
	
	constructor(name:string, description:string, price:number, discount:number) {
		//write your code here	
		this.name = name;
		this.description = description;
		this.price = price;
		this.discount = discount;
	}
	
	calculatePrice():void{
		//write your code here
		this.finalPrice =  this.price - ((this.discount/100)*this.price);
	}
	display():void{
		//write your code here
		console.log("Product Name : "+this.name);
		console.log("Product Brand : "+this.description);
		console.log("Product Price : "+this.price.toFixed(2));
		console.log("Product Discount : "+this.discount.toFixed(2));
		console.log("Total Price : "+this.finalPrice.toFixed(2));
	}
}

//import * as product from "./Product";
//write your code here
var fs = require('fs');
var input = fs.readFileSync("input.txt").toString().trim();
var arr = input.split(",");

var obj = new Product(arr[0], arr[1], parseInt(arr[2]), parseInt(arr[3]));
obj.calculatePrice();
obj.display();