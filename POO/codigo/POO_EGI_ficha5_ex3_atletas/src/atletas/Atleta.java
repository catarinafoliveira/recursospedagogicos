package atletas;

public class Atleta {
	private String nome;
	private int idade;
	private char genero;
	private double peso;
	private double altura;
	private Cartao cartao;
	
	private static final String NOME_OMISSAO = "Não definido";
	private static final int IDADE_OMISSAO = 0;
	private static final char GENERO_OMISSAO = 'x';
	private static final double PESO_OMISSAO = 0.0;
	private static final double ALTURA_OMISSAO = 0.0;
	
	public Atleta(String nome, int idade, char genero, double peso, double altura, Cartao cartao) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.cartao = cartao;
	}
	
	public Atleta(String nome, int idade, char genero, double peso, double altura, int nrEntradasCartao, int nrSaidasCartao) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.cartao = new Cartao(nrEntradasCartao, nrSaidasCartao);
	}
	
	public Atleta(String nome, int idade, char genero, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.cartao = new Cartao();
	}
	
	public Atleta() {
		this.nome = NOME_OMISSAO;
		this.idade = IDADE_OMISSAO;
		this.genero = GENERO_OMISSAO;
		this.peso = PESO_OMISSAO;
		this.altura = ALTURA_OMISSAO;
		this.cartao = new Cartao();;
	}
	
	public Atleta(Atleta a) {
		this.nome = a.nome;
		this.idade = a.idade;
		this.genero = a.genero;
		this.peso = a.peso;
		this.altura = a.altura;
		this.cartao = new Cartao(a.cartao);;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}
	
	public char getGenero() {
		return this.genero;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}
	
		/**
	 * @return the cartao
	 */
	public Cartao getCartao() {
		return cartao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @param cartao the cartao to set
	 */
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", peso=" + peso + ", altura="
				+ altura + "] tem cartão:\n" + this.cartao;
	}

	public double calcularIMC() {
		return this.peso/Math.pow(altura, 2);
	}
	
	public String determinarObesidade() {
		double imc = this.calcularIMC();
		if(imc < 18.4) {
			return "Abaixo do peso";
		} else {
			if(imc < 25) {
				return "Peso normal";
			} else {
				return "Sobrepeso";
			}
		}
	}
	
	public boolean isSaudavel(){
		return this.determinarObesidade().equals("Peso normal");
	}

	public void registarEntrada() {
		this.cartao.registarEntrada();;
	}
	
	public void registarSaida() {
		this.cartao.registarSaida();;
	}
	
	public boolean validarEntradasSaidas() {
		return this.cartao.validarEntradasSaidas();
	}
}
