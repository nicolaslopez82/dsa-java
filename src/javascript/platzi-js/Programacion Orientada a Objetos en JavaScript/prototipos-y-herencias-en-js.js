class Animal{

    constructor(nombre, tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    emitirSonido(){
        console.log("El animal esta emitiendo un sonido.");
    }
}

class Perro extends Animal{
    constructor(raza, nombre, tipo){
        super(nombre, tipo);
        this.raza = raza;
    }

    emitirSonido(){
        console.log("El Perro esta ladrando");
    }

    correr(){
        console.log(`El Perro ${this.nombre} esta corriendo.`);
    }
}

const perro1 = new Perro('Criollo', 'Mateo', 'grande');
console.log(perro1);
perro1.correr();
perro1.emitirSonido();

console.log(Animal.prototype);

Perro.prototype.segundoMetodo = function(){
    console.log(`Perro Segundo Metodo ${this.nombre}`);
}

perro1.segundoMetodo();