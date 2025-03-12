package exerciciosfor;

import java.util.Scanner;

public class IntervaloInOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor X: ");
		int n = sc.nextInt();

		int dentro = 0, fora = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um valor: ");
			int x = sc.nextInt(); 

			if (x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}

		System.out.println(dentro + " in");
		System.out.println(fora + " out");

		sc.close();
	}
}
