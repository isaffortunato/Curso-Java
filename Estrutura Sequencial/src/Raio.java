import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        //ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
        //formula da área: área = pi.raio²
        //pi = 3.14159
        Scanner sc = new Scanner(System.in);

        double raio;
        double raioQuadrado;
        double pi = 3.14159;
        double resultadoArea;

        raio = sc.nextDouble();

        raioQuadrado = raio*raio;
        resultadoArea = pi*raioQuadrado;

        System.out.printf("A área do circulo é = %.4f", resultadoArea);

        sc.close();
    }
}