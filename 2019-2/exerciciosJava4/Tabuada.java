package aula1;

import javax.swing.*;

public class Tabuada {

    public static void main(String[] args) {


        String teclado = JOptionPane.showInputDialog("DIGITE O NUMERO DA TABUADA DESEJADA:");
        int num = Integer.parseInt(teclado);

        JOptionPane.showMessageDialog(null,
                "Tabuada do "+num+
                        +1+"x"+num+"="+num*1+"\n"+
                        2+"x"+num+"="+num*2+"\n"+
                        3+"x"+num+"="+num*3+"\n"+
                        4+"x"+num+"="+num*4+"\n"+
                        5+"x"+num+"="+num*5+"\n"+
                        6+"x"+num+"="+num*6+"\n"+
                        7+"x"+num+"="+num*7+"\n"+
                        8+"x"+num+"="+num*8+"\n"+
                        9+"x"+num+"="+num*9+"\n"+
                        10+"x"+num+"="+num*10+"\n");
    }
}
