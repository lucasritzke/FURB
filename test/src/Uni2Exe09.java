import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe09 {
    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    //Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.
    public static void main(String[] args) {
        //
        Scanner read = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        Double valor;
        Double cotacao = 6.00;

        System.out.println("Qual o valor a ser convertido de dolares em reais?");
        valor = read.nextDouble();

        valor = valor * cotacao;

        System.out.println("Seu valor em reais é de R$:" + valor);

    }
    
}
