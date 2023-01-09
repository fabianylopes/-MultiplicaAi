public class App {
    public static void main(String[] args) throws Exception {
        int x = 4;

        System.out.println("\n==== Tabela de multiplicação de " + x + " ====\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }

    }
}
