package ficha2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nota = ler.next();
		switch(nota) {
			case "Muito bom": {
				System.out.println("80% a 100%");
				break;
			}
			case "Bom": {
				System.out.println("65% a 79%");
				break;
			}
			case "Suficiente+": {
				System.out.println("55% a 64%");
				break;
			}
			case "Suficiente": {
				System.out.println("50% a 54%");
				break;
			}
			case "Insuficiente": {
				System.out.println("0% a 49%");
				break;
			}
			default: System.out.println("Inválido");
		}
	}

}
