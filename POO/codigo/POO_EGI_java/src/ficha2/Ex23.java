package ficha2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int potencia = 1;
		for(int i=1; i<=b; i++)
			potencia*=a;
		System.out.println(potencia);
	}

}
