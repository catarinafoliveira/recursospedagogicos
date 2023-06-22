package ficha2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		int horasExtra = ler.nextInt();
		int faltas = ler.nextInt();
		double fator = horasExtra - (2/3.0)*faltas;
		double bonus;
		if(fator>40)
			bonus=50;
		else if(fator>30)
			bonus=25;
		else if(fator>20)
			bonus=12.5;
		else if(fator>10)
			bonus=10;
		else bonus=5;
		System.out.println("Bonus do " + nome + ": " + String.format("%.2f€", bonus));
	}

}
