package orientacaoobjetos;

public class Comparador {
    public static void main(String[] args) {
        String s1, s2;

        s1 = "Oi tudo bem?";
        s2 = "Oi tudo bem?";

        if (s1 == s2) {  // não compara conteúdo e sim endereços
            System.out.println("mesmo endereco de memoria");
        }
        else {
            System.out.println("enderecos diferentes na memoria");
        }
        if (s1.equals(s2)) { // equals serve para comparar conteúdos
            System.out.println("conteudos iguais");
        } else {
            System.out.println("conteudos diferentes");
        }
        s2 = "Agora vai!!!!!";

        System.out.println(s1);
        System.out.println(s2);

    }
}
