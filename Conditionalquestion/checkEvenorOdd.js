const prompt = require("prompt-sync")();

let num=Number(prompt("Enter the number = "));

if(num%2==0){
    console.log("this number is Even");
}
else{
    console.log("this number id odd")
}