import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = Double.parseDouble(sc.nextLine());

            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            double total = preco * quantidade;

            System.out.println("\n--- PRODUTO CADASTRADO ---");
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor em estoque: R$ " + total);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos para preço e quantidade.");
        } finally {
            System.out.println("Cadastro de produto finalizado.");
        }
        
        sc.close();
    }
}
