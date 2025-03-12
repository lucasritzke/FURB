import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o raio da lata de oleo");
        double raio = ler.nextDouble();

        System.out.println("Digite a altura da lata de oleo:");
        double altura = ler.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata de oleo é " + df_2.format(volume));
    }
}
