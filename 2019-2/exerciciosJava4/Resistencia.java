package aula1;

import javax.swing.*;
import java.util.concurrent.DelayQueue;

public class Resistencia {

    public static void main(String[] args) {
        int resistencia[] = new int[4];
        int maior = 0;
        int menor = 1000000;
        int equivalente = 0;

        for(int x=0; x<4; x++) {
            String teclado = JOptionPane.showInputDialog("DIGITE O VALOR DA RESISTENCIA "+x);
            resistencia[x] = Integer.parseInt(teclado);

            equivalente += resistencia[x];

            if (resistencia[x] > maior ){
                maior = resistencia[x];
            }
            if (resistencia[x] < menor ){
                menor = resistencia[x];
            }
        }

        JOptionPane.showMessageDialog(null, "RESISTENCIA EQUIVALENTE:"+equivalente);
        JOptionPane.showMessageDialog(null,"MAIOR RESISTENCIA: "+maior);
        JOptionPane.showMessageDialog(null,"MENOR RESISTENCIA: "+menor);

    }
}
