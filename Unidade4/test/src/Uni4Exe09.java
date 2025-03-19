import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        //Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
        Scanner ler = new Scanner(System.in);

        int valor1 = ler.nextInt();
        int valor2 = ler.nextInt();
        
        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

    }
}
