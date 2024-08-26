import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Usuario: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite sua Agencia: ");
        String Agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String NomeDoCliente = scanner.next();

        double Saldo = 522.54;

        System.out.println("Ola " + NomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " ja esta disponivel para saque");
    }
}