package empresa;
import java.util.Objects;

import utilitarios.Data;

public class ColaboradorComissao extends Colaborador {
	private double salarioBase;
	private double comissao;
	
	private static final double SALARIO_BASE_OMISSAO = 0;
	private static final double COMISSAO_OMISSAO = 0;
	
	public ColaboradorComissao() {
		super();
		this.salarioBase = SALARIO_BASE_OMISSAO;
		this.comissao = COMISSAO_OMISSAO;
	}
	
	public ColaboradorComissao(String nome, String nif, Data dataNascimento, String morada, double salarioBase, double comissao) {
		super(nome, nif, dataNascimento, morada);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public ColaboradorComissao(ColaboradorComissao cc) {
		super(cc);
		this.salarioBase = cc.salarioBase;
		this.comissao = cc.comissao;
	}
	
	public ColaboradorComissao clone() {
		return new ColaboradorComissao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		ColaboradorComissao other = (ColaboradorComissao) obj;
		return this.comissao == other.comissao
				&& this.salarioBase == other.salarioBase;
	}

	@Override
	public String toString() {
		return super.toString() + " - ColaboradorComissao [salarioBase=" + salarioBase + ", comissao=" + comissao + "]";
	}

	@Override
	public double calcularVencimento() {
		return this.salarioBase + this.comissao;
	}

}
