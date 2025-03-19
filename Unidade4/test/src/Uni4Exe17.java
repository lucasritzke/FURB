
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0");

        System.out.print("Renda anual: ");
        double rendaAnual = ler.nextDouble();

        System.out.print("Numero de dependentes: ");
        int dependentes = ler.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * 0.02 * dependentes);
        double imposto;

        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15;
        }

        System.out.println("O imposto a ser pago é: R$ "+ df_2.format(imposto));
    }
}
