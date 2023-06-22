const express = require('express');
const app = express();
const server = app.listen(3000, function(){
	console.log("servidor a funcionar na porta %s", server.address().port);
});

const { Sequelize, Model, DataTypes } = require('sequelize')
const seq = new Sequelize('mysql://root:@localhost/carros');

app.use('/fotos', express.static('./fotos'));

app.get('/carros_s',function(req,res,next){
	var Marca = seq.define('marca', {
		mc_id: { type: Sequelize.INTEGER, primaryKey: true },
		mc_marca: { type: Sequelize.STRING }
	},{
		freezeTableName: true,
		timestamps: false
	});
	Marca.findAll().then(marca => {
		//console.log("All marca:", JSON.stringify(marca, null, 4));
		//console.log(marca[1].dataValues['mc_id']);
		res.writeHead(200,{'Content-Type':'text/html'});
		res.write('<html><body><h1>Carros</h1><table>');
		res.write('<table><tr><th>Cod Marca</th><th>Nome Marca</th></tr>');
		for(x=0; x < marca.length; x++){
			var str = "<tr><td>" + marca[x].mc_id + "</td><td>" + marca[x].mc_marca + "</td></tr>";
			console.log(marca[x]);
			res.write(str);
		}
		res.write('</table></body></html></body></html>');
		res.end();
	});	
}); 