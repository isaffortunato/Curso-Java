import java.util.Scanner;

public class exercicioFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            //int numeroImpar = 0;
            if (i % 2 != 0) {
                //numeroImpar = i;
                System.out.println(i);
            }
        }

        sc.close();
    }
}