
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {    
    Scanner ler = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    //Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento,
    // o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias 
    //após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por 
    //cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule 
    //o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês 
    //e os clientes nunca deixam para pagar no mês seguinte.
        System.out.print("valor da prestacao");
        double valorPrestacao = ler.nextDouble();
        System.out.print("dia do vencimento ");
        int diaVencimento = ler.nextInt();
        System.out.print("dia do pagamento");
        int diaPagamento = ler.nextInt();
        
        double valorAPagar = valorPrestacao;
        
        if (diaPagamento <= diaVencimento) {
            valorAPagar = valorPrestacao * 0.90;
            System.out.println("pagamento em dia desconto de 10% aplicado");
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.println("pagamento ate 5 dias apos o vencimento sem desconto");
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            valorAPagar = valorPrestacao + (valorPrestacao * 0.02 * diasAtraso);
            System.out.println("pagamento atrasado. Multa de 2% por dia de atraso aplicada");
        }
        
        System.out.println("valor a ser pago  R$ " + df_2.format(valorAPagar));
    }
}
