const prompt = require("prompt-sync")();
let a=Number(prompt("Enter the number a = "));
let b=Number(prompt("Enter the number b = "));
let c=Number(prompt("Enter the number c = "));

if(a+b<=c || b+c<=a || c+a<=b){
    console.log("Not Possible ")
}
else{
    s=(a+b+c)/2;
    console.log(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

}

