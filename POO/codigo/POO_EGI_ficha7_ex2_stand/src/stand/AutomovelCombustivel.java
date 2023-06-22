package stand;

import java.util.Objects;

public class AutomovelCombustivel extends Automovel {
	private String tipoCombustivel;
	private double consumo;
	private double capacidadeDeposito;
	private double potenciaMotor;

	public static final String TIPO_COMBUSTIVEL_OMISSAO = "Não definido";
	public static final double CONSUMO_OMISSAO = 0;
	public static final double CAPACIDADE_DEPOSITO_OMISSAO = 0;
	public static final double POTENCIA_MOTOR_OMISSAO = 0;
	
	public AutomovelCombustivel() {
		super();
		this.tipoCombustivel = TIPO_COMBUSTIVEL_OMISSAO;
		this.consumo = CONSUMO_OMISSAO;
		this.capacidadeDeposito = CAPACIDADE_DEPOSITO_OMISSAO;
		this.potenciaMotor = POTENCIA_MOTOR_OMISSAO;
	}

	public AutomovelCombustivel(String marca, String modelo, String cor, int nrPortas, double preco, 
			String tipoCombustivel, double consumo, double capacidadeDeposito, double potenciaMotor) {
		super(marca,modelo,cor,nrPortas,preco);
		this.tipoCombustivel = tipoCombustivel;
		this.consumo = consumo;
		this.capacidadeDeposito = capacidadeDeposito;
		this.potenciaMotor = potenciaMotor;
	}
	
	public AutomovelCombustivel(AutomovelCombustivel ac) {
		super(ac);
		this.tipoCombustivel = ac.tipoCombustivel;
		this.consumo = ac.consumo;
		this.capacidadeDeposito = ac.capacidadeDeposito;
		this.potenciaMotor = ac.potenciaMotor;
	}

	@Override
	public AutomovelCombustivel clone() {
		return new AutomovelCombustivel(this);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public void setCapacidadeDeposito(double capacidadeDeposito) {
		this.capacidadeDeposito = capacidadeDeposito;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		AutomovelCombustivel other = (AutomovelCombustivel) obj;
		return Double.doubleToLongBits(capacidadeDeposito) == Double.doubleToLongBits(other.capacidadeDeposito)
				&& Double.doubleToLongBits(consumo) == Double.doubleToLongBits(other.consumo)
				&& Double.doubleToLongBits(potenciaMotor) == Double.doubleToLongBits(other.potenciaMotor)
				&& Objects.equals(tipoCombustivel, other.tipoCombustivel);
	}

	@Override
	public String toString() {
		return super.toString() + " - AutomovelCombustivel [tipoCombustivel=" + tipoCombustivel + ", consumo=" + consumo
				+ ", capacidadeDeposito=" + capacidadeDeposito + ", potenciaMotor=" + potenciaMotor + "]";
	}

	@Override
	public double calcularAutonomia() {
		return this.capacidadeDeposito/this.consumo*100;
	}

}
