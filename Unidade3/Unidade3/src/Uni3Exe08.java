import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Quantos dolares você quer converter?");
        Double dolares = ler.nextDouble();
        System.out.println("Qual a cotação do dolar?");
        Double cotacao = ler.nextDouble();

        Double reais = dolares * cotacao;   

        System.out.println("Você terá R$ " + df_2.format(reais));


    }
}
