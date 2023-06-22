package ficha2;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = ler.next(), categoria;
		int anoNascimento, nrTreinos, preco;
		while(!nome.equals("fim")) {
			anoNascimento = ler.nextInt();
			nrTreinos = ler.nextInt();
			if(anoNascimento>2001) {
				categoria = "Mini";
				preco = 20;
			} else if(anoNascimento>1998) {
				categoria = "Intermédio";
				preco = 25;
			} else {
				categoria = "Expert";
				preco = 30;
			}
			System.out.println(nome + " vai pagar " + preco*nrTreinos + "€ por mês (" + categoria + ")");
			nome = ler.next();
		}

	}

}
