import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com as hora trabalhadas no mes: ");
        int hora = ler.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        double valor = ler.nextDouble();
        Double salarioTotal = hora * valor;

        if (hora > 160){
            Double salarioExtra = (hora - 160) * (valor / 2);
             salarioTotal = salarioExtra + salarioTotal;
        }else{
            System.out.println("O Salario total é: "+ salarioTotal);
        }
        System.out.println("Salario total: " + salarioTotal);
    }
}
