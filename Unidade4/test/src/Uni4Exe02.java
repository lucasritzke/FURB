import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = ler.nextInt();

        if (valor % 2 == 0 ){
            System.out.println(valor + " é par");
        }else {
            System.out.println(valor + " é impar");
        }

    }
}
