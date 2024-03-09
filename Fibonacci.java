import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        // Verificação de número negativo
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }
        // Fibonacci
        if (n <= 1) {
            System.out.println("O " + n + "º número da sequência de Fibonacci é: " + n);
            return;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        // Verificação se o número pertence à sequência
        boolean pertence = (b == n);
        System.out.println("O número " + n + (pertence ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }
}