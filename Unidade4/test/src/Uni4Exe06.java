import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String word = ler.nextLine();
        if (word == "M"){
            System.out.println("Masculino");
        }else if (word == "F"){
            System.out.println("Feminino");
        }else if (word == "I"){
            System.out.println("Não Informado");
        }else{
            System.out.println("Entrada invalida");
        }
    }
}
