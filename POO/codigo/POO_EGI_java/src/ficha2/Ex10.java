package ficha2;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		int delta = b*b-4*a*c;
		if(delta<0)
			System.out.println("Indeterminado");
		else if(delta==0)
			System.out.println("1 raiz: " + -b/(2.0*a));
		else
			System.out.println("2 raizes: " + (-b + Math.sqrt(delta))/(2.0*a) + " ou " + (-b - Math.sqrt(delta))/(2.0*a));
			
	}
}
