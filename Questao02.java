import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           
        try {
           System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
       

        System.out.println("Idade cadastrada: ");
           

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } finally {
            System.out.println("Processamento encerrado.");
        }
        sc.close();
    }
}