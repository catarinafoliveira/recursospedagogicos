package ficha1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lado1=ler.nextDouble();
		double lado2 = ler.nextDouble();
		double perimetro = 2*lado1+2*lado2;
		double area = lado1*lado2;
		System.out.println(String.format("Perímetro = %.1f cm; Área = %.1f cm2", perimetro, area));
	}

}
