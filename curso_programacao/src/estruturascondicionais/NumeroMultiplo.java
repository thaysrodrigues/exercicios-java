package estruturascondicionais;
import java.util.Scanner;

public class NumeroMultiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite o valor do n�mero A: ");
		int numeroA = sc.nextInt(); 
		
		System.out.print("Digite o valor do n�mero B: ");
		int numeroB = sc.nextInt(); 
		
		if (numeroA %  numeroB == 0 || numeroB % numeroA == 0) { 
		    System.out.println("Sao multiplos");
		} else {
		    System.out.println("Nao sao multiplos");
		}
			
		sc.close(); 

	}		

}