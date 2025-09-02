/*
¿Qué son los objetos en programación?
Los objetos son un concepto fundamental en programación, especialmente en la programación orientada a objetos. Se pueden considerar como estructuras de datos que permiten agrupar información en un formato de "propiedad-valor". Este concepto es crucial para representar entidades del mundo real en el ámbito digital, permitiendo abstraer y estructurar información de forma organizada.

¿Cómo se estructura un objeto?
Un objeto se compone de propiedades y valores. Cada propiedad representa un atributo del objeto y está asociada a un valor. La síntaxis típica para representar un objeto es a través de llaves {} y dentro se definen pares de propiedad: valor.

¿Cómo se pueden generar acciones en objetos?
Los objetos no solo almacenan datos, también pueden ejecutar acciones a través de métodos. Un método es básicamente una función asociada a un objeto. Estas funciones permiten a los objetos realizar acciones, como interacciones o cálculos.

Ejemplo de método dentro de un objeto & Ejemplo de objeto en JavaScript:
*/

const persona = {
    nombre: "Nicolas",
    edad: 42,
    direccion: {
        calle: "Tribulato",
        numero: 700,
        cp: 1663,
        ciudad: "San Miguel",
        localidad: "San Miguel",
        provincia: "Buenos Aires",
        pais: "Argentina"
    },
    saludar: function(){
      return `Hola, mi nombre es: ${this.nombre}`;
    },

    greeting() {
        console.log(`Hola, mi nombre es: ${this.nombre} ${this.direccion.calle}`);
    }
};

// Imprimamos el objeto

console.log(persona);

// Imprimamos la propiedad nombre

console.log(persona.nombre);

// Imprimamos el metodo saludar

persona.saludar();

// Imprimamos el metodo greeting

persona.greeting();

// En este caso, saludar es un método del objeto persona que devuelve un saludo utilizando la propiedad nombre del mismo objeto.

// Agrergamos una propiedad al objeto en este caso telefono

persona.telefono = "555-555-5555";

console.log(persona.telefono);

// Agregamos un metodo al objeto

persona.mostrarPais = () => console.log(`Pais: ${persona.direccion.pais}`);

persona.mostrarPais();

// Eliminar una propiedad de un objeto

delete persona.telefono;

console.log(persona.telefono);

/*   
Aplicaciones prácticas de los objetos
Modelado de entidades: Permiten modelar cualquier cosa del mundo real, como usuarios, productos o vehículos.

Reutilización de código: Los objetos pueden contener métodos reutilizables, facilitando la creación de código modular.

Mantenimiento y escalabilidad: Fomentan un diseño de código organizado y escalable, manejable a medida que los proyectos crecen.

Interacción y dinámica: Agregan dinamismo a las aplicaciones al permitir la ejecución de funciones específicas del objeto.
*/