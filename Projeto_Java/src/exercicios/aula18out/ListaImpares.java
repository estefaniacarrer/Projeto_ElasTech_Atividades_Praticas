package exercicios.aula18out;

import java.net.StandardSocketOptions;

public class ListaImpares {

    public void listar() {

        int z = 1;
        while (z <= 100) {
            z++;

            if (z % 2 == 1){        // ou (z % 2 != 0)
                System.out.println(z);

            }
        }
    }

    public static void main(String[] args) {
        ListaImpares l2 = new ListaImpares();
        l2.listar();
    }
}
