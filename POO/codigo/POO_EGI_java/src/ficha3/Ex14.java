package ficha3;

public class Ex14 {

	public static double serie(int n) {
		if(n==1)
			return 1;
		return 1.0/n + serie(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(serie(5));
	}

}
