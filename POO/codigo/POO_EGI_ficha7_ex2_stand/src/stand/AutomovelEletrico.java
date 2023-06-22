package stand;

import java.util.Objects;

public class AutomovelEletrico extends Automovel {
	private double capacidadeBateria;
	private double consumo;
	
	private static final double CAPACIDADE_BATERIA_DEFEITO = 0;
	private static final double CONSUMO_DEFEITO = 0;
	
	public AutomovelEletrico() {
		super();
		this.capacidadeBateria = CAPACIDADE_BATERIA_DEFEITO;
		this.consumo = CONSUMO_DEFEITO;
	}
	
	public AutomovelEletrico(String marca, String modelo, String cor, int nrPortas, double preco,
			double capacidadeBateria, double consumo) {
		super(marca,modelo,cor,nrPortas,preco);
		this.capacidadeBateria = capacidadeBateria;
		this.consumo = consumo;
	}

	public AutomovelEletrico(AutomovelEletrico ae) {
		super(ae);
		this.capacidadeBateria = ae.capacidadeBateria;
		this.consumo = ae.consumo;
	}

	public AutomovelEletrico clone() {
		return new AutomovelEletrico(this);
	}
	
	public double getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setCapacidadeBateria(double capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		AutomovelEletrico other = (AutomovelEletrico) obj;
		return Double.doubleToLongBits(capacidadeBateria) == Double.doubleToLongBits(other.capacidadeBateria)
				&& Double.doubleToLongBits(consumo) == Double.doubleToLongBits(other.consumo);
	}

	@Override
	public String toString() {
		return super.toString() + " - AutomovelEletrico [capacidadeBateria=" + capacidadeBateria + ", consumo=" + consumo + "]";
	}

	@Override
	public double calcularAutonomia() {
		return this.capacidadeBateria/this.consumo*10;
	}

}
