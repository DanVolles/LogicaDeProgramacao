package Exemplos;

public class IfElse {

    public static void main(String[] args) {

        boolean x = true;

        // Se sozinho
        if (x) {
            System.out.println("Esse código só é executado se x for true.");
        }

        // Se com o senão
        if (x == false) {
            System.out.println("Esse código só é executado se x for false.");
        } else {
            System.out.println("Esse código só é executado se x for true.");
        }

        int a = 2;
        if (a == 2) {
            System.out.println("Dois.");
        } else if (a == 4) {
            System.out.println("Quatro.");
        } else {
            System.out.println("Nem 2, nem 4.");
        }

        String key = "/";
        switch (key) {
            case "+" -> System.out.println("Somar.");
            case "-" -> System.out.println("Subtrai.");
            case "*" -> System.out.println("Multiplicar.");
            case "/" -> System.out.println("Dividir.");
            default -> System.out.println("Não identificado.");
        }
    }
}
