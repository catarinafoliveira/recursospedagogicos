package ficha3;

public class Ex11 {

	public static boolean ePalindromo(String palavra) {
		int t = palavra.length();
		for(int i=0; i<t/2; i++) {
			if(palavra.charAt(i)!=palavra.charAt(t-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("ana: " + ePalindromo("ana"));
		System.out.println("AA: " + ePalindromo("AA"));
		System.out.println("kayak: " + ePalindromo("kayak"));
		System.out.println("ze: " + ePalindromo("ze"));
	}

}
