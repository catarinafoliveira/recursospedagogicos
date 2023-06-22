package ficha2;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int d, qtdPares=0, qtd = 0, maiorImpar=-1;
		while(n>0) {
			d = n%10;
			if(d%2==0) {
				qtdPares++;
			} else {
				if(d > maiorImpar) {
					maiorImpar = d;
				}
			}
			qtd++;
			n = n/10;
		}
		System.out.print("Percentagem pares: " + String.format("%.2f", qtdPares/(double)qtd*100)+"%");
		if(maiorImpar==-1)
			System.out.println("; Sem ímpares");
		else
			System.out.println("; Maior ímpar: " + maiorImpar);
	}

}
