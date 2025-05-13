import java.util.Scanner;

public class test {
    private test(){
        int opcao = 0;
        int vetor[] = new int[50];
        int posicao = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma opcao: ");
        do{
            System.out.println("Menua\n1- incluir Valor\n2- Pesquisar Valor\n3- Alterar Valor\n4- Excluir valor\n5- Mostrar valores\n6- Ordenar Valores\n7- Inverter Valores\n8- Sair");
            opcao = ler.nextInt();
            System.out.println("Opção digitada: " + opcao);
            switch(opcao){
                case 1:
                posicao = incluirValor(vetor, posicao, ler);
                    break;
                case 2:
                pesquisarValor(vetor, ler);
                    break;
                case 3:
                    alterarValor(vetor, ler);
                    break;
                case 4:
                    excluirValor(vetor, ler);
                    break;
                case 5:
                    mostrarValores(vetor, ler);
                    break;
                case 6:
                    ordenarValores(vetor, ler);
                    break;
                case 7:
                    inverterValores(vetor, ler);
                    break;
                case 8:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        }while(opcao != 8);
        

    }
    public static void main(String[] args) {
        new test();

    }

    private int incluirValor(int[] vetor, int posicao, Scanner ler) {
        System.out.println("Digite o valor a ser incluido: ");
        int valor = ler.nextInt();
        if (posicao < vetor.length){
            vetor[posicao] = valor;
            System.out.println("Valor "+ valor + ", incluido na posicao " + posicao);
        }else{
            System.out.println("Vetor cheio");
        }

        return posicao+1;
    }

    private void pesquisarValor(int[] vetor, Scanner ler) {
        System.out.println("Digite o valor a ser pesquisado: ");
        int valor = ler.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor){
                System.out.println("Valor " + valor + " encontrado na posicao " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Valor " + valor + " nao encontrado");
        }
    }

    private void alterarValor(int[] vetor, Scanner ler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void excluirValor(int[] vetor, Scanner ler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void mostrarValores(int[] vetor, Scanner ler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void ordenarValores(int[] vetor, Scanner ler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void inverterValores(int[] vetor, Scanner ler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
