public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double saldoInicial, double taxaJuros) {
        super(saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }
}
