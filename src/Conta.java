public abstract class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para deposito.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado.");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    // Método abstrato
    public abstract void atualizarSaldo();
}
