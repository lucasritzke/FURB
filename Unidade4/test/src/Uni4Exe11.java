import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.
        Scanner ler = new Scanner(System.in);
        int ano1 = ler.nextInt();
        int ano2 = ler.nextInt();
        int ano3 = ler.nextInt();
        if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("Trigêmeos");
        } else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.println("Gêmeos");
        } else {
            System.out.println("Apenas irmãos");
        }
    }
}
