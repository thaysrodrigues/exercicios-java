package exerciciosvariaveis;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero do funcion�rio: ");
		int numeroFuncionario = sc.nextInt();

		System.out.print("Digite o n�mero de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();

		System.out.print("Digite o valor da hora trabalhada: ");
		double valorHora = sc.nextDouble();

		double resultado = horasTrabalhadas * valorHora;

		System.out.printf("N�mero do Funcion�rio: %d\n", numeroFuncionario);
		System.out.printf("Sal�rio: R$ %.2f\n", resultado);

		sc.close();
	}
}