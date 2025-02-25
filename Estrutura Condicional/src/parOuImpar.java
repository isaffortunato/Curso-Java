import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.printf("Digite um número: ");
        numero = sc.nextDouble();

    //verifica se o resto da divisão de "numero por 2 é igual a zero. Se for, significa que o número é par.
        if (numero % 2 == 0) {
            System.out.println("É um número par!");
        } else {
            System.out.println("É um número ímpar!");
        }

        sc.close();
    }
}
