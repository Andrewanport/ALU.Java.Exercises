package A2;

import java.util.Scanner;

public class A012 {
    public static void main(String[] args) {

        int year = 2014;

        boolean plan = false;

        String planType = "Plat";

        if (year >= 2022) {
            System.out.println("Esse é lançamento!");
        }
        else {
            System.out.println("Ainda não assistiu esse!?");
        }

        if ((plan == true) && (planType.equals("Gold"))) {
            System.out.println("Você pode assistir! ");

        }
        else {
            System.out.println("Você não pode assistir!");
        }
    }
}
