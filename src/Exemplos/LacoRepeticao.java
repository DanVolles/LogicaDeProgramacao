package Exemplos;

public class LacoRepeticao {
    public static void main(String[] args) {

        int contar = 1; //i
        while (contar <= 10) {
            System.out.print(contar);
            System.out.println(" <- dentro do loop while.");
            contar++; // Ou contar = contar + 1;
        }

        do {
            contar--; // Ou contar = contar - 1;
            System.out.print(contar);
            System.out.println(" <- dentro do loop do-while.");
        } while (contar > 1);

        // 1 - star da variável; 2 - condição de repetição; forma de incremento
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i);
            System.out.println(" < dentro do loop for.");
        }
    }
}
