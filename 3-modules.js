// CommonJS, every file is module (by default) 
// Modules - Encapsulated code (only share minium)

// this tutorial is basially about how to connect files to each other
// 3, 4, 5, 6, 7 files are connected

// ************************** Example 1 **************************
// using this line we accessed names and function from diffrent files using module.exports
const names = require('./4-names')
const sayHi = require('./5-utils');

console.log(names);
// console.log(sayHi);


// now neither function nor names are in this file but still we can access thems
// sayHi('shridhar')
// sayHi(names.john)
// sayHi(names.peter)



// ************************** Example 2 **************************
const data = require('./6-alternative-flavour');
console.log(data);


// ************************** Example 3 **************************
// now with this line we can directly run funtion from file number 7
// require('./7-mind-grenade');