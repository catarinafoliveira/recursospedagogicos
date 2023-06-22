package ficha1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Diâmetro?");
		double diametro = ler.nextDouble();
		double raio = diametro/2;
		double perimetro = 2*Math.PI*raio;
		double area = Math.PI*Math.pow(raio, 2);
		System.out.println(String.format("Perímetro = %.3f cm; Área = %.3f cm2", perimetro, area));
	}

}
