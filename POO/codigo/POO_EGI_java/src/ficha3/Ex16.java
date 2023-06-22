package ficha3;

import java.util.Scanner;

public class Ex16 {

	public static boolean multiploTodosAlgarismos(int n) {
		int num = n, d;
		while(num>0) {
			d = num % 10;
			if(d==0 || n % d != 0) {
				return false;
			}
			num = num/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n= ler.nextInt();;
		while(!multiploTodosAlgarismos(n)) {
			System.out.println("Tente outro");
			n = ler.nextInt();
		} 
		System.out.println(n + " é múltiplo de todos os algarismos");
	}

}
