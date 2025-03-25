import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        Double nota1, nota2, nota3, notasExercicios;
        System.out.println("Digite a nota 1: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3 = ler.nextDouble();

        System.out.println("Digite a media dos exercicios: ");
        notasExercicios = ler.nextDouble();

        Double media = (nota1 + (nota2 * 2) + (nota3 * 3) + notasExercicios) /7;
        if (media >= 9 ){
            System.out.println("A");
        }else if (media < 9 && media >= 7.5 ){
            System.out.println("B");
        }
        else if (media < 7.5 && media >= 6 ){
            System.out.println("C");
        }else if (media < 6 && media >= 4 ){
            System.out.println("D");

        }else if (media < 4){
            System.out.println("E");
        }
        System.out.println("Media: " + df_2.format(media));
    }
}
