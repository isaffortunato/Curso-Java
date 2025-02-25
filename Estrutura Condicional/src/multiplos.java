import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.printf("Digite o primeiro número: ");
        A = sc.nextInt();

        System.out.printf("Digite o segundo número: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos!");
        } else {
            System.out.println("Não são múltiplos!");
        }

        sc.close();

    }
}
