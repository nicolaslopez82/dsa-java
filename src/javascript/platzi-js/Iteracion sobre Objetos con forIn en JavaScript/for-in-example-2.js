/*
The for...in statement iterates over all enumerable string properties of an object (ignoring properties keyed by symbols), 
including inherited enumerable properties.
*/

// For in -> Use it for enumerable objects, like Objects with Properties and Methods.

const object = { a: 1, b: 2, c: 3 };

for (const property in object) {
  console.log(`${property}: ${object[property]}`);
}

// Expected output:
// "a: 1"
// "b: 2"
// "c: 3"

//================================================================================================================================//


const car = {
    brand: 'Toyota',
    model: 'Land Crousier M300',
    price: 150000
}

for (const property in car){
  console.log(`${property}: ${car[property]}`);
}