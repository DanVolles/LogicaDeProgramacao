package Exemplos.Metodos;

public class Exemplo00 {

    // Static não precisa criar uma variável para ser utilizado
    static void boasVindas(){
        System.out.println("Seja bem-vindo!");
    }

    static void ateLogo(){
        System.out.println("Até logo!");
    }

    static void somarNumeros(int[] numeros){
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        System.out.print(total);
    }

}
