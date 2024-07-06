public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) throws Exception {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            throw new Exception("Saldo insuficiente/valor inválido");
        }
    }
}
