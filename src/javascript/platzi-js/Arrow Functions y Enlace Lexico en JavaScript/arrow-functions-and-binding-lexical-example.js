const greeting = function (name){
    return `Hi, ${name}`;
}

// Arrow function - explicit return 

const newGreeting = (name) => {
  return `Hi, ${name}`
}

// Arrow funtion - implicit return.
const arrowGreeting = name => `Hi, ${name}`;
const arrowFullNameGreeting = (fistName, lastName) => `Hi, ${fistName}, ${lastName}`

console.log(greeting('Nicolas'));
console.log(arrowGreeting('Lopez'));
console.log(arrowFullNameGreeting('Martin', 'Lopez'));

// Lexical Binding

const functionalCharacter = {
    name: 'Uncle Ben',

    messageWithTraditionalFunction: function (message){
        console.log(`${this.name} says: ${message}`);
    },

    messageWithArrowFunction: message => {
        console.log(`${functionalCharacter.name} says: ${message}`) 
    }
    // this.name is going to be an undefined because I have to use the class' name to refered an instance property. So, functionalCharacter.name.
};

functionalCharacter.messageWithTraditionalFunction('With great power comes great responsability.');
functionalCharacter.messageWithArrowFunction('Beware of Doctor Octopus.');