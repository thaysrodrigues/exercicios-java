package exerciciosvariaveis;

import java.util.Scanner;

public class CalculoAreas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		double A = sc.nextDouble();

		System.out.print("Digite o valor de B: ");
		double B = sc.nextDouble();

		System.out.print("Digite o valor de C: ");
		double C = sc.nextDouble();

//a)   
		double triangulo = (A * C) / 2;
		System.out.printf("TRIANGULO: %.3f\n", triangulo);

//b)	
		double pi = Math.PI;
		double circulo = Math.pow(C, 2) * pi;
		System.out.printf("CIRCULO: %.3f\n", circulo);

//c)
		double trapezio = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);

//d)
		double quadrado = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f\n", quadrado);

//e)
		double retangulo = A * B;
		System.out.printf("RETANGULO: %.3f\n", retangulo);

		sc.close();

	}
}
