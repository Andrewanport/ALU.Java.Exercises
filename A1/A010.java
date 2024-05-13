package A1;

import java.util.Scanner;

public class A010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade de dinheiro em real: ");
        double real = sc.nextDouble();

        double dolar = real / 4.94;

        System.out.println("R$" + real + " é igual à " + "$" + dolar);
    }
}
