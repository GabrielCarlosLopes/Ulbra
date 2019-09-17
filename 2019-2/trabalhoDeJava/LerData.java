import java.util.Scanner;

public class LerData {

    public static String data(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data: ");
        return scanner.nextLine();
    }
}
