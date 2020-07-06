var fs = require('fs');

console.log(123);

fs.readFile("start.txt", function(err, data){
    console.log(data.toString());
});