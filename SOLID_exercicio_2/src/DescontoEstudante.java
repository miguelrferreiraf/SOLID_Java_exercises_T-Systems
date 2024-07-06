class DescontoEstudante extends Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;
    }
}

class DescontoIdoso extends Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85;
    }
}
