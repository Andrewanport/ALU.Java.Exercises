package A1;

import java.util.Scanner;

public class A006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a grade (1): ");
        double G1 = sc.nextInt();

        System.out.println("Enter a grade (2): ");
        double G2 = sc.nextInt();

        double average = (G1 + G2) / 2;

        System.out.println("The average grade is " + average);
    }
}
