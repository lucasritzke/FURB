public class App {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[10];
        int resultado = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            if (vetor[i] % 2 == 0) {
                resultado += vetor[i];
            }   
        }
        System.out.println(resultado);
    }
}
