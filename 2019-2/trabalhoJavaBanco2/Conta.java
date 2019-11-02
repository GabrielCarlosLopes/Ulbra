import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Conta {

    private int agencia;
    private int numeroConta;
    private double saldo;
    private double limite;
    Cliente titular;

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", titular=" + titular +
                '}';
    }

    public Conta(Cliente titular, int b, double c) {
        this.titular = titular;
        this.agencia = 1;
        this.numeroConta = b;
        this.saldo = c;
        if (titular.getIdade() < 18) {
            this.limite = 100;
        } else if (titular.getIdade() > 60) {
            this.limite = 1000;
        } else if (titular.getIdade() > 17 && titular.getIdade() < 60) {
            this.limite = 700;
        }

    }

    private static AtomicInteger at = new AtomicInteger(0);

    public static int incrementaNumero() {
        return at.incrementAndGet();
    }


    public static void addConta(ArrayList<Conta> conta) {
        Cliente client = new Cliente(Cliente.lerNome(), Cliente.lerCpf(conta), Cliente.lerData());

        conta.add(new Conta(client, Conta.incrementaNumero(), 0));

        System.out.println("CONTA CADASTRADA COM SUCESSO");

    }

    public static void removeConta(ArrayList<Conta> conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO DA CONTA QUE DESEJA REMOVER: ");
        int achei = 0 , n = ConfirmaDados.confirmaInt(scanner.nextLine());
        for (var client : conta) {
            if (n == client.numeroConta) {
                conta.remove(client);
                System.out.println("CONTA REMOVIDA COM SUCESSO");
                achei=1;
                break;
            }
        }
        if(achei == 0){
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }

    public static void listContas(ArrayList<Conta> conta) {
        if(conta.size() == 0){
            System.out.println("LISTA VAZIA");
        }
        for (var client : conta) {
            System.out.println(" " + client);
        }
    }

    public static void sacar(ArrayList<Conta> conta) {
        Scanner scanner = new Scanner(System.in);
        int nConta, achei=0;
        double valor;
        System.out.println("DIGITE O NUMERO DA CONTA: ");
        nConta = ConfirmaDados.confirmaInt(scanner.nextLine());
        for (var client : conta) {
            if (nConta == client.numeroConta) {
                achei = 1;
                System.out.println("QUANTO DESEJA SACAR: ");
                valor = ConfirmaDados.confirmaFloat(scanner.nextLine());
                if (valor > client.saldo && valor < client.saldo + client.limite) {
                    System.out.println("SALDO INSUFICIENTE, DESEJA UTILIZAR O LIMITE?[S/N]");
                    String resp = scanner.nextLine().toLowerCase();
                    if (resp.equals("s")) {
                        System.out.println("SACADOS R$ " + valor);
                        client.saldo -= valor;
                        System.out.println("SALDO ATUAL: R$ " + client.saldo);
                        break;
                    } else {
                        System.out.println("OK NAO USAREMOS SEU LIMETE, OBRIGADO");
                        break;
                    }

                } else if (valor < client.saldo) {
                    System.out.println("SACADOS R$ " + valor);
                    client.saldo -= valor;
                    System.out.println("SALDO ATUAL: R$ " + client.saldo);
                    break;
                } else if (valor > client.saldo && valor > client.saldo+client.limite){
                    System.out.println("SALDO INSUFICIENTE");
                    System.out.println("SALDO ATUAL: R$ " + client.saldo);
                    break;
                }
            }
        }if(achei == 0) {
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }

    public static void depositar(ArrayList<Conta> conta){
        Scanner scanner = new Scanner(System.in);
        int achei = 0, nConta;
        double valor;
        System.out.println("DIGITE O NUMERO DA CONTA");
        nConta = ConfirmaDados.confirmaInt(scanner.nextLine());
        for (var client : conta) {
            if (nConta == client.numeroConta) {
                achei = 1;
                System.out.println("QUANTO DESEJA DEPOSITAR: ");
                valor = ConfirmaDados.confirmaFloat(scanner.nextLine());
                client.saldo += valor;
                System.out.println("FORAM DEPOSITADOS R$ " + valor);
                System.out.println("SALDO ATUAL: R$ " + client.saldo);
                break;
            }
        }if(achei == 0){
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }

    public static void trasferir(ArrayList<Conta> conta){
        Scanner scanner = new Scanner(System.in);
        int achei = 0, achei2 = 0, nConta;
        double valor;
        System.out.println("DIGITE O NUMERO DA CONTA");
        nConta = ConfirmaDados.confirmaInt(scanner.nextLine());
        for(var client : conta){
            if (nConta == client.numeroConta) {
                achei = 1;
                System.out.println("NUMERO DA CONTA PARA A TRANSFERENCIA: ");
                nConta = ConfirmaDados.confirmaInt(scanner.nextLine());
                for(var client2 : conta){
                    if(nConta == client2.numeroConta){
                        achei2 = 1;
                        System.out.println("QUANTO DESEJA DEPOSITAR: ");
                        valor = ConfirmaDados.confirmaFloat(scanner.nextLine());
                        if (valor > client.saldo && valor < client.saldo + client.limite) {
                            System.out.println("SALDO INSUFICIENTE, DESEJA UTILIZAR O LIMITE?[S/N]");
                            String resp = scanner.nextLine().toLowerCase();
                            if (resp.equals("s")) {
                                System.out.println("TRANSFERIDOS R$ " + valor);
                                client.saldo -= valor;
                                client2.saldo += valor;
                                System.out.println("SALDO ATUAL: R$ " + client.saldo);
                                break;
                            } else {
                                System.out.println("OK NAO USAREMOS SEU LIMETE, OBRIGADO");
                                break;
                            }
                        } else if (valor < client.saldo) {
                            System.out.println("TRANSFERIDOS R$ " + valor);
                            client.saldo -= valor;
                            client2.saldo += valor;
                            System.out.println("SALDO ATUAL: R$ " + client.saldo);
                            break;
                        } else if (valor > client.saldo && valor > client.saldo+client.limite){
                            System.out.println("SALDO INSUFICIENTE");
                            System.out.println("SALDO ATUAL: R$ " + client.saldo);
                            break;
                        }
                    }
                }
            }
            if(achei == 1 && achei2 == 1){
                break;
            }
        }if(achei == 0 || achei2 == 0){
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }

    public static void mostrarSaldo(ArrayList<Conta> conta){
        Scanner scanner = new Scanner(System.in);
        int achei = 0, nConta;
        System.out.println("DIGITE O NUMERO DA CONTA");
        nConta = ConfirmaDados.confirmaInt(scanner.nextLine());
        for(var client : conta){
            if(conta.size() == 0){
                System.out.println("CONTA NAO ENCONTRADA");
            }
            if (nConta == client.numeroConta) {
                achei = 1;
                System.out.println("SALDO ATUAL: R$ " + client.saldo);
                break;
            }
        }
        if(achei == 0){
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }
}
