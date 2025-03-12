import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        Double a1 = 4.00;
        Double a2 = 7.00;
        Double contaAnel = a1 + a2;
        
        System.out.println("Quantos frangos precisam do anel");
        int totalFrangos = ler.nextInt();

        Double contaFinal = contaAnel * totalFrangos;
        System.out.println(df_2.format(contaFinal));

    }
}
