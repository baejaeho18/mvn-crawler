var http = require('http');
http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end('Hello from the fabric8 NodeJS example');
}).listen(8080);
console.log('Server running at http://localhost:8080/');
