package figuras;

/**
 * Representa um retângulo, que herda de figura
 * @author Catarina
 *
 */
public class Retangulo extends Figura {
	/**
	 * O comprimento da base do retangulo
	 */
	private double base;
	
	/**
	 * A altura do retangulo
	 */
	private double altura;
	
	/**
	 * O valor utilizado para definir o comprimento da base por omissão
	 */
	private static final double BASE_OMISSAO = 0;
	
	/**
	 * O valor utilizado para definir a altura por omissão
	 */
	private static final double ALTURA_OMISSAO = 0;
	
	/**
	 * Constroi um retangulo com os valores por omissão, chamando o construtor vazio de figura
	 */
	public Retangulo() {
		super();
		this.base = BASE_OMISSAO;
		this.altura = ALTURA_OMISSAO;
	}

	/**
	 * Constroi um retangulo com os valores passados por parametro, chamando o construtor de figura para definir a cor
	 * @param cor A cor do retangulo
	 * @param base O comprimento da base do retangulo
	 * @param altura A altura do retangulo
	 */
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	/**
	 * Constroi um retangulo por copia de outro retangulo, chamando o construtor copia de figura
	 * @param r O retangulo a copiar
	 */
	public Retangulo(Retangulo r) {
		super(r);
		this.base = r.base;
		this.altura = r.altura;
	}

	/**
	 * Devolve o comprimento da base do retangulo
	 * @return O comprimento da base do retangulo
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Devolve a altura do retangulo
	 * @return A altura do retangulo
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Redefine o comprimento da base do retangulo
	 * @param base O comprimento da base do retangulo
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Redefine altura do retangulo
	 * @param altura A altura do retangulo
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Compara o retangulo com outro objeto
	 * @return true caso sejam iguais e false caso contrário
	 */
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Retangulo other = (Retangulo) obj;
		return this.altura == other.altura
				&& this.base == other.base;
	}
	
	/**
	 * Devolve a descrição textual de um retangulo, que inclui a descricao textual de uma figura
	 */
	@Override
	public String toString() {
		return super.toString() + " é um retangulo de base=" + base + " e altura=" + altura;
	}

	/**
	 * Calcula e devolve a área de um retangulo
	 * @return A área do retângulo
	 */
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
}
