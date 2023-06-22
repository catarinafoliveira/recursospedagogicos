package mercearia;

public class ProdutoPeso extends Produto {
	private double precoKg;
	
	private static final double PESO_OMISSAO = 0.0;
	
	public ProdutoPeso() {
		super();
		this.precoKg = PESO_OMISSAO;
	}

	public ProdutoPeso(String nome, double precoKg) {
		super(nome);
		this.precoKg = precoKg;
	}
	
	public ProdutoPeso(ProdutoPeso pp) {
		super(pp);
		this.precoKg = pp.precoKg;
	}
	
	public ProdutoPeso clone() {
		return new ProdutoPeso(this);
	}
	
	public double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		ProdutoPeso other = (ProdutoPeso) obj;
		return Double.doubleToLongBits(precoKg) == Double.doubleToLongBits(other.precoKg);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - ProdutoPeso [precoKg=" + precoKg + "]";
	}

	@Override
	public double calcularPreco(double quantidade) {
		return this.precoKg * quantidade;
	}

}
