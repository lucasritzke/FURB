import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Coloque a primeira nota");
        Double n1 = ler.nextDouble();
        Double n1Result = n1 / 5;
        System.out.println("Coloque a primeira nota");
        Double n2 = ler.nextDouble();
        Double n2Result = n2 / 3;
        System.out.println("Coloque a primeira nota");
        Double n3 = ler.nextDouble();
        Double n3Result = n3 / 2;

        Double mediaFinal  = n1Result + n2Result + n3Result;

        System.out.println(df_2.format(mediaFinal));

    }
}
