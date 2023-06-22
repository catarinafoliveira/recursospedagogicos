package ficha2;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		for(int i=a; i<=b; i++) {
			if(i%2==1 && i%5==0)
				System.out.println(i);
		}
	}
}
