import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("QUal o valor da gasolina?");
        Double gaso = ler.nextDouble();
        System.out.println("Qual o valor que voce pagou?");
        Double pagoso = ler.nextDouble();

        Double contaFinal = pagoso / gaso;

        System.out.println("Voce colocou " + df_2.format(contaFinal) + " Litros");
    }
}
