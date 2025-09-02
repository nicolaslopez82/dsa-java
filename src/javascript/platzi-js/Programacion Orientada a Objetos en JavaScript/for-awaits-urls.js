async function fetchData(){
    try {
        let response = await fetch("https://rickandmortyapi.com/api/character");
        let data = await response.json();
        console.log(data);
    } catch (error) {
        console.log(error);
    }
}

const urls = [
    "https://rickandmortyapi.com/api/character",
    "https://rickandmortyapi.com/api/location",
    "https://rickandmortyapi.com/api/episode"
];

async function fetchBatchData(){
    try {
        for await(let url of urls){
            let response = await fetch(url);
            let data = await response.json();
            console.log(data);
        }
    } catch (error) {
        console.log(error);
    }
}

/*
Resumen

¿Cómo realizar múltiples peticiones HTTP de forma eficiente en JavaScript?
¿Alguna vez te has enfrentado a la necesidad de realizar múltiples peticiones HTTP en un proyecto de desarrollo web? Este es un desafío común, especialmente cuando interactuamos con varias APIs al mismo tiempo. La solución más eficiente es usar el ciclo for await...of, combinando async y await para ejecutar promesas de manera asíncrona. Esto no solo hace que el código sea más limpio, sino que también mejora el rendimiento y la experiencia del usuario al no bloquear la carga de otros elementos en la aplicación.

¿Qué es y cómo funciona for await...of?
El for await...of es una herramienta poderosa en JavaScript. Es un bucle que permite iterar sobre objetos asíncronos, como promesas, de manera que podemos esperar a que cada una se resuelva antes de continuar con la siguiente. La sintaxis es intuitiva y se adapta bien cuando necesitas trabajar con múltiples solicitudes HTTP.

Por ejemplo, digamos que tienes un array de URLs de una API, como la de Rick and Morty. Puedes iterar sobre cada URL y realizar una petición fetch asíncrona de la siguiente manera:

async function fetchNewData() {
  const URLs = [
    'url1',  // Reemplazar con URLs reales
    'url2',
    'url3'
  ];

  try {
    for await (let URL of URLs) {
      let response = await fetch(URL);
      let data = await response.json();
      console.log(data);
    }
  } catch (error) {
    console.error('Error:', error);
  }
}

fetchNewData();
¿Cómo estructurar el código para manejar errores?
Manejar errores es fundamental cuando trabajas con peticiones asíncronas. Utilizar bloques try...catch es la manera recomendada para capturar y manejar errores, como fallas en las solicitudes de red. Esto asegura que tu aplicación no falle por completo si una de las peticiones falla y puedes reaccionar adecuadamente, por ejemplo, mostrando un mensaje de error al usuario.

Dentro del ciclo for await, el bloque try se encarga de realizar la fetch y convertir la respuesta a formato JSON. Si alguna de estas operaciones falla, el control pasa al bloque catch, donde podemos manejar el error de manera elegante.

¿Cuáles son los beneficios de usar for await...of en proyectos reales?
Rendimiento sin bloqueo: La ejecución de peticiones de manera asíncrona permite al navegador seguir procesando otros elementos de la interfaz de usuario, mejorando la experiencia.
Código más limpio y manejable: Al usar async/await, tu código se vuelve más legible y fácil de mantener comparado con las promesas tradicionales o los callbacks.
Escalabilidad: Puedes fácilmente adaptar este enfoque para manejar más URLs o añadir lógica adicional al proceso de cada respuesta.
Implementar estas técnicas en tus proyectos no solo optimiza su rendimiento, sino que también proporciona una base robusta para manejar escenarios complejos donde múltiples elementos de datos deben ser cargados y procesados simultáneamente. Así que, ¡anímate a aplicar for await...of en tus futuros desarrollos y experimenta la eficiencia y fluidez mejorada de tus aplicaciones!
*/