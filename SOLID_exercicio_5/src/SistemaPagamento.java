public class SistemaPagamento {
    private MetodoPagamento metodoPagamento;

    public SistemaPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void processarPagamento(double valor) {
        metodoPagamento.pagar(valor);
    }
}
