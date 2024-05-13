package A2;

public class A011 {
    public static void main(String[] args) {

        double PrecoOriginal = 100;

        double Desconto = ((10.0 / 100.0) * PrecoOriginal);
        // ou:      double desconto = (PrecoOriginal) * 0.90;

        double ValorFinal = (PrecoOriginal - Desconto);

        System.out.println("Preço final : " + ValorFinal);

    }
}
