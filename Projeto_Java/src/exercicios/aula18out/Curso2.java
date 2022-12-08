package exercicios.aula18out;

public class Curso2 {

    public void escreveNome () {

        int x = 1;
        while (x <= 5) {
            System.out.println("Elas tech");
            x++;
        }
    }

    public static void main(String[] args) {
        Curso2 c2 = new Curso2();
        c2.escreveNome();
    }

}
