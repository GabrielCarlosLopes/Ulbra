import java.util.Scanner;

public class LerTelefone {

    public static String telefone (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu telefone: ");
        return scanner.nextLine();
    }
}
