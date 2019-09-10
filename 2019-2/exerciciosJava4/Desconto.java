package aula1;

import javax.swing.*;

public class Desconto {

    public static void main(String[] args) {
        float valor=0;
        float ValorDesconto = 0;

        String teclado = JOptionPane.showInputDialog("Digite o nome do produto");
        String produto = teclado;
        do {
            teclado = JOptionPane.showInputDialog("Valor do produto");
            valor = Float.parseFloat(teclado);
            if (valor <= 0){
                JOptionPane.showMessageDialog(null,"O VALOR NAO PODE SER MENOR QUE ZERO, DIGITE UM VALOR VALIDO");
            }
        }while (valor <= 0) ;
        if ((valor > 0) && (valor < 50)){
            JOptionPane.showMessageDialog(null,"O produto "+produto+" com valor de "+valor+"R$ nao teve desconto");
        }
        if ((valor >= 50) && (valor <200)){
            ValorDesconto = valor - (valor * 5 /100);
            JOptionPane.showMessageDialog(null,"O produto "+produto+" com valor de "+valor+"R$ com desconto ficou por "+ValorDesconto+"R$");
        }

        if((valor >= 200) && (valor < 500)){
            ValorDesconto = valor - (valor * 6 /100);
            JOptionPane.showMessageDialog(null,"O produto "+produto+" com valor de "+valor+"R$ com desconto ficou por "+ValorDesconto+"R$");
        }

        if((valor >= 500) && (valor < 1000)){
            ValorDesconto = valor - (valor * 7 /100);
            JOptionPane.showMessageDialog(null,"O produto "+produto+" com valor de "+valor+"R$ com desconto ficou por "+ValorDesconto+"R$");
        }

        if (valor >= 1000){
            ValorDesconto = valor - (valor * 8 /100);
            JOptionPane.showMessageDialog(null,"O produto "+produto+" com valor de "+valor+"R$ com desconto ficou por "+ValorDesconto+"R$");
        }

    }
}
