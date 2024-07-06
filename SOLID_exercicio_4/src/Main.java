public class Main {
    public static void main(String[] args) {
        Imprimivel impressoraSimples = new ImpressoraSimples();
        impressoraSimples.imprimirDocumento("Documento Simples");

        ImpressoraMultifuncional impressoraMultifuncional = new ImpressoraMultifuncional();
        impressoraMultifuncional.imprimirDocumento("Documento Multifuncional");
        impressoraMultifuncional.escanearDocumento("Documento Multifuncional");
        impressoraMultifuncional.faxearDocumento("Documento Multifuncional");
    }
}
