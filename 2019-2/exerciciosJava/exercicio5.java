import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        String procura1 = "sexo";
        String procura2 = "sexual";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = scanner.nextLine();

        if (frase.toLowerCase().contains(procura1.toLowerCase()) || (frase.toLowerCase().contains(procura2.toLowerCase()))){
            System.out.println("Conteudo Impropio");
        } else {
            System.out.println("Conteudo Liberado");
            System.out.println(frase);
        }
    }
}
