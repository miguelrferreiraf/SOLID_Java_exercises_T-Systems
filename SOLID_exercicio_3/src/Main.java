public class Main {
    public static void main(String[] args) {
        try {
            Conta contaCorrente = new ContaCorrente(1000.0, 500.0);
            contaCorrente.depositar(200.0);
            contaCorrente.sacar(300.0);
            System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

            Conta contaPoupanca = new ContaPoupanca(1000.0, 0.02);
            contaPoupanca.depositar(200.0);
            contaPoupanca.sacar(300.0);
            System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
