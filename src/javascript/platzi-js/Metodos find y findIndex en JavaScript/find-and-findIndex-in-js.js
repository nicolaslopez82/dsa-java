// find y findIndex. 
// Estos métodos no modifican el array original, sino que nos ayudan a encontrar elementos específicos y sus índices, 
// basándonos en una condición determinada.

// El método find de JavaScript nos devuelve el primer elemento de un array que cumple con una condición especificada en una función de prueba. 
// Supongamos que tenemos un array de números y queremos encontrar el primer número mayor a 10:

const multipleOfFive =  [5, 10, 15, 20];
const firstNumberGreaterThanTen = multipleOfFive.find(number => number > 10);

console.log(multipleOfFive); // Imprime: [5, 10, 15, 20]
console.log(firstNumberGreaterThanTen); // Imprime: 15

// En este ejemplo, find evalúa cada elemento del array multiplosDeCinco y devuelve el primer número que sea mayor a 10, que es 15. 
// El array original no sufre ninguna modificación.

// ¿Cuál es la diferencia entre find y findIndex?
// Mientras que find nos proporciona el elemento que satisface la condición, 
// findIndex nos devuelve el índice (la posición dentro del array) del primer elemento que cumple con la condición especificada.

const randomNumbers = [6, 14, 27, 56, 40];
const indexOfNumberGreaterThanFifty = randomNumbers.findIndex(num => num > 50);
console.log(randomNumbers); // Imprime: [6, 14, 27, 56, 40]
console.log(indexOfNumberGreaterThanFifty);  // Imprime: 3

// En este caso, findIndex busca el primer número mayor a 50 en el array randomNumbers y devuelve su índice, 
// que en este caso es 3, correspondiente al número 56. Al igual que con find, el array original se mantiene inalterado.

/*
Recomendaciones para utilizar find y findIndex
Cuando trabajes con grandes volúmenes de datos y necesites realizar búsquedas específicas, estos métodos se convierten en herramientas valiosas. Te recomendamos:

Utilizar find cuando necesites el elemento en sí.
Optar por findIndex cuando solo necesites la posición del elemento.
*/