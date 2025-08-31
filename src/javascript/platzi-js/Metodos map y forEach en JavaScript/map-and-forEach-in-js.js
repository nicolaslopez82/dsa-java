// ================================ M A P ===================================================================================================================//
// El método map es uno de los métodos de arrays más poderosos y versátiles en JavaScript. 
// Este método crea un nuevo array al aplicar una función proporcionada a cada elemento del array original. 
// Lo más relevante de map es que no modifica el array original, sino que devuelve un nuevo array con los resultados de la función aplicada.

//Ejemplo de uso de map
//Supongamos que tenemos un array de números. Queremos elevar al cuadrado cada número en el array. Usando map, esto se vería de la siguiente manera:

const numbers = [1, 2, 3, 4, 5];
const squaredNumbers = numbers.map(num => num * num);
console.log(numbers);
console.log(squaredNumbers);

// En este ejemplo, numbers es el array original que permanece inalterado, mientras que squaredNumbers es el nuevo array con cada elemento elevado al cuadrado.


// ================================ F O R E A C H ==========================================================================================================//

// El método forEach también itera sobre cada elemento de un array y ejecuta una función para cada uno de ellos. 
// Sin embargo, a diferencia de map, forEach no crea un nuevo array ni devuelve ningún resultado. 
// Simplemente ejecuta una función proporcionada para cada elemento.

// Ejemplo de uso de forEach
// Veamos cómo iterar sobre un array de colores e imprimir cada color en la consola:

const colors = ['red', 'pink', 'blue'];
colors.forEach(color => console.log(color))

/* 
Comparación práctica de map y forEach
Cuando decides utilizar uno de estos métodos, la elección depende de lo que necesitas hacer con el resultado:

Usa map cuando quieras transformar cada elemento de un array en algo nuevo y obtener un nuevo array como resultado.
Usa forEach cuando necesites ejecutar una acción para cada elemento sin preocuparte por crear o devolver un nuevo array.
*/

// Ejemplo práctico: Conversión de temperaturas:
// Imagine que tiene temperaturas en Fahrenheit y necesita convertirlas a Celsius. 
// Este es un ejemplo clásico donde map sería ideal porque queremos transformar y obtener un nuevo array con los valores convertidos.

const tempsInFahrenheit = [32, 68, 95, 212];
const tempsInCelsius = tempsInFahrenheit.map(fahrenheit => (5/9) * (fahrenheit - 32) );
console.log('tempsInFahrenheit:' + tempsInFahrenheit);  // [32, 68, 95, 212]
console.log('tempsInCelsius: ' + tempsInCelsius);  // [0, 20, 35, 100]

// Ejemplo práctico: Suma de elementos de un array.
// En este caso, queremos sumar todos los elementos de un array. 
// Un enfoque típico sería usar forEach, ya que estamos realizando una operación acumulativa y no necesitamos un nuevo array.

const numeros = [1, 2, 3, 4, 5];
let sum = 0;
numeros.forEach(numero => sum+= numero);
console.log('Sumatoria: ' + sum); // 15

// En este caso, forEach recorre el array y suma cada elemento a una variable acumuladora suma.

// Conclusion: Recuerda que map es ideal para transformar y obtener nuevos arrays, 
// mientras que forEach es excelente para operaciones que no necesitan devolver un nuevo array. 