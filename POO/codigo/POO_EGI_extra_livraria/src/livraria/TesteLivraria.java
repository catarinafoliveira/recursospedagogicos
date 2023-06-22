package livraria;

public class TesteLivraria {
	public static void main(String[] args) {
		Livro livro1 = new Livro("POO em Java", new Pessoa("Mario Martins", new Data()), new Data(2017,1,1), "FCA", 37.75);
		Livro livro2 = new Livro("Programação em Java", new Pessoa("Pedro Coelho", new Data()), new Data(2012,1,1), "FCA", 40.99);
		
		System.out.println(livro1.verIdadeAutor(new Data(2023,03,30)));
		System.out.println(livro2.verIdadeAutor(new Data(2023,03,30)));
		
		System.out.println(livro1.calcularDiferencaPublicação(livro2));
		 
		
	}

}
