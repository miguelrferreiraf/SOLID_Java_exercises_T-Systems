class Venda {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Venda(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getTotal() {
        return quantidade * precoUnitario;
    }
}





