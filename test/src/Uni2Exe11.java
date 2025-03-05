import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        //Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159).
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.   

        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double A = 3.0;
        double B = 4.0;
        double C = 5.4;
        double PI = 3.14159;

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * C * C;
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println("TRIANGULO: \n" + areaTriangulo);
        System.out.println("CIRCULO: \n" + areaCirculo);
        System.out.println("TRAPEZIO: \n" + areaTrapezio);
        System.out.println("QUADRADO: \n" + areaQuadrado);
        System.out.println("RETANGULO: \n" + areaRetangulo);
    }
    
}
