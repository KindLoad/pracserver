//split을 2중으로 하여 처리
var fs = require('fs');
var readline = require('readline');

fs.readFile('./practice/exam1_imf.txt', function(err, data){
    var first_split_result = data.toString().split('\r\n');

    for(var i = 0 ; i < first_split_result.length ; i++){
        var second_split_result = first_split_result[i].split(' ');
        console.log(second_split_result[0]);
    }
});