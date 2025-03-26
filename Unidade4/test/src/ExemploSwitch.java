import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 1;
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("outro numero");
                break;
        }
    }
}
