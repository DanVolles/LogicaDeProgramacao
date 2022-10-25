package Atividade02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Neste programa posso te dizer se uma pessoa pode ter CNH!");

        System.out.println("Por favor, insira a idade da pessoa: ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Essa pessoa não pode tirar CNH!");
        } else {
            System.out.println("Essa pessoa pode tirar CNH!");
        }
    }
}
