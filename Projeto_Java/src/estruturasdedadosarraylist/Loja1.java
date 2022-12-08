package estruturasdedadosarraylist;

import java.util.ArrayList; // exercicio de array lista

public class Loja1 {
    public static void main(String[] args) {
/*        Produto lista[];
        lista = new Produto1[5];

        lista[0] = new Produto1(1, "Computador", 1500.0);
        lista[1] = new Produto1(2, "Mouse", 30);
        lista[2] = new Produto1(3, "Teclado", 80);
        lista[3] = new Produto1(4, "Monitor", 400.0);
        lista[4] = new Produto1 (5, "Impressora", 650.0);

       for (int i=0; i<lista.length; i++) {
            System.out.println(lista[i]);
        }
 */
        ArrayList<Produto1> lista;
        lista = new ArrayList<Produto1>();

        lista.add(new Produto1(1, "Computador", 1500.0));
        lista.add(new Produto1(2, "Mouse", 30));
        lista.add(new Produto1(3, "Teclado", 80));
        lista.add(new Produto1(4, "Monitor", 400.0));
        lista.add(new Produto1(5, "Impressora", 650.0));

 //       for (Produto p: lista){  // for each - condição apenas para todos os produtos da lista
 //           System.out.println(p);
 //       }

        lista.remove(2); //reorganiza a lista excluindo o elemento 2
        for (int i=0 ; i <lista.size(); i++) {
            System.out.println(lista.get(i));
           }
        }

    }

