import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Informe o saldo da conta: ");
        double saldo = sc.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);


        sc.close();
    }
}