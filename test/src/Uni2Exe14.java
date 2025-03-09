import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
        //(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
        Scanner read = new Scanner(System.in);

        int valor = read.nextInt();
        
        System.out.println(valor);        
        int quantidadeNotas = valor / 100;
        System.out.println(quantidadeNotas + " nota(s) de R$ 100");
        valor = valor % 100;

        quantidadeNotas = valor / 50;
        System.out.println(quantidadeNotas + " nota(s) de R$ 50");
        valor = valor % 50;

        quantidadeNotas = valor / 20;
        System.out.println(quantidadeNotas + " nota(s) de R$ 20");
        valor = valor % 20;

        quantidadeNotas = valor / 10;
        System.out.println(quantidadeNotas + " nota(s) de R$ 10");
        valor = valor % 10;

        quantidadeNotas = valor / 5;
        System.out.println(quantidadeNotas + " nota(s) de R$ 5");
        valor = valor % 5;

        quantidadeNotas = valor / 2;
        System.out.println(quantidadeNotas + " nota(s) de R$ 2");
        valor = valor % 2;

        quantidadeNotas = valor / 1;
        System.out.println(quantidadeNotas + " nota(s) de R$ 1");
        
        read.close();
    }
    
}
