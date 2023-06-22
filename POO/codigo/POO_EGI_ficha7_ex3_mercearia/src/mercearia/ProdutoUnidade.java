package mercearia;

import java.util.Objects;

public class ProdutoUnidade extends Produto {
	private double precoUnitario;
	private static double precoEmbalagem = 0.5;

	private static final double PRECO_OMISSAO = 0.0;
	
	public ProdutoUnidade() {
		super();
		this.precoUnitario = PRECO_OMISSAO;
	}
	
	public ProdutoUnidade(String nome, double precoUnitario) {
		super(nome);
		this.precoUnitario = precoUnitario;
	}

	public ProdutoUnidade(ProdutoUnidade pu) {
		super(pu);
		this.precoUnitario = pu.precoUnitario;
	}
	
	public ProdutoUnidade clone() {
		return new ProdutoUnidade(this);
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public static double getPrecoEmbalagem() {
		return precoEmbalagem;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public static void setPrecoEmbalagem(double precoEmbalagem) {
		ProdutoUnidade.precoEmbalagem = precoEmbalagem;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		ProdutoUnidade other = (ProdutoUnidade) obj;
		return Double.doubleToLongBits(precoUnitario) == Double.doubleToLongBits(other.precoUnitario);
	}

	@Override
	public String toString() {
		return super.toString() + " - ProdutoUnidade [precoUnitario=" + precoUnitario + "]";
	}

	@Override
	public double calcularPreco(double quantidade) {
		return this.precoUnitario + this.precoEmbalagem;
	}

}
