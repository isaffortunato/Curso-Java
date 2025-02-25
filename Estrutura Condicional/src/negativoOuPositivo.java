import java.util.Scanner;

public class negativoOuPositivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.printf("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO!");
        } else {
            System.out.println("POSITIVO!");
        }

        sc.close();
    }
}