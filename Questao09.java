import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        
        try {
            int resultado = n1 / n2;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage() );
        } finally {
            System.out.println("Operação finalizada.");
        }
        System.out.println("Adição: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage() );
        } finally {
            System.out.println("Calculadora encerrada");
        }
        sc.close();
    }
}
