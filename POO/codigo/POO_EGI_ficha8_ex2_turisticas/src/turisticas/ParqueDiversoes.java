package turisticas;

public class ParqueDiversoes extends Parque implements Faturavel{
	private int nrDiversoes;
	private static double precoComRisco = 0.75;
	private static double precoSemRisco = 0.55;
	private static int limiteIdadeRisco = 18;
	
	public ParqueDiversoes(String nome, String local, double area, int nrDiversoes) {
		super(nome, local, area);
		this.nrDiversoes = nrDiversoes;
	}

	@Override
	public String toString() {
		return super.toString() + " - ParqueDiversoes [nrDiversoes=" + nrDiversoes + "]";
	}

	@Override
	public double calcularPrecoBilhete(int idade) {
		if(idade < limiteIdadeRisco) {
			return nrDiversoes * precoComRisco;
		} else {
			return nrDiversoes * precoSemRisco;
		}
	}
}
