/*¿Qué son las clases en JavaScript?
Una clase en JavaScript actúa como un blueprint o plano para crear objetos. Imagínalo como un molde, a partir del cual se pueden construir múltiples instancias o copias de un objeto. La definición de clase facilita la estructuración y organización de codificaciones, ya que permite separar claramente las propiedades y los métodos que lo caracterizan.

¿Cómo se define una clase con la nueva sintaxis en JavaScript?
La creación de una clase comienza con la palabra reservada class, seguida del nombre de la clase, que por convención, empieza con mayúscula. Después de definir el cuerpo de la clase con llaves {}, se introduce el método constructor. Un ejemplo simple sería una clase Persona con propiedades nombre y edad.
*/


class Person{
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    greeting(){
        console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);    
    }
}

const personExample1 = new Person('Mateo', 2);
const personExample2 = new Person('Milka', 5);

console.log(personExample1);
console.log(personExample2);
personExample1.greeting();
personExample2.greeting();

class Persona {
  constructor(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  saludar() {
    console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
  }
}

/*
¿Cómo se crean instancias de una clase en JavaScript?
Una instancia es una manifestación concreta de la clase. Utilizar la palabra new junto con el nombre de la clase permite crear estas instancias. Este proceso activa el constructor, asignando valores a las propiedades definidas.
*/
const persona1 = new Persona('Mariana', 25);
persona1.saludar(); // Hola, mi nombre es Mariana y tengo 25 años.

/*
¿Qué beneficios ofrecen las clases en la programación orientada a objetos?
Simplicidad y claridad: La sintaxis de las clases resulta más natural y sencilla para quienes provienen de otros lenguajes de programación orientados a objetos.
Reutilización de código: Los blueprints permiten crear múltiples objetos similares sin necesidad de redefinir sus características cada vez.
Organización del código: Al separar claramente métodos y propiedades, las clases facilitan el mantenimiento y la comprensión del código.
Encapsulamiento: Aunque JavaScript no implementa encapsulamiento de manera robusta como otros lenguajes, las clases permiten una mejor centralización de propiedades y métodos.
*/