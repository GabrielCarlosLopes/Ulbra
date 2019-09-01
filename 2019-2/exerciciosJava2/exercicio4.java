import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        String string;
        String inverseString = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Uma Frase");
        string = scanner.nextLine();

        for (int x=string.length()-1; x >= 0; x --){
            inverseString += string.charAt(x);
        }

        if ( string.equals(inverseString)){
            System.out.println("A string eh palíndromo");
        } else {
            System.out.println("A string nao eh palídromo");
        }
    }
}
