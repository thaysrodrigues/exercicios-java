package exerciciosvariaveis;

import java.util.Scanner;

public class ValorPecas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero da pe�a 1: ");
		int peca1 = sc.nextInt();
		System.out.print("Digite o n�mero de pe�as: ");
		int numeroPecas = sc.nextInt();
		System.out.print("Digite o valor da pe�a: ");
		double valorPeca = sc.nextDouble();

		System.out.print("Digite o n�mero da pe�a 2: ");
		int peca2 = sc.nextInt();
		System.out.print("Digite o n�mero de pe�as: ");
		int numeroPecas2 = sc.nextInt();
		System.out.print("Digite o valor da pe�a: ");
		double valorPeca2 = sc.nextDouble();

		double resultado = (numeroPecas * valorPeca) + (numeroPecas2 * valorPeca2);

		System.out.printf("VALOR A PAGAR: R$%.2f\n", resultado);

		sc.close();

	}
}
