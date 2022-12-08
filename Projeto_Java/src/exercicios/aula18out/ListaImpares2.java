package exercicios.aula18out;

public class ListaImpares2 {

    public void listar () {

        int x = 1;
        while ( x <=99){
            x++;
            if (x % 2 != 0){
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        ListaImpares2 li2 = new ListaImpares2();
        li2.listar();
    }
}
