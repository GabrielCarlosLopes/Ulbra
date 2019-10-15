import java.util.Scanner;

public class Titutlar {

    public String cpf;
    public String nome;
    public Integer idade;
    public String nascimento;

    @Override
    public String toString() {
        return "{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }

    public String lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome do Titular: ");
        return scanner.nextLine();
    }

    public String lerCpf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        if (ConfirmarDados.isCPF(cpf) == true) {
            return cpf;
        } else {
            System.out.println("CPF INVALIDO");
            System.exit(0);
            return null;
        }
    }

    public String lerData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento: ");
        return ConfirmarDados.confirmaData(scanner.nextLine());
    }

    public int idade(String nasc){

        if(ConfirmarDados.getIdade(nasc) > 16){
            return ConfirmarDados.getIdade(nasc);
        }else {
            System.out.println("IMPOSSIVEL CRIAR CONTA COM ESTA IDADE");
            System.exit(0);
        }
        return 0;
    }
}
