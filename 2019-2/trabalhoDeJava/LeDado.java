import java.util.Scanner;

public class LeDado {

    public static String leDado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dado: ");
        return scanner.next();
    }
}
