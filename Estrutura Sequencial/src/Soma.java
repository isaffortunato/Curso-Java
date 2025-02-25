import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.print("SOMA = ");
        System.out.print(y + x);

        sc.close();
    }
}
