package A2;

import java.util.Scanner;

public class A013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        double nota = 0;
        double somatorio = 0;


        for (int i = 0; i < 3; i++) {

            System.out.printf("Digite a sua nota (%d): ",counter);
            nota = sc.nextDouble();
            somatorio += nota;

            counter += 1;

        }

        double media = somatorio/3;

        System.out.printf("A média de avaliação foi de: %s", media);


    }
}
