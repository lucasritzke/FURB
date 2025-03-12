import java.text.DecimalFormat;
import java.util.Scanner;

public class sum{
    public static void main(String args[]) throws Exception {
        SystemClass systemInstance = new SystemClass();
        systemInstance.welcome();
    }
}

class SystemClass {
    public void welcome() throws Exception {
        Scanner ler = new Scanner(System.in);
        int answerUser;
        System.out.println("Hi, What would you do in our system we have this choices below\n1 - Plus\n2 - Minus\n3 - Divided\n4 - Times\n5 - count area\n6 - media\n7 - fluxo");
        answerUser = ler.nextInt();

        if (answerUser == 1) {
            plus();
        } else if (answerUser == 2) {
            minus();
        } else if (answerUser == 3 ){
            divided();
        } else if (answerUser == 4 ){
            times();
        } else if (answerUser == 5 ){
            area();
        }else if (answerUser == 6){
            media();
        }else if (answerUser == 7){
            fluxo();
        }

        ler.close();
    }

    public void plus() throws Exception {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the sum.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the sum.");
        num2 = ler.nextInt();

        count = num1 + num2;

        System.out.println("The sum of the two numbers is " + count);
        ler.close();
    }

    public void minus() throws Exception {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the subtraction.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the subtraction.");
        num2 = ler.nextInt();

        count = num1 - num2;

        System.out.println("The result of the subtraction is " + count);
        ler.close();
    }
    public void divided() throws Exception {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the division.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the division.");
        num2 = ler.nextInt();

        count = num1 / num2;

        System.out.println("The result of the division is " + count);
        ler.close();
    }
    public void times() throws Exception {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int count;

        System.out.println("Enter with the first number, to make the multiplication.");
        num1 = ler.nextInt();

        System.out.println("Enter with the second number, to make the multiplication.");
        num2 = ler.nextInt();

        count = num1 * num2;

        System.out.println("The result of the multiplication is " + count);
        ler.close();
    }
    public void area() throws Exception {
        Scanner ler = new Scanner(System.in);

        float num1;
        float num2;
        float count;

        System.out.println("Enter with the width number, to make the sum.");
        num1 = ler.nextFloat();

        System.out.println("Enter with the length number, to make the sum.");
        num2 = ler.nextFloat();

        count = num1 / num2;

        System.out.println("The result of the sum about the area is " + count);
        ler.close();
    }
    public void media() throws Exception {
        Scanner ler = new Scanner(System.in);

        float num1;
        float num2;
        float num3;
        float count;

        System.out.println("Enter with the first grade.");
        num1 = ler.nextFloat();

        System.out.println("Enter with the second grade.");
        num2 = ler.nextFloat();

        System.out.println("Enter with the third grade.");
        num3 = ler.nextFloat();

        count = num1 + num2 + num3;
        count = count / 3;

        System.out.println("The result of the sum about the grades are " + count);
        ler.close();
    }
    public void fluxo() throws Exception {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Double pi = 3.14159;
        Double num1;
        System.out.println("Qual o valor do raio.");
        num1 = ler.nextDouble();

        double area = pi * Math.pow(num1,2);
        System.out.println("The result of the sum about the area is " + df_4.format(area));


        ler.close();
    }
}
