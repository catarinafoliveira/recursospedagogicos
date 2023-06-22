package livrarias;

import java.util.ArrayList;
import java.util.Objects;

public class Livraria {
	private String nome;
	private String morada;
	private ArrayList<Livro> livros;
	
	private static final String NOME_OMISSAO = "Nao definido";
	private static final String MORADA_OMISSAO = "Nao definido";
	
	public Livraria() {
		this.nome = NOME_OMISSAO;
		this.morada = MORADA_OMISSAO;
		this.livros = new ArrayList<>();
	}
	
	public Livraria(String nome, String morada) {
		this.nome = nome;
		this.morada = morada;
		this.livros = new ArrayList<>();
	}
	
	public Livraria(Livraria l) {
		this.nome = l.nome;
		this.morada = l.morada;
		this.livros = new ArrayList<>();
		for(Livro x: l.livros) {
			this.livros.add(new Livro(x));
		}
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public ArrayList<Livro> getLivros() {
		ArrayList<Livro> novo = new ArrayList<>();
		for(Livro l: this.livros) {
			novo.add(new Livro(l));
		}
		return novo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = new ArrayList<>();
		for(Livro l: livros) {
			this.livros.add(new Livro(l));
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Livraria other = (Livraria) obj;
		if(!this.morada.equals(other.morada) || !this.nome.equals(other.nome)) {
			return false;
		}
		for(Livro l: this.livros) {
			if(!other.livros.contains(l)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String descricao = "Livraria [nome=" + nome + ", morada=" + morada + "], com livros:";
		for(Livro l: this.livros) {
			descricao += "\n- " + l;
		}
		return descricao;
	}
	
	public void adicionarLivro(Livro l) {
		this.livros.add(l);
	}
	
	public void adicionarLivro(String titulo, String autor, int isbn, double preco) {
		this.livros.add(new Livro(titulo, autor, isbn, preco));
	}
	
	public void removerLivro(Livro l) {
		this.livros.remove(l);
	}
	
	private Livro procurarLivro(int isbn) {
		for(Livro l: this.livros) {
			if(l.hasISBN(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	public void removerLivro(int isbn) {
		removerLivro(procurarLivro(isbn));
	}
	
	public void atribuirDescontoLivro(Livro l, double percentagem) {
		for(Livro x: this.livros) {
			if(x.equals(l)) {
				x.aplicarDesconto(percentagem);
			}
		}
	}
	
	public void atribuirDescontoLivro(int isbn, double percentagem) {
		atribuirDescontoLivro(procurarLivro(isbn), percentagem);
	}
	
	public void atribuirDescontoAutor(String nomeAutor, double percentagem) {
		for(Livro l: this.livros) {
			if(l.hasAutor(nomeAutor)) {
				atribuirDescontoLivro(l, percentagem);
			}
		}
	}
}
