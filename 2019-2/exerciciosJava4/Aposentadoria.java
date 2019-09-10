package aula1;

import javax.swing.*;

public class Aposentadoria {

    public static void main(String[] args) {
        String teclado = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(teclado);

        teclado = JOptionPane.showInputDialog("Sexo (M/F): ");
        char sexo = teclado.charAt(0);

        teclado = JOptionPane.showInputDialog("Anos de contribuição: ");
        int contribuicao = Integer.parseInt(teclado);

        if (sexo == 'F' || sexo == 'f') {
            if ((idade >= 60) || (contribuicao >= 30)) {
                JOptionPane.showMessageDialog(null, "Você ja tem direito a aposentadoria");
            } else {
                int restante = 30 - contribuicao;
                JOptionPane.showMessageDialog(null, "Restão ainda " + restante + " anos de contribuição para você se aposentar");
            }
        }

        if (sexo == 'M' || sexo == 'm') {
            if ((idade >= 65) || (contribuicao >= 35)) {
                JOptionPane.showMessageDialog(null, "Você ja tem direito a aposentadoria");
            } else {
                int restante = 35 - contribuicao;
                JOptionPane.showMessageDialog(null, "Restão ainda " + restante + " anos de contribuição para você se aposentar");
            }
        }
    }
}
