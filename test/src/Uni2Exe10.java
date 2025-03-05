import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int totalSegundos = 4515;
                
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    
}
