package Atividade02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Neste programa posso te dizer se a idade de uma pessoa permite que ela vote!");

        System.out.println("Por favor, insira a idade da pessoa: ");
        int idade = input.nextInt();

        if (idade < 16) {
            System.out.println("Essa pessoa não pode votar!");
        } else if (idade < 18 || idade >= 60) { // || indica o "OU" na lógica de programação, && indica o "E"
            System.out.println("Essa pessoa pode escolher se quer ou não votar!");
        } else {
            System.out.println("Essa pessoa precisa votar!");
        }
    }
}
