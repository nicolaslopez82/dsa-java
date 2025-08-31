/*
Resumen

¿Cuáles son los métodos Filter y Reduce y cómo funcionan?
Filter y Reduce. Ambos son herramientas poderosas que no alteran el array original, permitiendo filtrar y reducir datos de manera eficiente.
*/

// ================================ F I L T E R ==========================================================================================================//

/*
¿Cómo utilizar el método Filter?
El método Filter crea un nuevo array con todos los elementos que pasan la condición implementada en la función de prueba proporcionada. Imagínate tener un array de números y desear únicamente aquellos que cumplan una cierta condición, como ser mayores a un número específico.

Ejemplo básico de Filter
Veamos un ejemplo práctico y sencillo:
 */

let numbers = [2, 3, 4, 5, 6, 7, 8, 9, 10];
let evenNumbers = numbers.filter(number => number % 2 === 0);
console.log(evenNumbers);

// En este bloque de código, filter recibe una función flecha que evalúa si cada número del array es par 
// (i.e., el módulo de 2 es cero), retornando un nuevo array con estos números pares.

// ================================ R E D U C E ==========================================================================================================//

/* 
¿En qué consiste el método Reduce?
A diferencia de Filter, el método Reduce toma una array y lo reduce a un único valor aplicando una función que se ejecuta en cada valor del array, de izquierda a derecha. Un uso clásico de reduce es la suma de todos los elementos de un array.

Ejemplo básico de Reduce
Observemos cómo funciona reduce al sumar números:
*/

const numberReduce = [1, 2, 3, 4, 5];
const sum = numberReduce.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
console.log(sum);
// Aquí, reduce acumula cada valor del array en el accumulator comenzando desde cero (initialValue) hasta que se logra la suma total del array.


/*
¿Qué otras aplicaciones tiene Reduce?
Reduce es versátil y puede utilizarse para casos más complejos, como contar la frecuencia de apariciones de palabras en un array.
*/

// Contando elementos con Reduce
// Veamos cómo contar cuántas veces se repite cada palabra en un array:

const words = ['apple', 'banana', 'hello', 'bye', 'banana', 'bye', 'bye'];
const frecuency = words.reduce((accumulator, currentValue) => {
    if(accumulator[currentValue] == (accumulator[currentValue] || 0 + 1)){
        accumulator[currentValue]++;
    }else{
        accumulator[currentValue] = 1;
    }
    return accumulator;
}, {});
console.log(frecuency);

// En este ejemplo, usamos un objeto como acumulador donde cada vez que encontramos una palabra, 
// incrementamos su conteo en el objeto, obteniendo así la frecuencia de cada palabra.