const prompt = require("prompt-sync")();

let num1=Number(prompt("Enter your First num1 = "));
let num2=Number(prompt("Enter your Second num2 = "));
let num3=Number(prompt("Enter your Third num3 = "));

if(num1>num2){
    console.log(`num1 ${num1} is Largest number of all in these`);
}
else if(num2>num3){
    console.log(`num2 ${num2} is Largest number of all in these`);
}
else{
   console.log(`num3 ${num3} is Largest number of all in these`);
} 