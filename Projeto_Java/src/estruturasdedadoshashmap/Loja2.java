package estruturasdedadoshashmap;

import estruturasdedadosarraylist.Produto1;

import java.util.HashMap;

public class Loja2 {
    public static void main(String[] args) {
           /*Integer - int
           Double - double
           Float - float
           Character - char
            */
        HashMap<Integer, Produto2> mapa; // utilizado para realizar buscar dentro de uma lista
        mapa = new HashMap<Integer, Produto2>();

        mapa.put(1, new Produto2(1, "Computador", 1500.0));
        mapa.put(2, new Produto2(2, "Mouse", 30.0));
        mapa.put(3,new Produto2(3, "Teclado", 80));
        mapa.put(4, new Produto2(4, "Monitor", 400.0));
        mapa.put(5, new Produto2(5, "Impressora", 650.0));

        int codigoAbuscar = 7;
        Produto2 p = mapa.get(codigoAbuscar);
        if(p != null) {
            System.out.println("Encontrei:" + p);
        }
        else {
            System.out.println("Nao existe");
        }
    }
}
