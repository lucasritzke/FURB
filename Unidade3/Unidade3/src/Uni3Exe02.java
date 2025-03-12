import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");

            System.out.println("Qual o valor do produto?");
            int prod = ler.nextInt();

            Double valorFinal = prod * 0.12;

            System.out.println("O valor do desconto é R$" + df_2.format(valorFinal));

    }
}
