import java.util.Scanner;
public class gustavoArthurHaerthel_2 {
    //construtor
    private gustavoArthurHaerthel_2(){
     Scanner teclado = new Scanner(System.in);
     System.out.println("Insira o tamanho dos vetores: ");
     int n =teclado.nextInt();
     int vetor1[] = new  int[n];  
     int vetor2[] = new  int[n];
     int soma[] = new  int[n];
    }
//ler dois vetores
private void lerVetor(int vetor1[], int vetor2[], Scanner tec, String nomeVetor){
    for(int i = 0; i < vetor1.length;i++){
        System.out.print("Vetor1" + "["+i+"]: ");
        vetor1[i] = tec.nextInt();
    }
    for(int i = 0; i < vetor2.length;i++){
        System.out.print("Vetor2" + "["+i+"]: ");
        vetor2[i] = tec.nextInt();
    }
}
//soma vetores
private void somaVetor(int vetor1[], int vetor2[], int soma[]){
    for (int i = 0; i < soma.length; i++){
        soma[i] = vetor1[i] + vetor2[i];
    }
}
//ordenador
     public static int[] ordenar(int[] soma, int tam){
        if (tam < 1){
            return soma;
        }

        for (int i = 0;i < soma.length - 1;i++){
            if (soma[i] > soma[i + 1]){
                int aux = soma[i];
                soma[i] = soma[i + 1];
                soma[i + 1] = aux;
            }
        }

        return ordenar(soma, tam - 1);
    }




















    public static void main(String[] args) {      


}
}
