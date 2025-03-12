package exerciciosfor;

import java.util.Scanner;

public class DivisaoPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();

			if (denominador == 0) {
				System.out.println("divisao impossivel");
			} else {
				double resultado = (double) numerador / denominador;
			    System.out.println(resultado);
			}

		}
		sc.close();

	}

}