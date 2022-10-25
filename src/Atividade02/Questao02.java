package Atividade02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Seja bem-vindo!\n" +
                "Aqui eu posso te mostrar a ordem de tamanho entre três números!");

        System.out.print ("Por favor, insira o primeiro número: ");
        double a = input.nextDouble();
        System.out.print ("Por favor, insira o segundo número: ");
        double b = input.nextDouble();
        System.out.print ("Por favor, insira o terceiro número: ");
        double c = input.nextDouble();

        // Dizer qual o maior número
        double maior = Math.max(Math.max(a,b),c);
        System.out.println("O maior número entre os três é " + maior);

        // Dizer qual o manor número
        double menor = Math.min(Math.min(a,b),c);
        System.out.println("O menor número entre os três é " + menor);
    }
}

class Questao02Variacao {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Seja bem-vindo!\n" +
                "Aqui eu posso te mostrar a ordem de tamanho entre três números!");

        System.out.print ("Por favor, insira o primeiro número: ");
        double a = input.nextDouble();
        System.out.print ("Por favor, insira o segundo número: ");
        double b = input.nextDouble();
        System.out.print ("Por favor, insira o terceiro número: ");
        double c = input.nextDouble();

        //Dizer qual o maior número
        if (a == b && a == c) {
            System.out.println("Os três números são iguais!");
        } else if (a >= b && a >= c) {
            System.out.println("O primeiro número, " + a + ", é o maior entre os 3!");
        } else if (b >= a && b >= c) {
            System.out.println("O segundo número, " + b + ", é o maior entre os 3!");
        } else {
            System.out.println("O terceiro número, " + c + ", é o maior entre os 3!");
        }

        //Dizer qual o menor número
        if (a == b && a == c) {

        }
        if (a <= b && a <= c) {
            System.out.println("O primeiro número, " + a + ", é o menor entre os 3!");
        } else if (b <= a && b <= c) {
            System.out.println("O segundo número, " + b + ", é o menor entre os 3!");
        } else {
            System.out.println("O terceiro número, " + c + ", é o menor entre os 3!");
        }
    }
}

class Questao02Plus {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Seja bem-vindo!\n" +
                "Aqui eu posso te mostrar a ordem de tamanho entre três números!");

        System.out.print ("Por favor, insira o primeiro número: ");
        int a = input.nextInt();
        System.out.print ("Por favor, insira o segundo número: ");
        int b = input.nextInt();
        System.out.print ("Por favor, insira o terceiro número: ");
        int c = input.nextInt();

        int maior = greater(a,b,c);
        int menor = smaller(a,b,c);

        System.out.println("O maior número entre os três é " + maior);
        System.out.println("O menor número entre os três é " + menor);

    }

    public static int greater (int x, int y, int z) {
        return Math.max(Math.max(x,y),z);
    }

    public static int smaller (int x, int y, int z) {
        return Math.min(Math.min(x,y),z);
    }

//    // exemplo para ser equivalente ao Math.max(x,y)
//    public static int greaterExample (int x, int y) {
//        if (x > y) {
//            return x;
//        } else {
//            return y;
//        }
//    }
//
//    // exemplo para ser equivalente ao Math.min(x,y)
//    public static int smallerExample (int x, int y) {
//        if (x < y) {
//            return x;
//        } else {
//            return y;
//        }
//    }
}