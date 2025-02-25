import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String frase1 = "NUMBER";
        String frase2 = "SALARIO";

        int numeroFuncionario;
        double horasTrabalhadas, ganhoHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        ganhoHora = sc.nextDouble();

        salario = horasTrabalhadas * ganhoHora;

        System.out.printf("%s = %d%n", frase1, numeroFuncionario);
        System.out.printf("%s = U$ %.2f", frase2, salario);
        sc.close();
    }
}
