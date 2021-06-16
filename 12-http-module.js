const { create } = require('domain');
const http = require('http');

// req = incoming request
const server = http.createServer((req, res) =>{
    if (req.url === '/'){
        res.end('welcome to our homepage')
    }
    if (req.url === '/about'){
        res.end('here is our short history')
    }
    else{
        res.end(`
        <h1>Oops!</h1>
        <p>we can't seem to have page you are looking for</p>
        <a href="/">
    `)
    }
})

server.listen(5000);