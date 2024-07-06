class GeradorRelatorio {
    public String gerarRelatorio(Venda[] vendas) {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório de Vendas:\n");
        relatorio.append("-------------------\n");
        for (Venda venda : vendas) {
            relatorio.append("Produto: ").append(venda.getProduto()).append("\n");
            relatorio.append("Quantidade: ").append(venda.getQuantidade()).append("\n");
            relatorio.append("Preço (Und.): ").append(venda.getPrecoUnitario()).append("\n");
            relatorio.append("Total: ").append(venda.getTotal()).append("\n");
            relatorio.append("-------------------\n");
        }
        return relatorio.toString();
    }
}