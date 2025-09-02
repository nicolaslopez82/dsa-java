

function Person(name, age){
        this.nombre = name;
        this.edad = age;
}

const persona1 = new Person('Martin', 30);
const persona2 = new Person('Rivero', 70);

console.log(persona1);
console.log(persona2);

Person.prototype.phone = '555-6666-7777';

Person.prototype.greeting = function(){console.log(`Hi, ${this.nombre}`);};

const persona3 = new Person('Dani', 33);
const persona4 = new Person('Sabri', 30);

persona1.greeting();
persona2.greeting();
persona3.greeting();
persona4.greeting();

persona1.nacionalidad = 'Argentina';

console.log(persona1);
console.log(persona4);


