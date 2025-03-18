import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        //Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
        //X centena(s)  Y dezena(s) K unidade(s)  
        //Exemplo, se for submetido o número 384, o programa deverá exibir:
        //3 centena(s)  8 dezena(s) 4 unidade(s) 
        int numero = ler.nextInt();
        int centena = numero / 100; 
        int dezena = (numero % 100) / 10;
        int unidade = (numero % 100) % 10;
        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
     
        
    }
}
