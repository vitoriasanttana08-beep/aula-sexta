import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno: " + media);

        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        } finally {
            System.out.println("Cálculo da média finalizado.");
        }

        sc.close();
    }
}