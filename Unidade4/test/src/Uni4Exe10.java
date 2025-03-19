import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
        int idadeFilho1 = ler.nextInt();
        int idadeFilho2 = ler.nextInt();
        int idadeFilho3 = ler.nextInt();

        if (idadeFilho1 < idadeFilho2 && idadeFilho1 < idadeFilho3) {
            System.out.println("Marquinhos é o caçula");
        } else if (idadeFilho2 < idadeFilho1 && idadeFilho2 < idadeFilho3) {
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é o caçula");
        }
    }
}