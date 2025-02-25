import java.util.Locale;
import java.util.Scanner;

public class Pecas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, qtdPecas1, peca2, qtdPecas2;
        double valorPeca1, valorPeca2, total;

        peca1 = sc.nextInt();
        qtdPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        peca2 = sc.nextInt();
        qtdPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        total = qtdPecas1 * valorPeca1 + qtdPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR = R$ %.2f", total);

        sc.close();
    }

}