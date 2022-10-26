package Exemplos.Array;

public class Exemplo00 {
    public static void main(String[] args) {

        // Arrays se iniciam da posição 0
        String [] pessoas = {"Chaves", "Seo Madruga", "Dona Florinda", "Chiquinha"};
        System.out.println(" ***** pessoas.length ***** \n" + pessoas.length);

        // Escrever um ítem específico
        System.out.println(" ***** Escrever um ítem específico ***** ");
        System.out.println(pessoas[0]);
        System.out.println(pessoas[1]);
        System.out.println(pessoas[2]);
        System.out.println(pessoas[3]);

        // Escrever tudo em um laço de repeticao
        // É necessário utilizar essa forma caso vc queira do último até o primeiro
        System.out.println(" ***** Laço for ***** ");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }

        // Trocar item em um array
        pessoas [0] = "Kiko";

        // Enhanced for formula
        System.out.println(" ***** Laço for-each ***** ");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
