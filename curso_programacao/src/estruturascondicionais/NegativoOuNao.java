package estruturascondicionais;
import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite o valor de um número: ");
		int numero = sc.nextInt(); 
		
		if (numero < 0) { 
		    System.out.println("NEGATIVO");
		} else {
		    System.out.println("NAO NEGATIVO");
		}
		
		
		sc.close(); 

	}
}


