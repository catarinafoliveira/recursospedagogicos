const express = require('express');
const app = express();
const server = app.listen(3000, function(){
	console.log("servidor a funcionar na porta %s", server.address().port);
});
app.get('/',function(req,res){
	res.send("Raiz");
});
app.get('/ajuda',function(req,res){
	res.send("Ajuda");
});
app.get('/hora',function(req,res){
	res.writeHead(200,{'Content-Type':'text/html'});
	res.write('<html><body><h1>');
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; 
	var yyyy = today.getFullYear();
	var hh = today.getHours();
	var MM = today.getMinutes();
	res.write(dd+"/"+mm+"/"+yyyy+" "+hh+":"+MM);
	res.write('</h1></body></html>');
	res.end();
});
app.get('/hora2',function(req,res){
    var time = new Date().getTime();
    var date = new Date(time);
    res.send(date.toString()); 
});
app.use('/antigos', express.static('./solucao_html'));