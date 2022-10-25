package Exemplos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Seja bem vindo à minha calculadora!");
        System.out.print("Digite a operação desejada: ");
        String operador = input.nextLine();

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        double a = switch (operador) {
            case "+" -> numero1 + numero2;
            case "-" -> numero1 - numero2;
            case "*" -> numero1 * numero2;
            case "/" -> numero1 / numero2;
            default -> 0;
        };
        System.out.println("O resultado da operação é: " + a);

    }
}
