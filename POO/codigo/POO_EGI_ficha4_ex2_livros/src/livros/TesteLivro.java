package livros;

public class TesteLivro {

	public static void main(String[] args) {
		 Livro livro1 = new Livro("POO em Java", "Mário Martins", 2017, "FCA", 37.75);
		 Livro livro2 = new Livro("Programação em Java", "Pedro Coelho", 2012, "FCA", 40.99);
		 System.out.println(livro1);
		 System.out.println(livro2);
		 livro2.setAnoPublicacao(2016);
		 System.out.println(livro2);
		 System.out.println(String.format("%.2f", livro1.precoComDesconto(0.10))+"€");
	}

}
