package ficha2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nr1 = ler.nextDouble();
		String operador = ler.next();
		double nr2 = ler.nextDouble();
		switch(operador) {
			case "+": System.out.println(nr1+nr2);
					  break;
			case "-": System.out.println(nr1-nr2);
			  		  break;
			case "*": System.out.println(nr1*nr2);
			  		  break;
			case "/": System.out.println(nr1/nr2);
			  		  break;
			default:  System.out.println("Inválido");
		}
	}

}
