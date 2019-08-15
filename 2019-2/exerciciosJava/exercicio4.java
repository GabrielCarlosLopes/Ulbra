import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        frase = scanner.nextLine();
        StringBuffer frase2 = new StringBuffer(frase);
        String fraseInv = frase2.reverse().toString();
        System.out.println(fraseInv);
    }
}
