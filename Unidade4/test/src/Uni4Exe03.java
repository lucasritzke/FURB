import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        if (num1 > num2) {
            System.out.println(num1+ " é maior que "+num2);
        }else if (num2 > num1) {
            System.out.println(num2+ " é maior que "+num1);
        }else {
            System.out.println("Erro");
        }
    }
}
