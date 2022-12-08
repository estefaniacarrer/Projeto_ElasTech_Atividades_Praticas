package exercicios.aula18out;

public class ListaPares {

    public void listar() {

        int y = 1;
        while (y <= 100)  { //ou for (int y = 1 ; y <= 100 ; y++) {
            y++;
            if (y % 2 == 0){
                System.out.println(y);

            }
        }
    }

    public static void main(String[] args) {
        ListaPares lp = new ListaPares();
        lp.listar();
    }
}
