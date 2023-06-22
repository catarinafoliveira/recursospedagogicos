package escola;

public class AlunoBolseiro extends Aluno implements Pagavel{
	private double valorBolsa;

	public AlunoBolseiro(String nome, String nif, String curso, int ano, double valorBolsa) {
		super(nome, nif, curso, ano);
		this.valorBolsa = valorBolsa;
	}

	@Override
	public String toString() {
		return "AlunoBolseiro [valorBolsa=" + valorBolsa + "]";
	}

	@Override
	public double calcularValorAPagar() {
		return valorBolsa;
	}
	
	
}
