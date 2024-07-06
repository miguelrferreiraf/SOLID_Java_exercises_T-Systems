public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String codigoSeguranca;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado com Cartão de Crédito.");
    }
}
