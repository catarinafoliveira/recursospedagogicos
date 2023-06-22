package livraria;

import java.util.Objects;

public class Livro {
	private String titulo;
	private Pessoa autor;
	private Data dataPublicacao;
	private String editor;
	private double preco;
	
	private static String TITULO_OMISSAO = "Não definido";
	private static Pessoa AUTOR_OMISSAO = new Pessoa();
	private static String EDITOR_OMISSAO = "Não definido";
	private static double PRECO_OMISSAO = 0.0;
	
	public Livro() {
		this.titulo = TITULO_OMISSAO;
		this.autor = AUTOR_OMISSAO;
		this.dataPublicacao = new Data();
		this.editor = EDITOR_OMISSAO;
		this.preco = PRECO_OMISSAO;
	}
	
	public Livro(String titulo, Pessoa autor, Data dataPublicacao, String editor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.editor = editor;
		this.preco = preco;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * @return the autor
	 */
	public Pessoa getAutor() {
		return this.autor;
	}

	/**
	 * @return the anoPublicacao
	 */
	public Data getDataPublicacao() {
		return this.dataPublicacao;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		return this.editor;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return this.preco;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	/**
	 * @param anoPublicacao the anoPublicacao to set
	 */
	public void setAnoPublicacao(Data dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + this.titulo + ", autor=" + this.autor + ", anoPublicacao=" 
				+ this.dataPublicacao + ", editor=" + this.editor + ", preco=" 
				+ String.format("%.2f", this.preco) + "€]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return this.dataPublicacao.equals(other.dataPublicacao) 
				&& this.autor.equals(other.autor)
				&& this.editor.equals(other.editor)
				&& this.preco == other.preco
				&& this.titulo.equals(other.titulo);
	}

	public double precoComDesconto(double pcDesconto) {
		return this.preco * (1 - pcDesconto);
	}
	
	public int verIdadeAutor(Data hoje) {
		return this.autor.calcularIdade(hoje);
	}
	
	public int calcularDiferencaPublicação(Livro l) {
		return this.dataPublicacao.calcularDiferenca(l.dataPublicacao);
	}
}
