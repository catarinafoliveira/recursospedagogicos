package ficha1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura = ler.nextDouble();
		double peso = ler.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		System.out.println(String.format("%.1f", imc));
	}

}
