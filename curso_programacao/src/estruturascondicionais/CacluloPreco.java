package estruturascondicionais;
import java.util.Scanner;

public class CacluloPreco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o c�digo do item: ");
		int codigo = sc.nextInt();

		System.out.print("Digite a quantidade do item: ");
		int quantidade = sc.nextInt();

		double preco = 0.0;

		if (codigo == 1) {
			preco = 5.00;
		} else if (codigo == 2) {
			preco = 10.00;
		} else if (codigo == 3) {
			preco = 15.00;
		} else {
			System.out.println("C�digo de item inv�lido");
			return;
		}

		double resultado = preco * quantidade;
		System.out.println("O valor total �: " + resultado + " reais");

		sc.close();

	}
}