import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T - Área de um triângulo");
        System.out.println("Q - Área de um quadrado");
        System.out.println("R - Área de um retângulo");
        System.out.println("C - Área de um círculo");
        char opcao = ler.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T': // Triângulo
                System.out.println("Informe a base do triângulo: ");
                double baseT = ler.nextDouble();
                System.out.println("Informe a altura do triângulo: ");
                double alturaT = ler.nextDouble();
                double areaTriangulo = (baseT * alturaT) / 2;
                System.out.println("A área do triângulo é: " + areaTriangulo);
                break;

            case 'Q': // Quadrado
                System.out.println("Informe o lado do quadrado: ");
                double ladoQ = ler.nextDouble();
                double areaQuadrado = ladoQ * ladoQ;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;

            case 'R': // Retângulo
                System.out.println("Informe a base do retângulo: ");
                double baseR = ler.nextDouble();
                System.out.println("Informe a altura do retângulo: ");
                double alturaR = ler.nextDouble();
                double areaRetangulo = baseR * alturaR;
                System.out.println("A área do retângulo é: " + areaRetangulo);
                break;

            case 'C': // Círculo
                System.out.println("Informe o raio do círculo: ");
                double raioC = ler.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioC, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        ler.close();
    }
}