import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o ponto X: ");
        int x = ler.nextInt();

        System.out.println("Digite o ponto Y: ");
        int y = ler.nextInt();

        if(x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }else if(x > 0 && y > 0){
            System.out.println("Quadrante 1");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrante 2");
        }else if (x < 0 && y < 0){
            System.out.println("Quadrante 3");
        }else if (x < 0 && y > 0){
            System.out.println("Quadrante 4");
        }
         
        
    }
    
}
