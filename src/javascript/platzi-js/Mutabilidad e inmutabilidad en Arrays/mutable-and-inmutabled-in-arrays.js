//const fruits = [0];
//console.log(fruits);
const fruits =  ['apple', 'banana', 'orange'];

fruits.push('lemon');
fruits.push('orange');
fruits.push('waterlemon');

console.log(fruits.length);
for(const fruit of fruits){
    console.log(fruit);
}

const concatFruits = fruits.concat(['tomato', 'mandarina']);

console.log('-------');

for(const fruit of concatFruits){
    console.log(fruit);
}

console.log('-------');

const isArray = Array.isArray(fruits);
console.log(isArray); // true

console.log('-------');

const numbersArray = [1, 2, 3, 4, 5];
let suma = 0;

for (let i = 0; i < numbersArray.length; i++) {
    suma += numbersArray[i];
}

console.log(`La suma de todos los elementos del array es: ${suma}`); // La suma es 15