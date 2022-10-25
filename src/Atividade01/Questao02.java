package Atividade01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        System.out.println("""
                Olá! seja bem vindo ao sistema de contagem de números!\s
                Esse programa vai te mostrar os némos vizinhos ao número escolhido.\s
                Dado um número n, o programa vai te mostrar sempre um n-1 e um n+1!""");

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = input.nextInt();

        int numero2 = numero1 - 1;
        int numero3 = numero1 + 1;

        System.out.println("Os números vizinhos à " + numero1 + " são " + numero2 + " e " + numero3 + "!");
        System.out.println("Obrigado por utilizar este programa! Tenha um excelente trabalho!");

    }
}