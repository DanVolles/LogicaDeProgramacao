package Exemplos.Metodos;

public class Exemplo02 {
    public static void main(String[] args) {
        int nFinal = somaRecursiva(10);
        System.out.println(nFinal);
    }

    static int somaRecursiva(int n) {
        if (n > 0) return n + somaRecursiva(n - 1);
        else {
            return 0;
        }
    }
}
