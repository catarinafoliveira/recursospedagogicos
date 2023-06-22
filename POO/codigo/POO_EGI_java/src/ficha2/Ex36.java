package ficha2;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int n1, n2, n1aux, n2aux, resto, maxDivisorComum, minMultiploComum;

        n1 = ler.nextInt();
        n2 = ler.nextInt();

        // para fins de calculo dos maximo divisor comum, porque n1 e n2 vao alterando dentro do while
        n1aux = n1;
        n2aux = n2;
        
        while (n2aux != 0) {
            resto = n1aux % n2aux;
            n1aux = n2aux;
            n2aux = resto;
        }
        maxDivisorComum = n1aux;
        
        minMultiploComum = n1*(n2/maxDivisorComum);
        
        System.out.println(minMultiploComum);
	}

}
