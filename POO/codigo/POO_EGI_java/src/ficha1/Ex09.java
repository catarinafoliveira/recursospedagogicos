package ficha1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Nr rapazes?");
		int nRapazes = ler.nextInt();
		System.out.println("Nr raparigas?");
		int nRaparigas = ler.nextInt();
		int total = nRapazes+nRaparigas;
		double pcRapazes = nRapazes/(double)total*100;
		double pcRaparigas = nRaparigas/(double)total*100;
		System.out.println("Rapazes: " + String.format("%.1f", pcRapazes)+"%, raparigas: "+String.format("%.1f", pcRaparigas)+"%");
	}

}
