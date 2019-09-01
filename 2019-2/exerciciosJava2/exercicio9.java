import javax.swing.*;
import java.util.Scanner;
import java.lang.String;

public class exercicio9 {
    public static void main(String[] args) {
        String[] p = new String[10];
        int o = 0, i = 0, j = 0;
        p[0] = "Liberado";
        p[1] = "Liberado";
        p[2] = "Liberado";
        p[3] = "Liberado";
        p[4] = "Liberado";
        p[5] = "Liberado";
        p[6] = "Liberado";
        p[7] = "Liberado";
        p[8] = "Liberado";
        p[9] = "Liberado";
        do {
            String[] OP = {"Entrada", "Saida", "Listar situação atual", "Encerrar o programa"};
            Scanner sc = new Scanner(System.in);
            String entrada = (String) JOptionPane.showInputDialog(null, "Escolha", "Vagas", JOptionPane.QUESTION_MESSAGE, null, OP, OP[0]);
            if (entrada == "Encerrar o programa") {
                break;
            }
            if (entrada == "Entrada") {
                p[i] = JOptionPane.showInputDialog("Digite a placa do veiculo", "Digite aqui");
                i++;
            }
            if (entrada == "Saida") {
                String n = JOptionPane.showInputDialog("Qual a posiçao no estacionamento ", "Digite aqui");
                int n1 = Integer.parseInt(n);
                n1 = n1 - 1;
                p[n1] = "Liberado";
            }
            if (entrada == "Listar situação atual") {
                int x = 0, k = 1;
                for (j = 0; j < 10; j++) {
                    JOptionPane.showMessageDialog(null, "\nSituação da vaga  " + k + " " + p[x], ".", JOptionPane.PLAIN_MESSAGE);
                    x++;
                    k++;
                }
            }
        } while (o != 4);
    }
}
