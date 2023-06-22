package atletas;

public class Atleta {
	private String nome;
	private int idade;
	private char genero;
	private double peso;
	private double altura;
	
	public Atleta(String nome, int idade, char genero, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
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

	
	
	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", peso=" + peso + ", altura="
				+ altura + "]";
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

}
