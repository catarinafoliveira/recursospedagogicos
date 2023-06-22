package livraria;

public class TesteLivraria {
	public static void main(String[] args) {
		Livro livro1 = new Livro("POO em Java", "Mário Martins", 2017, "FCA", 37.75);
		Livro livro2 = new Livro("Programação em Java", "Pedro Coelho", 2012, "FCA", 40.99);
		 
		Prateleira p1 = new Prateleira();
		p1.adicionarLivro(livro1);
		p1.adicionarLivro(livro2);
		
		System.out.println(p1);
		
		 
		Prateleira p2 = new Prateleira();
		p2.adicionarLivro(livro1);
		p2.adicionarLivro(livro2);
		
		System.out.println(p2);
		
		Livro livro3 = new Livro("POO em Java", "Mário Martins", 2017, "FCA", 37.75);
		System.out.println("Preço do livro 1: " + p2.verPreco(livro3));
	}

}
