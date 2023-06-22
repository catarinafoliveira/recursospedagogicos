package ficha2;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		final int LOTACAO = 100, MAX_BILHETES = 30; 
		int nBilhetes, ocupantes = 0, nCompradores = 0;
		Scanner ler = new Scanner(System.in);

		do {
			nBilhetes = ler.nextInt();
			if (nBilhetes < 1 || nBilhetes > MAX_BILHETES) {
				System.out.println("Quantidade inválida (Máx:"+MAX_BILHETES+"). Faltam vender: " + (LOTACAO - ocupantes));
			} else {
				if (ocupantes + nBilhetes > LOTACAO) {
					System.out.println("Nr ocupantes excede lotação ("+LOTACAO+")");
				} else {
					ocupantes += nBilhetes;
					nCompradores++;
					System.out.println("Faltam vender: " + (LOTACAO - ocupantes));
				}
			}
		} while (ocupantes != LOTACAO);
		System.out.println("Cinema cheio. Nº compradores: " + nCompradores);

	}

}
