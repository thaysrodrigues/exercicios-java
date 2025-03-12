package estruturascondicionais;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor X: ");
		double x = sc.nextDouble();

		System.out.print("Digite o valor Y: ");
		double y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("ponto no eixo y");
		} else if (y == 0) {
			System.out.println("ponto no eixo x");
		} else if (x > 0 && y > 0) {
			System.out.println("quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("quadrante 4");

		} else {
			System.out.println("Fora do intervalo");

		}

		sc.close();

	}
}
