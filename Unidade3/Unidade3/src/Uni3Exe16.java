
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        //Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos..
        //Preciso colocar isso "O número mínimo de notas de troco é: 6"
        int valorCompra = ler.nextInt();
        int valorPago = ler.nextInt();
        int troco = valorPago - valorCompra;
        int notas100 = troco / 100;
        int notas10 = (troco % 100) / 10;
        int notas1 = (troco % 100) % 10;
        int totalNotas = notas100 + notas10 + notas1;
        
        System.out.println("Troco: " + troco);
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 1: " + notas1);
        System.out.println("O número mínimo de notas de troco é: " + totalNotas);
    }
    
}
