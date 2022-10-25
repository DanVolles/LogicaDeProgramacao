package Exemplos;

public class Comparacao {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        System.out.println(" -- Operadores de comparação -- ");
        /* System.out.println(
                "x == y\n" +
                "x != y\n" +
                "x > y\n" +
                "x < y\n" +
                "x >= y\n" +
                "x <= y\n"
                );
                Assim não funciona, necessariamente eu preciso colocar cada um em seu próprio sout
               */
        System.out.println("x == y");
        System.out.println("x != y");
        System.out.println("x > y");
        System.out.println("x < y");
        System.out.println("x >= y");
        System.out.println("x <= y");

        System.out.println(" -- Operações lógicas -- ");

        boolean vaiTerAula;
        boolean diaSemana = true;
        boolean feriado = true;

        vaiTerAula = diaSemana && !feriado;

        System.out.println(vaiTerAula);
        System.out.println(diaSemana == true && feriado == false);
    }
}
