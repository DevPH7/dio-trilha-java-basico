import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá, para criar sua conta precisaremos que nos informe alguns dados.");

        System.out.println("Digite o número da Agência");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número do usuário");
        int usuario = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        scanner.close();

        
        double saldo = 237.48;

    




        System.out.println(
            "Olá" + " " + nome + " " + "obrigado por criar uma conta em nosso banco, sua agência é" + " "
             + numeroAgencia + " " + "o número da sua conta é" + " " + usuario + " " 
             + "seu saldo atual é de" + " " + saldo + " " + "já está disponível para saque."
        );

    }
}
