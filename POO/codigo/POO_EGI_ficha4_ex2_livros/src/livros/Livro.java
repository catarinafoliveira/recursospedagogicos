package livros;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editor;
	private double preco;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
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
	public String getAutor() {
		return this.autor;
	}

	/**
	 * @return the anoPublicacao
	 */
	public int getAnoPublicacao() {
		return this.anoPublicacao;
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
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @param anoPublicacao the anoPublicacao to set
	 */
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
				+ this.anoPublicacao + ", editor=" + this.editor + ", preco=" 
				+ String.format("%.2f", this.preco) + "€]";
	}
	
	public double precoComDesconto(double pcDesconto) {
		return this.preco * (1 - pcDesconto);
	}
}
