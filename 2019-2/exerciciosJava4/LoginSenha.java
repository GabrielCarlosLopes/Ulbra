package aula1;

import javax.swing.*;


public class LoginSenha {

    public static void main(String[] args) {
            String login;
            String senha;
            int cont = 4;

            login = JOptionPane.showInputDialog("Informe o login:");
            senha = JOptionPane.showInputDialog("Informe a senha:");

            for (int i = 0; i < 4; i++) {
                if (senha.equals("java8") && login.equals("java8")) {
                    JOptionPane.showMessageDialog(null, "Senha Válida!");
                    break;
                } else {
                    cont--;
                    if (cont == 0) {
                        JOptionPane.showMessageDialog(null, "Cartão Cancelado!"
                                + "\n" + cont + " tentativa(s).");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou Senha Invlaidas!"
                                + "\n" + cont + " tentativa(s).");
                        login = JOptionPane.showInputDialog("Informe o Login:");
                        senha = JOptionPane.showInputDialog("Informe a senha:");
                    }
                }
            }
    }
}


