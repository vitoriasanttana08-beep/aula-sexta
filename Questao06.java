public class Questao06 {
    public static void main(String[] args) {

        try {
        String nome = null;

        System.out.println("Nome: " + nome.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Nome não informado.");
        } finally {
            System.out.println("Operação de manipulação de texto finalizada");
        }
    }
}