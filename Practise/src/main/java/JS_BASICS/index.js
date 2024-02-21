let person = {
    name: 'Mosh',
    age: 30};

//Dot Notation
person.name = 'John'

//Bracket Notation
//person['name'] = 'Mary'
let selection = 'name';
person[selection] = 'Mary';

console.log(person.name)

let selectedColors = ['red','blue'];
selectedColors[2] = 1;
console.log(selectedColors.length);

function greet(name, lastname) {
    console.log('Hello World '+ name + ' ' + lastname);
}

function square(number) {
    return number * number
}
greet(person.name, 'Smith');

console.log(square(2));

