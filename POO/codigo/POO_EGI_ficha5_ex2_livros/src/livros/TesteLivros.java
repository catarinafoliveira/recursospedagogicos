package livros;

import java.util.ArrayList;

import utilitarios.Data;

public class TesteLivros {
	public static void main(String[] args) {
		Livro livro1 = new Livro("POO em Java", new Pessoa("Mário Martins",new Data()), new Data(2017,1,1), "FCA", 37.75);
		Livro livro2 = new Livro("Programação em Java", new Pessoa("Pedro Coelho",new Data()), new Data(2012,1,1), "FCA", 40.99);

		Livro livro3 = new Livro("POO em Java", new Pessoa("Mário Martins",new Data()), new Data(2017,1,1), "FCA", 37.75);
		System.out.println(livro1.equals(livro3));

	}

}
