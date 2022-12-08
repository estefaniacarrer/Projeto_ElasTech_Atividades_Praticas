package exercicios.aula19out;

public class ExercicioArray22 {

    public void somavalor (Integer[]array){

        int total = 0;
        for (Integer x : array) {
            total += x;

        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Integer [] teste = new Integer[5];

        teste[0] = 40; // começar sempre em 0 pelo amor de Deus /////////////////////////////
        teste[1] = 60;
        teste[2] = 600;
        teste[3] = 500;
        teste[4] = 100;

        ExercicioArray22 ex2 = new ExercicioArray22();
        ex2.somavalor(teste);
    }
}
