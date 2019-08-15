import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        float valorProduto=0;

        do {
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("R$ #,##0.00");

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do produto: ");

            valorProduto = sc.nextFloat();

            valorProduto += valorProduto * 12/100;

            System.out.println(df.format(valorProduto));

        }while(valorProduto != 0);
    }
}
