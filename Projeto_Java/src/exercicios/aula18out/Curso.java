package exercicios.aula18out;

public class Curso {

    public void escreveNome() {

        int x = 0;
        while (x < 5) { // pode ser tbm de 1 à 5 ou 0 <=4
            x++;
//          x = x + 1 mesma coisa que a linha de cima

            System.out.println("Elas Tech");
        }

    }

    public static void main(String[] args) {
        Curso c = new Curso();
        c.escreveNome();
    }
}
