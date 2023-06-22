package figuras;

/**
 * Representa um circulo, que herda de Figura
 * @author Catarina
 *
 */
public class Circulo extends Figura {
	/**
	 * O raio do circulo
	 */
	private double raio;

	/**
	 * O valor a utilizar para definir o raio do circulo por omissao
	 */
	private static final double RAIO_OMISSAO = 0;
	
	/**
	 * Constroi um circulo com valores por omissão, chamando o construtor por omissão de figura
	 */
	public Circulo() {
		super();
		this.raio = RAIO_OMISSAO;
	}

	/**
	 * Constroi um circulo com os valores recebidos por parâmetro, chamando o construtor de figura para definir a cor
	 * @param cor A cor do circulo
	 * @param raio O raio do circulo
	 */
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	/**
	 * Constroi um circulo por cópia de outro circulo, chamando o construtor cópia da figura
	 * @param c O circulo a copiar
	 */
	public Circulo(Circulo c) {
		super(c);
		this.raio = c.raio;
	}
	
	/**
	 * Devolve o raio do circulo
	 * @return O raio do circulo
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Redefine o raio do circulo
	 * @param raio O raio do circulo
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	/**
	 * Compara o circulo com outro objeto
	 * @return true caso sejam iguais e false caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Circulo other = (Circulo) obj;
		return this.raio == other.raio;
	}
	
	/**
	 * Retorna a descrição teztual de um circulo, que inclui a descrição textual de figura
	 */
	@Override
	public String toString() {
		return super.toString() 
				+ " é um círculo de raio=" + raio;
	}
	
	/**
	 * Calcula e devolve a área do círculo
	 * @return A área do circulo
	 */
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
