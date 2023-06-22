package livrarias;

public class TesteLivrarias {
	public static void main(String[] args) {
		Livro l1 = new Livro("Java","Martins",123,30.00);
		Livro l2 = new Livro("C","Ze",456,50.00);
		Livro l3 = new Livro("PHP","Martins",789,40.00);
		Livro l4 = new Livro("JavaScript","Paulo",101,32.32);
		Livro l5 = new Livro("Pyhton","Tó",112,14.25);
		
		Livraria l = new Livraria("liv1","morada liv1");
		
		l.adicionarLivro(l1);
		l.adicionarLivro(l2);
		l.adicionarLivro(l3);
		l.adicionarLivro(l4);
		l.adicionarLivro(l5);
		System.out.println(l);
		
		l.removerLivro(l5);
		System.out.println(l);
		
		l.removerLivro(101);
		System.out.println(l);
		
		l.atribuirDescontoLivro(l2, 0.1);
		System.out.println(l);
		
		l.atribuirDescontoLivro(456, 0.1);
		System.out.println(l);
		
		l.atribuirDescontoAutor("Martins", 0.1);
		System.out.println(l);
	}
}
