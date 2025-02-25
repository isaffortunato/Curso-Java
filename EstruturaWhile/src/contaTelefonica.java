import java.util.Scanner;
import java.util.Locale;

public class contaTelefonica {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double valorPagar = 50;

        if (minutos > 100){
            valorPagar += (minutos - 100) * 2;
            //valorPagar = valorPagar + (minutos - 100) * 2
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        sc.close();
    }
}
