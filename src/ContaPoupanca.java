public class ContaPoupanca extends Conta implements OperacoesBancarias {

    private final double RENDIMENTO = 0.003;

    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void atualizarSaldo() {
        double novoSaldo = getSaldo() + (getSaldo() * RENDIMENTO);
        System.out.println("Saldo atualizado com rendimento de 0.3%.");
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferencia realizada sem taxa.");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== EXTRATO CONTA POUPANÇA ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("==============================\n");
    }
}
