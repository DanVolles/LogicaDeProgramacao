package Exemplos.ProgOrientObj;

public class Exemplo00 {
    public static void main(String[] args) {
        // Criação do objeto do tipo caneta
        Caneta caneta1 = new Caneta();
        // Descrição do objeto
        caneta1.modelo = "BIC";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.9f;
        caneta1.carga = 100;
        caneta1.tampa = false;
        // chamar a caneta para rabiscar
        caneta1.rabiscar();
        caneta1.tampar();
        caneta1.rabiscar();
    }
}
