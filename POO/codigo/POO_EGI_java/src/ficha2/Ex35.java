package ficha2;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt(), nrDiv=2;
		System.out.println(1);
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
				nrDiv++;
			}
		}
		System.out.println(n);
		System.out.println("("+nrDiv+")");
	}

}
