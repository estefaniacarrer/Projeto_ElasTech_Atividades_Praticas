package exercicios.aula19out;

import java.util.Arrays;

public class ExercicioArray1 {

    public void  listarnomes() {
        String[] cidades = {"Sao Paulo", "Curitiba", "Porto Alegre"};

        System.out.println(Arrays.toString(cidades));

    }

    public static void main(String[] args) {
        ExercicioArray1 ex1 = new ExercicioArray1();
        ex1.listarnomes();
    }

}
