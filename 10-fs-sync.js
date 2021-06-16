// Synchronous fs

const {readFileSync, writeFileSync} = require('fs')       // this is similar to const fs = require('fs'); fs.readFileSync

const first = readFileSync('./content/first.txt', 'utf8');
const second = readFileSync('./content/second.txt', 'utf8');

console.log('step 1');
// we can read file using this
// console.log(first);
// console.log(second);

// we can write file
writeFileSync('./content/result-sync.txt', `Here is the result : ${first}, ${second}`);
// writeFileSync('./content/result-sync.txt', `Here is the result : ${first}, ${second}`, {flag : 'a'});
console.log('step 2');
console.log('step 3');




/*
now this will print all console.log steps as it is 
this is why it is called as synchronous 

this will take lot of time if there are 10 users and all of them wants to get this functionality

op:
step 1
step 2
step 3
*/