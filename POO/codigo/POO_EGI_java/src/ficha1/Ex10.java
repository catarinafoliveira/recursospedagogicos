package ficha1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Raio da base? (cm)");
		double raio = ler.nextDouble();
		System.out.println("Altura do recipiente? (cm)");
		double altura = ler.nextDouble();
		double volumeCm3 = Math.PI * Math.pow(raio, 2) * altura;
		double volumeM3 = volumeCm3/1000;
		System.out.println(String.format("O recipiente tem capacidade de %.1f L",volumeM3));
	}

}
