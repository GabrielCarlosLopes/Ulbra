import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Conta {

    public Integer agencia;
    public Integer numero;
    public double saldo;
    public double limite;

    Titutlar cliente;


    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +"R$"+
                ", limite=" + limite +"R$"+
                ", titutlar=" + cliente +
                '}';
    }

    private static AtomicInteger at = new AtomicInteger(0);
    public int incrementaNumero() {
        return at.incrementAndGet();
    }

    public int lerAgencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a agencia");
        return ConfirmarDados.confirmaInt(sc.nextLine());
    }

    public double colocaLimite(int i){
        if(i < 18){
            return 100;
        }else if(i > 60){
            return 1000;
        }else if(i>17 && i <60){
            return 300;
        }else return 0;
    }

    public double depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto deseja depositar: ");
        return ConfirmarDados.confirmaFloat(sc.nextLine());
    }

    public void sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto deseja sacar: ");
        double valor = ConfirmarDados.confirmaFloat(sc.nextLine());
        if( valor < saldo+limite){
            System.out.println("Valor sacado com sucesso");
            saldo -= valor;
        }else{
            System.out.println("NAO TEM O VALOR SOLICITADO");
        }
    }

    public double transferir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto deseja transferir: ");
        double valor = ConfirmarDados.confirmaFloat(sc.nextLine());
        if(valor < saldo+limite){
            saldo -= valor;
            System.out.println("transferencia feita com sucesso;");
            return valor;
        }else{
            System.out.println("Erro");
            return 0;
        }
    }
}
