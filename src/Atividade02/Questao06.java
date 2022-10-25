package Atividade02;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Vamos calcular o seu IMC?");
        System.out.println("Por favor, insira os dados solicitados a seguir:");

        System.out.println("Digite o seu peso (em quilogramas): ");
        double peso = input.nextDouble();
        System.out.println("Digite a sua altura (em metros): ");
        double altura = input.nextDouble();

        double imc = peso / (altura*altura);

        if (imc < 20) {
            System.out.println("O seu IMC é " + imc + " e está abaixo do esperado.");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("O seu IMC é " + imc + " e está dentro do esperado.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("O seu IMC é " + imc + " e está acima do esperado.\n" +
                    "Você está em situação de sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("O seu IMC é " + imc + " e está acima do esperado.\n" +
                    "Você está em situação de obesidade leve.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("O seu IMC é " + imc + " e está acima do esperado.\n" +
                    "Você está em situação de obesidade moderada.");
        } else if (imc >= 40) {
            System.out.println("O seu IMC é " + imc + " e está acima do esperado.\n" +
                    "Você está em situação de obesidade mórbida.");
        }
    }
}
