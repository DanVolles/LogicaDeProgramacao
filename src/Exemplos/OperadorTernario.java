package Exemplos;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora para saber se está de dia ou de noite!");
        double hora = input.nextDouble();

        String turno = (hora >= 18) ? "Noite" : "Dia";
        System.out.println(turno);
    }
}

class OperadorTernarioDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora para saber se está de dia ou de noite!");
        double hora = input.nextDouble();

        if (hora >= 18) {
            System.out.println("Está de noite!");
        } else {
            System.out.println("Está de dia!");
        }
    }
}