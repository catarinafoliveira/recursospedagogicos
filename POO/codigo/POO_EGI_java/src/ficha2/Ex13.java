package ficha2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int temperatura = ler.nextInt();
		if(temperatura<5)
			System.out.println("Muito frio");
		else if(temperatura<10)
			System.out.println("Frio");
		else if(temperatura<20)
			System.out.println("Ameno");
		else if(temperatura<30)
			System.out.println("Quente");
		else System.out.println("Muito quente");
	}

}
