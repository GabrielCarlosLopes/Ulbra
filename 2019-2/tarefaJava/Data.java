import java.util.Scanner;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    @Override
    public String toString() {
        return "Data " + dia + "/" + mes + "/" + ano;
    }

    public void ler() {
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.println("Digite a dia");
                dia = ConfirmaInt.confirmaInt(sc.next());
                if (dia > 31) {
                    System.out.println("Dia invalido digite novamente");
                }
            } while (dia > 31 || dia < 1);
            do {
                System.out.println("Digite o mes");
                mes = ConfirmaInt.confirmaInt(sc.next());
                if (mes > 12) {
                    System.out.println("Mes invalido digite novamente");
                }
            } while (mes > 12 || mes < 1);
            System.out.println("Digite o ano");
            ano = ConfirmaInt.confirmaInt(sc.next());
            if (dia >= 29 && mes == 2) {
                if (dia == 29 && ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    break;
                }
                do {
                    System.out.println("Esse mes no ano " + ano + " tem apenas 28 dias entao escolha um dia valido");
                    System.out.println("Digite a dia");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia >= 29 && mes == 2);
            }
            if (dia > 31 && mes == 1) {
                do {
                    System.out.println("Esse dia tem apenas 31 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia > 31 && mes == 1);
            }
            if (dia > 31 && mes == 3) {
                do {
                    System.out.println("Esse dia tem apenas 31 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia > 31 && mes == 3);
            }
            if (dia >= 31 && mes == 4) {
                do {
                    System.out.println("Esse dia tem apenas 30 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia >= 31 && mes == 4);
            }
            if (dia > 31 && mes == 5) {
                do {
                    System.out.println("Esse dia tem apenas 31 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia > 31 && mes == 5);
            }
            if (dia >= 31 && mes == 6) {
                do {
                    System.out.println("Esse dia tem apenas 30 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia >= 31 && mes == 6);
            }
            if (dia > 31 && mes == 7) {
                do {
                    System.out.println("Esse dia tem apenas 31 dias");
                    System.out.println("Digite a dia novamente");
                    dia = ConfirmaInt.confirmaInt(sc.next());
                } while (dia > 31 && mes == 7);
            }
        }while (dia>31 && mes>12);
    }
}
