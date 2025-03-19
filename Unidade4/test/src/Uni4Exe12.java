
import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado1 = ler.nextDouble();
        double lado2 = ler.nextDouble();
        double lado3 = ler.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo isoceles");
            } else {
            System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triangulo");
        }
    }
    
}
