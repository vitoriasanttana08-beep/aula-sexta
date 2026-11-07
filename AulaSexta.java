public class AulaSexta{
    public static void main(String[] args) {
int a = 10, b = 0;
try {
    System.out.println("Início");
    int r = a / b;
    System.out.println("r");
} catch (ArithmeticException e) {
    System.out.println("Erro: " + e.getMessage());
}  
    System.out.println("Fim");
}
}