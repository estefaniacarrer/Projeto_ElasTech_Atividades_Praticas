package exercicios.aula26out;

/* Na mesma classe criada anteriormente (Impressao), crie um método que construa uma array de 5 espaços.
Cada espaço deverá ter um número inteiro. Dentro desse método, percorra o array imprimindo
(utilize System.out.println) todos os números usando o loop for-each.*/

public class Exercicio05 {

    public void imprimeNumeros() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

              int[] array = {1, 2, 3, 4, 5};
              public void imprimiArray(){
                  for (int i: array) {
                 System.out.println(i);

    }
}

    public static void main(String[] args) {
        Exercicio05 ex05 = new Exercicio05();
        ex05.imprimiArray();
    }
}
