import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), 
        //e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

        Double precoAzu = 12.50;
        Double altura = ler.nextDouble();
        Double comprimento = ler.nextDouble();


        Double calc1 = altura * comprimento;
        Double calc2 = calc1 * 9;
        Double calcFinal = calc2 * precoAzu;

        System.out.println("R$: " + df_2.format(calcFinal));


    }
}
