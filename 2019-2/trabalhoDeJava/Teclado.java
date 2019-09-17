import java.util.Scanner;

public class Teclado {

    public static int lerInt(){
        Scanner tc = new Scanner(System.in);
        Menssagem.menssagemInt();
        return ConfirmacaoDado.confirmaInt(tc.next());
    }

    public static float lerFloat(){
        Scanner tc = new Scanner(System.in);
        Menssagem.menssagemFloat();
        return ConfirmacaoDado.confirmaFloat(tc.next());
    }

    public static double lerDouble(){
        Scanner tc = new Scanner(System.in);
        Menssagem.menssagemDouble();
        return ConfirmacaoDado.confirmaDouble(tc.next());
    }

    public static String lerString(){
        Scanner tc = new Scanner(System.in);
        Menssagem.menssagemString();
        return tc.nextLine();
    }

    public static char lerChar(){
        Scanner tc = new Scanner(System.in);
        Menssagem.menssagemChar();
        return tc.next().charAt(0);
    }
}
