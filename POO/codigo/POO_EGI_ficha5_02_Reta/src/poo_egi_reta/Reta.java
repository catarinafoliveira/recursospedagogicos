package poo_egi_reta;

/**
 * Representa uma reta
 * @author Catarina
 *
 */
public class Reta {
	/**
	 * O conjunto de pontos inicial e final da reta
	 */
	private Ponto[] pontos;
	
	/**
	 * Constroi uma reta a partir de um array de pontos
	 * @param pontos O array de pontos usado para construir a reta
	 */
	public Reta(Ponto[] pontos) {
		this.pontos = new Ponto[2];
		this.pontos[0] = pontos[0];
		this.pontos[1] = pontos[1];
	}
	
	
	/**
	 * Constroi uma reta a partir dos seus pontos inicial e final
	 * @param inicio O ponto inicial
	 * @param fim O ponto final
	 */
	public Reta(Ponto inicio, Ponto fim) {
		this.pontos = new Ponto[2];
		this.pontos[0] = inicio;
		this.pontos[1] = fim;
	}
	
	/**
	 * Constroi uma reta sem definir os pontos inicial e final
	 */
	public Reta() {
		this.pontos = new Ponto[2];
	}
	
	/**
	 * Constroi uma reta por cópia de outra reta
	 * @param A reta a copiar
	 */
	public Reta(Reta r) {
		this.pontos = r.pontos;
	}
	
	
	/**
	 * Define o ponto inicial da reta
	 * @param p O ponto inicial da reta
	 */
	public void definirInicio(Ponto p) {
		this.pontos[0] = p;
	}
	
	/**
	 * Define o porto final da reta
	 * @param p O ponto final da reta
	 */
	public void definirFim(Ponto p) {
		this.pontos[1] = p;
	}

	@Override
	/**
	 * Devolve a descrição textual de uma reta
	 * @return A descrição textual de uma reta
	 */
	public String toString() {
		String resultado = "Reta com pontos:\n";
		for(int i=0; i<this.pontos.length; i++) {
			resultado += this.pontos[i];
		}
		return resultado;
	}

	@Override
	/**
	 * Determina se uma reta é igual a outro objeto
	 * @return true caso os objetos sejam iguais e false caso contrário
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Reta other = (Reta) obj;
		for(int i=0; i<this.pontos.length; i++) {
			if(!this.pontos[i].equals(other.pontos[i])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Devolve o comprimento de uma reta, calculado a partir da distância euclideana entre os pontos inicial e final
	 * @return O comprimento da reta
	 */
	public double comprimento() {
		return this.pontos[0].distanciaEuclideana(this.pontos[1]);
	}
}
