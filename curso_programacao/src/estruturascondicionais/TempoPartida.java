package estruturascondicionais;
import java.util.Scanner;

public class TempoPartida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Digite o valor da hora final: ");
		int horaFinal = sc.nextInt();

		int resultado = horaInicial - horaFinal;
		System.out.println("A dura��o do jogo �: " + resultado + " horas");

		if (horaFinal > horaInicial) {
			System.out.println("O jogo passou da meia-noite.");
		} else {
			System.out.println("O jogo n�o passou da meia-noite.");
		}

		sc.close();
	}
}