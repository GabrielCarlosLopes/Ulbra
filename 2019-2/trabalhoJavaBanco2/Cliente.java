import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private String nascimento;

    public Cliente(String a, String b, String d ){
        this.nome = a;
        this.cpf = b;
        this.idade = Cliente.idade(d) ;
        this.nascimento = d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }

    //LE O NOME DO CLIENTE E RETORNA UMA STRING
    public static String lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome do Titular: ");
        return scanner.nextLine();
    }


    //LE O CPF, CONFIRMA SE É VALIDO, SE JA EXISTE NA LISTA, E RETORNA UMA STRING
    public static String lerCpf(ArrayList<Conta> conta) {
        Scanner scanner = new Scanner(System.in);
        String cpf;
        boolean info = false;
        do {
            System.out.println("Digite o CPF: ");
            cpf = scanner.nextLine();
            if (ConfirmaDados.isCPF(cpf) == true) {
                if(conta.size() == 0){
                    info = true;
                }
                else {
                    info = Cliente.confereCpf(conta, cpf);
                    if(info == false){
                        System.out.println("CPF JA CADASTRADO");
                    }
                }
            }else {
                System.out.println("CPF INVALIDO, TENTE NOVAMENTE");
            }
        }while (info == false) ;
        return cpf;
    }

    //LE A DATA DE NASCIMENTO DO CLIENTE
    public static String lerData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento(dd/mm/AAAA): ");
        return ConfirmaDados.confirmaData(scanner.nextLine());
    }

    //CALCULA A IDADE A PARTIR DA DATA DE NASCIMENTO
    public static int idade(String nasc) {
        if (ConfirmaDados.getIdade(nasc) > 16) {
            return ConfirmaDados.getIdade(nasc);
        } else {
            System.out.println("IMPOSSIVEL CRIAR CONTA COM ESTA IDADE");
            System.exit(0);
        }
        return 0;
    }

    //CONFIRMA SE O CPF JA ESTA NO ARRAYLIST
    public static boolean confereCpf(ArrayList<Conta> conta, String cpf){
        boolean test = false;
        for(var client : conta) {
            if (client.titular.cpf.equals(cpf)) {
                test = false;
            } else {
                test = true;
            }
        }
        return(test);
    }

}

