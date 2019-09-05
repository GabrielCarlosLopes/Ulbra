import java.util.Scanner;

public class data {

    public static int getDia (){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Digite o dia");
        int dia = scanner.nextInt();
        if (dia <= 0 || dia > 31){
            return 0;
        }else {
            return dia;
        }

    }

    public static int getMes (){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Digite o mes");
        int mes = scanner.nextInt();
        if (mes <= 0 || mes > 12){
            return 0;
        }else{
            return mes;
        }

    }

    public static int getAno (){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Digite o ano");
        int ano = scanner.nextInt();
        if (ano <= 0 || ano > 2019){
            return 0;
        }else {
            return ano;
        }

    }

    public static void mostrarData(int dia, int mes, int ano){
        if (dia == 0 || mes == 0 || ano == 0){
            System.out.println("Algum dado da data foi digitado errado");
        } else {
            System.out.println(dia + "/" + mes + "/" + ano);
        }
    }
}
