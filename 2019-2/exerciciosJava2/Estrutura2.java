import java.util.Scanner;

import static java.lang.System.exit;


public class Estrutura2 {
    public static void main(String[] args) {

        float vetor [] = new float  [5];
        int a=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o vetor");
        for(int x=0; x<5; x++){
            vetor[x] = scanner.nextFloat();
        }

        System.out.println("Digite uma codigo de 0 a 2");
        a = scanner.nextInt();

        switch (a){
            case 0:
                System.out.println("Programa finalizado");
                exit(0);
                break;
            case 1:
                System.out.println("Vetor");
                for (int x=0; x<5; x++){
                    System.out.println(vetor[x]);
                }
                break;
            case 2:
                System.out.println("Vetor na ordem inversa");
                for (int x=4; x>=0; x--){
                    System.out.println(vetor[x]);
                }
                break;
        }
    }
}
