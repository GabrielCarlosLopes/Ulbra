import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu, menu2;

        var conta = new ArrayList<Conta>();

        while (true){
            System.out.println("---ESCOLHA UMA OPCAO---");
            System.out.println("[1]ADICIONAR CONTA");
            System.out.println("[2]REMOVER CONTA");;
            System.out.println("[3]OPERACOES");
            System.out.println("[4]MOSTRAR TODAS AS CONTA");
            System.out.println("[5]SAIR");
            menu = ConfirmaDados.confirmaInt(scanner.nextLine());

            switch (menu){
                case 1:
                    Conta.addConta(conta);
                    break;
                case 2:
                    Conta.removeConta(conta);
                    break;
                case 3:
                    System.out.println("===OPERACOES===");
                    System.out.println("[1]SACAR");
                    System.out.println("[2]DEPOSITAR");
                    System.out.println("[3]TRANSFERIR");
                    System.out.println("[4]SALDO");
                    menu2 = ConfirmaDados.confirmaInt(scanner.nextLine());

                    switch (menu2){
                        case 1:
                            Conta.sacar(conta);
                            break;
                        case 2:
                            Conta.depositar(conta);
                            break;
                        case 3:
                            Conta.trasferir(conta);
                            break;
                        case 4:
                            Conta.mostrarSaldo(conta);
                            break;
                    }
                    break;
                case 4:
                    Conta.listContas(conta);
                    break;
                case 5:
                    System.out.println("PROGRAMA ENCERRADO");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }

        }
    }
}
