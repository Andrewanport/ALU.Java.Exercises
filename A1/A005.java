package A1;

import java.util.Scanner;

public class A005 {
    public static void main(String[] args) {

        System.out.print("Digite a temperatura em celcius: ");
        Scanner sc = new Scanner(System.in);

        double Celcius = sc.nextDouble();

        double Fahrenheit = ((Celcius * 1.8) + 32);

        System.out.printf("A temperatura %sºC é equivalente à %sºF", Celcius, Fahrenheit);

        int CelciusFahrenheit = (int) ((Celcius * 1.8) + 32);

        System.out.println("\nTemperatura inteira é: " + CelciusFahrenheit + "ºF");
    }
}
