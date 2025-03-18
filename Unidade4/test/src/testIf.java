public class testIf {
    public static void main(String[] args) {
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Adulto");
        }
        else if (idade >= 6){
            System.out.println("Adolescente");
        }
        else if (idade <= 6){
            System.out.println("Infantil");
        }else{
            System.out.println("Voce digitou algo errado!");
        }
    }
}
