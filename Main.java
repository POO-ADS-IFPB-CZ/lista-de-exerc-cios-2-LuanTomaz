import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular, 0.0f);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo inicial: R$ " + conta.consultarSaldo());

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para sacar: ");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
