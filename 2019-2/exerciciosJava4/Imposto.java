package aula1;

import javax.swing.*;

public class Imposto {
    public static void main(String[] args) {

        int percentual;
        float transacao;
        float venal;
        float ValorImposto=0;


        String teclado = JOptionPane.showInputDialog("Digite o valor da transação: ");
        transacao = Float.parseFloat(teclado);
        teclado = JOptionPane.showInputDialog("Digite o valor venal: ");
        venal = Float.parseFloat(teclado);
        teclado = JOptionPane.showInputDialog("Digite o percentual do imposto");
        percentual = Integer.parseInt(teclado);

        if (transacao > venal) {
            ValorImposto = transacao * percentual / 100;
        }
        else{
            ValorImposto = venal * percentual / 100;
        }

        System.out.println("Valor a ser pago: "+ValorImposto);
    }
}
