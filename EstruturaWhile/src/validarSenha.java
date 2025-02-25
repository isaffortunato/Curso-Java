import java.util.Scanner;

public class validarSenha {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int senha = 2002;
       int x = sc.nextInt();

       while (x != senha){
           System.out.println("Senha inválida");
           x = sc.nextInt();
       }

       System.out.print("Acesso permitido");

       sc.close();
    }
}
