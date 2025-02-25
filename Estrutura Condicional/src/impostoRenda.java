import java.util.Locale;
import java.util.Scanner;

public class impostoRenda {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda, valorIR;

        System.out.println("Insira o valor do salário: ");
        renda = sc.nextDouble();

        if (renda <= 2000.0){
            valorIR = 0.0;
        } else if (renda <= 3000.0){
            valorIR = (renda - 2000.0) * 0.08;
        } else if (renda <= 4500.0){
            valorIR = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            valorIR = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (valorIR == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", valorIR);
        }

        sc.close();
    }
}
