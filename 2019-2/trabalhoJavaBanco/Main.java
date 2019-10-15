public class Main {

    public static void main(String[] args) {


        Titutlar t1 = new Titutlar();
        Conta c1 = new Conta();
        t1.nome = t1.lerNome();
        t1.cpf = t1.lerCpf();
        t1.nascimento = t1.lerData();
        t1.idade = t1.idade(t1.nascimento);

        c1.cliente = t1;
        c1.numero = c1.incrementaNumero();
        c1.agencia = c1.lerAgencia();
        c1.limite = c1.colocaLimite(t1.idade);

        System.out.println(c1);

        Titutlar t2 = new Titutlar();
        Conta c2 = new Conta();
        t2.nome = t2.lerNome();
        t2.cpf = t2.lerCpf();
        t2.nascimento = t2.lerData();
        t2.idade = t2.idade(t2.nascimento);

        c2.cliente = t2;
        c2.numero = c2.incrementaNumero();
        c2.agencia = c2.lerAgencia();
        c2.limite = c2.colocaLimite(t2.idade);


        System.out.println(c1);
        System.out.println(c2);

        c1.saldo = c1.depositar();

        c2.saldo = c2.depositar();

        System.out.println(c1);
        System.out.println(c2);

        c1.sacar();
        c2.sacar();

        System.out.println(c1);
        System.out.println(c2);


        c1.saldo += c2.transferir();
        c2.saldo += c1.transferir();

        System.out.println(c1);
        System.out.println(c2);
    }
}
