const express = require('express');
const app = express();
const server = app.listen(3000, function(){
	console.log("servidor a funcionar na porta %s", server.address().port);
});
const ligacao = require('../connect');

app.use('/fotos', express.static('./fotos'));


app.get('/carros_m',function(req,res,next){
	ligacao.con.query("SELECT mc_marca, md_modelo, md_cilindrada, md_fotografia FROM marca, modelo WHERE mc_id = md_marca", function(err,rows,fields){
		if(!err){
			res.writeHead(200,{'Content-Type':'text/html'});
			res.write('<html><body><h1>Carros</h1><table>');
			res.write('<table><tr><th>Marca</th><th>Modelo</th><th>Cilindrada</th><th>Fotografia</th></tr>');
			for(x=0; x < rows.length; x++){
				var str = "<tr><td>" + rows[x].mc_marca + "</td><td>" + rows[x].md_modelo + "</td><td>" + rows[x].md_cilindrada + "</td><td><img src='fotos/" + rows[x].md_fotografia + "' width='100' height='50'></td></tr>";
				res.write(str);
			}
			res.write('</table></body></html>');
			res.end();
		} else {
		console.log(err);
		}
	});
});