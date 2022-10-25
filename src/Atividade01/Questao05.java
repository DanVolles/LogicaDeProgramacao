package Atividade01;

import java.util.Scanner;

public class Questao05 {

    static Scanner input = new Scanner(System.in);

    // Método para inclusão de um novo item no pedido do cliente
    public static void inclusaoItem () {

        System.out.println("Incluir um novo item? Digite S ou N.");
        String sn = input.nextLine();

        if (sn.equalsIgnoreCase("s") || sn.equalsIgnoreCase("sim")) {

            System.out.println("Por favor, insira o valor do produto: ");
            double valorItem = input.nextDouble();

        } else {

        }

        /* do {

            System.out.println("Por favor, insira o valor do produto: ");
            double valorItem = input.nextDouble();

        } while (sn.equalsIgnoreCase("s") || sn.equalsIgnoreCase("sim"));*/

    }

    // Método para incluir os 10 por cento do garçom, visto que é uma opção do cliente
    public static void incluirGorgeta () {

        System.out.println("Deseja adicionar os 10 por cento de gorgeta para o garçom? Digite S ou N.");
        String sn = input.nextLine();

        if (sn.equalsIgnoreCase("s") || sn.equalsIgnoreCase("sim")) {


            System.out.println("Obrigado, você incluiu a gorgeta de 10 por cento!");

        }

    }

    // Método main
    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao programa de gestão de valores de comandas!");

        inclusaoItem();

        incluirGorgeta();

        //System.out.println("O valor dos 10 por cento de gorgeta do garçom é: " + valorGorgeta);
    }
}

