import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.

        int dia = ler.nextInt();
        int mes = ler.nextInt();
        int ano = ler.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("invalida");
        } else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia < 1 || dia > 29) {
                    System.out.println("invalida");
                } else {
                    System.out.println("valida");
                }
            } else {
                if (dia < 1 || dia > 28) {
                    System.out.println("invalida");
                } else {
                    System.out.println("valida");
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                System.out.println("invalida");
            } else {
                System.out.println("valida");
            }
        } else {
            if (dia < 1 || dia > 31) {
                System.out.println("invalida");
            } else {
                System.out.println("valida");
            }
        }

    }
}