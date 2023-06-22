package escola;

public class Professor extends Pessoa implements Pagavel{
	private double salarioBase;
	private int nrHorasExtra;
	private static double valorHoraExtra = 10;
	
	public Professor(String nome, String nif, double salarioBase, int nrHorasExtra) {
		super(nome, nif);
		this.salarioBase = salarioBase;
		this.nrHorasExtra = nrHorasExtra;
	}

	@Override
	public String toString() {
		return super.toString() + " - Professor [salarioBase=" + salarioBase + ", nrHorasExtra=" + nrHorasExtra + "]";
	}

	@Override
	public double calcularValorAPagar() {
		return salarioBase + valorHoraExtra * nrHorasExtra;
	}
	
	
}
