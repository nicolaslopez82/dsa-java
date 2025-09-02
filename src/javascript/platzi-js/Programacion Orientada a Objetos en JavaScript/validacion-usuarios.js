/* 
Requerimientos del reto:

1. El usuario debe poder ingresar su usuario y contraseÃ±a
2. El sistema debe ser capaz de validar si el usuario y contraseÃ±a ingresados por el usuario existen en la base de datos
3. Si el usuario y contraseÃ±a son correctos, el sistema debe mostrar un mensaje de bienvenida y mostrar el timeline del usuario.
4. Si el usuario y contraseÃ±a son incorrectos, el sistema debe mostrar un mensaje de error y no mostrar ningun timeline.

*/

const usersDatabase = [
  {
    username: "andres",
    password: "123",
  },
  {
    username: "caro",
    password: "456",
  },
  {
    username: "mariana",
    password: "789",
  },
];

const usersTimeline = [
  {
    username: "Estefany",
    timeline: "Me encata Javascript!",
  },
  {
    username: "Oscar",
    timeline: "Bebeloper es lo mejor!",
  },
  {
    username: "Mariana",
    timeline: "A mi me gusta mÃ¡s el cafÃ© que el tÃ©",
  },
  {
    username: "Andres",
    timeline: "Yo hoy no quiero trabajar",
  },
];

const username = prompt(`Ingrese el Usuario`);
const password = prompt(`Ingrese su Password`);

console.log(username);
console.log(password);

function existeUsuario(username, password){
    for(let i; i < usersDatabase.length; i++){
        if(usersDatabase[i].username === username
            && usersDatabase[i].password === password
        ){
            return true;
        }
    }
    return false;
}

function signIn(username, password){
    if(existeUsuario(username, password)){
        alert(`Bienvenido a tu cuenta ${username}`);
        console.log(usersTimeline);
    }else{
        alert("Uuups, usuario o contraseÃ±a incorrectos!");
    }
}

signIn(username, password);