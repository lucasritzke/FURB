import java.util.Scanner;

public class Uni2Exe02 {
    public static void main (String args[]){
                Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the multiplication.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the multiplication.");
        num2 = ler.nextInt();

        count = num1 * num2;

        System.out.println("The result of the multiplication is " + count);
        ler.close();
    }
}
