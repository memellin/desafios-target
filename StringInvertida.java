import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra");
        Scanner sc = new Scanner(System.in);
        String plvr = sc.nextLine();
        String plvrInvertida = "";
        //tentar criar função para inverter a string
        for (int i = plvr.length() - 1; i >= 0; i--) {
            plvrInvertida += plvr.charAt(i);
        }
        System.out.println(plvrInvertida);
        sc.close();
    }
}
