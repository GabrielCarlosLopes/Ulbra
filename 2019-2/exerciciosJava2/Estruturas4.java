import java.util.Scanner;

public class Estruturas4 {
    public static void main(String[] args) {
        int vetor [] = new int[10];
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Complete o vetor");
        for (int x=0; x<10; x++){
            vetor[x] = scanner.nextInt();
        }

        for (int x=0; x<10; x++){
            if ( vetor[x] > 50) {
                System.out.println("Numero " + vetor[x] + " maior que 50, na posição " + x);
            }
        }
    }
}
