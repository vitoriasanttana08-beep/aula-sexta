import java.util.InputMismatchException;

public class Questao03 {
    public static void main(String[] args) {

        
        try {
           String valor = "abc";

        int numero = Integer.parseInt(valor);

        System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.");
        } finally {
            System.out.println("Tentativa de conversão foi finalizada.");
        }
    }
}