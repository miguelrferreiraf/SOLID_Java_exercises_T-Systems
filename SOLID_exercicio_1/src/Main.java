public class Main {
    public static void main(String[] args) {
        Venda[] vendas = {
                new Venda("Produto A", 2, 10.0),
                new Venda("Produto B", 1, 20.0)
        };

        GeradorRelatorio gerador = new GeradorRelatorio();
        String relatorio = gerador.gerarRelatorio(vendas);

        ImpressoraRelatorio impressora = new ImpressoraRelatorio();
        impressora.imprimirRelatorio(relatorio);
    }
}