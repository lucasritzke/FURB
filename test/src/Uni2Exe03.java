import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Double pi = 3.14159;
        Double num1;
        System.out.println("Qual o valor do raio.");
        num1 = ler.nextDouble();

        double area = pi * Math.pow(num1,2);
        System.out.println("The result of the sum about the area is " + df_4.format(area));


        ler.close(); 
    }
}
