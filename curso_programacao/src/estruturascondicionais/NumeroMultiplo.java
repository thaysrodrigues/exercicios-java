package estruturascondicionais;
import java.util.Scanner;

public class NumeroMultiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Digite o valor do número A: ");
		int numeroA = sc.nextInt(); 
		
		System.out.print("Digite o valor do número B: ");
		int numeroB = sc.nextInt(); 
		
		if (numeroA %  numeroB == 0 || numeroB % numeroA == 0) { 
		    System.out.println("Sao multiplos");
		} else {
		    System.out.println("Nao sao multiplos");
		}
			
		sc.close(); 

	}		

}