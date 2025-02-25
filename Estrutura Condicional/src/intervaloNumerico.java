import java.util.Locale;
import java.util.Scanner;

public class intervaloNumerico {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número: ");
        numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.print("Fora de intervalo.");
        } else if (numero > 75.0) {
                System.out.print("Intervalo [75, 100]");
        } else if (numero > 50.0) {
            System.out.print("Intervalo [50, 75]");
        } else if (numero > 25.0) {
            System.out.print("Intervalo [25, 50]");
        } else if (numero <= 25.0) {
            System.out.print("Intervalo [0, 25]");
        }

        sc.close();
    }
}
