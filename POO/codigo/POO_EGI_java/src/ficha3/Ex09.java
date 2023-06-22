package ficha3;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int[] valores = new int[n];
		for(int i=0; i<n; i++) {
			valores[i]=ler.nextInt();
		}
		for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (valores[j] < valores[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
		for(int i=0; i<3; i++) {
			System.out.print(valores[i] + " ");
		}
	}

}
//1200 1300 1080 500 1200 1000 1250 1050