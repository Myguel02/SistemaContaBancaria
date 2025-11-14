public class BancoApp {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(101, "Matheus Freitas");
        ContaPoupanca cp = new ContaPoupanca(202, "Ana Oliveira");

        // Depósitos
        cc.depositar(1000);
        cp.depositar(500);

        // Saque com tratamento de exceção
        try {
            cc.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Transferência com exceção
        try {
            cc.transferir(cp, 300);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao transferir: " + e.getMessage());
        }

        // Atualização de saldo
        cp.atualizarSaldo();

        // Extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
