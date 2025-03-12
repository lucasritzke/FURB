import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String args[]){

        //Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
        //e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
        Scanner ler = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        int x1, x2, y1, y2;
        x1 = ler.nextInt();
        y1 = ler.nextInt();
        x2 = ler.nextInt();
        y2 = ler.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df_4.format(distance));

    }
}
