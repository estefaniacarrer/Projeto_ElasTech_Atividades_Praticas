package exercicios.aula18out;

public class ListaPares2 {

    public void listar (){

        int x = 1;
        while (x <= 100){
            x++;
            if (x % 2 == 0 ) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        ListaPares2 lp2 = new ListaPares2();
        lp2.listar();
    }
}
