import java.util.Scanner;

public class Hora {

    public int horas;
    public int minutos;
    public int segundos;

    @Override
    public String toString() {
        return "Horario: "+horas+":"+ minutos +":"+ segundos;
    }

    Scanner sc = new Scanner(System.in);

    public void ler() {
        do {
            System.out.println("Digite a Hora: ");
            horas = ConfirmaInt.confirmaInt(sc.next());
            if (horas > 23 || horas < 00) {
                System.out.println("Hora invalido digite novamente");
            }
        } while (horas > 23 || horas < 00);
        do{
            System.out.println("Digite os minutos: ");
            minutos = ConfirmaInt.confirmaInt(sc.next());
            if(minutos < 00 || minutos > 59){
                System.out.println("minutos invalido digite novamente");
            }
        }while(minutos < 00 || minutos > 59);
        do{
            System.out.println("Digite os segundos");
            segundos = ConfirmaInt.confirmaInt(sc.next());
            if(segundos < 00 || segundos > 59){
                System.out.println("segundos invalido digite novamente");
            }
        }while(segundos < 00 || segundos > 59);
    }
}
