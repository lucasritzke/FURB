import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
        //A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int userId;
        Double timeSpend;
        Double earnHours = 10.00;
        Double countSalary;

        System.out.println("What is your ID number?");
        userId = read.nextInt();

        System.out.println("How many hours did you work?");
        timeSpend = read.nextDouble();

        countSalary = timeSpend * earnHours;

        System.out.println(df_2.format(countSalary));
        read.close();


    }
}
