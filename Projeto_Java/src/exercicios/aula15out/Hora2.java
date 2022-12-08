package exercicios.aula15out;

public class Hora2 {

    public int hora; // isso é um atributo e pode ser inserido apos a linha abaixo, retirando o "int hora"

    public void verificaPeriodo ( int hora) { // isso é um metodo

        // int hora = 8; apenas aqui também é uma forma

        if (hora >= 0 && hora <= 5) {
            System.out.println("madrugada");
        } else if (hora > 5 && hora < 12) {
            System.out.println("manha");
        } else if (hora > 12 && hora < 18) {
            System.out.println("tarde");
        } else {
            System.out.println("noite");
        }
    }

    public static void main(String[] args) {
        Hora2 h = new Hora2();
        h.verificaPeriodo(07); // (inclua o valor aqui para testar o metodo)
    }
}
