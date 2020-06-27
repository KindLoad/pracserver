var net = require('net');
var server = net.createServer(function(socket){
    socket.on('data', function(data){
        socket.write(data.toString());
    })

    socket.on('end', function(){
        console.log('unconnect client');
    });
});


server.listen(3000);