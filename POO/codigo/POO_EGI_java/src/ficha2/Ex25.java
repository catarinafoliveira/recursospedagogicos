package ficha2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int qtd=0;
		for(int i=a; i<b; i++) {
			if(i%2==0 && i%3==0) 
				System.out.println(i);
		}
	}

}
