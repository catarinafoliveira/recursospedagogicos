package figuras;

/**
 * Representa um círculo, que faz alguns cálculos geométricos a partir da interface CalculosGeometricos
 * @author Catarina
 *
 */
public class Circulo implements CalculosGeometricos {
	/**
	 * O raio do círculo
	 */
	private double raio;
	
	/**
	 * O valor por omissão para definir o raio
	 */
	private static final double RAIO_OMISSAO = 0;
	
	/**
	 * Constrói um círculo com o valor do raio por omissão
	 */
	public Circulo() {
		this.raio = RAIO_OMISSAO;
	}
	
	/**
	 * Constrói um círculo com o valor do raio passado por parâmetro
	 * @param raio O raio a utilizar para construção do círculo
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	/**
	 * Constrói um círculo por cópia de outro círculo
	 * @param c O círculo a copiar
	 */
	public Circulo(Circulo c) {
		this.raio = c.raio;
	}
	
	/**
	 * Clona um círculo
	 */
	@Override
	public Circulo clone() {
		return new Circulo(this);
	}

	/**
	 * Devolve o raio do círculo
	 * @return O raio do círculo
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Redefine o raio do círculo
	 * @param raio O novo raio do círculo
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	/**
	 * Devolve a descrição textual do círculo
	 */
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

	/**
	 * Devolve a área do círculo
	 */
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	/**
	 * Devolve o perímetro do círculo
	 */
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
}
