const prompt = require("prompt-sync")();
let p=Number(prompt("Enter the number p = "));
let r=Number(prompt("Enter the number r = "));
let t=Number(prompt("Enter the number t = "));

console.log((p*Math.pow(1+r/100,t))-p);