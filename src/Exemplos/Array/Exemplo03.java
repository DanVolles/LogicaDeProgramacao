package Exemplos.Array;

import javax.swing.*;
import java.util.ArrayList;

public class Exemplo03 {
    public static void main(String[] args) {

        // Array list é uma classe java mais flexível para manipular uma lista (no quesito tamanho da lista)
        ArrayList<String> lista = new ArrayList<>();
        int selecionado = 0;

        // Desafio - incluir opção "alterar"
        Object [] opcoes = {"INCLUIR", "LISTAR", "APAGAR", "ALTERAR"};

        do {
            try {
// Bloco inicial
                selecionado = JOptionPane.showOptionDialog(
                        null,
                        "O que você deseja?",
                        "Exemplo",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]);
// Bloco Incluir
                if (selecionado == 0) {

                    String item = JOptionPane.showInputDialog("Digite");
                    lista.add(item);

                }
// Bloco Listar
                if (selecionado == 1) {
                    String msg = "";

                    for (String item : lista) {
                        msg += item + "\n";
                    }
                    if (msg.equals("")) {
                        msg = "\"Lista sem registros\"";
                    }

                    JOptionPane.showConfirmDialog(null, msg);
                }
// Bloco Apagar
                if (selecionado == 2) {
                    Object[] opcaoApagar = new Object[lista.size()];

                    for (int i = 0; i < opcaoApagar.length; i++) {
                        opcaoApagar[i] = lista.get(i);
                    }

                    Object itemSelecionado = JOptionPane.showInputDialog(
                            null,
                            "Selecione o item para apagar",
                            "Apagar",
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcaoApagar,
                            opcaoApagar[0]);

                    for (int i = 0; i < lista.size(); i++) {
                        if (itemSelecionado.toString().equals(lista.get(i))) {
                            lista.remove(i);
                        }
                    }

                }
// Bloco Alterar
                if (selecionado == 3) {
                    Object[] opcaoAlterar = new Object[lista.size()];

                    for (int i = 0; i < opcaoAlterar.length; i++) {
                        opcaoAlterar[i] = lista.get(i);
                    }

                    Object itemSelecionado = JOptionPane.showInputDialog(
                            null,
                            "Selecione o item para alterar",
                            "Alterar",
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcaoAlterar,
                            opcaoAlterar[0]);

                    for (int i = 0; i < lista.size(); i++) {

                        if (itemSelecionado.toString().equals(lista.get(i))) {
                            String item = JOptionPane.showInputDialog(
                                    "Digite novo item", lista.get(i));
                            lista.set(i, item);
                        }

                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
                // serve para evitar que o programa seja interrompido inexperadamente
                JOptionPane.showMessageDialog(
                        null, "Erro inesperado identificado com o try-catch");
            }
        } while (selecionado != -1);
    }
}
