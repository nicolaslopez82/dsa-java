

// slice()

const animals = ['ant', 'bison', 'camel', 'duck', 'elephant']

console.log(animals.slice(2)) // ['camel', 'duck', 'elephant']
console.log(animals.slice(2, 4)) // ['camel', 'duck']
console.log(animals.slice(1, 6)) // ['bison', 'camel', 'duck', 'elephant']
console.log(animals.slice(-2)) // ['duck', 'elephant']
console.log(animals.slice(2, -1)) // ['camel', 'duck']
console.log(animals.slice())// ['ant', 'bison', 'camel', 'duck', 'elephant']

/*
Resumen

¿Cómo funciona el método slice en arreglos?
El método slice en JavaScript es una herramienta poderosa al trabajar con arreglos. Permite extraer una porción de un arreglo sin modificar el arreglo original, lo cual es esencial cuando necesitas manipular o analizar subgrupos de datos sin perder la información completa. En este artículo, exploraremos cómo utilizar slice con ejemplos prácticos que te ayudarán a comprender su utilidad y versatilidad.

¿Cómo se utiliza slice con un solo parámetro?
Slice puede recibir uno o dos parámetros, y cada uno tiene un propósito específico. Cuando utilizas un solo parámetro, este indica el índice desde donde deseas comenzar a extraer los elementos del arreglo.

Ejemplo práctico
Imagínate que tienes un arreglo de diferentes animales:

let animales = ["hormiga", "bisonte", "camello", "pato", "elefante"];
Si deseas extraer los elementos desde el índice 2 (es decir, desde "camello" en adelante), usarías slice de la siguiente manera:

let resultado = animales.slice(2);
console.log(resultado); // ["camello", "pato", "elefante"]
Esto devuelve un nuevo arreglo que comienza desde el índice indicado y continúa hasta el final del arreglo.

¿Cómo se utiliza slice con dos parámetros?
Cuando slice se utiliza con dos parámetros, el primer parámetro indica el inicio y el segundo el final de la porción que deseas extraer. Es importante tener en cuenta que el índice final no se incluye en el resultado.

Ejemplo ilustrativo
Siguiendo con el mismo arreglo de animales:

let resultado = animales.slice(1, 4);
console.log(resultado); // ["bisonte", "camello", "pato"]
En este caso, estás seleccionando desde el índice 1 hasta antes del índice 4, lo que incluye "bisonte", "camello" y "pato".

¿Cómo utilizar índices negativos en slice?
Una de las características más interesantes de slice es la posibilidad de utilizar índices negativos. Estos cuentan desde el final del arreglo, permitiéndote seleccionar fácilmente los últimos elementos.

Ejemplo de índices negativos
Si deseas seleccionar los últimos dos elementos del arreglo:

let resultado = animales.slice(-2);
console.log(resultado); // ["pato", "elefante"]
Aquí, -2 comienza el conteo desde el penúltimo elemento hacia el final del arreglo.

¿Qué se devuelve al usar slice sin parámetros?
Al llamar a slice sin parámetros, obtienes una copia del arreglo original. Esto puede ser útil si necesitas trabajar con una réplica del arreglo para asegurar que el original permanezca sin cambios.

let copia = animales.slice();
console.log(copia); // ["hormiga", "bisonte", "camello", "pato", "elefante"]
Es buena práctica usar slice para crear una copia cuando quieras realizar operaciones que modifiquen el arreglo sin alterar el original.

¿Cuál es la importancia de la inmutabilidad con slice?
Slice se destaca por su inmutabilidad: no modifica el arreglo original al crear subarreglos. Esta característica es crucial en programación funcional y puede prevenir errores, ya que te permite trabajar con datos en escenarios de prueba y error sin preocuparte por cambios inadvertidos en tus datos originales.

El método slice es esencial en el desarrollo de software donde los datos necesitan ser manejados con precisión y cuidado.
*/