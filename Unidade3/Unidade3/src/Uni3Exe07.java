import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("QUantas 350ml");
        int ml350 = ler.nextInt();

        System.out.println("Quantas 600ml");
        int ml600 = ler.nextInt();

        System.out.println("Quantas 2L");
        int l2 = ler.nextInt();

        Double contaFinal = (ml350 * 0.35) + (ml600 * 0.60) + (l2 * 2.00);
        System.out.println("O comprador comprou " + df_2.format(contaFinal) + "ml's");

    }
}
