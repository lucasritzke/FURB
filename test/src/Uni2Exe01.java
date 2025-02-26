import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String args[]){
                Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the sum.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the sum.");
        num2 = ler.nextInt();

        count = num1 + num2;

        System.out.println("The sum of the two numbers is " + count);
        ler.close();
    }
}
