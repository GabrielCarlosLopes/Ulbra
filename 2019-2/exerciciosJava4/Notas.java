package aula1;

import javax.swing.*;

public class Notas {
    public static void main(String[] args) {
        float media=0;
        JOptionPane.showMessageDialog(null, "==DIGITE AS NOTAS==");
        String teclado = JOptionPane.showInputDialog("DIGITE A NOTA DA PRIMEIRA PROVA: ");
        float nota1 = Float.parseFloat(teclado);
        teclado = JOptionPane.showInputDialog("DIGITE A NOTA DA SEGUNDA PROVA: ");
        float nota2 = Float.parseFloat(teclado);
        teclado = JOptionPane.showInputDialog("DIGITE A NOTA DO TRABALHO: ");
        float trab = Float.parseFloat(teclado);
    
        media =  (nota1 + nota2 + trab)/3;
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "SUA MEDIA FOI DE "+media+" E VOCÊ FOI APROVADO");
        }
        else{
            JOptionPane.showMessageDialog(null, "SUA MEDIA FOI DE "+media+" E VOCÊ FOI REPROVADO");
        }

    }
}
