//import the product class here.
class Product{
	//write your code here.
	name : string;
	description : string;
	price : number;
	discount : number;

	constructor(name:string, description:string, price:number, discount:number)
	{
		this.name = name;
		this.description = description;
        this.price = price;
		this.discount = discount;
	}
}
class Phone extends Product{
	RAM : string;
	ROM : string;
	processor : string;
	osVersion : string;
	releasedYear : string;
	constructor(name:string, description:string, price:number, discount:number, RAM:string, ROM:string, processor:string, osVersion:string, releasedYear:string) {
		//write your code here.
		super(name, description, price, discount);
		this.RAM = RAM;
		this.ROM = ROM;
		this.processor = processor;
		this.osVersion = osVersion;
		this.releasedYear = releasedYear;

		
	}
	
	display():void{
		//write your code here.
		console.log("Product Name : "+this.name);
		console.log("Product Brand : "+this.description);
		console.log("Product Price : "+this.price.toFixed(2));
		console.log("Product Discount : "+this.discount.toFixed(2));
		console.log("RAM : "+this.RAM);
		console.log("ROM : "+this.ROM);
		console.log("Processor : "+this.processor);
		console.log("osVersion : "+this.osVersion);
		console.log("Released Year : "+this.releasedYear);
	}
}

//export the phone class here.

declare let require:any;
//import phone = require("./Phone");
//write your code here
var fs = require('fs');
var input = fs.readFileSync("input.txt").toString().trim();
var arr = input.split(",")
var obj = new Phone(arr[0], arr[1], parseInt(arr[2]), parseInt(arr[3]), arr[4], arr[5], arr[6], arr[7], arr[8]);
obj.display();
