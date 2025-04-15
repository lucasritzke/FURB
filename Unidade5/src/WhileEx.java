public class WhileEx {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println("Número par: " + contador);
            } else {
                System.out.println("Número ímpar: " + contador);
            }
            contador++;
        }
    }
}
