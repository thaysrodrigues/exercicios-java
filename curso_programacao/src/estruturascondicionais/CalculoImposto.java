package estruturascondicionais;
import java.util.Scanner;
import java.util.Locale;

public class CalculoImposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		try {
			System.out.print("Digite o valor: ");
			double salario = sc.nextDouble();

			double imposto = 0.0;

			if (salario <= 2000.00) {
				System.out.println("Isento");
			} else {
				if (salario > 2000.00 && salario <= 3000.00) {
					imposto += (salario - 2000.00) * 0.08;
				} else if (salario > 3000.00 && salario <= 4500.00) {
					imposto += (1000.00) * 0.08;
					imposto += (salario - 3000.00) * 0.18;
				} else {
					imposto += (1000.00) * 0.08;
					imposto += (1500.00) * 0.18;
					imposto += (salario - 4500.00) * 0.28;
				}

				System.out.println(String.format("R$ %.2f", imposto));
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Erro, entrada inválida, insira um valor válido");
		} finally {
			sc.close();
		}
	}
}
