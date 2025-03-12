
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        //Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
        System.out.println("passe a base desse terreno");
        int base = ler.nextInt();
        System.err.println("Passe a altura desse terreno");
        int altura = ler.nextInt();

        int contaArea = base * altura;

        System.out.println(contaArea);



    }
}
