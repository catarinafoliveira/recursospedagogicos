package ficha3;

import java.util.Scanner;

public class Ex17 {
	public static boolean isPrimo(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n= ler.nextInt();;
		while(n>0) {
			if(isPrimo(n)) {
				System.out.println("Primo");
			} else {
				System.out.println("Não primo");
			}
			n = ler.nextInt();
		} 
	}
}
