// Asynchronous fs
const {readFile, writeFile} = require('fs')       // this is similar to const fs = require('fs'); fs.readFileSync


//without this 'utf8' op will be in buffer format(encoded format)  utf8 is a decoder
console.log('step 1');
readFile('./content/first.txt', 'utf8', (err, result) =>{
    if (err){
        console.log(err);
        return;
    }
    const first = result;
    
    // for file 2
    readFile('./content/second.txt', 'utf8', (err, result) => {
        if (err){
            console.log(result);
            return;
        }
        const second = result;
        // for writing into new file if file is not there it will be created
        writeFile('./content/result-async.txt', `Here is your result : ${first}, ${second}`, (err, result) =>{
            if (err){
                console.log(err);
                return;
            }
            console.log('step 2');
        })
    })
})
console.log('step 3');




/*
now this will not run call console log as it is since this is async

this will start running function and then jump to the end of a function, therefore both function and code will run side by side even if there are 10 users

op:
step 1
step 3
step 2
*/