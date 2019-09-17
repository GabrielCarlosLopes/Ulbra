import java.util.Scanner;

public class LerEmail {

    public static String leEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Email: ");
        return scanner.nextLine();
    }
}
