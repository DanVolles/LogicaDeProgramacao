package Exemplos.Array;

import javax.swing.*;

public class Exemplo02 {

    public static void main(String[] args) {

        int [] numeros = new int[3]; // declarar para depois incluir os valores

        for (int i = 0; i < numeros.length; i++) {
            String temp = JOptionPane.showInputDialog("Digite um número.");
            numeros [i] = Integer.parseInt(temp);
        }

        String numerosDigitados = "";
        for (int i : numeros) {
            // System.out.println(i);
            numerosDigitados += "," + i ;
        }
        JOptionPane.showMessageDialog(null, numerosDigitados);

    }
}
