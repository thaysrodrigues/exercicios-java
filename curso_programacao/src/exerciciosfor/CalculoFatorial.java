package exerciciosfor;

import java.util.Scanner;


public class CalculoFatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor n: ");
		int n = sc.nextInt();
		
		int resultado = 0; 
		
		for (int i = 1; i <= n; i++) {
			resultado = resultado * i; 
		    System.out.println(resultado);
		}
		
		sc.close();
	}

}
