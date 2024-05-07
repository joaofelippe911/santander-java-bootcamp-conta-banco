import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Conta!");
        numero = scanner.nextInt();


        System.out.println("Por favor, digite a Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente!");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
    }
}
