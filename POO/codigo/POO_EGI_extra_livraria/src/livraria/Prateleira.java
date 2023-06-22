package livraria;

public class Prateleira {
	private static int nrPrateleiras = 0;

	private int identificacao;
	private Livro[] livros;
	private int nrLivros;

	public Prateleira() {
		nrPrateleiras++;
		this.identificacao = nrPrateleiras;
		this.livros = new Livro[10];
		this.nrLivros = 0;
	}

	/**
	 * @return the nrPrateleiras
	 */
	public static int getNrPrateleiras() {
		return nrPrateleiras;
	}

	/**
	 * @return the identificacao
	 */
	public int getIdentificacao() {
		return identificacao;
	}

	/**
	 * @return the livros
	 */
	public Livro[] getLivros() {
		return livros;
	}


	/**
	 * @return the nrLivros
	 */
	public int getNrLivros() {
		return nrLivros;
	}



	/**
	 * @param identificacao the identificacao to set
	 */
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	/**
	 * @param livros the livros to set
	 */
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	/**
	 * @param nrLivros the nrLivros to set
	 */
	public void setNrLivros(int nrLivros) {
		this.nrLivros = nrLivros;
	}

	@Override
	public String toString() {
		String resultado = "Prateleira [" + identificacao + "] - Livros:\n";
		for(int i=0; i<this.livros.length;i++) {
			if(livros[i]!=null) {
				resultado+=livros[i]+"\n";
			}
		}
		return resultado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Prateleira other = (Prateleira) obj;
		if(identificacao == other.identificacao)
			return false;
		for(int i=0; i<this.livros.length; i++) {
			if(!this.livros[i].equals(other.livros[i])) {
				return false;
			}
		}
		return true;
	}

	public void adicionarLivro(Livro livro) {
		if(nrLivros <= 10) {
			this.livros[this.nrLivros] = livro;
			this.nrLivros++;
		}
	}
	
	public double verPreco(Livro l) {
		for(int i=0; i<this.livros.length; i++) {
			if(this.livros[i]!= null && this.livros[i].equals(l)) {
				return this.livros[i].getPreco();
			}
		}
		return -1;
	}

}
