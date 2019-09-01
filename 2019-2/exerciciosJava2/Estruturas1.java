import java.util.Scanner;

public class Estruturas1 {
    public static void main(String[] args) {

        float temperatura [] = new float [7];
        float soma =0;
        float media = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite as temperaturas da semana: ");
        for (int x=0; x<7; x++){
            temperatura [x] = scanner.nextFloat();
            soma += temperatura [x];
        }

        media = soma / 7;
        System.out.println("A media das temperaturas foi:"+media);
        for (int x=0; x<7; x++ ){
            if ( temperatura[x] > media){
                System.out.println("A temperatura "+temperatura[x]+" foi maior que a media");
            }
        }
    }
}
