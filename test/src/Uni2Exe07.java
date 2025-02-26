import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        String userName;
        Double fixedSalary;
        Double monthSales;
        Double comission = 0.15;
        Double increase;
        Double result;
        
        
        System.out.println("What is the sales name?");
        userName = read.nextLine();

        System.out.println("What is the fixed salary?");
        fixedSalary = read.nextDouble();

        System.out.println("What is the value of the month sales?");
        monthSales = read.nextDouble();

        increase =  monthSales * comission;
        result = increase + fixedSalary;

        System.out.println("The salary from "+ userName + " is $:" + result);


        read.close();

    }
    
}
