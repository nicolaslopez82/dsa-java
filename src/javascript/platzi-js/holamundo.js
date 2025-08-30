let cajaDeNico = 'Nico Box.';
console.log(cajaDeNico);


// String
let sNombre = 'Nicolas';

// number
let number = 12;

// boolean
let esMayorDeEdad = false;

// null
let noHayValor = null;

// undefined
let noDefinido = undefined;

// Symbol
 let simboloUnico = Symbol('unico');
console.log(simboloUnico);

 // BigInt
 let numeroGrande = 2n;

 // Objetos
 let car = {
    marca: 'Toyota',
    modelo: 'Land Crusier'
 }

 // Arrays
 let paises = ['Argentina', 'Canada', 'USA', 'Republica Checa', 'Andorra'];

 // Function

 function saludar(){}

 let string1 = 'Nicolas'
 let string2 = "Martin"
 let string3 = `${string1} Lopez`
 console.log(string3);
 let string4 = string1 + ' ' + string2;
 console.log(string4);

 let frase = 'Learning JS, again';
 console.log(frase.length);

 // Precision numerica
 const resultado = 0.1 + 0.2;
 console.log(resultado.toFixed(1));
 if(resultado == 0.3){
    console.log('resultado is true');
 }else {
    console.log('resultado is false');
 }

 const raizCuadrada = Math.sqrt(16);
 const valorAbsoluto = Math.abs(-7);
 const aleatorio = Math.random();

 console.log(raizCuadrada);
 console.log(valorAbsoluto);
 console.log(aleatorio);

let pais = 'Canada';

 switch(pais){
    case 'Canada':
        console.log('canada');
        break;

    case 'Arg':
        console.log('Arg');
        break;

    case 'Chile':
        console.log('Chile');
        break;

    default:
        console.log('Nada');
        break;
 }