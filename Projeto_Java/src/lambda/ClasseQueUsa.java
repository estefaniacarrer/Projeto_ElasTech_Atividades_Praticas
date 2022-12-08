package lambda;

public class ClasseQueUsa {
    public static void main(String[] args) {

        InterfaceServico i;

        i = new InterfaceServico() {
            public void executa(int valor){
                System.out.println("Estou executando algo..." +valor);
            }
        };
        i.executa(10); // instancia anonima


        InterfaceServico i2 = (valor) -> {
            System.out.println("Outra logica - " + valor);
        };
        i2.executa(20); // lambda

    }
}
