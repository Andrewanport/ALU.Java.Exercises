package A2;

import java.util.Scanner;

public class A014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        double nota = 0;
        double somatorio = 0;
        int totalNotas = 0;


        while (nota != -1) {

            System.out.printf("Digite a sua nota (%d): ",counter);
            nota = sc.nextDouble();
            counter += 1;

            if (nota != -1){
                somatorio += nota;
                totalNotas += 1;
            }

        }

        double media = somatorio/totalNotas;

        System.out.printf("A média de avaliação foi de: %s", media);


    }
}
