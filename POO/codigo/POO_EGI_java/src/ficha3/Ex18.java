package ficha3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex18 {
	public static int adivinha(int s) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Tente adivinhar o número secreto");
		int n = ler.nextInt();
		int tentativas = 1;
		while(n!=s) {
			tentativas++;
			if(s>n) {
				System.out.println("Tente maior");
			} else {
				System.out.println("Tente menor");
			}
			n = ler.nextInt();
		}
		
		System.out.println("Acertou");
		return tentativas;
	}
	
	public static void main(String[] args) {
		int segredo = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int tentativas = adivinha(segredo);
		System.out.println("Foram necessárias " + tentativas + " tentativas");
	}
}
