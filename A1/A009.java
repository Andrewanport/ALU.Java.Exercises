package A1;

import java.util.Scanner;

public class A009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        double total = valor * quantidade;

        System.out.printf("O total é: R$%s", total);
    }
}
