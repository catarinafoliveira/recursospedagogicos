package ficha3;

public class Ex01 {

	public static void main(String[] args) {
		int[] fibonacci = new int[20];
		fibonacci[0] = fibonacci[1] = 1;
		for(int i = 2; i<fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
		}
		
		for(int i = 0; i<fibonacci.length; i++) {
			System.out.print (fibonacci[i] + " ");
		}
	}
}
