import java.util.Scanner;

public class scanner_examples {
    public static void main(String args[])throws Exception{
        Scanner digito = new Scanner(System.in);

        //Test String
        String answer;
            
        System.out.println("Test String");
        answer = digito.nextLine();

        System.out.println(answer);

        //Test int
        int answer1;
            
        System.out.println("Test Int");
        answer1 = digito.nextInt();

        System.out.println(answer1);

        //Test Double
        Double answer2;
            
        System.out.println("Test Double");
        answer2 = digito.nextDouble();

        System.out.println(answer2);
 
    }
    
}
