package A1;

import java.util.Scanner;

public class A001 {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("Você tem %d, %s", idade, nome);
    }
}
