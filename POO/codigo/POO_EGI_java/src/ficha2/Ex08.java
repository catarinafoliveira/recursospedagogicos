package ficha2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int y = ler.nextInt();
		if(x>0)
			if(y>0)
				System.out.println("1º quadrante");
			else
				System.out.println("4º quadrante");
		else
			if(y>0)
				System.out.println("2º quadrante");
			else
				System.out.println("3º quadrante");
	}

}
