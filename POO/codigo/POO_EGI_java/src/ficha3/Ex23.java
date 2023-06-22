package ficha3;

import java.util.Scanner;

public class Ex23 {
	public static Scanner ler = new Scanner(System.in);

	public static double[] ler() {
		
		double[] array = new double[12];
		for(int i=0; i<12; i++) {
			array[i] = ler.nextDouble();
		}
		return array;
	}
	
	public static double valorFinal(double valorInicial, double[] taxas) {
		double valorFinal = valorInicial;
		for(int i=0; i<taxas.length; i++) {
			valorFinal+=valorFinal*taxas[i];
//			System.out.println("Ao fim de " + (i+1) + " meses: " + valorFinal);
		}
		return valorFinal;
	}
	
	public static void main(String[] args) {
		double[] taxas = ler();
		double valor = ler.nextDouble();
		System.out.println("Valor final: " + valorFinal(valor, taxas));
	}

}
