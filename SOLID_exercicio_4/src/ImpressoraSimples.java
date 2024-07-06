public class ImpressoraSimples implements Imprimivel {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo " + documento);
    }
}
