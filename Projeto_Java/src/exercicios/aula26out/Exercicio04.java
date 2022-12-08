package exercicios.aula26out;

/* Na mesma classe criada anteriormente (Impressao), crie um método que imprima (utilize System.out.println)
        os números de 1 a 10 usando o loop while.
*/
public class Exercicio04 {

    public void imprimir() {
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Exercicio04 ex4 = new Exercicio04();
        ex4.imprimir();
    }
}