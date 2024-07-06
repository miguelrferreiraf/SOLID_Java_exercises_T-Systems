class DescontoFuncionario extends Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.8;
    }
}
