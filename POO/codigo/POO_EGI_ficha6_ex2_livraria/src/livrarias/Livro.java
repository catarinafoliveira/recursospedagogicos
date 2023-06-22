package livrarias;

import java.util.Objects;

public class Livro {
	private String titulo;
	private String autor;
	private int ISBN;
	private double preco;
	
	private static final String TITULO_OMISSAO = "Não definido";
	private static final String AUTOR_OMISSAO = "Não definido";
	private static final int ISBN_OMISSAO = 0;
	private static final double PRECO_OMISSAO = 0.0;
	
	public Livro() {
		this.titulo = TITULO_OMISSAO;
		this.autor = AUTOR_OMISSAO;
		this.ISBN = ISBN_OMISSAO;
		this.preco = PRECO_OMISSAO;
	}

	public Livro(String titulo, String autor, int ISBN, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.preco = preco;
	}
	
	public Livro(Livro l) {
		this.titulo = l.titulo;
		this.autor = l.autor;
		this.ISBN = l.ISBN;
		this.preco = l.preco;
	}
	
	public Livro clone() {
		return new Livro(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public double getPreco() {
		return preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return this.ISBN == other.ISBN 
				&& this.autor.equals(other.autor)
				&& this.preco == other.preco
				&& this.titulo.equals(other.titulo);
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", preco=" + preco + "]";
	}
	
	public void aplicarDesconto(double percentagem) {
		this.preco = this.preco*(1-percentagem);
	}
	
	public boolean hasISBN(int nr) {
		return this.ISBN == nr;
	}
	
	public boolean hasAutor(String autor) {
		return this.autor.equals(autor);
	}
}
