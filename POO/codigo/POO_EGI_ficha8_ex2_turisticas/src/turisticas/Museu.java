package turisticas;

public class Museu extends Atracao implements Faturavel {
	private double precoBilhete;
	private static double percentagemDescontoIdade = 0.1;
	private static int limiteIdadeDesconto = 65;

	public Museu(String nome, String local, double precoBilhete) {
		super(nome, local);
		this.precoBilhete = precoBilhete;
	}

	@Override
	public String toString() {
		return super.toString() + " - Museu [precoBilhete=" + precoBilhete + "]";
	}

	@Override
	public double calcularPrecoBilhete(int idade) {
		if(idade < limiteIdadeDesconto) {
			return precoBilhete;
		} else {
			return precoBilhete * (1-percentagemDescontoIdade);
		}
	}

}
