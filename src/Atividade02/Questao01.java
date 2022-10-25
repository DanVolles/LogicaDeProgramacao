package Atividade02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Olá, obrigado por utilizar esse programa!");
        System.out.println("Aqui eu vou te dizer se um número é maior, igual ou menor que 0!");

        System.out.print("Por favor, digite o número: ");
        double n = input.nextDouble();

        if (n > 0) {
            System.out.println("Esse número é maior que 0!");
        }
        if (n == 0) {
            System.out.println("Esse número é igual a 0!");
        }
        if (n < 0) {
            System.out.println("Esse número é menor que zero!");
        }
    }
}

class Questao01Variacao {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Olá, obrigado por utilizar esse programa!");
        System.out.println("Aqui eu vou te dizer se um número é maior, igual ou menor que 0!");

        System.out.print("Por favor, digite o número: ");
        double n = input.nextDouble();

        String msg = "O número %s é %s que zero!";
        if (n < 0) {
            msg = String.format(msg, n, "menor");
        } else if (n > 0) {
            msg = String.format(msg, n, "maior");
        } else {
            msg = String.format(msg, n, "igual");
            msg = msg.replaceAll("que", "a");
        }
        System.out.println(msg);
        input.close();
    }
}
