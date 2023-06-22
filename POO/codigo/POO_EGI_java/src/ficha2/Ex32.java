package ficha2;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		final int LOTACAO = 100;
		int ocupantes = 0, nEntradas;
        Scanner ler = new Scanner(System.in);

        do {
            nEntradas = ler.nextInt();
            if (ocupantes + nEntradas > LOTACAO) {
                System.out.println("Nr ocupantes excede lotação");
            } else {
                ocupantes += nEntradas;
                System.out.println("Ocupação atual: " + ocupantes);
            }
        } while (ocupantes != LOTACAO);
        System.out.println("Bar cheio");
	}

}
