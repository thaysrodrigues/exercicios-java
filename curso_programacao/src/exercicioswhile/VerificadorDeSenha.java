package exercicioswhile;

import java.util.Scanner;

public class VerificadorDeSenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da senha: ");
        int x = sc.nextInt();

        while (x != 2002) { 
            System.out.println("Senha inválida");
            System.out.print("Digite o valor da senha: ");
            x = sc.nextInt();
        }

        System.out.println("Senha correta");

        sc.close();
    }
}
