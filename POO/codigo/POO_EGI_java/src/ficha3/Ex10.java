package ficha3;

public class Ex10 {

	public static int fatorialSimples(int n) {
		int fatorial = 1;
		for(int i=2; i<=n; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}
	
	public static int fatorialRecursivo(int n) {
		if(n==1) 
			return 1;
		return n * fatorialRecursivo(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fatorialSimples(6));
		System.out.println(fatorialRecursivo(6));
	}

}
