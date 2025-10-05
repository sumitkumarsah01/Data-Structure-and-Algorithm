const prompt = require("prompt-sync")();

let num1=Number(prompt("Enter the first number = "));
let num2=Number(prompt("Enter the second Number = "));

if(num1>num2) console.log("num1 is Greater");
else console.log("num2 is greater");