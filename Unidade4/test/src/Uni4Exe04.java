import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try{
            int N = ler.nextInt();
            System.out.println("Casas decimais não foram digitadas.");

        }catch(Exception e){
            System.out.println("Casas decimais foram digitadas.");
        }
    }
}
