public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        super(saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if (valor > 0 && valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
        } else {
            throw new Exception("Saldo insuficiente/valor inválido");
        }
    }
}
