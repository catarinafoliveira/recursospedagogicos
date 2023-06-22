package ficha1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int h = ler.nextInt();
		int m = ler.nextInt();
		int passou = h*60+m;
		System.out.println("Passaram " + passou + " minutos desde a meia noite");
	}

}
