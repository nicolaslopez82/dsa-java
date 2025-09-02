const promise = new Promise(
    (resolve, reject) => {
        setTimeout( () => {
            let operationSuccessful = true;
            if(operationSuccessful){
                resolve("La operacion fue exitosa!");
            }else{
                reject("Fallo la operacion.");
            }
        }, 2000);
    }
);

promise
    .then((successMessage) => {
        console.log(successMessage);
    })
    .catch((errorMessage) => {
        console.log(errorMessage);
    })

/*
Resumen

¿Cómo funciona JavaScript engine en el navegador?
Para entender cómo se maneja la ejecución del código JavaScript, es crucial comprender los componentes clave de su motor de ejecución en los navegadores: el Memory Heap y el Call Stack.

¿Qué es el Memory Heap?
El Memory Heap es el espacio donde se almacenan variables, funciones y objetos creados en JavaScript de forma aleatoria. Actúa como un almacén desorganizado donde el navegador gestiona la memoria de manera eficiente, permitiendo que las aplicaciones JavaScript funcionen sin problemas.

¿Cómo opera el Call Stack?
El Call Stack es una pila de tareas donde se registran las funciones que deben ejecutarse. Cuando se llama a una función, esta se agrega al Call Stack, ejecutándose de manera secuencial. Por ejemplo, si tienes una función holaMundo que llama a otra función miNombreEsDiego, el Call Stack ejecutará primero holaMundo y luego miNombreEsDiego, de forma simple y secuencial.

¿Qué es la programación síncrona en JavaScript?
En un entorno síncrono, JavaScript ejecuta una tarea a la vez en el Call Stack. Este enfoque puede llegar al temido Stack Overflow, una situación en la que el Call Stack se llena más allá de su capacidad y el navegador puede bloquearse. Para solventar este problema, el navegador debe cerrarse y abrirse nuevamente.

JavaScript, por naturaleza, funciona de forma síncrona, ejecutando cada línea de código en orden. Sin embargo, ciertos mecanismos permiten que JavaScript también pueda manejar tareas asincrónicamente.

¿Cómo se realiza la programación asíncrona?
¿Qué son las Web APIs?
Las Web APIs son herramientas que permiten que JavaScript ejecute tareas de manera asíncrona, proporcionando simultaneidad. Cuando una función de Web API se llama, se transfiere a la sección de las Web APIs y se ejecuta en paralelo al Call Stack. Una vez completada, la tarea se mueve al Queue.

¿Qué es el Event Loop?
El Event Loop interroga constantemente al Call Stack para verificar si está vacío. Cuando lo está, extrae una tarea del Queue y la transfiere al Call Stack para ejecutar. De este modo, tareas asincrónicas se integran ordenadamente en el flujo de ejecución.

Ejemplo de setTimeout en programación asíncrona
Considera un caso donde se utiliza setTimeout, una función que actúa asincrónicamente:

function varFunc() {
  console.log(1);
  setTimeout(() => console.log(2), 0);
  console.log(3);
}
La secuencia de ejecución sería:

console.log(1) se ejecuta primero.
setTimeout() transfiere el console de 2 al Queue.
console.log(3) se ejecuta.
Una vez que el Call Stack está vacío, el event loop mueve el console de 2 del Queue al Call Stack.
El resultado en consola sería: 1, 3 y 2. Aunque setTimeout parece ser instantáneo, su resultado aparece solo cuando el Stack está vacío.

¿Qué son las promesas en JavaScript?
Las promesas en JavaScript, al igual que las funciones de Web API, facilitan la programación asíncrona. Permiten que funciones específicas se ejecuten en paralelo al flujo principal, mejorando la eficiencia y evitando cuellos de botella en aplicaciones de alto rendimiento.

¿Cuál es el uso de async/await?
async y await son sintaxis modernas para manejar promesas, haciendo que el código asíncrono se vea y se lea como si fuera síncrono. Proporcionan una forma más clara y manejable de estructurar código asincrónico, especialmente en operaciones complejas o jerárquicas.

*/

// =========================================================================================================================================================//

/*
Resumen

¿Qué son las promesas en JavaScript?
Las promesas son una herramienta poderosa para transformar nuestro código de JavaScript de un modelo síncrono a uno asíncrono. Funcionan al indicar al navegador que ciertas funciones deben ejecutarse de manera independiente. Una vez resueltas, las promesas se integran en el call stack para proporcionar un resultado. Mediante su uso, podemos manejar tareas asíncronas de manera más fluida y organizada.

¿Cuáles son los estados de las promesas?
Las promesas presentan tres estados fundamentales durante su ciclo de vida:

Pending (pendiente): Este es el estado inicial. La promesa está creada pero aún no se ha resuelto ni ha fallado.
Fulfilled (resuelta): Indica que la promesa se ha completado con éxito.
Rejected (rechazada): Ocurre cuando la promesa no se puede cumplir, produciendo un error.
¿Qué funciones de callback usan las promesas?
Las promesas trabajan con dos tipos de funciones de callback:

Resolve: Se ejecuta cuando la promesa se resuelve exitosamente.
Reject: Se activa cuando la promesa no se puede completar, indicando un fallo.
¿Cómo utilizar métodos como then y catch con promesas?
Las promesas vienen con dos métodos esenciales para gestionar su resultado:

Then: Se ejecuta cuando la promesa se resuelve. A través de este método, podemos llevar a cabo acciones basadas en el resultado exitoso de una promesa.
Catch: Se utiliza para manejar errores. Si la promesa falla, el catch nos proporciona la información necesaria para entender por qué no se resolvió.
Aquí tienes un ejemplo de código ilustrando cómo manejar una promesa asíncrona aprovechando un setTimeout:

const promesa = new Promise((resolve, reject) => {
  const operationSuccessFull = true;

  setTimeout(() => {
    if (operationSuccessFull) {
      resolve('La operación fue exitosa');
    } else {
      reject('La operación falló');
    }
  }, 2000);
});

promesa
  .then(successMessage => {
    console.log(successMessage);
  })
  .catch(errorMessage => {
    console.error(errorMessage);
  });
¿Cómo crear y manejar promesas en JavaScript?
Crear una promesa implica declarar una constante e instanciar una nueva promesa, donde especificamos las funciones resolve y reject que manejarán el resultado. Dentro, podemos simular, por ejemplo, una petición a un API usando un setTimeout. Este temporizador nos permite retrasar la ejecución, indicando un manejo asíncrono:

const myPromise = new Promise((resolve, reject) => {
  let mockApiResponse = true; // Simulación de una respuesta de API

  setTimeout(() => {
    if (mockApiResponse) {
      resolve('Operación completada con éxito');
    } else {
      reject('Error en la operación');
    }
  }, 3000);
});

// Uso de then y catch para manejar el resultado
myPromise
  .then(result => console.log(result))
  .catch(error => console.error(error));
Este ejemplo demuestra el uso básico de promesas para ejecutar un código asíncrono que resuelve una operación tras un retraso. Mediante las funciones then y catch, capturamos y gestionamos los resultados de una acción, ya sea exitosa o fallida. Con esta base, podrás implementar flujos más complejos en tus proyectos de JavaScript, mejorando el rendimiento y la experiencia de usuario.
*/