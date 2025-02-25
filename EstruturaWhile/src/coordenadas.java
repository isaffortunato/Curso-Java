import java.util.Scanner;

public class coordenadas {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int coordX = sc.nextInt();
        int coordY = sc.nextInt();

        while (coordX != 0 && coordY != 0) {
            if (coordX > 0 && coordY > 0) {
                System.out.println("Primeiro");
            }
            else if (coordX < 0 && coordY > 0) {
                System.out.println("Segundo");
            }
            else if (coordX < 0 && coordY < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }
            coordX = sc.nextInt();
            coordY = sc.nextInt();
        }

        sc.close();
    }
}
