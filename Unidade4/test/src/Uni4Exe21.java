import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a altura do cara ");
        double altura = ler.nextDouble();

        System.out.println("Digite quantos quilos a pessoa tem: ");
        double pessoaKg = ler.nextDouble();

        Double IMC = pessoaKg / altura;
        if (IMC < 18.5) {
            System.out.println("Magreza");
        }else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Saudavel");
        }else if (IMC >= 24.9 && IMC < 29.9) {
            System.out.println("Sobrepeso");
        }else if (IMC >= 29.9 && IMC < 34.9) {
            System.out.println("Obeso grau 1");
        }else if (IMC >= 34.9 && IMC < 39.9) {
            System.out.println("Obeso grau 2");
        }else if (IMC >= 39.9) {
            System.out.println("Obeso grau 3");
        }
        
    }

}
