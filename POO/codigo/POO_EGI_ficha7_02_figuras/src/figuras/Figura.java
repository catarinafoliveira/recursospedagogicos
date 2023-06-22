package figuras;

/**
 * Representa uma figura. É uma classe abstract porque não faz sentido construir figuras que não sejam de um dos seus suptipos (subclasses)
 * @author Catarina
 *
 */
public abstract class Figura {
	/** 
	 * A cor da figura
	 */
	private String cor;
	
	/**
	 * O valor a utilizar por omissão para a cor da figura
	 */
	private static final String COR_OMISSAO = "Branco";
	
	/**
	 * Constroi uma figura com os valores por omissão
	 */
	public Figura() {
		this.cor = COR_OMISSAO;
	}
	
	/**
	 * Costrói uma figura com a cor passada por parâmetro
	 * @param cor A cor a utilizar na figura
	 */
	public Figura(String cor) {
		this.cor = cor;
	}
	
	/**
	 * Constroi uma figura por cópia de outra figura
	 * @param f A figura a copiar
	 */
	public Figura(Figura f) {
		this.cor = f.cor;
	}
	
	/**
	 * Devolve a cor da figura
	 * @return A cor da figura
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * Redefine a cor da figura
	 * @param cor A nova cor da figura
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * Compara a figura com outro objeto
	 * @return true caso os objetos sejam iguais e false caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return this.cor.equals(other.cor);
	}

	/**
	 * Devolve a descrição textual da figura
	 * @return A descrição textual
	 */
	public String toString() {
		return "Figura de cor " + this.cor;
	}
	
	/**
	 * Método abstract para calcular a área de uma figura. Será implementado em cada uma das subclasses
	 * @return A área da figura
	 */
	public abstract double calcularArea();
}
