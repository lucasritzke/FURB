import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
        //o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int codPc1;
        int codPc2;
        Double unitarieValuePc1;
        Double unitarieValuePc2;
        int numberPcs1;
        int numberPcs2;
        double valueBox1;
        double valueBox2;


        System.out.println("What's the code of the first pc?");
        codPc1 = read.nextInt();

        System.out.println("What's the number of pc?");
        numberPcs1 = read.nextInt();

        System.out.println("What's the unitarie value of this pc?");
        unitarieValuePc1 = read.nextDouble();

        valueBox1 = numberPcs1 * unitarieValuePc1;

        System.out.println("The value of the first box from the product " + codPc1 + " is $:" + df_2.format(valueBox1));

        System.out.println("What's the code of the second pc?");
        codPc2 = read.nextInt();

        System.out.println("What's the number of pc?");
        numberPcs2 = read.nextInt();

        System.out.println("What's the unitarie value of this pc?");
        unitarieValuePc2 = read.nextDouble();

        valueBox2 = numberPcs2 * unitarieValuePc2;

        System.out.println("The value of the second box from the product " + codPc2 + " is $:" + df_2.format(valueBox2));

        read.close();

    }
}
