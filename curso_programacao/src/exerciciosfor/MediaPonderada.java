package exerciciosfor;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite tr�s valores: ");

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a + b + c) / 3;

			System.out.println("o valor da m�dia ser�: " + media);
		}

		sc.close();
	}

}
