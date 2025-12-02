import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaDio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int Numero = scanner.nextInt();
        scanner.nextLine();

       System.out.println("Por favor, digite o nome do cliente");
        String NomeCliente = scanner.nextLine();

        System.out.println("Qoal o saldo disponível?");
        double Saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta, %d  e seu saldo %.2f já está disponível para saque", NomeCliente, Agencia,Numero, Saldo );





    }
}