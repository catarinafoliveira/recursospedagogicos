package ficha3;

import java.util.Scanner;

public class Ex15 {
	public static boolean isPerfeito(int n) {
		int soma=0;
		for(int i=1; i<= n/2; i++) {
			if(n%i==0) {
				soma+=i;
			}
		}
		return n==soma;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n= ler.nextInt();;
		while(n>0) {
			
			if(isPerfeito(n)) {
				System.out.println("É perfeito");
			} else {
				System.out.println("Não é perfeito");
			}
			n = ler.nextInt();
		} 
	}

}
