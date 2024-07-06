public class PayPal implements MetodoPagamento {
    private String email;
    private String senha;

    public PayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado com PayPal.");
    }
}
