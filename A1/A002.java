package A1;

import java.util.Scanner;

public class A002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter an integer: ");
        int b = sc.nextInt();

        System.out.printf("The sum of [%d, %d] is: ", a, b);
        System.out.print(a + b);
    }
}

