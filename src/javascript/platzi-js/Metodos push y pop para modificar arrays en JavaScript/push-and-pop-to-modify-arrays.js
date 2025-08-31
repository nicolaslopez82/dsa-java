// Methods that modify the original array (Mutability).

// push();

const countries = ['USA', 'Canada', 'UK'];
const newCountries = countries.push('Germany', 'Australia');

console.log('Countries: ' + countries);
console.log('newCountries: ' + newCountries)

// pop();

const removedCountry = countries.pop();

console.log('countries:' + countries);
console.log('removedCountry with pop(): ' + removedCountry);