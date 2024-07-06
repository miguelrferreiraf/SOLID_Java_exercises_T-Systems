public class ImpressoraMultifuncional implements Imprimivel, Escaneavel, Faxavel {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }

    @Override
    public void escanearDocumento(String documento) {
        System.out.println("Escaneando documento: " + documento);
    }

    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Enviando fax do documento: " + documento);
    }
}
