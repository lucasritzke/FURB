import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
        Scanner ler = new Scanner(System.in);
        int idadeHomem1 = ler.nextInt();
        int idadeHomem2 = ler.nextInt();
        int idadeMulher1 = ler.nextInt();
        int idadeMulher2 = ler.nextInt();
        int homemMaisVelho = 0;
        int homemMaisNovo = 0;
        int mulherMaisVelha = 0;
        int mulherMaisNova = 0;

        if (idadeHomem1 > idadeHomem2) {
            homemMaisVelho = idadeHomem1;
            homemMaisNovo = idadeHomem2;
        } else {
            homemMaisVelho = idadeHomem2;
            homemMaisNovo = idadeHomem1;
        }
        if (idadeMulher1 > idadeMulher2) {
            mulherMaisVelha = idadeMulher1;
            mulherMaisNova = idadeMulher2;
        } else {
            mulherMaisVelha = idadeMulher2;
            mulherMaisNova = idadeMulher1;
        }

        System.out.println("Soma: " + (homemMaisVelho + mulherMaisNova));
        System.out.println("Produto: " + (homemMaisNovo * mulherMaisVelha));

    }
}
