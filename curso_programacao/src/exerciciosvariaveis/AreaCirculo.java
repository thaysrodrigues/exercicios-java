package exerciciosvariaveis;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		double R = sc.nextDouble();
		double pi = Math.PI;
		double A = Math.pow(R, 2) * pi;

		System.out.printf("A área do círculo é: %.4f\n", A);

	}
}