package veiculos;

public class VeiculoNaoMotorizado extends Veiculo {
	private double peso;
	private double capacidadeMaxima;
	
	public VeiculoNaoMotorizado(String marca, String modelo, double peso, double capacidadeMaxima) {
		super(marca, modelo);
		this.peso = peso;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	@Override
	public String toString() {
		return "VeiculoNaoMotorizado [peso=" + peso + ", capacidadeMaxima=" + capacidadeMaxima + "]";
	}
	
	
}
