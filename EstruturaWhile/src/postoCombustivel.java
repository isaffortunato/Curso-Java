import java.util.Scanner;

public class postoCombustivel {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     int x = sc.nextInt();
     int gasolina = 0;
     int alcool = 0;
     int diesel = 0;

     while (x != 4){
         if (x == 1) {
             alcool++;
             x = sc.nextInt();
         }
         else if (x == 3) {
             diesel++;
             x = sc.nextInt();
         }
         else if (x == 2) {
             gasolina++;
             x = sc.nextInt();

         }
         else {
             System.out.println("Digite um número valido");
             x = sc.nextInt();
         }
         }

         System.out.println("Muito obrigado");
         System.out.printf("Alcool: %d%n", alcool);
         System.out.printf("Gasolina: %d%n", gasolina);
         System.out.printf("Diesel: %d%n", diesel);

     sc.close();
    }
}