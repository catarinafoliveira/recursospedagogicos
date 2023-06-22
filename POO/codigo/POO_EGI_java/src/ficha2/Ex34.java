package ficha2;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int d, produto, num, nImpares;
		while(n>0) {
			num = n;
			produto = 1;
			nImpares = 0;
			while(num>0) {
				d = num%10;
				if(d%2!=0) {
					produto*=d;
					nImpares++;
				}
				num = num/10;
			}
			if(nImpares>0) {
				System.out.println(produto);
			} else {
				System.out.println("Não tem ímpares");
			}
			n = ler.nextInt();
		}
	}
	

}
