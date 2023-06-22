package ficha2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cilindrada = ler.nextInt();
		double taxa, parcela;
		if(cilindrada<1250) {
			taxa=3.74;
			parcela= 2417.56;
		} else {
			taxa=8.86;
			parcela=8813.22;
		}
		System.out.println(taxa*cilindrada-parcela);
			
	}

}
