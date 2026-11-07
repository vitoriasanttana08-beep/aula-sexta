public class Questao08 {
    public static void main(String[] args) {

        try {
            String nome = null;

            System.out.println("Nome: " + nome.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Nome não informado.");
        } finally {
            System.out.println("Operação de manipulação de texto finalizada");
        }
        Usuario usuario = null;

        try {
            System.out.println("Nome do usuário: " + usuario.getNome());
        } catch (NullPointerException e) {
            System.out.println("Usuário não informado.");
        } finally {
            System.out.println("Operação de acesso aos dados do usuário finalizada");
        }

    }
}

class Usuario {

    private String nome = "Carlos";

    public String getNome() {
        return nome;
    }
}
