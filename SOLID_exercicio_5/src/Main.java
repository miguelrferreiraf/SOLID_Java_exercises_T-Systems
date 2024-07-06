public class Main {
    public static void main(String[] args) {
        MetodoPagamento pagamentoCartao = new CartaoCredito("39485593043", "Gandalf", "12/24", "123");
        SistemaPagamento sistemaPagamentoCartao = new SistemaPagamento(pagamentoCartao);
        sistemaPagamentoCartao.processarPagamento(10000.0);

        MetodoPagamento pagamentoPayPal = new PayPal("gandalfocinzento@example.com", "senhaSegura");
        SistemaPagamento sistemaPagamentoPayPal = new SistemaPagamento(pagamentoPayPal);
        sistemaPagamentoPayPal.processarPagamento(4500.0);
    }
}
