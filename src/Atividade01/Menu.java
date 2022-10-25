package Atividade01;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        String escolha = "";
        while (!escolha.equals("x")){
        System.out.println("Escolha a questão: ");
        System.out.println(
                "a) Questão 01\n" +
                "b) Questão 02\n" +
                "c) Questão 03\n" +
                "d) Questão 04\n" +
                "e) Questão 05\n" +
                "f) Questão 06\n" +
                "x) Para encerrar");

        Scanner ler = new Scanner(System.in);
        escolha = ler.next();

            switch (escolha) {
                case "a" -> {
                    System.out.println(" -- Questão 01 -- ");
                    Questao01.main(args);
                }
                case "b" -> {
                    System.out.println(" -- Questão 02 -- ");
                    Questao02.main(args);
                }
                case "c" -> {
                    System.out.println(" -- Questão 03 -- ");
                    Questao03.main(args);
                }
                case "d" -> {
                    System.out.println(" -- Questão 04 -- ");
                    Questao04.main(args);
                }
                case "e" -> {
                    System.out.println(" -- Questão 05 -- ");
                    Questao05.main(args);
                }
                case "f" -> {
                    System.out.println(" -- Questão 06 -- ");
                    Questao06.main(args);
                }
                default -> {
                }
            }
            /* switch (escolha) {
                case "a":
                    System.out.println(" -- Questão 01 -- ");
                    Questao01.main(args);
                    break;
                case "b":
                    System.out.println(" -- Questão 02 -- ");
                    Questao02.main(args);
                    break;
                case "c":
                    System.out.println(" -- Questão 03 -- ");
                    Questao03.main(args);
                    break;
                case "d":
                    System.out.println(" -- Questão 04 -- ");
                    Questao04.main(args);
                    break;
                case "e":
                    System.out.println(" -- Questão 05 -- ");
                    Questao05.main(args);
                    break;
                case "f":
                    System.out.println(" -- Questão 06 -- ");
                    Questao06.main(args);
                    break;
                default:
                    break;

             */
        }
    }
}
