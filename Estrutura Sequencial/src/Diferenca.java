import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.print ("Diferença = " + diferenca);

        sc.close();
    }
}
