package exercicios.aula19out;

public class ExercicioArray2 {
    public void soma(Integer[]array) {

        int total = 0;
        for (Integer x : array){
            total = total + x;
            // total += x;

        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Integer[] teste = new Integer[5];
        teste[0] = 7;
        teste[1] = 6;
        teste[2] = 0;
        teste[3] = 900;
        teste[4] = 13;

        ExercicioArray2 exerc2 = new ExercicioArray2();
        exerc2.soma(teste);

    }
}
