package ficha2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura = ler.nextDouble();
		double peso = ler.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		if(imc<18.4)
			System.out.println("Abaixo do peso");
		else if(imc<25)
			System.out.println("Peso normal");
		else if(imc<30)
			System.out.println("Sobrepeso");
		else if(imc<35)
			System.out.println("Obesidade Grau I");
		else if(imc<40)
			System.out.println("Obesidade Grau II");
		else System.out.println("Obesidade Grau III");

	}

}
