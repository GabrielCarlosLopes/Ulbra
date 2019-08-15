import java.util.Scanner;

public class exercicio7{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("Digite um numero para elevar a potencia do numero anterior: ");
        int exp = scanner.nextInt();

        System.out.println(Math.pow(num, exp));
    }
}
