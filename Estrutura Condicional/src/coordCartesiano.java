import java.util.Locale;
import java.util.Scanner;

public class coordCartesiano {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double coord1, coord2;

        System.out.println("Insira a primeira coordenada: ");
        coord1 = sc.nextDouble();

        System.out.println("Insira a segunda coordenada: ");
        coord2 = sc.nextDouble();

        if (coord1 == 0.0 && coord2 == 0.0){
            System.out.print("Origem.");
        } else if (coord1 == 0.0){
            System.out.print("Eixo Y.");
        } else if (coord2 == 0.0) {
            System.out.print("Eixo X.");
        } else if (coord1 > 0.0 && coord2 > 0.0){
            System.out.print("Q1.");
        } else if (coord1 < 0.0 && coord2 > 0.0){
            System.out.print("Q2.");
        } else if (coord1 < 0.0 && coord2 < 0.0){
            System.out.print("Q3.");
        } else if (coord1 > 0.0 && coord2 < 0.0) {
            System.out.print("Q4.");
        }

        sc.close();
    }
}
