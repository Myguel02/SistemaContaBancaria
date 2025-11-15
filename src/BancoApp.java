import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente(101, "Matheus Freitas");
        ContaPoupanca cp = new ContaPoupanca(202, "Ana Oliveira");

        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor para depósito na Conta Corrente: ");
                    double valorDep = sc.nextDouble();
                    cc.depositar(valorDep);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque na Conta Corrente: ");
                    double valorSaq = sc.nextDouble();
                    try {
                        cc.sacar(valorSaq);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para transferir da Conta Corrente → Poupança: ");
                    double valorTrans = sc.nextDouble();
                    try {
                        cc.transferir(cp, valorTrans);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Atualizando saldos...");
                    cc.atualizarSaldo();
                    cp.atualizarSaldo();
                    break;

                case 5:
                    cc.imprimirExtrato();
                    cp.imprimirExtrato();
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- MENU BANCÁRIO ---");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Transferir");
        System.out.println("4. Atualizar Saldo");
        System.out.println("5. Extrato");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
