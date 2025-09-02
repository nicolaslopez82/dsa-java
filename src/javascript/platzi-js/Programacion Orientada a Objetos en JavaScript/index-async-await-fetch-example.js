/*
function fetchData(){
    fetch("https://rickandmortyapi.com/api/character")
    .then((response) => response.json())
    .then((data) => console.log(data))
    .catch((error) => console.log(error));
}
    */

async function fetchData(){
    try {
        let response = await fetch("https://rickandmortyapi.com/api/character");
        let data = await response.json();
        console.log(data);
    } catch (error) {
        console.log(error);
    }
}

/*
Resumen

¿Cómo manejar promesas asíncronas en JavaScript utilizando async/await?
El mundo del desarrollo de software está en constante evolución y aprender nuevas formas de escribir código más limpio y eficiente es una habilidad invaluable. ¿Quieres mejorar tu forma de manejar promesas asíncronas? Vamos a explorar dos potentes técnicas de JavaScript: async/await y fetch para hacer peticiones a APIs con ejemplo concreto.

¿Qué son async y await en JavaScript?
Async/await es un paradigma que nos permite escribir código asíncrono de forma más legible y estructurada. En JavaScript, el uso de async/await nos permite manejar promesas de una manera más clara, comparada con los métodos tradicionales que usan .then() y .catch(). Al usar async/await, tu código se ve y se comporta más como el código síncrono, aunque sigue siendo asíncrono. Cuando declaras una función con async, esta automáticamente devuelve una promesa. Por otro lado, await hace que JavaScript espere a que una promesa se resuelva antes de continuar con el siguiente bloque de código.

¿Cómo utilizar fetch para obtener datos de una API?
Para poner en práctica estos conceptos, vamos a hacer una petición a una API pública usando fetch. Este método proporciona una forma fácil de obtener recursos de manera asíncrona a través de la red.

Implementación con .then() y .catch()
function fetchData() {
  fetch('https://rickandmortyapi.com/api/character')
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error('Error:', error));
}

fetchData();
En este script, fetch realiza una solicitud a la API de Rick and Morty. Una vez recibida la respuesta, la convierte a JSON y luego imprime los datos. Si ocurre un error durante la solicitud, el bloque catch lo capturará y lo mostrará en la consola.

Conversión a async/await
async function fetchData() {
  try {
    const response = await fetch('https://rickandmortyapi.com/api/character');
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error('Error:', error);
  }
}

fetchData();
Aquí, al usar async/await, el código se transforma significativamente en términos de legibilidad. La función fetchData es ahora una función async, y las llamadas a fetch y response.json() están precedidas por await, lo que indica que deben completarse antes de pasar a la siguiente línea. Esto hace que el código sea más fácil de leer y entender, especialmente para los desarrolladores que están acostumbrados al flujo lógico de código síncrono.

¿Por qué utilizar async/await?
Legibilidad: Al cambiar a async/await, el flujo de código se vuelve más natural y fácil de seguir.
Error Handling: La gestión de errores se centraliza a través de try/catch, lo que simplifica la depuración.
Simplicidad: Reduce la complejidad asociada con las cadenas de promesas mediante .then().
Nota importante: Async/await es ideal para manejar situaciones donde los pasos deben realizarse secuencialmente, pero sigue siendo necesario recordar que el código es asíncrono y no bloqueante.

Conclusión
El uso de async/await en JavaScript es una práctica moderna que le permite a los desarrolladores manejar la asincronía con mayor elegancia y claridad. Esto, combinado con métodos como fetch, crea un poderoso conjunto de herramientas para hacer solicitudes en la red mucho más manejables. 
*/