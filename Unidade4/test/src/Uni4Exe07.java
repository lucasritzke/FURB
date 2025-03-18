import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Peso carta: ");
        int peso = ler.nextInt();

        if (peso <= 50){
            Double valorPagar = 0.45;
            System.out.println("Peso carta: " + valorPagar);
        }else if (peso > 50){
            int pesoExcedido = peso - 50;
            int qtAdd = (pesoExcedido / 20) + 1;
            float valorPagar = 0.45f + 0.45f * qtAdd;
            System.out.println("Peso carta: " + valorPagar);
        }else {
            System.out.println("Peso carta invalido");
        }

    }
}
