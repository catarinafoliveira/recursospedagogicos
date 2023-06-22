package figuras;

/**
 * Representa um retângulo, que faz alguns cálculos geométricos a partir da interface CalculosGeometricos
 * @author Catarina
 *
 */
public class Retangulo implements CalculosGeometricos {
	/**
	 * A base do retângulo
	 */
	private double base;
	
	/**
	 * A altura do retângulo
	 */
	private double altura;
	
	/**
	 * O valor por omissão para definir a base
	 */
	private static final double BASE_OMISSAO = 0;
	
	/**
	 * O valor por omissão para definir a altura
	 */
	private static final double ALTURA_OMISSAO = 0;

	/**
	 * COnstrói um retângulo com valores por omissão para a base e a altura
	 */
	public Retangulo() {
		this.base = BASE_OMISSAO;
		this.altura = ALTURA_OMISSAO;
	}
	
	/**
	 * Constrói um retângulo com os valores passados por parâmetro para a base e a altura
	 * @param base A base do retângulo
	 * @param altura A altura do retângulo
	 */
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Constrói um retângulo por cópia de outro retângulo 
	 * @param r O retângulo a copiar
	 */
	public Retangulo(Retangulo r) {
		this.base = r.base;
		this.altura = r.altura;
	}

	/**
	 * Clona um retângulo
	 */
	public Retangulo clone() {
		return new Retangulo(this);
	}
	
	/**
	 * Devolve a base do retângulo
	 * @return A base do retângulo
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Devolve a altura do retângulo
	 * @return A altura do retângulo
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Redefine a base do retângulo
	 * @param base A nova base do retângulo
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Redefine a altura do retângulo
	 * @param altura A nova altura do retângulo
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Devolve a descrição textual do retângulo
	 */
	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + "]";
	}

	/**
	 * Devolve a área do retângulo
	 */
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	/**
	 * Devolve o perímetro do retângulo
	 */
	@Override
	public double calcularPerimetro() {
		return 2 * base + 2 * altura;
	}
}
