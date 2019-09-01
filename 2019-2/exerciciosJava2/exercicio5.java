import java.util.Arrays;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        float notas [] = new float[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as Notas");
        for(int x=0; x<5; x++){
            notas [x] = scanner.nextFloat();
        }

        Arrays.sort(notas);

        for (int x=notas.length-1; x>=0; x--){
            System.out.println(notas[x]);
        }


    }




}
