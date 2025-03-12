package exerciciosfor;

import java.util.Scanner;

public class ImprimirImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor X: ");
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

			sc.close();
		}
	}
}
