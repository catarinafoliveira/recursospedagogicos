package ficha2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int qtdImpares=0, somaPares=0, qtdPares=0;
		while(n>0) {
			if(n%2==0) {
				somaPares+=n;
				qtdPares++;
			} else {
				qtdImpares++;
			}
			n = ler.nextInt();
		}
		System.out.println("Percentagem ímpares: " + qtdImpares/(double)(qtdImpares+qtdPares)*100 + "%; Média pares: " + somaPares/qtdPares);
	}

}
