package ficha2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
//		masculino 2 1,80 75 43
		String genero = ler.next();
		int treinos = ler.nextInt();
		double altura = ler.nextDouble();
		int peso = ler.nextInt();
		int idade = ler.nextInt();
		double fator;
		if(treinos==0)
			fator=1.2;
		else if(treinos<=2)
			fator=1.375;
		else if(treinos<=4)
			fator=1.55;
		else if(treinos<=6)
			fator=1.725;
		else
			fator=1.9;
		double tmb;
		if(genero.equals("masculino")) {
			tmb = fator*(66+13.7*peso+5*altura-6.8*idade);
		} else {
			tmb = fator*(655+9.6*peso+1.8*altura-4.7*idade);
		}
		System.out.println(tmb);
	}

}
