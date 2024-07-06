public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularValorComDesconto() {
        return desconto.aplicarDesconto(valor);
    }

    public static void main(String[] args) {
        Desconto descontoEstudante = new DescontoEstudante();
        Pedido pedidoEstudante = new Pedido(100.0, descontoEstudante);
        System.out.println("Desconto para estudante: " + pedidoEstudante.calcularValorComDesconto());

        Desconto descontoIdoso = new DescontoIdoso();
        Pedido pedidoIdoso = new Pedido(100.0, descontoIdoso);
        System.out.println("Desconto para idoso: " + pedidoIdoso.calcularValorComDesconto());
    }
}
