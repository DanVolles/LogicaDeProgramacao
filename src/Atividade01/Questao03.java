package Atividade01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        System.out.println("Olá, muito bem vindo!\n" +
                "Por favor, digite o seu nome: ");

        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();

        System.out.println("Olá, " + nome + "!\n" +
                "Tenha um excelente dia!");
    }
}
