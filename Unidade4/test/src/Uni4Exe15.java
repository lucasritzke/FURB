
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0");
        System.out.println("Digite a quantidade de meses que os funcionarios fora contratados");
        int mesesAdmitido = ler.nextInt();

        double reajuste = 0.0;
        if (mesesAdmitido <= 12) {
            reajuste = 0.05;
        } else if (mesesAdmitido <= 48) {
            reajuste = 0.07;
        } else if (mesesAdmitido > 50){
            System.out.println("Reajuste não informado");
            return;
        }

        System.out.println("O valor do reajuste será de " + df_2.format((reajuste * 100)) + "%");
    }
}
