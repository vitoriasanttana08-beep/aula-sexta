import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] produtos = {
            "Mouse", "Teclado", "Monitor", "Impressora", "Notebook"
        };

        System.out.print("Digite a posição do produto (0 a 4): ");
        int posicao = sc.nextInt();

        System.out.println("Produto: " + produtos[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entrada inválida.");
        } finally {
            System.out.println("Consulta finalizada");
        }
        String[] produtos = {
            "Mouse", "Teclado", "Monitor", "Impressora", "Notebook"
        };

        sc.close();
    }
}