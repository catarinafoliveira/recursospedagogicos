package ficha2;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		if(x<0)
			System.out.println(x-1);
		else if(x==0)
			System.out.println(0);
		else
			System.out.println((int)Math.pow(x, 2)-2*x);
	}

}
