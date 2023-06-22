package ficha2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1 = ler.nextInt();
		int nota2 = ler.nextInt();
		int nota3 = ler.nextInt();
		if(nota1>nota2 && nota1>nota3)
			System.out.println(nota1);
		else if(nota2>nota1 && nota2>nota3)
			System.out.println(nota2);
		else
			System.out.println(nota3);
	}

}
