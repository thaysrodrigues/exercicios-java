package exerciciosvariaveis;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do funcionário: ");
		int numeroFuncionario = sc.nextInt();

		System.out.print("Digite o número de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();

		System.out.print("Digite o valor da hora trabalhada: ");
		double valorHora = sc.nextDouble();

		double resultado = horasTrabalhadas * valorHora;

		System.out.printf("Número do Funcionário: %d\n", numeroFuncionario);
		System.out.printf("Salário: R$ %.2f\n", resultado);

		sc.close();
	}
}