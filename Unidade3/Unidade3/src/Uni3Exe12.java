import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o nome do funcionario");
        String nome = ler.nextLine();
        System.out.println("Digite o numero de horas trabalhadas mensais");
        int horasTrabalhadas = ler.nextInt();
        System.out.println("Digite o numero de dependentes");
        int dependentes = ler.nextInt();

        double salarioPorHora = 10.00;
        double salarioPorDependente = 60.00;

        double salarioTrabalho = horasTrabalhadas * salarioPorHora;
        double salarioFamilia = dependentes * salarioPorDependente;
        double salarioBruto = salarioTrabalho + salarioFamilia;

        double descINSS = salarioTrabalho * 0.085;
        double descIR = salarioTrabalho * 0.05;
        double salarioLiquido = salarioBruto - descINSS - descIR;

        System.out.println("Nome do funcionario " + nome);
        System.out.println("Salario bruto " + df_2.format(salarioBruto));
        System.out.println("Salario líquido " + df_2.format(salarioLiquido));
    }
}
