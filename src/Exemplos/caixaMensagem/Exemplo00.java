package Exemplos.caixaMensagem;

import javax.swing.*;

public class Exemplo00 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Java com JOptionPane");
        JOptionPane.showConfirmDialog(null, "Mensagem no JOP", "Título", JOptionPane.YES_NO_OPTION);
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + nome);
    }
}