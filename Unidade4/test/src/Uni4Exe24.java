import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        int num1 = ler.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = ler.nextInt();
        System.out.println("Terceiro numero: ");
        int num3 = ler.nextInt();
        System.out.println("Qual Opção desejada: ");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int op1 = ler.nextInt();

        switch (op1) {
            case 1:
                if (num1 > num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                if (num1 > num3) {
                    int temp = num1;
                    num1 = num3;
                    num3 = temp;
                }
                if (num2 > num3) {
                    int temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
                System.out.println(num1 + ", " + num2 + ", " + num3);
                break;
            case 2:
                if (num1 < num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                if (num1 < num3) {
                    int temp = num1;
                    num1 = num3;
                    num3 = temp;
                }
                if (num2 < num3) {
                    int temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
                System.out.println(num1 + ", " + num2 + ", " + num3);
                break;
            case 3:
                int maior, meio, menor;
                if (num1 > num2 && num1 > num3) {
                    maior = num1;
                    if (num2 > num3) {
                        meio = num2;
                        menor = num3;
                    } else {
                        meio = num3;
                        menor = num2;
                    }
                } else if (num2 > num1 && num2 > num3) {
                    maior = num2;
                    if (num1 > num3) {
                        meio = num1;
                        menor = num3;
                    } else {
                        meio = num3;
                        menor = num1;
                    }
                } else {
                    maior = num3;
                    if (num1 > num2) {
                        meio = num1;
                        menor = num2;
                    } else {
                        meio = num2;
                        menor = num1;
                    }
                }
                System.out.println(menor + ", " + maior + ", " + meio);
                break;

            default:
                System.out.println("Opcao invalida!");
        }
        ler.close();
    }
}