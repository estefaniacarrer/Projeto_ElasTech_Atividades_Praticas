package interfacesv2;

public class AplicacaoQueUsaCalculos {
    public static void main(String[] args) {
        //situacao 1 - preciso chamar o metodo do objeto do jeito que ele é

        ObjetoQueCalcula o = new ObjetoQueCalcula();
        o.realizaAlgumCalculo();

        // situação 2 - o modulo x só consegue chamar via método calcularValores()
        InterfaceModulo1 i1 = o ;
        i1.calcularValores();

        // situação 3 - o modulo y só consegue chamar via efetivarContas()
        InterfaceModulo2 i2 = o;
        i2.efetivarContas();
    }


}
