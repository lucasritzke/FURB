import java.util.Scanner;

public class gustavoArthurHaerthel_1{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double porcentagem1 =0;
    double porcentagem2 =0;
    double porcentagemn =0;
    int totalvotos =0;
    int opcao =0;
    int chapa1 =0;
    int chapa2 =0;
    int nulo =0;
    do{
    System.out.println("Escolha a sua chapa de acordo com o N°:");
    System.out.println("1 para Chapa1 / 2 para chapa2 / 3 para anular / 0 encerra votação");
    opcao =teclado.nextInt();
    switch (opcao) {
        case 1:
        chapa1++;
        totalvotos++;
            break;
        case 2:
        chapa2++;
        totalvotos++;
            break;
        case 3:
        nulo++;
        totalvotos++;
            break;
        default: System.out.println("Opção Incorreta");
            break;
    }
    }while (opcao != 0);
    if(totalvotos == 0){
        System.out.println("Não há votos!");
    }else{
//Chapa1
    System.out.println("O total de votos da chapa1 foi de: "+chapa1+" Votos");
    porcentagem1 = (chapa1 * 100) / totalvotos;
    System.out.println("A porcentagem de votos da chapa1 é: "+porcentagem1+"%");
//Chapa2
    System.out.println("O total de votos da chapa2 foi de: "+chapa2+" Votos");
    porcentagem2 = (chapa2 * 100) / totalvotos; 
    System.out.println("A porcentagem de votos da chapa2 é: "+porcentagem2+"%");
//Nolus
System.out.println("O total de votos nulos foi de: "+nulo+" Votos");
    porcentagemn = (nulo * 100) / totalvotos;
    System.out.println("A porcentagem de votos Nulos é: "+porcentagemn+"%");
//informação de vitória
        if(chapa1 > chapa2){
            System.out.println("A Chapa1 foi a vencedora !! ");
        }else if (chapa2 > chapa1){
            System.out.println("A Chapa2 foi a vencedora !!");
        }else if (chapa1 == chapa2){
            System.out.println("EMPATE NA VOTAÇÃO.");
        }
    }
    teclado.close();
  }
} 

    