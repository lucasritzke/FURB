import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Qual o valor em graus Celsius?");
        double celsius = ler.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("O valor em Fahrenheit é " + df_2.format(fahrenheit));
    }
}
