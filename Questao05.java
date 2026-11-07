import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Preço informado: R$ " + preco);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } finally {
            System.out.println("Cadastro de preço finalizado");
        }
        
        sc.close();
    }
    }
