import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        //Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
        //calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
         
        Double distancia = ler.nextDouble();
        Double tempo = ler.nextDouble();    
        Double velocidadeMedia = distancia / tempo;
        Double combustivelGasto = distancia / 12;
        System.out.println("velocidade media " + df_2.format(velocidadeMedia));
        System.out.println("combustivel gasto " + df_2.format(combustivelGasto));
    }
}
