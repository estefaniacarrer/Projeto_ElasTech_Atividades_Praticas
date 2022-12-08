package exercicios.aula26out;

/* Na mesma classe criada anteriormente (Impressao), crie um método que imprima (utilize System.out.println)
        os números de 1 a 10 usando o loop while. Usando array
*/
public class Exercicio041 {

    public void imprimir (Integer[] array) {
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);

        }
    }

    public static void main(String[] args) {
        Integer [] array = new Integer[10];

        for (int x = 0; x < array.length; x++){
            array [x] = x + 1;
        }

       // usar for ou posso declarar assim até 10 = array [0] = 1;

        Exercicio041 e = new Exercicio041();
        e.imprimir(array);
    }
    }

    // posso usar int no lugar de Integer ai o valor null muda para 0
