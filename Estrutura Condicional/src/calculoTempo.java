import java.util.Scanner;

public class calculoTempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaInicio, horaFim, duracao;

        System.out.printf("Digite a hora que o jogo iniciou: ");
        horaInicio = sc.nextInt();

        System.out.printf("Digite a hora que o jogo terminou: ");
        horaFim = sc.nextInt();

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;

        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.print("O jogo durou " + duracao + " hora(s).");

        sc.close();
    }
}
