package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja3 {
    public static void main(String[] args) {
        List<Produto3> lista = new ArrayList<Produto3>();

        lista.add(new Produto3(1, "Computador", 1500));
        lista.add(new Produto3(2, "Mouse", 30));
        lista.add(new Produto3(3, "Teclado", 80));
        lista.add(new Produto3(4, "Monitor", 450));
        lista.add(new Produto3(5, "Impressora", 600));
        lista.add(new Produto3(6, "Notebook", 2500));

        lista.stream().forEach((p2) -> {
            System.out.println(p2);
        });
        System.out.println("\nProdutos em ordem alfabetica...");
        lista.stream().sorted(Comparator.comparing(Produto3::getNome))
                .forEach(p2 -> System.out.println(p2));

        System.out.println("\nProdutos em ordem de preco...");
        lista.stream().sorted(Comparator.comparing(Produto3::getPreco))
                .forEach(p2 -> System.out.println(p2));

        System.out.println("\nObtendo o produto mais caro");
        Produto3 produtoMaisCaro;
        produtoMaisCaro = lista.stream().max(Comparator.comparing(p2 ->p2.getPreco()))
                                        .orElse(null);
        if(produtoMaisCaro != null) {
            System.out.println("Produto mais caro = " +produtoMaisCaro);
        }

        System.out.println("\nObtendo o produto mais barato");
        Produto3 produtoMaisBarato;
        produtoMaisBarato = lista.stream().min(Comparator.comparing(p2 ->p2.getPreco()))
                .orElse(null);
        if(produtoMaisCaro != null) {
            System.out.println("Produto mais barato = " +produtoMaisBarato);
        }
    }

}
