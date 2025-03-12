public class Uni2Exe05 {
    public static void main(String[] args) {
        //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D 
        //segundo a fórmula: DIFERENCA = (A * B - C * D).
        int numA = 3;
        int numB = 4;
        int numC = 5;
        int numD = 6;
        int sum1;
        int sum2;
        int result;

        sum1 = numA * numB;
        sum2 = numC * numD;
        result = sum1 - sum2;

        System.out.println("First sum A * B = " + sum1);
        System.out.println("Second sum C * D = " + sum2);
        System.out.println("The result of (A * B - C * D) is: " + result);
        
    }
}
