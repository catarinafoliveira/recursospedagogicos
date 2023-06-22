package atletas;

public class Cartao {
	private int codigo;
	private int nrEntradas;
	private int nrSaidas;
	
	private static int nrCartoes = 0;

	public Cartao(int nrEntradas, int nrSaidas) {
		nrCartoes++;
		this.codigo = nrCartoes;
		this.nrEntradas = nrEntradas;
		this.nrSaidas = nrSaidas;
	}
	
	public Cartao() {
		nrCartoes++;
		this.codigo = nrCartoes;
		this.nrEntradas = 0;
		this.nrSaidas = 0;
	}
	
	public Cartao(Cartao c) {
		this.codigo = c.codigo;
		this.nrEntradas = c.nrEntradas;
		this.nrSaidas = c.nrSaidas;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the nrEntradas
	 */
	public int getNrEntradas() {
		return nrEntradas;
	}

	/**
	 * @return the nrSaidas
	 */
	public int getNrSaidas() {
		return nrSaidas;
	}

	/**
	 * @return the nrCartoes
	 */
	public static int getNrCartoes() {
		return nrCartoes;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param nrEntradas the nrEntradas to set
	 */
	public void setNrEntradas(int nrEntradas) {
		this.nrEntradas = nrEntradas;
	}

	/**
	 * @param nrSaidas the nrSaidas to set
	 */
	public void setNrSaidas(int nrSaidas) {
		this.nrSaidas = nrSaidas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		return codigo == other.codigo && nrEntradas == other.nrEntradas && nrSaidas == other.nrSaidas;
	}

	@Override
	public String toString() {
		return "Cartao [codigo=" + codigo + ", nrEntradas=" + nrEntradas + ", nrSaidas=" + nrSaidas + "]";
	}
	
	public void registarEntrada() {
		this.nrEntradas++;
	}
	
	public void registarSaida() {
		this.nrSaidas++;
	}
	
	public boolean validarEntradasSaidas() {
		return this.nrEntradas == this.nrSaidas;
	}
}
