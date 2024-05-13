package A1;

public class A004 {
    public static void main(String[] args) {

        System.out.println("Welcome to Absolute Cinema");
        System.out.println("Movie: Interstellar");

        int year = 2014;
        System.out.println("Year: " + year);

        boolean plan = true;

        double grade = 9.99;

        // Média calculada por 3 notas aleatórias
        double media = (10 + 9.5 + 8.6) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme sobre algo além do espaço...
                Amor!
                """;

        System.out.println(sinopse);

        // Casting
        int stars = (int) media / 2;
        System.out.println(stars);


    }
}
