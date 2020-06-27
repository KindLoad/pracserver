//소켓 프로그래밍 관련

var net = require('net');

var ip = '127.0.0.1';
var port = 3000;

var socket = new net.Socket();
socket.connect({host:ip, port:port}, function(){

    var message = 'this is exam';

    socket.write(message);
    console.log(message);
    socket.end();

    socket.on('data', function(data){
        console.log(data.toString());
    })
})