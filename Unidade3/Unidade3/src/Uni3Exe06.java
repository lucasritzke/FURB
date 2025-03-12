import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        Double precoPorKg = 25.00;
        System.out.println("Quantos kg deu o prato?");
        Double kgs = ler.nextDouble();
        kgs = kgs - 0.75;
        Double custoTotal = precoPorKg * kgs;
        System.out.println("O custo total é: R$ " + df_2.format(custoTotal));
    }
}
