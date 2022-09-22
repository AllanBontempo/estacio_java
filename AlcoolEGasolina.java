import java.util.Scanner;

public class AlcoolGasolina {

    public static void main(String[] args) {
        float gasolina;
        float alcool;
        float percentual;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da gasolina:");
        gasolina = scan.nextFloat();

        System.out.println("Digite o valor da alcool:");
        alcool = scan.nextFloat();

        percentual = alcool / gasolina;

        if (percentual < 0.7) {
            System.out.println("O Alcool está mais acessível que a gasolina.");
        } else {
            System.out.println("A gasolina está mais acessível que a alcool.");
        }

    }
}
