package estruturascondicionais;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite o valor de um n�mero: ");
		int numero = sc.nextInt(); 
		
		if (numero % 2 == 0) { 
		    System.out.println("PAR");
		} else {
		    System.out.println("�MPAR");
		}
		
		
		sc.close(); 

	}

}

