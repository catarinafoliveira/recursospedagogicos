package veiculos;

import java.util.ArrayList;

public class TesteVeiculos {
	public static void main(String[] args) {
		VeiculoMotorizado carro = new VeiculoMotorizado("mitsubishi", "space star", 1199, 6.9);
		VeiculoNaoMotorizado bicicleta = new VeiculoNaoMotorizado("BMX", "123", 20, 15);
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(carro);
		veiculos.add(bicicleta);
		
		System.out.println("=== Veículos ===");
		for(Veiculo v: veiculos) {
			if(v instanceof Custos) {
				System.out.println(v + " => " + ((Custos)v).calcularCustoKm() + "€/km");
			} else {
				System.out.println(v);
			}
		}
		
		System.out.println("=== Veículos Motorizados ===");
		for(Veiculo v: veiculos) {
			if(v instanceof VeiculoMotorizado) {
				System.out.println(v);
			} 
		}
		
		System.out.println("=== Veículos Não Motorizados ===");
		for(Veiculo v: veiculos) {
			if(v instanceof VeiculoNaoMotorizado) {
				System.out.println(v);
			} 
		}
		
	}
}
