package veiculos;

public class VeiculoMotorizado extends Veiculo implements Custos{
	private int potencia;
	private double consumo;
	private static double precoCombustivel = 1.69;
	
	public VeiculoMotorizado(String marca, String modelo, int potencia, double consumo) {
		super(marca, modelo);
		this.potencia = potencia;
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return super.toString() + " - VeiculoMotorizado [potencia=" + potencia + ", consumo=" + consumo + "]";
	}

	@Override
	public double calcularCustoKm() {
		return consumo/100 * precoCombustivel;
	}
	
}
