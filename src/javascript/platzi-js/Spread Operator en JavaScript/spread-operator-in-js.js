// Resumen

// ¿Qué es el Spread Operator y cómo se utiliza?
// El Spread Operator es una herramienta poderosa en JavaScript 
// que te permite manipular arreglos y objetos de manera flexible y eficiente. 
// Su representación se hace mediante tres puntos (...), y es utilizado en diversas acciones, 
// como copiar arreglos, combinarlos, añadir elementos, o incluso, pasar parámetros a funciones.

// ¿Cómo copiar un arreglo sin modificar el original?
// Copiar un arreglo es una de las aplicaciones más básicas del Spread Operator. 
// Supongamos que tienes un arreglo original del cual deseas crear una copia para no afectar el original al realizar modificaciones. 
// El código para efectuar esta operación es sencillo:

const originalArray = [1, 2, 3, 4, 5];
const copiedArray = [...originalArray];

console.log('Original:', originalArray);
console.log('Copiado:', copiedArray);

// Este método es útil para preservar datos originales que podrían resultar afectados por cambios involuntarios en tu código.

// ¿Cómo combinar arreglos con Spread Operator?
// El proceso de combinar arreglos es otro uso común del Spread Operator. Es posible fusionar múltiples arreglos en uno solo fácilmente:

const array1 = [1, 2, 3];
const array2 = [4, 5, 6];

const combinedArray = [...array1, ...array2];
console.log('array1: ', array1);
console.log('array2: ', array2);
console.log('Array combinado:', combinedArray);

// Al utilizar el Spread Operator, es sencillo extender el contenido de varios arreglos para crear estructuras de datos 
// compuestas, evitando operaciones más complejas y menos eficientes.

// ¿Cómo crear un nuevo arreglo con elementos adicionales?
// El Spread Operator también es práctico para crear nuevos arreglos que incluyan elementos adicionales sin modificar los originales. 
// Este enfoque es útil cuando necesitas construir un nuevo conjunto de datos con una base preestablecida:

const baseArray = [1, 2, 3];
const extendedArray = [...baseArray, 4, 5, 6];
console.log('Array extendido:', extendedArray);

// Esta técnica permite agregar elementos de manera directa y sencilla, evitando alterar los datos originales.

// ¿Cómo pasar elementos de un arreglo a una función?
// Al trabajar con funciones que requieren múltiples argumentos, el Spread Operator facilita el paso de los
// elementos de un arreglo como parámetros:

function sum(a, b, c) {
  return a + b + c;
}

const numbers = [1, 2, 3];
const result = sum(...numbers);

console.log('Resultado de la suma:', result);

// Este método reduce la complejidad al manejar funciones con varios parámetros, permitiendo pasar directamente arreglos que 
// contienen todos los valores necesarios.

// El Spread Operator es además compatible con objetos y puede ser empleado para realizar operaciones similares a las mencionadas con arreglos.