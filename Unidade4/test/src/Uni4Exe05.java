import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("A cor é azul? ");
        boolean answer = ler.nextBoolean();
        if(answer == true){
            System.out.println("sim");
        }
        else if(answer == false){
            System.out.println("não");
        }else{
            System.out.println("Erro");
        }
    }
}
