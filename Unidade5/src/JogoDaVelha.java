
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("");
            for (int j=0; j<3; j++){
                if(i < 2) {
                    System.out.print("_");
                }else {
                    System.out.print(" ");
                }
                if(j  < 2) {
                    System.out.print("|");
                }
            }
                
            
        }

    }
    
}
