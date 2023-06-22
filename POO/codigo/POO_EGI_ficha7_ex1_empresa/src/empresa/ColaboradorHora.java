package empresa;
import utilitarios.Data;

public class ColaboradorHora extends Colaborador {
	private int nrHoras;
	private static double valorHora = 11.5;
	
	private static final int NR_HORAS_OMISSAO = 0;
	
	public ColaboradorHora() {
		super();
		this.nrHoras = NR_HORAS_OMISSAO;
	}
	
	public ColaboradorHora(String nome, String nif, Data dataNascimento, String morada, int nrHoras) {
		super(nome, nif, dataNascimento, morada);
		this.nrHoras = nrHoras;
	}
	
	public ColaboradorHora(ColaboradorHora ch) {
		super(ch);
		this.nrHoras = ch.nrHoras;
	}
	
	public ColaboradorHora clone() {
		return new ColaboradorHora(this);
	}
	public int getNrHoras() {
		return nrHoras;
	}

	public static double getValorHora() {
		return valorHora;
	}

	public void setNrHoras(int nrHoras) {
		this.nrHoras = nrHoras;
	}

	public static void setValorHora(double valorHora) {
		ColaboradorHora.valorHora = valorHora;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		ColaboradorHora other = (ColaboradorHora) obj;
		return this.nrHoras == other.nrHoras;
	}

	@Override
	public String toString() {
		return super.toString() + " - ColaboradorHora [nrHoras=" + nrHoras + "]";
	}

	@Override
	public double calcularVencimento() {
		return this.nrHoras * ColaboradorHora.valorHora;
	}

}
