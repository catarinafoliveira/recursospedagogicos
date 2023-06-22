package ficha1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double segundos = ler.nextDouble();
		final int VELOCIDADE_SOM_MS2 = (1224*1000)/(60*60); // velocidade do som em m/s2
		double distanciaKM = segundos * VELOCIDADE_SOM_MS2 / 1000.0;
		System.out.println(String.format("%.2f km", distanciaKM));
	}

}
