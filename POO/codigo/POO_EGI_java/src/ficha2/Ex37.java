package ficha2;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
        int n, nDivisores = 0;
        Scanner ler = new Scanner(System.in);

        n = ler.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (n % i == 0) {
                    System.out.println(i);
                    nDivisores++;
                }
            }
        }
        if (nDivisores == 0) {
            System.out.println("Sem divisores múltiplos de 3");
        }
    }
}
