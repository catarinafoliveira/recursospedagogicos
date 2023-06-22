package ficha2;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int NR_UCS = 4;
		int nota, soma, nrAprovadas;
		String nome = ler.next();
		while(!nome.equals("END")) {
			soma = 0;
			nrAprovadas = 0;
			for(int i=0; i<NR_UCS; i++) {
				nota = ler.nextInt();
				soma +=nota;
				if(nota>=10) {
					nrAprovadas++;
				}
			}
			System.out.println(nome + " - Média: " + soma/(double)NR_UCS + ". Sucesso a: " + nrAprovadas + " UCs");
			nome = ler.next();
		}
	}

}
