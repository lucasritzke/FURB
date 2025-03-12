import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o cateto 1");
        double cateto1 = ler.nextDouble();

        System.out.println("Digite o cateto 2");
        double cateto2 = ler.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("A hipotenusa é " + df_2.format(hipotenusa));
    }
}
