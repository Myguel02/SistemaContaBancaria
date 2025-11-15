public class ContaCorrente extends Conta implements OperacoesBancarias {

    private final double TAXA_OPERACAO = 0.005;

    public ContaCorrente(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void atualizarSaldo() {
        System.out.println("Conta Corrente nao possui rendimento mensal.");
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        double valorComTaxa = valor + (valor * TAXA_OPERACAO);

        if (valorComTaxa > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferencia com taxa.");
        }

        this.sacar(valorComTaxa);
        destino.depositar(valor);

        System.out.println("Transferência realizada com taxa de operação de 0.5%.");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== EXTRATO CONTA CORRENTE ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("==============================\n");
    }
}
